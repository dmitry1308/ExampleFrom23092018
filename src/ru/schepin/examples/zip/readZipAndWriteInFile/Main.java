package ru.schepin.examples.zip.readZipAndWriteInFile;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.zip.ZipInputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length < 2) return;
        String resultPath = args[0];

        List<FileInputStream> listFileInputStream = getListFileInputStream(args);
        List<byte[]> bytes = readFile(listFileInputStream);
        writeBytesInFile(bytes, resultPath);
    }

    private static void writeBytesInFile(List<byte[]> bytes, String resultPath) throws IOException {
        FileOutputStream fileOutStream = new FileOutputStream(resultPath);
        for (int i = 0; i < bytes.size(); i++) {
            fileOutStream.write(bytes.get(i));
        }
        fileOutStream.close();
    }

    private static List<byte[]> readFile(List<FileInputStream> listFileInputStream) throws IOException {
        SequenceInputStream seqInStream = new SequenceInputStream(Collections.enumeration(listFileInputStream));
        ZipInputStream zipInStream = new ZipInputStream(seqInStream);
        ArrayList<byte[]> bytes = new ArrayList<>();
        while (zipInStream.getNextEntry() != null) {
            byte[] buf = new byte[1024 * 1024]; // 1MB buffer
            int count;
            while ((count = zipInStream.read(buf)) != -1) {
                int read = zipInStream.read(buf, 0, count);
            }
            bytes.add(buf);
        }
        zipInStream.close();
        seqInStream.close();
        return bytes;
    }

    private static List<FileInputStream> getListFileInputStream(String[] args) throws FileNotFoundException {
        String[] archives = Arrays.copyOfRange(args, 1, args.length);
        // sort by file name
        Arrays.sort(archives);

        List<FileInputStream> fisList = new ArrayList<>();
        for (int i = 0; i < archives.length; i++) {
            fisList.add(new FileInputStream(archives[i]));
        }
        return fisList;
    }
}


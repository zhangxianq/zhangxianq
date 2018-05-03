package zxq.util.file;


import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UserHomeUtils {

    private static final Lock lock = new ReentrantLock();

    public static void set(String key, String val) {
        RandomAccessFile randomAccessFile = null;
        try {
            lock.lock();
            randomAccessFile = new RandomAccessFile(StringUtils.join(System.getProperty("user.home"), File.separator, key), "rw");
            randomAccessFile.writeUTF(val);
        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        } finally {
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException e) {
                }
            }
            lock.unlock();
        }
    }

    public static String get(String key) {
        RandomAccessFile randomAccessFile = null;
        try {
            lock.lock();
            randomAccessFile = new RandomAccessFile(StringUtils.join(System.getProperty("user.home"), File.separator, key), "r");
            return randomAccessFile.readUTF();
        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        } finally {
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException e) {
                }
            }
            lock.unlock();
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.home"));
        set("test001", "hello");
        set("test001", "hello-r");
        System.out.println(get("test001"));
    }

}

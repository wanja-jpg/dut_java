package com.company;

import java.io.*;

public class SerializationUtil {
    public static void serialize(User user, String path) throws IOException {

        FileOutputStream fileOut = new FileOutputStream(path);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user);
        fileOut.close();
        out.close();
    }
    public static User deserialize(String path) throws IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream(path);
        ObjectInputStream in = new ObjectInputStream(fileIn);
        User user = (User) in.readObject();
        fileIn.close();
        in.close();
        return user;
    }
}

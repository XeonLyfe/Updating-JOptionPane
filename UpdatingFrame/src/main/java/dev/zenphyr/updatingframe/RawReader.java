package dev.zenphyr.updatingframe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author XeonLyfeGPC
 */
public class RawReader {


    public static List<String> getUpdates() {

        List<String> TextList = new ArrayList<>();

        try {
            URL pastebin = new URL("PUT PASTEBIN RAW HERE!");
            BufferedReader in = new BufferedReader(new InputStreamReader(pastebin.openStream()));
            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                TextList.add(inputLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return TextList;
    }
}

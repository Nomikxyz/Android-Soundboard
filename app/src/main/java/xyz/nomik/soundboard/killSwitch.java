package xyz.nomik.soundboard;

import android.content.Context;
import android.os.AsyncTask;

import java.net.HttpURLConnection;
import java.net.URL;

public class killSwitch extends AsyncTask<String, Void, String> {
    private Context mContext;

    public killSwitch(Context context) {
        mContext = context;
    }
    @Override
    protected void onPreExecute() {

    }

    @Override
    protected String doInBackground(String... params) {

        try {
            HttpURLConnection.setFollowRedirects(false);
            HttpURLConnection con =  (HttpURLConnection) new URL(params[0]).openConnection();
            con.setRequestMethod("HEAD");
            System.out.println(con.getResponseCode());
            return Integer.toString(con.getResponseCode());
        }
        catch (Exception e) {

            return e.toString();
        }
    }


    protected void onPostExecute(String result) {

        if(result.equals("404")) {
            System.exit(0);
            //or add in your toast with the mContext object here
        }
    }
}

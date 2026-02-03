package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drhr implements Runnable {
    final /* synthetic */ drhs a;
    private final Uri b;

    public drhr(drhs drhsVar, Uri uri) {
        this.a = drhsVar;
        this.b = uri;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        try {
            drhs drhsVar = this.a;
            String str = drhsVar.a;
            if (str.equals("/")) {
                Log.d("HatsLibTransmitter", "Skipping transmission of beacon since answerUrl was \"/\", this should only happen during debugging.");
                return;
            }
            Uri uri = this.b;
            String queryParameter = uri.getQueryParameter("t");
            byte[] bytes = uri.getEncodedQuery().getBytes(drgu.a);
            csq csqVar = new csq();
            csqVar.put(ffho.a, "application/x-www-form-urlencoded");
            csqVar.put("Content-Length", Integer.toString(bytes.length));
            csqVar.put("charset", "utf-8");
            csqVar.put("Connection", "close");
            drhw.c();
            csqVar.put("User-Agent", drhu.a);
            String strB = drhsVar.b.b(str);
            if (!TextUtils.isEmpty(strB)) {
                csqVar.put("Cookie", strB);
            }
            drhw drhwVarC = drhw.c();
            if (((drhu) drhwVarC).d == null) {
                synchronized (drhwVarC) {
                    if (((drhu) drhwVarC).d == null) {
                        ((drhu) drhwVarC).d = new drib();
                    }
                }
            }
            drib dribVar = ((drhu) drhwVarC).d;
            drhs drhsVar2 = this.a;
            String str2 = drhsVar2.a;
            HttpURLConnection httpURLConnection2 = null;
            try {
                try {
                    httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
                } catch (IOException e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setRequestMethod("POST");
                for (Map.Entry entry : csqVar.entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpURLConnection.setUseCaches(false);
                new DataOutputStream(httpURLConnection.getOutputStream()).write(bytes);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), drgu.a));
                while (bufferedReader.readLine() != null) {
                }
                bufferedReader.close();
                int responseCode = httpURLConnection.getResponseCode();
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                if (responseCode == 200) {
                    Log.d("HatsLibTransmitter", "Successfully transmitted answer beacon of type: ".concat(String.valueOf(queryParameter)));
                    drhsVar2.b.c(str2, headerFields);
                } else {
                    Log.e("HatsLibTransmitter", a.B(responseCode, queryParameter, "Failed to transmit answer beacon of type: ", "; response code was: "));
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            } catch (IOException e2) {
                e = e2;
                httpURLConnection2 = httpURLConnection;
                Log.d("HatsLibTransmitter", "Failed to put answer", e);
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection2 = httpURLConnection;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                throw th;
            }
        } catch (Exception e3) {
            Log.e("HatsLibTransmitter", "Transmission of answer beacon failed.", e3);
        }
    }
}

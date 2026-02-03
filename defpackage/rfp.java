package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rfp implements rfg {
    private final rlc a;
    private final int b;
    private HttpURLConnection c;
    private InputStream d;
    private volatile boolean e;

    public rfp(rlc rlcVar, int i) {
        this.a = rlcVar;
        this.b = i;
    }

    private static int c(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e);
            return -1;
        }
    }

    private final InputStream f(URL url, int i, URL url2, Map map) throws IOException {
        if (i >= 5) {
            throw new ree("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new ree("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            int i2 = this.b;
            httpURLConnection.setConnectTimeout(i2);
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.c = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.d = this.c.getInputStream();
                if (this.e) {
                    return null;
                }
                int iC = c(this.c);
                int i3 = iC / 100;
                if (i3 == 2) {
                    HttpURLConnection httpURLConnection2 = this.c;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.d = new ruw(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                            }
                            this.d = httpURLConnection2.getInputStream();
                        }
                        return this.d;
                    } catch (IOException e) {
                        throw new ree("Failed to obtain InputStream", c(httpURLConnection2), e);
                    }
                }
                if (i3 != 3) {
                    if (iC == -1) {
                        throw new ree("Http request failed", -1);
                    }
                    try {
                        throw new ree(this.c.getResponseMessage(), iC);
                    } catch (IOException e2) {
                        throw new ree("Failed to get a response message", iC, e2);
                    }
                }
                String headerField = this.c.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new ree("Received empty or null redirect url", iC);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    e();
                    return f(url3, i + 1, url, map);
                } catch (MalformedURLException e3) {
                    throw new ree("Bad redirect url: ".concat(String.valueOf(headerField)), iC, e3);
                }
            } catch (IOException e4) {
                throw new ree("Failed to connect or obtain data", c(this.c), e4);
            }
        } catch (IOException e5) {
            throw new ree("URL.openConnection threw", 0, e5);
        }
    }

    @Override // defpackage.rfg
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.rfg
    public final void d() {
        this.e = true;
    }

    @Override // defpackage.rfg
    public final void e() throws IOException {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.c = null;
    }

    @Override // defpackage.rfg
    public final reb eX() {
        return reb.REMOTE;
    }

    @Override // defpackage.rfg
    public final void g(rbh rbhVar, rff rffVar) {
        int i = rvd.a;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                rlc rlcVar = this.a;
                if (rlcVar.f == null) {
                    if (TextUtils.isEmpty(rlcVar.e)) {
                        String string = rlcVar.d;
                        if (TextUtils.isEmpty(string)) {
                            URL url = rlcVar.c;
                            rvi.f(url);
                            string = url.toString();
                        }
                        rlcVar.e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
                    }
                    rlcVar.f = new URL(rlcVar.e);
                }
                rffVar.c(f(rlcVar.f, 0, null, rlcVar.b.a()));
            } catch (IOException e) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e);
                }
                rffVar.f(e);
            }
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + rvd.a(jElapsedRealtimeNanos));
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + rvd.a(jElapsedRealtimeNanos));
            }
            throw th;
        }
    }
}

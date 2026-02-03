package defpackage;

import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbri implements Runnable {
    public static final /* synthetic */ int b = 0;
    private static final dcmc c = new dcmc("RevokeAccessOperation", new String[0]);
    public final dciw a;
    private final String d;

    public dbri(String str) {
        dclh.k(str);
        this.d = str;
        this.a = new dciw(null);
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        Status status = Status.c;
        try {
            URL url = new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.d);
            int i = ddmv.b;
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestProperty(ffho.a, "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.a;
            } else {
                c.c("Unable to revoke access!", new Object[0]);
            }
            c.b(a.g(responseCode, "Response Code: "), new Object[0]);
        } catch (IOException e) {
            c.c("IOException when revoking access: ".concat(String.valueOf(e.toString())), new Object[0]);
        } catch (Exception e2) {
            c.c("Exception when revoking access: ".concat(String.valueOf(e2.toString())), new Object[0]);
        }
        this.a.m(status);
    }
}

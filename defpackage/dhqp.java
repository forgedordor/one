package defpackage;

import android.util.Base64;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dhqp extends fcyz implements fdat {
    final /* synthetic */ dhqq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhqp(dhqq dhqqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dhqqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dhqp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        URLConnection uRLConnectionOpenConnection = new URL(this.a.b.a.concat("/on-device-safety/bt_log_signature_key.txt")).openConnection();
        uRLConnectionOpenConnection.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        try {
            try {
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() != 200) {
                    throw new RuntimeException("BT log key fetch failed with status " + httpURLConnection.getResponseCode());
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                inputStream.getClass();
                byte[] bArrA = fczk.a(inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, 8192));
                httpURLConnection.getInputStream().close();
                httpURLConnection.disconnect();
                try {
                    byte[] bArrDecode = Base64.decode(bArrA, 0);
                    bArrDecode.getClass();
                    return bArrDecode;
                } catch (IllegalArgumentException e) {
                    throw new RuntimeException("Invalid base-64 encoding for BT log key.", e);
                }
            } catch (IOException e2) {
                throw new RuntimeException("Error fetching BT log key.", e2);
            }
        } catch (Throwable th) {
            httpURLConnection.getInputStream().close();
            httpURLConnection.disconnect();
            throw th;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dhqp(this.a, fcxyVar);
    }
}

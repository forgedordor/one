package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxgw extends bxge {
    private static volatile qzr h;
    private final cpeo j;
    public static final cqce g = cqce.g("Bugle", "NetworkUriImageRequest");
    private static final int i = (int) TimeUnit.SECONDS.toMillis(10);

    /* compiled from: PG */
    public interface a {
        cpeo iv();
    }

    public bxgw(Context context, bxhb bxhbVar) {
        super(context, bxhbVar);
        this.e = 0;
        this.j = ((a) ehli.a(context, a.class)).iv();
    }

    @Override // defpackage.bxge
    protected final InputStream i() {
        cqaz.h();
        String string = ((bxhb) this.b).a().toString();
        try {
            return new URL(string).openStream();
        } catch (Exception e) {
            cqbd cqbdVarB = g.b();
            cqbdVarB.I("Exception trying to get inputStream for image.");
            cqbdVarB.A("url", string);
            cqbdVarB.s(e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bxge
    public final Bitmap l() throws Throwable {
        CountDownLatch countDownLatch;
        IOException e;
        HttpURLConnection httpURLConnection;
        MalformedURLException e2;
        OutOfMemoryError e3;
        cqaz.h();
        final bxgv bxgvVar = new bxgv();
        String string = ((bxhb) this.b).a().toString();
        final CountDownLatch countDownLatch2 = new CountDownLatch(1);
        Context context = this.a;
        if (h == null) {
            synchronized (bxgw.class) {
                if (h == null) {
                    h = ras.a(context);
                }
            }
        }
        HttpURLConnection httpURLConnection2 = null;
        bitmap = null;
        bitmap = null;
        Bitmap bitmap = null;
        h.a(new ran(string, new qzt() { // from class: bxgt
            @Override // defpackage.qzt
            public final void a(Object obj) {
                cqce cqceVar = bxgw.g;
                cqaz.l(obj);
                bxgv bxgvVar2 = bxgvVar;
                cqaz.i(bxgvVar2.a);
                bxgvVar2.a = (Bitmap) obj;
                countDownLatch2.countDown();
            }
        }, null, new qzs() { // from class: bxgu
            @Override // defpackage.qzs
            public final void a(qzx qzxVar) {
                bxgw.g.s("Error loading image from volley!", qzxVar);
                countDownLatch2.countDown();
            }
        }));
        try {
            countDownLatch2.await(i, TimeUnit.MILLISECONDS);
            countDownLatch = countDownLatch2;
        } catch (InterruptedException unused) {
            Thread threadCurrentThread = Thread.currentThread();
            threadCurrentThread.interrupt();
            countDownLatch = threadCurrentThread;
        }
        Bitmap bitmapDecodeStream = bxgvVar.a;
        try {
            if (bitmapDecodeStream != null) {
                return bitmapDecodeStream;
            }
            try {
                httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
                try {
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.connect();
                    if (httpURLConnection.getResponseCode() == 200) {
                        bitmapDecodeStream = BitmapFactory.decodeStream(httpURLConnection.getInputStream());
                    }
                    bitmap = bitmapDecodeStream;
                    if (httpURLConnection == null) {
                        return bitmap;
                    }
                } catch (IOException e4) {
                    e = e4;
                    cqbd cqbdVarE = g.e();
                    cqbdVarE.I("IOException trying to get inputStream for image.");
                    cqbdVarE.A("url", string);
                    cqbdVarE.s(e);
                    if (httpURLConnection == null) {
                        return bitmapDecodeStream;
                    }
                    httpURLConnection.disconnect();
                    return bitmap;
                } catch (OutOfMemoryError e5) {
                    e3 = e5;
                    cqbd cqbdVarE2 = g.e();
                    cqbdVarE2.I("OutOfMemoryError for image.");
                    cqbdVarE2.A("url", string);
                    cqbdVarE2.s(e3);
                    this.j.a(15, 1);
                    if (httpURLConnection == null) {
                        return bitmapDecodeStream;
                    }
                    httpURLConnection.disconnect();
                    return bitmap;
                } catch (MalformedURLException e6) {
                    e2 = e6;
                    cqbd cqbdVarE3 = g.e();
                    cqbdVarE3.I("MalformedUrl for image.");
                    cqbdVarE3.A("url", string);
                    cqbdVarE3.s(e2);
                    if (httpURLConnection == null) {
                        return bitmapDecodeStream;
                    }
                    httpURLConnection.disconnect();
                    return bitmap;
                }
            } catch (OutOfMemoryError e7) {
                e3 = e7;
                httpURLConnection = null;
            } catch (MalformedURLException e8) {
                e2 = e8;
                httpURLConnection = null;
            } catch (IOException e9) {
                e = e9;
                httpURLConnection = null;
            } catch (Throwable th) {
                th = th;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                throw th;
            }
            httpURLConnection.disconnect();
            return bitmap;
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection2 = countDownLatch;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.net.HttpURLConnection] */
    @Override // defpackage.bxge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final boolean o() throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r0 = "url"
            defpackage.cqaz.h()
            bxgf r1 = r8.b
            bxhb r1 = (defpackage.bxhb) r1
            android.net.Uri r1 = r1.a()
            r2 = 8963(0x2303, float:1.256E-41)
            r3 = 0
            r4 = 0
            android.net.TrafficStats.setThreadStatsTag(r2)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f java.net.MalformedURLException -> L55
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f java.net.MalformedURLException -> L55
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f java.net.MalformedURLException -> L55
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f java.net.MalformedURLException -> L55
            java.net.URLConnection r2 = r2.openConnection()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f java.net.MalformedURLException -> L55
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f java.net.MalformedURLException -> L55
            r2.connect()     // Catch: java.io.IOException -> L39 java.net.MalformedURLException -> L3b java.lang.Throwable -> L73
            int r4 = r2.getResponseCode()     // Catch: java.io.IOException -> L39 java.net.MalformedURLException -> L3b java.lang.Throwable -> L73
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 != r5) goto L6a
            java.lang.String r4 = "image/gif"
            java.lang.String r5 = r2.getContentType()     // Catch: java.io.IOException -> L39 java.net.MalformedURLException -> L3b java.lang.Throwable -> L73
            boolean r3 = r4.equalsIgnoreCase(r5)     // Catch: java.io.IOException -> L39 java.net.MalformedURLException -> L3b java.lang.Throwable -> L73
            goto L6a
        L39:
            r4 = move-exception
            goto L43
        L3b:
            r4 = move-exception
            goto L59
        L3d:
            r0 = move-exception
            goto L75
        L3f:
            r2 = move-exception
            r7 = r4
            r4 = r2
            r2 = r7
        L43:
            cqce r5 = defpackage.bxgw.g     // Catch: java.lang.Throwable -> L73
            cqbd r5 = r5.b()     // Catch: java.lang.Throwable -> L73
            java.lang.String r6 = "IOException trying to get inputStream for image."
            r5.I(r6)     // Catch: java.lang.Throwable -> L73
            r5.A(r0, r1)     // Catch: java.lang.Throwable -> L73
            r5.s(r4)     // Catch: java.lang.Throwable -> L73
            goto L6a
        L55:
            r2 = move-exception
            r7 = r4
            r4 = r2
            r2 = r7
        L59:
            cqce r5 = defpackage.bxgw.g     // Catch: java.lang.Throwable -> L73
            cqbd r5 = r5.b()     // Catch: java.lang.Throwable -> L73
            java.lang.String r6 = "MalformedUrl for image."
            r5.I(r6)     // Catch: java.lang.Throwable -> L73
            r5.A(r0, r1)     // Catch: java.lang.Throwable -> L73
            r5.s(r4)     // Catch: java.lang.Throwable -> L73
        L6a:
            if (r2 == 0) goto L6f
            r2.disconnect()
        L6f:
            android.net.TrafficStats.clearThreadStatsTag()
            return r3
        L73:
            r0 = move-exception
            r4 = r2
        L75:
            if (r4 == 0) goto L7a
            r4.disconnect()
        L7a:
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxgw.o():boolean");
    }
}

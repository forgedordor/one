package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffdx {
    public static final byte[] a = {42};
    public static final List b = fcva.b("*");
    public static final ffdx c = new ffdx();
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final CountDownLatch e = new CountDownLatch(1);
    public byte[] f;
    public byte[] g;

    public final List a(String str) {
        List listR = fdgn.R(str, new char[]{'.'});
        return fdbq.f(fcva.S(listR), "") ? fcva.ad(listR, 1) : listR;
    }

    public final void b() {
        fdci fdciVar;
        fdci fdciVar2;
        InputStream resourceAsStream;
        CountDownLatch countDownLatch;
        boolean z = false;
        while (true) {
            try {
                try {
                    try {
                        fdciVar = new fdci();
                        fdciVar2 = new fdci();
                        resourceAsStream = ffdx.class.getResourceAsStream("publicsuffixes.gz");
                        break;
                    } catch (Throwable th) {
                        this.e.countDown();
                        throw th;
                    }
                } finally {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } catch (InterruptedIOException unused) {
                Thread.interrupted();
                z = true;
            } catch (IOException e) {
                ffdi.b.l("Failed to read public suffix list", 5, e);
            }
        }
        if (resourceAsStream == null) {
            countDownLatch = this.e;
        } else {
            fffv fffvVar = new fffv(new fffh(fffk.b(resourceAsStream)));
            try {
                fdciVar.a = fffvVar.H(fffvVar.f());
                fdciVar2.a = fffvVar.H(fffvVar.f());
                fczl.a(fffvVar, null);
                synchronized (this) {
                    Object obj = fdciVar.a;
                    obj.getClass();
                    this.f = (byte[]) obj;
                    Object obj2 = fdciVar2.a;
                    obj2.getClass();
                    this.g = (byte[]) obj2;
                }
                countDownLatch = this.e;
            } finally {
            }
        }
        countDownLatch.countDown();
    }
}

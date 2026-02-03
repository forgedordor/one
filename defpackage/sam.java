package defpackage;

import android.net.LocalServerSocket;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.BindException;
import java.net.SocketException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sam {
    public final String b;
    private final sat c;
    private LocalServerSocket e;
    private final AtomicInteger d = new AtomicInteger();
    public final String a = "main";

    public sam(String str, sat satVar) {
        this.b = str;
        this.c = satVar;
    }

    private static LocalServerSocket b(String str) throws InterruptedException, BindException {
        BindException bindException = null;
        int i = 2;
        while (true) {
            try {
                if (rzl.f(3)) {
                    String strV = a.v(str, "Trying to bind to @");
                    if (rzl.f(3)) {
                        rzk.c(3, strV);
                    }
                }
                return new LocalServerSocket(str);
            } catch (BindException e) {
                rzl.e(e, "Binding error, sleep 1000 ms...");
                if (bindException == null) {
                    bindException = e;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jCurrentTimeMillis2 = 1000;
                do {
                    try {
                        Thread.sleep(jCurrentTimeMillis2);
                        break;
                    } catch (InterruptedException unused) {
                        jCurrentTimeMillis2 -= System.currentTimeMillis() - jCurrentTimeMillis;
                        if (jCurrentTimeMillis2 > 0) {
                        }
                    }
                } while (jCurrentTimeMillis2 > 0);
                int i2 = i - 1;
                if (i <= 0) {
                    throw bindException;
                }
                i = i2;
            }
        }
    }

    public final void a(String str) {
        this.e = b(str);
        rzl.c("Listening on @".concat(str));
        while (!Thread.interrupted()) {
            try {
                sal salVar = new sal(this.e.accept(), this.c);
                salVar.setName("StethoWorker-" + this.a + "-" + this.d.incrementAndGet());
                salVar.setDaemon(true);
                salVar.start();
            } catch (InterruptedIOException unused) {
            } catch (SocketException e) {
                if (Thread.interrupted()) {
                    break;
                } else {
                    rzl.e(e, "I/O error");
                }
            } catch (IOException e2) {
                rzl.e(e2, "I/O error initialising connection thread");
            }
        }
        rzl.c("Server shutdown on @".concat(str));
    }
}

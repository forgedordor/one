package defpackage;

import android.os.Looper;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehqr {
    public static final String a = "ehqr";
    static final byte[] b;
    public static final InputStream c;
    public final ejxr d;
    public final Executor e;
    public final long f;
    public final int g;
    public PrintWriter h;
    public ehqq i;

    static {
        byte[] bytes = "\nGap in log files detected, log data may be out of order or corrupted.\n".getBytes();
        b = bytes;
        c = evqs.x(bytes).m();
    }

    public ehqr(ejxr ejxrVar, long j, int i, Executor executor) {
        ejwl.b(j > 0, "The max total log size must be greater than 0 bytes");
        ejwl.b(i > 0, "There must be at least one log file");
        this.d = ejxx.a(ejxrVar);
        this.g = i - 1;
        this.f = j / i;
        this.e = executor;
    }

    public static void b() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            Looper.getMainLooper().getThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), new AssertionError("This method should not be called on main thread."));
        }
    }

    final File a(int i) {
        ejwl.a(i > 0);
        return new File(((File) this.d.get()).getAbsolutePath() + "." + i);
    }

    public final void c() throws IOException {
        b();
        File file = (File) this.d.get();
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            file.createNewFile();
        }
        this.i = new ehqq(new BufferedWriter(new FileWriter(file, true)));
        this.h = new PrintWriter(this.i);
    }

    public final void d() throws IOException {
        b();
        int i = this.g;
        if (i == 0) {
            File file = (File) this.d.get();
            file.delete();
            file.createNewFile();
            return;
        }
        b();
        int i2 = 0;
        int i3 = 1;
        for (int i4 = 1; i4 <= i; i4++) {
            File fileA = a(i4);
            if (fileA.exists()) {
                i2++;
                if (i3 != i4) {
                    fileA.renameTo(a(i3));
                }
                i3++;
            }
        }
        if (i2 == i) {
            a(1).delete();
            for (int i5 = 2; i5 <= i; i5++) {
                a(i5).renameTo(a(i5 - 1));
            }
            i2--;
        }
        ((File) this.d.get()).renameTo(a(i2 + 1));
    }
}

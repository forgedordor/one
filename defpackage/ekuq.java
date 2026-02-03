package defpackage;

import android.os.Looper;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekuq {
    public static final String a = "ekuq";
    static final byte[] b;
    public final ejxr c;
    public final Executor d;
    public final long e;
    public PrintWriter f;

    static {
        byte[] bytes = "\nGap in log files detected, log data may be out of order or corrupted.\n".getBytes();
        b = bytes;
        new ByteArrayInputStream(bytes);
    }

    public ekuq(ejxr ejxrVar, long j, Executor executor) {
        ejwl.b(j > 0, "The max total log size must be greater than 0 bytes");
        ejwl.b(true, "There must be at least one log file");
        this.c = ejxx.a(ejxrVar);
        this.e = j / 4;
        this.d = executor;
    }

    public static void c() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            Looper.getMainLooper().getThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), new AssertionError("This method should not be called on main thread."));
        }
    }

    final File a(int i) {
        ejwl.a(i > 0);
        return new File(((File) this.c.get()).getAbsolutePath() + "." + i);
    }

    public final PrintWriter b() throws IOException {
        c();
        File file = (File) this.c.get();
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            file.createNewFile();
        }
        return new PrintWriter(new BufferedWriter(new FileWriter(file, true)));
    }

    public final void d() {
        c();
        c();
        int i = 0;
        int i2 = 1;
        for (int i3 = 1; i3 <= 3; i3++) {
            File fileA = a(i3);
            if (fileA.exists()) {
                i++;
                if (i2 != i3) {
                    fileA.renameTo(a(i2));
                }
                i2++;
            }
        }
        if (i == 3) {
            a(1).delete();
            i = 2;
            for (int i4 = 2; i4 <= 3; i4++) {
                a(i4).renameTo(a(i4 - 1));
            }
        }
        ((File) this.c.get()).renameTo(a(i + 1));
    }
}

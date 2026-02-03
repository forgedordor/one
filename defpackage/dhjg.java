package defpackage;

import android.os.Process;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dhjg extends dhjh {
    private final SimpleDateFormat c = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);
    private final csu a = new csu(500);
    private final Object b = new Object();

    @Override // defpackage.dhjh
    public final void a(PrintWriter printWriter) {
        Object obj = this.b;
        int iMyPid = Process.myPid();
        synchronized (obj) {
            int i = 0;
            while (true) {
                csu csuVar = this.a;
                if (i < csuVar.a()) {
                    printWriter.println(String.format(Locale.US, "%s %5d %5d %s %s: %s", this.c.format((Object) 0L), Integer.valueOf(iMyPid), 0, null, null, null));
                    i++;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}

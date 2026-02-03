package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.concurrent.ThreadLocalRandom;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxbe implements bxam {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/layer/LoggingPlugin");
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/datamodel/layer/LoggingPlugin");
    public final eygg c;
    public final eygg d;
    public final AtomicInteger e = new AtomicInteger(0);
    private final eygg f;
    private final aptk g;
    private final fcsu h;

    public bxbe(eygg eyggVar, eygg eyggVar2, aptk aptkVar, eygg eyggVar3, fcsu fcsuVar) {
        this.c = eyggVar;
        this.f = eyggVar2;
        this.g = aptkVar;
        this.d = eyggVar3;
        this.h = fcsuVar;
    }

    @Override // defpackage.bxam
    public final /* synthetic */ int e(Exception exc, int i, dqtx dqtxVar) {
        return 1;
    }

    final Map f() throws IOException {
        HashMap map = new HashMap();
        Instant instantF = ((cogw) this.f.b()).f();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("/proc/thread-self/io")));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    List listI = ejxk.b(' ').i(line);
                    map.put(((String) listI.get(0)).substring(0, ((String) listI.get(0)).length() - 1), Integer.valueOf((String) listI.get(1)));
                } finally {
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            ((ekrd) ((ekrd) ((ekrd) b.j()).g(e)).h("com/google/android/apps/messaging/shared/datamodel/layer/LoggingPlugin", "readIoCounts", (char) 176, "LoggingPlugin.java")).q("got io exception reading /proc/thread-self/io");
        }
        map.put("cost_millis", Integer.valueOf((int) Duration.between(instantF, ((cogw) this.f.b()).f()).toMillis()));
        return map;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0151  */
    @Override // defpackage.bxam
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Closeable m(final defpackage.dqtx r15) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxbe.m(dqtx):java.io.Closeable");
    }

    @Override // defpackage.bxam
    public final boolean o() {
        Boolean bool = true;
        bool.getClass();
        long jLongValue = ((Long) this.h.b()).longValue();
        return jLongValue > 0 && ((double) ThreadLocalRandom.current().nextLong(jLongValue)) == 0.0d;
    }

    @Override // defpackage.bxam
    public final /* synthetic */ void n(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // defpackage.bxam
    public final Cursor a(Cursor cursor, dqtx dqtxVar) {
        return cursor;
    }
}

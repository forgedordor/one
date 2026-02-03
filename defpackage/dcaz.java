package defpackage;

import com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable;
import com.google.android.gms.clearcut.internal.LogErrorParcelable;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcaz {
    private static volatile dcaz a;
    private int c = 0;
    private final Map b = new csq();

    private dcaz() {
    }

    static dcaz b() {
        if (a == null) {
            synchronized (dcaz.class) {
                if (a == null) {
                    a = new dcaz();
                }
            }
        }
        return a;
    }

    final synchronized BatchedLogErrorParcelable a() {
        ArrayList arrayList;
        Map map = this.b;
        arrayList = new ArrayList(map.values());
        int i = this.c;
        if (i > 0) {
            arrayList.add(new LogErrorParcelable("UNKNOWN", 1002, i));
            this.c = 0;
        }
        map.clear();
        return new BatchedLogErrorParcelable(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final synchronized void c(LogErrorParcelable logErrorParcelable) {
        lcb lcbVar = new lcb(logErrorParcelable.a, Integer.valueOf(logErrorParcelable.b));
        Map map = this.b;
        LogErrorParcelable logErrorParcelable2 = (LogErrorParcelable) map.get(lcbVar);
        if (logErrorParcelable2 != null) {
            logErrorParcelable2.c = eoln.c(logErrorParcelable2.c, logErrorParcelable.c);
        } else if (((cvw) map).d >= 100) {
            this.c = eoln.c(this.c, logErrorParcelable.c);
        } else {
            map.put(lcbVar, logErrorParcelable);
        }
    }
}

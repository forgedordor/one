package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dstw {
    private static final AtomicInteger a = new AtomicInteger();
    private static final long b;
    private static final eoib c;

    static {
        long jCurrentTimeMillis = System.currentTimeMillis() * 1000;
        b = jCurrentTimeMillis;
        SystemClock.elapsedRealtime();
        eoia eoiaVar = (eoia) eoib.a.createBuilder();
        eoiaVar.copyOnWrite();
        eoib.b((eoib) eoiaVar.instance);
        eoiaVar.copyOnWrite();
        eoib.a((eoib) eoiaVar.instance);
        eoiaVar.copyOnWrite();
        eoib eoibVar = (eoib) eoiaVar.instance;
        eoibVar.b |= 1;
        eoibVar.c = jCurrentTimeMillis;
        c = (eoib) eoiaVar.build();
    }

    public static eohz a() {
        eohy eohyVar = (eohy) eohz.a.createBuilder();
        long andIncrement = a.getAndIncrement();
        eohyVar.copyOnWrite();
        eohz eohzVar = (eohz) eohyVar.instance;
        eohzVar.b |= 2;
        eohzVar.d = andIncrement;
        eoib eoibVar = c;
        eohyVar.copyOnWrite();
        eohz eohzVar2 = (eohz) eohyVar.instance;
        eoibVar.getClass();
        eohzVar2.c = eoibVar;
        eohzVar2.b |= 1;
        return (eohz) eohyVar.build();
    }
}

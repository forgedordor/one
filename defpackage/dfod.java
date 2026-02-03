package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Locale;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public final class dfod extends dfoc {
    private static final Object a = new Object();
    private static volatile dfod b;
    private final ConcurrentMap e;

    private dfod() {
        super("KillSwitch__");
        this.e = new ConcurrentHashMap();
    }

    public static dfny a(int i) {
        dfod dfodVarC = c();
        String str = String.format(Locale.US, "bug_%s", Integer.valueOf(i));
        ConcurrentMap concurrentMap = dfodVarC.e;
        dfny dfnyVar = (dfny) concurrentMap.get(str);
        if (dfnyVar != null) {
            return dfnyVar;
        }
        dfoa dfoaVarI = c().i(str, true);
        dfny dfnyVar2 = (dfny) concurrentMap.putIfAbsent(str, dfoaVarI);
        return dfnyVar2 == null ? dfoaVarI : dfnyVar2;
    }

    public static dfod c() {
        if (b == null) {
            d();
        }
        if (b != null) {
            return b;
        }
        throw new IllegalStateException("CsLibKillSwitch flags are not initialized!");
    }

    static void d() {
        synchronized (a) {
            if (b == null) {
                b = new dfod();
                b.l();
            }
        }
    }

    @Override // defpackage.dfoc
    protected final ekgb b() {
        return ekgb.n(this.e.values());
    }
}

package defpackage;

import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfnv {
    public static volatile dfnu b;
    public static final dfnt a = dfnt.OFF;
    private static final Object c = new Object();

    public static dfnu a() {
        if (b == null) {
            synchronized (c) {
                if (b == null) {
                    b = ((dfns) dfds.a(dfns.class)).k();
                    b.l();
                }
            }
        }
        if (b != null) {
            return b;
        }
        throw new IllegalStateException("CsLibAllowSwitch flags are not initialized!");
    }

    public static dfny b(String str) {
        dfnu dfnuVarA = a();
        ConcurrentMap concurrentMap = dfnuVarA.a;
        dfny dfnyVar = (dfny) concurrentMap.get(str);
        if (dfnyVar != null) {
            return dfnyVar;
        }
        dfoa dfoaVarI = dfnuVarA.i(str, dfnuVarA.b);
        dfny dfnyVar2 = (dfny) concurrentMap.putIfAbsent(str, dfoaVarI);
        return dfnyVar2 == null ? dfoaVarI : dfnyVar2;
    }
}

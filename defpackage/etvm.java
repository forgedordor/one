package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etvm extends evsn implements evui {
    public static final etvm a;
    private static volatile evuo g;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public boolean f;
    private int h;

    static {
        etvm etvmVar = new etvm();
        a = etvmVar;
        evsn.registerDefaultInstance(etvm.class, etvmVar);
    }

    private etvm() {
        emptyIntList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0003\u0007\u0005\u0000\u0000\u0000\u0003ဇ\u0001\u0004ဇ\u0002\u0005᠌\u0003\u0006᠌\u0004\u0007ဇ\u0005", new Object[]{"h", "b", "c", "d", etvk.a, "e", etvi.a, "f"});
        }
        if (iOrdinal == 3) {
            return new etvm();
        }
        if (iOrdinal == 4) {
            return new etvh();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (etvm.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}

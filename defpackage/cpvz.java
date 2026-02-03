package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpvz extends evsn implements evui {
    public static final cpvz a;
    private static volatile evuo c;
    public boolean b;

    static {
        cpvz cpvzVar = new cpvz();
        a = cpvzVar;
        evsn.registerDefaultInstance(cpvz.class, cpvzVar);
    }

    private cpvz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new cpvz();
        }
        if (iOrdinal == 4) {
            return new cpvy();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cpvz.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}

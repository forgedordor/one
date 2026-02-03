package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjkk extends evsn implements evui {
    public static final cjkk a;
    private static volatile evuo e;
    public int b;
    public int c;
    public evrj d;

    static {
        cjkk cjkkVar = new cjkk();
        a = cjkkVar;
        evsn.registerDefaultInstance(cjkk.class, cjkkVar);
    }

    private cjkk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"b", "c", cjki.a, "d"});
        }
        if (iOrdinal == 3) {
            return new cjkk();
        }
        if (iOrdinal == 4) {
            return new cjkh();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cjkk.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}

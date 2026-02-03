package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emta extends evsn implements evui {
    public static final emta a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        emta emtaVar = new emta();
        a = emtaVar;
        evsn.registerDefaultInstance(emta.class, emtaVar);
    }

    private emta() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"c", "b", emti.class, emtm.class, emsy.class, emtd.class, emtp.class});
        }
        if (iOrdinal == 3) {
            return new emta();
        }
        if (iOrdinal == 4) {
            return new emsz();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (emta.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}

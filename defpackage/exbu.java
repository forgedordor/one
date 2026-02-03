package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exbu extends evsn implements evui {
    public static final exbu a;
    private static volatile evuo c;
    public evub b = evub.a;

    static {
        exbu exbuVar = new exbu();
        a = exbuVar;
        evsn.registerDefaultInstance(exbu.class, exbuVar);
    }

    private exbu() {
        evsn.emptyProtobufList();
        evsn.emptyProtobufList();
        evsn.emptyProtobufList();
        evsn.emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", exbt.a});
        }
        if (iOrdinal == 3) {
            return new exbu();
        }
        if (iOrdinal == 4) {
            return new exbs();
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
        synchronized (exbu.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}

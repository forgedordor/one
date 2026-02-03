package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exfk extends evsn implements evui {
    public static final exfk a;
    private static volatile evuo d;
    public boolean b;
    public String c = "";

    static {
        exfk exfkVar = new exfk();
        a = exfkVar;
        evsn.registerDefaultInstance(exfk.class, exfkVar);
    }

    private exfk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002Ȉ", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new exfk();
        }
        if (iOrdinal == 4) {
            return new exfj();
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
        synchronized (exfk.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}

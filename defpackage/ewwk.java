package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewwk extends evsn implements evui {
    public static final ewwk a;
    private static volatile evuo d;
    public int b;
    public String c = "";

    static {
        ewwk ewwkVar = new ewwk();
        a = ewwkVar;
        evsn.registerDefaultInstance(ewwk.class, ewwkVar);
    }

    private ewwk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new ewwk();
        }
        if (iOrdinal == 4) {
            return new ewwj();
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
        synchronized (ewwk.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewab extends evsn implements evui {
    public static final ewab a;
    private static volatile evuo d;
    public int b;
    public String c = "";

    static {
        ewab ewabVar = new ewab();
        a = ewabVar;
        evsn.registerDefaultInstance(ewab.class, ewabVar);
    }

    private ewab() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new ewab();
        }
        if (iOrdinal == 4) {
            return new ewaa();
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
        synchronized (ewab.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}

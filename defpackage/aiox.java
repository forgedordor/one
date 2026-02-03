package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aiox extends evsn implements evui {
    public static final aiox a;
    private static volatile evuo e;
    public double b;
    public int c;
    public int d;
    private int f;

    static {
        aiox aioxVar = new aiox();
        a = aioxVar;
        evsn.registerDefaultInstance(aiox.class, aioxVar);
    }

    private aiox() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001က\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"f", "b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new aiox();
        }
        if (iOrdinal == 4) {
            return new aiow();
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
        synchronized (aiox.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}

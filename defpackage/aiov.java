package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aiov extends evsn implements evui {
    public static final aiov a;
    private static volatile evuo d;
    public int b;
    public double c;
    private int e;

    static {
        aiov aiovVar = new aiov();
        a = aiovVar;
        evsn.registerDefaultInstance(aiov.class, aiovVar);
    }

    private aiov() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002က\u0001", new Object[]{"e", "b", aiot.a, "c"});
        }
        if (iOrdinal == 3) {
            return new aiov();
        }
        if (iOrdinal == 4) {
            return new aios();
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
        synchronized (aiov.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aiiv extends evsn implements evui {
    public static final aiiv a;
    private static volatile evuo e;
    public int b;
    public boolean c;
    public boolean d = true;

    static {
        aiiv aiivVar = new aiiv();
        a = aiivVar;
        evsn.registerDefaultInstance(aiiv.class, aiivVar);
    }

    private aiiv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new aiiv();
        }
        if (iOrdinal == 4) {
            return new aiiu();
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
        synchronized (aiiv.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiaa extends evsn implements evui {
    public static final aiaa a;
    private static volatile evuo h;
    public int b;
    public long c;
    public String d = "";
    public evvp e;
    public long f;
    public long g;

    static {
        aiaa aiaaVar = new aiaa();
        a = aiaaVar;
        evsn.registerDefaultInstance(aiaa.class, aiaaVar);
    }

    private aiaa() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new aiaa();
        }
        if (iOrdinal == 4) {
            return new ahzz();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = h;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (aiaa.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}

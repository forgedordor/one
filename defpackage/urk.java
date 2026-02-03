package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class urk extends evsn implements evui {
    public static final urk a;
    private static volatile evuo e;
    public int b;
    public upx c;
    public String d = "";

    static {
        urk urkVar = new urk();
        a = urkVar;
        evsn.registerDefaultInstance(urk.class, urkVar);
    }

    private urk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new urk();
        }
        if (iOrdinal == 4) {
            return new urj();
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
        synchronized (urk.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}

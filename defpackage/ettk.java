package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ettk extends evsn implements evui {
    public static final ettk a;
    private static volatile evuo c;
    public long b;
    private int d;
    private etti e;

    static {
        ettk ettkVar = new ettk();
        a = ettkVar;
        evsn.registerDefaultInstance(ettk.class, ettkVar);
    }

    private ettk() {
    }

    public static /* synthetic */ void a(ettk ettkVar, etti ettiVar) {
        ettiVar.getClass();
        ettkVar.e = ettiVar;
        ettkVar.d |= 1;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0002", new Object[]{"d", "e", "b"});
        }
        if (iOrdinal == 3) {
            return new ettk();
        }
        if (iOrdinal == 4) {
            return new ettj();
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
        synchronized (ettk.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}

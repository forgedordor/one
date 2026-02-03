package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewvz extends evsn implements evui {
    public static final ewvz a;
    private static volatile evuo g;
    public int b;
    public ezpp c;
    public eypt d;
    public eyqn e;
    public evqs f = evqs.b;

    static {
        ewvz ewvzVar = new ewvz();
        a = ewvzVar;
        evsn.registerDefaultInstance(ewvz.class, ewvzVar);
    }

    private ewvz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\n", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new ewvz();
        }
        if (iOrdinal == 4) {
            return new ewvy();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ewvz.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}

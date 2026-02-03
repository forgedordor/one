package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ennd extends evsn implements evui {
    public static final ennd a;
    private static volatile evuo h;
    public int b;
    public Object d;
    public Object f;
    public int g;
    public int c = 0;
    public int e = 0;

    static {
        ennd enndVar = new ennd();
        a = enndVar;
        evsn.registerDefaultInstance(ennd.class, enndVar);
    }

    private ennd() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0002\u0001\u0001Ϸ\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000d<\u0001e<\u0001f<\u0001Ϸဌ\u0000", new Object[]{"d", "c", "f", "e", "b", enns.class, ennq.class, ennh.class, ennb.class, enmz.class, "g"});
        }
        if (iOrdinal == 3) {
            return new ennd();
        }
        if (iOrdinal == 4) {
            return new ennc();
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
        synchronized (ennd.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}

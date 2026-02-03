package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emmo extends evsn implements evui {
    public static final emmo a;
    public static final evsl b;
    private static volatile evuo h;
    public int c;
    public emmj d;
    public emme e;
    public emmm f;
    public emmc g;

    static {
        emmo emmoVar = new emmo();
        a = emmoVar;
        evsn.registerDefaultInstance(emmo.class, emmoVar);
        b = evsn.newSingularGeneratedExtension(emmz.a, emmoVar, emmoVar, null, 571, evwh.MESSAGE, emmo.class);
    }

    private emmo() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0002\u0007\u0004\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0007ဉ\u0006", new Object[]{"c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new emmo();
        }
        if (iOrdinal == 4) {
            return new emmn();
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
        synchronized (emmo.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}

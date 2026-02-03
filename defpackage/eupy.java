package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eupy extends evsn implements evui {
    public static final eupy a;
    public static final evsl b;
    private static volatile evuo e;
    public int c;
    public eupp d;

    static {
        eupy eupyVar = new eupy();
        a = eupyVar;
        evsn.registerDefaultInstance(eupy.class, eupyVar);
        b = evsn.newSingularGeneratedExtension(emmz.a, eupyVar, eupyVar, null, 549, evwh.MESSAGE, eupy.class);
    }

    private eupy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "d"});
        }
        if (iOrdinal == 3) {
            return new eupy();
        }
        if (iOrdinal == 4) {
            return new eupx();
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
        synchronized (eupy.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}

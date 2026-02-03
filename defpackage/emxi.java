package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emxi extends evsn implements evui {
    public static final emxi a;
    public static final evsl b;
    public static final evsl c;
    private static volatile evuo f;
    public int d;
    public emxk e;

    static {
        emxi emxiVar = new emxi();
        a = emxiVar;
        evsn.registerDefaultInstance(emxi.class, emxiVar);
        b = evsn.newSingularGeneratedExtension(emkw.a, emxiVar, emxiVar, null, 249, evwh.MESSAGE, emxi.class);
        c = evsn.newSingularGeneratedExtension(emmz.a, emxiVar, emxiVar, null, 974, evwh.MESSAGE, emxi.class);
    }

    private emxi() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"d", "e"});
        }
        if (iOrdinal == 3) {
            return new emxi();
        }
        if (iOrdinal == 4) {
            return new emxh();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (emxi.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}

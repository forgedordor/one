package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etsc extends evsn implements evui {
    public static final etsc a;
    private static volatile evuo g;
    public int b;
    public Object d;
    public evrj f;
    public int c = 0;
    public String e = "";

    static {
        etsc etscVar = new etsc();
        a = etscVar;
        evsn.registerDefaultInstance(etsc.class, etscVar);
    }

    private etsc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"d", "c", "b", "e", "f", etsz.class, etsn.class, ettc.class, ettk.class});
        }
        if (iOrdinal == 3) {
            return new etsc();
        }
        if (iOrdinal == 4) {
            return new etsb();
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
        synchronized (etsc.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}

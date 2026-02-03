package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etgu extends evsn implements evui {
    public static final etgu a;
    private static volatile evuo i;
    public int b;
    public Object d;
    public int g;
    public int c = 0;
    public String e = "";
    public String f = "";
    public String h = "";

    static {
        etgu etguVar = new etgu();
        a = etguVar;
        evsn.registerDefaultInstance(etgu.class, etguVar);
    }

    private etgu() {
        emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0001\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001ဈ\u0001\u0002ဈ\u0002\u0003᠌\u0003\u0004ဈ\u0004\u0007<\u0000\b<\u0000", new Object[]{"d", "c", "b", "e", "f", "g", esxg.a, "h", etgq.class, etgt.class});
        }
        if (iOrdinal == 3) {
            return new etgu();
        }
        if (iOrdinal == 4) {
            return new etgr();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = i;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (etgu.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}

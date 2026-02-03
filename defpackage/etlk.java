package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etlk extends evsn implements evui {
    public static final etlk a;
    private static volatile evuo k;
    public int b;
    public Object d;
    public int e;
    public eyax g;
    public eyax h;
    public int j;
    public int c = 0;
    public String f = "";
    public evtg i = emptyProtobufList();

    static {
        etlk etlkVar = new etlk();
        a = etlkVar;
        evsn.registerDefaultInstance(etlk.class, etlkVar);
    }

    private etlk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\n\u0001\u0001\u0001\u000f\n\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003;\u0000\u0006ဉ\u0002\b<\u0000\t᠌\u0004\nဉ\u0003\u000b\u001b\u000e<\u0000\u000f<\u0000", new Object[]{"d", "c", "b", "e", etlh.a, "f", "g", etjz.class, "j", etlf.a, "h", "i", etnt.class, etla.class, etmm.class});
        }
        if (iOrdinal == 3) {
            return new etlk();
        }
        if (iOrdinal == 4) {
            return new etlj();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = k;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (etlk.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}

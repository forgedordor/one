package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exng extends evsn implements evui {
    public static final exng a;
    private static volatile evuo h;
    public int b;
    public exqw c;
    public expq d;
    public String e = "";
    public evtg f = evsn.emptyProtobufList();
    public String g = "";

    static {
        exng exngVar = new exng();
        a = exngVar;
        evsn.registerDefaultInstance(exng.class, exngVar);
    }

    private exng() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004Ț\u0005Ȉ", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new exng();
        }
        if (iOrdinal == 4) {
            return new exnf();
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
        synchronized (exng.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}

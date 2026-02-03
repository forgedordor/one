package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evgj extends evsn implements evui {
    public static final evsy a = new evgh();
    public static final evgj b;
    private static volatile evuo k;
    public int c;
    public String d = "";
    public evhn e;
    public evtg f;
    public evhf g;
    public int h;
    public evsx i;
    public int j;

    static {
        evgj evgjVar = new evgj();
        b = evgjVar;
        evsn.registerDefaultInstance(evgj.class, evgjVar);
    }

    private evgj() {
        emptyProtobufList();
        this.f = emptyProtobufList();
        this.i = emptyIntList();
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
            return newMessageInfo(b, "\u0004\u0007\u0000\u0001\u0001\u0012\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0003ဉ\u0001\bဉ\u0004\t᠌\u0005\u000bࠬ\u000f᠌\t\u0012\u001b", new Object[]{"c", "d", "e", "g", "h", evjd.a, "i", evjr.a, "j", evka.a, "f", evhq.class});
        }
        if (iOrdinal == 3) {
            return new evgj();
        }
        if (iOrdinal == 4) {
            return new evgi();
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = k;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (evgj.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(b);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}

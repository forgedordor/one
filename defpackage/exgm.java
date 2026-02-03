package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exgm extends evsn implements evui {
    public static final exgm a;
    private static volatile evuo j;
    public Object c;
    public int d;
    public int h;
    public boolean i;
    public int b = 0;
    public String e = "";
    public String f = "";
    public evtg g = emptyProtobufList();

    static {
        exgm exgmVar = new exgm();
        a = exgmVar;
        evsn.registerDefaultInstance(exgm.class, exgmVar);
    }

    private exgm() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\n\u0001\u0000\u0001\n\n\u0000\u0001\u0000\u0001\u000b\u0002Ȉ\u0003\f\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b\u0007\tȈ\n\u001b", new Object[]{"c", "b", "d", "e", "h", exhe.class, exga.class, exgo.class, exgc.class, "i", "f", "g", exhq.class});
        }
        if (iOrdinal == 3) {
            return new exgm();
        }
        if (iOrdinal == 4) {
            return new exgl();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = j;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (exgm.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}

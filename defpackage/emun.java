package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emun extends evsn implements evui {
    public static final emun a;
    private static volatile evuo j;
    public int b;
    public int c;
    public int d;
    public int e;
    public emuh f;
    public emuh g;
    public emuh h;
    public evtg i;

    static {
        emun emunVar = new emun();
        a = emunVar;
        evsn.registerDefaultInstance(emun.class, emunVar);
    }

    private emun() {
        emptyProtobufList();
        this.i = emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0004᠌\u0003\u0005ဉ\u0004\u0006ဉ\u0006\b\u001b\tဉ\u0005", new Object[]{"b", "c", emul.a, "d", emuj.a, "e", emuk.a, "f", "h", "i", emub.class, "g"});
        }
        if (iOrdinal == 3) {
            return new emun();
        }
        if (iOrdinal == 4) {
            return new emui();
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
        synchronized (emun.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}

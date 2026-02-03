package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emih extends evsn implements evui {
    public static final emih a;
    private static volatile evuo n;
    public int b;
    public int c;
    public int d;
    public evsx e;
    public int f;
    public evtg g;
    public int h;
    public evtg i;
    public int j;
    public String k;
    public int l;
    public long m;

    static {
        emih emihVar = new emih();
        a = emihVar;
        evsn.registerDefaultInstance(emih.class, emihVar);
    }

    private emih() {
        emptyIntList();
        emptyIntList();
        this.e = emptyIntList();
        this.g = emptyProtobufList();
        this.i = emptyProtobufList();
        this.k = "";
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0002\u000e\u000b\u0000\u0003\u0000\u0002᠌\u0000\u0003င\u0001\u0006᠌\u0002\u0007\u001b\bင\u0003\t᠌\u0004\nဈ\u0005\u000bࠞ\f᠌\u0006\r\u001b\u000eဂ\u0007", new Object[]{"b", "c", emif.a, "d", "f", eyzu.a, "g", emip.class, "h", "j", ezab.a, "k", "e", ezam.a, "l", ezad.a, "i", emhx.class, "m"});
        }
        if (iOrdinal == 3) {
            return new emih();
        }
        if (iOrdinal == 4) {
            return new emie();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = n;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (emih.class) {
            evsgVar = n;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                n = evsgVar;
            }
        }
        return evsgVar;
    }
}

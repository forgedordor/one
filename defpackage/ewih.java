package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewih extends evsn implements evui {
    public static final ewih a;
    private static volatile evuo h;
    public int b;
    public int c = 0;
    public Object d;
    public long e;
    public int f;
    public int g;

    static {
        ewih ewihVar = new ewih();
        a = ewihVar;
        evsn.registerDefaultInstance(ewih.class, ewihVar);
    }

    private ewih() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\r\u0001\u0001\u0001\r\r\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0002\u0003<\u0000\u0004᠌\u0001\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000", new Object[]{"d", "c", "b", "e", "g", ewgj.a, ewjd.class, "f", ewgk.a, ewhg.class, ewit.class, ewhp.class, ewif.class, ewhi.class, ewhl.class, ewgv.class, ewic.class, ewhv.class});
        }
        if (iOrdinal == 3) {
            return new ewih();
        }
        if (iOrdinal == 4) {
            return new ewig();
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
        synchronized (ewih.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elnb extends evsn implements evui {
    public static final elnb a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        elnb elnbVar = new elnb();
        a = elnbVar;
        evsn.registerDefaultInstance(elnb.class, elnbVar);
    }

    private elnb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u000e\u0001\u0000\u0001\u000e\u000e\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000", new Object[]{"c", "b", emzc.class, emyw.class, emyr.class, emyk.class, emyp.class, emyt.class, emzf.class, emzh.class, emxv.class, emyi.class, emyg.class, emye.class, emyc.class, emxy.class});
        }
        if (iOrdinal == 3) {
            return new elnb();
        }
        if (iOrdinal == 4) {
            return new elna();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (elnb.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}

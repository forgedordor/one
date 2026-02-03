package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eypd extends evsn implements evui {
    public static final eypd a;
    private static volatile evuo l;
    public int b;
    public Object d;
    public Object f;
    public eypt h;
    public long i;
    public int j;
    public int k;
    public int c = 0;
    public int e = 0;
    public String g = "";

    static {
        eypd eypdVar = new eypd();
        a = eypdVar;
        evsn.registerDefaultInstance(eypd.class, eypdVar);
    }

    private eypd() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u000e\u0002\u0001\u0002É\u000e\u0000\u0000\u0000\u0002\f\u0003Ȉ\u0004ဉ\u0000\u0005\u0002\u0006\fe<\u0000f<\u0000g<\u0000h<\u0000i<\u0000j<\u0000k<\u0000l<\u0000É<\u0001", new Object[]{"d", "c", "f", "e", "b", "j", "g", "h", "i", "k", eyql.class, eyot.class, eyqx.class, eyqh.class, eyop.class, eyqp.class, eyqt.class, eyoz.class, eyqp.class});
        }
        if (iOrdinal == 3) {
            return new eypd();
        }
        if (iOrdinal == 4) {
            return new eypc();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = l;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eypd.class) {
            evsgVar = l;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                l = evsgVar;
            }
        }
        return evsgVar;
    }
}

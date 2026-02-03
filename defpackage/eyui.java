package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyui extends evsn implements evui {
    public static final eyui a;
    private static volatile evuo j;
    public int b = 0;
    public Object c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;

    static {
        eyui eyuiVar = new eyui();
        a = eyuiVar;
        evsn.registerDefaultInstance(eyui.class, eyuiVar);
    }

    private eyui() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u000e\u0001\u0000\u0001m\u000e\u0000\u0000\u0000\u0001\f\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\b\u0007e<\u0000f<\u0000g<\u0000h<\u0000i<\u0000j<\u0000k<\u0000m<\u0000", new Object[]{"c", "b", "d", "e", "f", "g", "h", "i", eyuw.class, eyto.class, eyue.class, eytm.class, eytw.class, eytk.class, eyti.class, eyts.class});
        }
        if (iOrdinal == 3) {
            return new eyui();
        }
        if (iOrdinal == 4) {
            return new eyuh();
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
        synchronized (eyui.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}

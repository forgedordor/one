package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyko extends evsn implements evui {
    public static final eyko a;
    private static volatile evuo m;
    public int b;
    public ezpp c;
    public int d;
    public eykm e;
    public int f;
    public boolean g;
    public boolean h;
    public float i;
    public String j = "";
    public String k = "";
    public ezpx l;

    static {
        eyko eykoVar = new eyko();
        a = eykoVar;
        evsn.registerDefaultInstance(eyko.class, eykoVar);
    }

    private eyko() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003ဉ\u0001\u0004\f\u0005\u0001\u0006Ȉ\u0007Ȉ\b\u0007\nဉ\u0002\u000b\u0007", new Object[]{"b", "c", "d", "e", "f", "i", "j", "k", "g", "l", "h"});
        }
        if (iOrdinal == 3) {
            return new eyko();
        }
        if (iOrdinal == 4) {
            return new eykn();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = m;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eyko.class) {
            evsgVar = m;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                m = evsgVar;
            }
        }
        return evsgVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sef extends evsn implements evui {
    public static final sef a;
    private static volatile evuo j;
    public int b;
    public evqs c;
    public String d;
    public long e;
    public long f;
    public int g;
    public int h;
    public int i;

    static {
        sef sefVar = new sef();
        a = sefVar;
        evsn.registerDefaultInstance(sef.class, sefVar);
    }

    private sef() {
        evqs evqsVar = evqs.b;
        this.c = evqs.b;
        this.d = "";
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            evsv evsvVar = sff.a;
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0006\r\u0007\u0000\u0000\u0000\u0006ဈ\u0007\u0007ည\u0004\tဂ\t\nဂ\n\u000b᠌\u000b\f᠌\f\r᠌\r", new Object[]{"b", "d", "c", "e", "f", "g", evsvVar, "h", evsvVar, "i", sfe.a});
        }
        if (iOrdinal == 3) {
            return new sef();
        }
        if (iOrdinal == 4) {
            return new see();
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
        synchronized (sef.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}

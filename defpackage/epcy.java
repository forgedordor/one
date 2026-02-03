package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epcy extends evsn implements evui {
    public static final epcy a;
    private static volatile evuo k;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public evqs h = evqs.b;
    public String i = "";
    public String j = "";

    static {
        epcy epcyVar = new epcy();
        a = epcyVar;
        evsn.registerDefaultInstance(epcy.class, epcyVar);
    }

    private epcy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005\u0007\u0006\n\u0007Ȉ\bȈ", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
        }
        if (iOrdinal == 3) {
            return new epcy();
        }
        if (iOrdinal == 4) {
            return new epcx();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = k;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (epcy.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}

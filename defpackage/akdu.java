package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akdu extends evsn implements evui {
    public static final akdu a;
    private static volatile evuo h;
    public int b;
    public String c = "";
    public cidt d;
    public boolean e;
    public aubq f;
    public awky g;

    static {
        akdu akduVar = new akdu();
        a = akduVar;
        evsn.registerDefaultInstance(akdu.class, akduVar);
    }

    private akdu() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u0007\u0004ဉ\u0001\u0005ဉ\u0002", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new akdu();
        }
        if (iOrdinal == 4) {
            return new akdt();
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
        synchronized (akdu.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}

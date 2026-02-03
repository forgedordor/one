package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewfc extends evsn implements evui {
    public static final ewfc a;
    private static volatile evuo h;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public boolean g;

    static {
        ewfc ewfcVar = new ewfc();
        a = ewfcVar;
        evsn.registerDefaultInstance(ewfc.class, ewfcVar);
    }

    private ewfc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဇ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new ewfc();
        }
        if (iOrdinal == 4) {
            return new ewfb();
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
        synchronized (ewfc.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}

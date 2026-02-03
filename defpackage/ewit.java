package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewit extends evsn implements evui {
    public static final ewit a;
    private static volatile evuo j;
    public int b;
    public String c = "";
    public String d = "";
    public ewir e;
    public ewik f;
    public ewip g;
    public ewiv h;
    public ewin i;

    static {
        ewit ewitVar = new ewit();
        a = ewitVar;
        evsn.registerDefaultInstance(ewit.class, ewitVar);
    }

    private ewit() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0002\u0002ဉ\u0003\u0003ဉ\u0004\u0004ဉ\u0005\u0005ဉ\u0006\u0006ဈ\u0000\u0007ဈ\u0001", new Object[]{"b", "e", "f", "g", "h", "i", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ewit();
        }
        if (iOrdinal == 4) {
            return new ewis();
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
        synchronized (ewit.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}

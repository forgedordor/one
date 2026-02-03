package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cavz extends evsn implements evui {
    public static final cavz a;
    private static volatile evuo k;
    public int b;
    public int d;
    public long e;
    public alwl f;
    public int h;
    public String c = "";
    public String g = "";
    public String i = "";
    public String j = "";

    static {
        cavz cavzVar = new cavz();
        a = cavzVar;
        evsn.registerDefaultInstance(cavz.class, cavzVar);
    }

    private cavz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003ဂ\u0000\u0004ဉ\u0001\u0005ለ\u0002\u0006င\u0003\u0007ለ\u0004\bለ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
        }
        if (iOrdinal == 3) {
            return new cavz();
        }
        if (iOrdinal == 4) {
            return new cavx();
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
        synchronized (cavz.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}

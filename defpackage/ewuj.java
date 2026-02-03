package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewuj extends evsn implements evui {
    public static final evsy a = new ewuh();
    public static final ewuj b;
    private static volatile evuo n;
    public int c;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public int m;
    public evsx d = emptyIntList();
    public String e = "";
    public String j = "";
    public String k = "";
    public String l = "";

    static {
        ewuj ewujVar = new ewuj();
        b = ewujVar;
        evsn.registerDefaultInstance(ewuj.class, ewujVar);
    }

    private ewuj() {
    }

    public final void a() {
        evsx evsxVar = this.d;
        if (evsxVar.c()) {
            return;
        }
        this.d = evsn.mutableCopy(evsxVar);
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003᠌\u0001\u0004᠌\u0002\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\t᠌\u0003\nင\b", new Object[]{"c", "d", ewus.a, "e", "f", ewvm.a, "g", ewvo.a, "i", "j", "k", "l", "h", ewvq.a, "m"});
        }
        if (iOrdinal == 3) {
            return new ewuj();
        }
        if (iOrdinal == 4) {
            return new ewui();
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = n;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ewuj.class) {
            evsgVar = n;
            if (evsgVar == null) {
                evsgVar = new evsg(b);
                n = evsgVar;
            }
        }
        return evsgVar;
    }
}

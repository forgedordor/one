package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewev extends evsn implements evui {
    public static final ewev a;
    private static volatile evuo q;
    public int b;
    public int c;
    public int e;
    public int f;
    public ewfe g;
    public int k;
    public int l;
    public int n;
    public int p;
    public int d = 1;
    public String h = "";
    public String i = "";
    public String j = "";
    public evtg m = emptyProtobufList();
    public String o = "";

    static {
        ewev ewevVar = new ewev();
        a = ewevVar;
        evsn.registerDefaultInstance(ewev.class, ewevVar);
    }

    private ewev() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004င\u0003\u0005ဉ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tင\b\nင\t\u000b\u001b\f᠌\n\rဈ\u000b\u000e᠌\f", new Object[]{"b", "c", ewer.a, "d", eweu.a, "e", ewew.a, "f", "g", "h", "i", "j", "k", "l", "m", ewep.class, "n", ewet.a, "o", "p", ewes.a});
        }
        if (iOrdinal == 3) {
            return new ewev();
        }
        if (iOrdinal == 4) {
            return new eweq();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = q;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ewev.class) {
            evsgVar = q;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                q = evsgVar;
            }
        }
        return evsgVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewys extends evsn implements evui {
    public static final ewys a;
    private static volatile evuo q;
    public int b;
    public int c;
    public int d;
    public int g;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int p;
    public String e = "";
    public String f = "";
    public String h = "";
    public String o = "";

    static {
        ewys ewysVar = new ewys();
        a = ewysVar;
        evsn.registerDefaultInstance(ewys.class, ewysVar);
    }

    private ewys() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u000f\u0000\u0000\u0001\u0012\u000f\u0000\u0000\u0000\u0001\u0004\u0002\f\u0003\f\u0004Ȉ\u0005Ȉ\u0006\u0004\u0007Ȉ\t\u0004\n\u0004\u000b\u0004\f\u0004\r\f\u0010\f\u0011Ȉ\u0012\f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"});
        }
        if (iOrdinal == 3) {
            return new ewys();
        }
        if (iOrdinal == 4) {
            return new ewyp();
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
        synchronized (ewys.class) {
            evsgVar = q;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                q = evsgVar;
            }
        }
        return evsgVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewjy extends evsn implements evui {
    public static final ewjy a;
    private static volatile evuo u;
    public int b;
    public long c;
    public int d;
    public int f;
    public int g;
    public int i;
    public int k;
    public int o;
    public ewfe p;
    public int q;
    public ewjs r;
    public int t;
    public int e = 1;
    public String h = "";
    public String j = "";
    public String l = "";
    public String m = "";
    public String n = "";
    public evsx s = emptyIntList();

    static {
        ewjy ewjyVar = new ewjy();
        a = ewjyVar;
        evsn.registerDefaultInstance(ewjy.class, ewjyVar);
    }

    private ewjy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0012\u0000\u0001\u0001\u0017\u0012\u0000\u0001\u0000\u0001စ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005င\u0004\u0006င\u0006\u0007ဈ\t\bဈ\u000b\t᠌\r\nဉ\u000e\fဈ\u0007\rင\u0010\u0010ဈ\u0005\u0011ဈ\f\u0012ဉ\u0013\u0015င\b\u0016ࠬ\u0017᠌\u0016", new Object[]{"b", "c", "d", esxt.a, "e", esxu.a, "f", esxr.a, "g", "i", "l", "m", "o", ewqt.a, "p", "j", "q", "h", "n", "r", "k", "s", ewju.a, "t", ewjw.a});
        }
        if (iOrdinal == 3) {
            return new ewjy();
        }
        if (iOrdinal == 4) {
            return new ewjt();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = u;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ewjy.class) {
            evsgVar = u;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                u = evsgVar;
            }
        }
        return evsgVar;
    }
}

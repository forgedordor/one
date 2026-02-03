package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewpg extends evsn implements evui {
    private static volatile evuo B;
    public static final ewpg a;
    public int A;
    public int b;
    public int c;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int n;
    public int o;
    public int p;
    public long q;
    public long r;
    public long s;
    public long t;
    public int u;
    public int v;
    public int y;
    public enpl z;
    public String d = "";
    public evsx m = emptyIntList();
    public String w = "";
    public String x = "";

    static {
        ewpg ewpgVar = new ewpg();
        a = ewpgVar;
        evsn.registerDefaultInstance(ewpg.class, ewpgVar);
    }

    private ewpg() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            evsv evsvVar = ewpc.a;
            evsv evsvVar2 = ewoz.a;
            return newMessageInfo(a, "\u0004\u0019\u0000\u0001\u0001\u001a\u0019\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004᠌\u0004\u0005᠌\u0005\u0006᠌\u0006\u0007᠌\u0007\b᠌\b\t᠌\t\n᠌\n\u000b᠌\u000b\f᠌\f\rဂ\r\u000eဂ\u000e\u000fဂ\u000f\u0010ဂ\u0010\u0011᠌\u0011\u0012᠌\u0012\u0013ဈ\u0013\u0014ဈ\u0014\u0015ࠬ\u0016᠌\u0003\u0017᠌\u0015\u0018ဉ\u0016\u001a᠌\u0018", new Object[]{"b", "c", evsvVar, "d", "e", ewpb.a, "g", evsvVar, "h", ewoy.a, "i", evsvVar, "j", enwq.a, "k", evsvVar, "l", evsvVar, "n", evsvVar2, "o", evsvVar, "p", ewre.a, "q", "r", "s", "t", "u", ewrq.a, "v", ewrc.a, "w", "x", "m", evsvVar2, "f", ewpe.a, "y", ewrd.a, "z", "A", enxd.a});
        }
        if (iOrdinal == 3) {
            return new ewpg();
        }
        if (iOrdinal == 4) {
            return new ewox();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = B;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ewpg.class) {
            evsgVar = B;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                B = evsgVar;
            }
        }
        return evsgVar;
    }
}

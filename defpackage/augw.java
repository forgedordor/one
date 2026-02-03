package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class augw extends evsn implements evui {
    public static final augw a;
    private static volatile evuo o;
    public int b;
    public aubq c;
    public aubq d;
    public aubq e;
    public awky f;
    public awso g;
    public eyga j;
    public aubt k;
    public aufx m;
    public auib n;
    public String h = "";
    public String i = "";
    public evqs l = evqs.b;

    static {
        augw augwVar = new augw();
        a = augwVar;
        evsn.registerDefaultInstance(augw.class, augwVar);
    }

    private augw() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဈ\u0005\u0005ဈ\u0006\u0006ဉ\u0007\u0007ဉ\b\bည\t\tဉ\n\nဉ\u000b\u000bဉ\u0003\fဉ\u0004", new Object[]{"b", "c", "d", "e", "h", "i", "j", "k", "l", "m", "n", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new augw();
        }
        if (iOrdinal == 4) {
            return new augv();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = o;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (augw.class) {
            evsgVar = o;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                o = evsgVar;
            }
        }
        return evsgVar;
    }
}

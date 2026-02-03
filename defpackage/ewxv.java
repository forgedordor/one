package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewxv extends evsn implements evui {
    public static final ewxv a;
    private static volatile evuo k;
    public int b;
    public String c = "";
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public elho i;
    public int j;

    static {
        ewxv ewxvVar = new ewxv();
        a = ewxvVar;
        evsn.registerDefaultInstance(ewxv.class, ewxvVar);
    }

    private ewxv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\f\u0004\u0004\u0005\f\u0006\f\u0007ဉ\u0000\b\f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
        }
        if (iOrdinal == 3) {
            return new ewxv();
        }
        if (iOrdinal == 4) {
            return new ewxu();
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
        synchronized (ewxv.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}

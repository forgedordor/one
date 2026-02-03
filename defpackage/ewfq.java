package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewfq extends evsn implements evui {
    public static final ewfq a;
    private static volatile evuo h;
    public int b;
    public String c = "";
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;

    static {
        ewfq ewfqVar = new ewfq();
        a = ewfqVar;
        evsn.registerDefaultInstance(ewfq.class, ewfqVar);
    }

    private ewfq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\u0007\u0004\u0007\u0005\u0007\u0006\f", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new ewfq();
        }
        if (iOrdinal == 4) {
            return new ewfn();
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
        synchronized (ewfq.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}

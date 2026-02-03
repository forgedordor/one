package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejhn extends evsn implements evui {
    public static final ejhn a;
    private static volatile evuo e;
    public int b = 0;
    public Object c;
    public float d;
    private int f;

    static {
        ejhn ejhnVar = new ejhn();
        a = ejhnVar;
        evsn.registerDefaultInstance(ejhn.class, ejhnVar);
    }

    private ejhn() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u083f\u0000\u0002;\u0000\u0003ခ\u0000", new Object[]{"c", "b", "f", eyzx.a, "d"});
        }
        if (iOrdinal == 3) {
            return new ejhn();
        }
        if (iOrdinal == 4) {
            return new ejhm();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ejhn.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}

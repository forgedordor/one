package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auaz extends evsn implements evui {
    public static final auaz a;
    private static volatile evuo f;
    public int b;
    public aubq c;
    public aufb d;
    public int e;

    static {
        auaz auazVar = new auaz();
        a = auazVar;
        evsn.registerDefaultInstance(auaz.class, auazVar);
    }

    private auaz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"b", "c", "d", "e", auei.a});
        }
        if (iOrdinal == 3) {
            return new auaz();
        }
        if (iOrdinal == 4) {
            return new auay();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (auaz.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}

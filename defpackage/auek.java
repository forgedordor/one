package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auek extends evsn implements evui {
    public static final auek a;
    private static volatile evuo f;
    public int b;
    public aubq c;
    public int d;
    public aufb e;

    static {
        auek auekVar = new auek();
        a = auekVar;
        evsn.registerDefaultInstance(auek.class, auekVar);
    }

    private auek() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", auei.a, "e"});
        }
        if (iOrdinal == 3) {
            return new auek();
        }
        if (iOrdinal == 4) {
            return new aueh();
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
        synchronized (auek.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}

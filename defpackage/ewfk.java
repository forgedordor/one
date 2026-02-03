package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewfk extends evsn implements evui {
    public static final ewfk a;
    private static volatile evuo h;
    public int b;
    public boolean c;
    public int d;
    public long e;
    public int f;
    public int g;

    static {
        ewfk ewfkVar = new ewfk();
        a = ewfkVar;
        evsn.registerDefaultInstance(ewfk.class, ewfkVar);
    }

    private ewfk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ဂ\u0002\u0004᠌\u0003\u0005င\u0004", new Object[]{"b", "c", "d", "e", "f", ewfi.a, "g"});
        }
        if (iOrdinal == 3) {
            return new ewfk();
        }
        if (iOrdinal == 4) {
            return new ewfh();
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
        synchronized (ewfk.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}

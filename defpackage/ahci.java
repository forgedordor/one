package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahci extends evsn<ahci, ahch> implements evui {
    public static final ahci a;
    private static volatile evuo f;
    public int b;
    public aubq c;
    public String d = "";
    public ahcz e;

    static {
        ahci ahciVar = new ahci();
        a = ahciVar;
        evsn.registerDefaultInstance(ahci.class, ahciVar);
    }

    private ahci() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0004ဉ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new ahci();
        }
        if (iOrdinal == 4) {
            return new ahch();
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
        synchronized (ahci.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}

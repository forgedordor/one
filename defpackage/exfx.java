package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exfx extends evsn implements evui {
    public static final exfx a;
    private static volatile evuo e;
    public String b = "";
    public boolean c;
    public boolean d;

    static {
        exfx exfxVar = new exfx();
        a = exfxVar;
        evsn.registerDefaultInstance(exfx.class, exfxVar);
    }

    private exfx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001Ȉ\u0003\u0007\u0004\u0007", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new exfx();
        }
        if (iOrdinal == 4) {
            return new exfw();
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
        synchronized (exfx.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}

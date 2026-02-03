package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class upx extends evsn implements evui {
    public static final upx a;
    private static volatile evuo k;
    public String b = "";
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;

    static {
        upx upxVar = new upx();
        a = upxVar;
        evsn.registerDefaultInstance(upx.class, upxVar);
    }

    private upx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\u0007\u0004\u0004\u0005\f\u0006\u0007\u0007\u0007\b\u0004\t\u0004", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
        }
        if (iOrdinal == 3) {
            return new upx();
        }
        if (iOrdinal == 4) {
            return new upw();
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
        synchronized (upx.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}

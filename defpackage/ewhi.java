package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewhi extends evsn implements evui {
    public static final ewhi a;
    private static volatile evuo f;
    public int b;
    public ewhg c;
    public ewgn d;
    public ewjp e;

    static {
        ewhi ewhiVar = new ewhi();
        a = ewhiVar;
        evsn.registerDefaultInstance(ewhi.class, ewhiVar);
    }

    private ewhi() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new ewhi();
        }
        if (iOrdinal == 4) {
            return new ewhh();
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
        synchronized (ewhi.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}

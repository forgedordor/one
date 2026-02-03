package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyxe extends evsn implements evui {
    public static final eyxe a;
    private static volatile evuo f;
    public int b;
    public ezpp c;
    public ezol d;
    public eyxi e;

    static {
        eyxe eyxeVar = new eyxe();
        a = eyxeVar;
        evsn.registerDefaultInstance(eyxe.class, eyxeVar);
    }

    private eyxe() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new eyxe();
        }
        if (iOrdinal == 4) {
            return new eyxd();
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
        synchronized (eyxe.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}

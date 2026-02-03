package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exnc extends evsn implements evui {
    public static final exnc a;
    private static volatile evuo b;

    static {
        exnc exncVar = new exnc();
        a = exncVar;
        evsn.registerDefaultInstance(exnc.class, exncVar);
    }

    private exnc() {
        evsn.emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new exnc();
        }
        if (iOrdinal == 4) {
            return new exnb();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = b;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (exnc.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}

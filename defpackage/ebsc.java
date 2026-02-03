package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebsc extends evsn implements evui {
    public static final ebsc a;
    private static volatile evuo b;

    static {
        ebsc ebscVar = new ebsc();
        a = ebscVar;
        evsn.registerDefaultInstance(ebsc.class, ebscVar);
    }

    private ebsc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0000", null);
        }
        if (iOrdinal == 3) {
            return new ebsc();
        }
        if (iOrdinal == 4) {
            return new ebsb();
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
        synchronized (ebsc.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}

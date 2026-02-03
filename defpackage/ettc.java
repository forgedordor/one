package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ettc extends evsn implements evui {
    public static final ettc a;
    private static volatile evuo c;
    public String b = "";
    private int d;

    static {
        ettc ettcVar = new ettc();
        a = ettcVar;
        evsn.registerDefaultInstance(ettc.class, ettcVar);
    }

    private ettc() {
    }

    public static /* synthetic */ void a(ettc ettcVar) {
        ettcVar.d |= 1;
        ettcVar.b = "upi-mvp";
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"d", "b"});
        }
        if (iOrdinal == 3) {
            return new ettc();
        }
        if (iOrdinal == 4) {
            return new ettb();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ettc.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}

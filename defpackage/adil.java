package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adil extends evsn implements evui {
    public static final adil a;
    private static volatile evuo f;
    public int b;
    public boolean c;
    public int d;
    public int e;

    static {
        adil adilVar = new adil();
        a = adilVar;
        evsn.registerDefaultInstance(adil.class, adilVar);
    }

    private adil() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            evsv evsvVar = adij.a;
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"b", "c", "d", evsvVar, "e", evsvVar});
        }
        if (iOrdinal == 3) {
            return new adil();
        }
        if (iOrdinal == 4) {
            return new adii();
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
        synchronized (adil.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}

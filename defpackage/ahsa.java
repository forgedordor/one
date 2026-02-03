package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahsa extends evsn implements evui {
    public static final ahsa a;
    private static volatile evuo i;
    public int b;
    public String c = "";
    public String d = "";
    public ahrg e;
    public int f;
    public evvp g;
    public epqh h;

    static {
        ahsa ahsaVar = new ahsa();
        a = ahsaVar;
        evsn.registerDefaultInstance(ahsa.class, ahsaVar);
    }

    private ahsa() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004\u0004\u0005ဉ\u0001\u0006ဉ\u0002", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new ahsa();
        }
        if (iOrdinal == 4) {
            return new ahrz();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = i;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ahsa.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}

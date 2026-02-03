package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fegm extends evsn implements evui {
    public static final fegm a;
    private static volatile evuo l;
    public int b;
    public long c;
    public fegj e;
    public evvp g;
    public evrj h;
    public int i;
    public fegl j;
    public String d = "";
    public evtg f = emptyProtobufList();
    public evtg k = emptyProtobufList();

    static {
        fegm fegmVar = new fegm();
        a = fegmVar;
        evsn.registerDefaultInstance(fegm.class, fegmVar);
    }

    private fegm() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0002\u0000\u0001စ\u0000\u0002ဈ\u0001\u0004ဉ\u0004\u0005င\u0006\u0006ဉ\u0007\u0007\u001b\b\u001b\nဉ\u0002\u000bဉ\u0005", new Object[]{"b", "c", "d", "g", "i", "j", "k", fegx.class, "f", fegh.class, "e", "h"});
        }
        if (iOrdinal == 3) {
            return new fegm();
        }
        if (iOrdinal == 4) {
            return new fegb();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = l;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (fegm.class) {
            evsgVar = l;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                l = evsgVar;
            }
        }
        return evsgVar;
    }
}

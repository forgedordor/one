package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class encn extends evsn implements evui {
    public static final evsy a = new enby();
    public static final encn b;
    private static volatile evuo o;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;
    public int h;
    public evsx i = emptyIntList();
    public evtg j = emptyProtobufList();
    public int k;
    public int l;
    public encc m;
    public int n;

    static {
        encn encnVar = new encn();
        b = encnVar;
        evsn.registerDefaultInstance(encn.class, encnVar);
    }

    private encn() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0002\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0003\u0004᠌\u0004\u0005ࠞ\u0006᠌\u0005\u0007᠌\u0006\bဉ\u0007\t᠌\b\n᠌\u0002\u000b\u001b", new Object[]{"c", "d", "e", encf.a, "g", enci.a, "h", ence.a, "i", encg.a, "k", encm.a, "l", encd.a, "m", "n", enca.a, "f", encj.a, "j", encl.class});
        }
        if (iOrdinal == 3) {
            return new encn();
        }
        if (iOrdinal == 4) {
            return new enbz();
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = o;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (encn.class) {
            evsgVar = o;
            if (evsgVar == null) {
                evsgVar = new evsg(b);
                o = evsgVar;
            }
        }
        return evsgVar;
    }
}

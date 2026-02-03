package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejpz extends evsn implements evui {
    public static final ejpz a;
    private static volatile evuo e;
    public String b = "";
    public evtg c = evsn.emptyProtobufList();
    public evtg d = evsn.emptyProtobufList();
    private int f;

    static {
        ejpz ejpzVar = new ejpz();
        a = ejpzVar;
        evsn.registerDefaultInstance(ejpz.class, ejpzVar);
    }

    private ejpz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001a\u0003\u001a", new Object[]{"f", "b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ejpz();
        }
        if (iOrdinal == 4) {
            return new ejpy();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ejpz.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}

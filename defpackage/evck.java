package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evck extends evsn implements evui {
    public static final evck a;
    private static volatile evuo l;
    public int b;
    public evtg c = emptyProtobufList();
    public String d = "";
    public String e = "";
    public String f = "";
    public long g;
    public evdz h;
    public evej i;
    public evda j;
    public long k;

    static {
        evck evckVar = new evck();
        a = evckVar;
        evsn.registerDefaultInstance(evck.class, evckVar);
    }

    private evck() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u000e\t\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0004ဉ\u0004\u0005ဉ\u0005\u0006ဈ\u0001\u0007ဉ\u0006\tဂ\b\fဈ\u0002\u000eဂ\u0003", new Object[]{"b", "c", evcj.class, "d", "h", "i", "e", "j", "k", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new evck();
        }
        if (iOrdinal == 4) {
            return new evch();
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
        synchronized (evck.class) {
            evsgVar = l;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                l = evsgVar;
            }
        }
        return evsgVar;
    }
}

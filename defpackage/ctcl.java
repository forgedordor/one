package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctcl extends evsn implements evui {
    public static final ctcl a;
    private static volatile evuo k;
    public int b;
    public int c;
    public evvp d;
    public int e;
    public int g;
    public evvp h;
    public evvp j;
    public String f = "";
    public evtg i = evsn.emptyProtobufList();

    static {
        ctcl ctclVar = new ctcl();
        a = ctclVar;
        evsn.registerDefaultInstance(ctcl.class, ctclVar);
    }

    private ctcl() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003᠌\u0002\u0005᠌\u0004\u0006ဉ\u0005\u0007\u001a\bဉ\u0006\tဈ\u0003", new Object[]{"b", "c", "d", "e", ctcg.a, "g", ctci.a, "h", "i", "j", "f"});
        }
        if (iOrdinal == 3) {
            return new ctcl();
        }
        if (iOrdinal == 4) {
            return new ctck();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = k;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ctcl.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}

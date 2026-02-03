package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyqn extends evsn implements evui {
    public static final eyqn a;
    private static volatile evuo c;
    public String b = "";

    static {
        eyqn eyqnVar = new eyqn();
        a = eyqnVar;
        evsn.registerDefaultInstance(eyqn.class, eyqnVar);
    }

    private eyqn() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new eyqn();
        }
        if (iOrdinal == 4) {
            return new eyqm();
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
        synchronized (eyqn.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}

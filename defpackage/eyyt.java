package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyyt extends evsn implements evui {
    public static final eyyt a;
    private static volatile evuo d;
    public String b = "";
    public int c;

    static {
        eyyt eyytVar = new eyyt();
        a = eyytVar;
        evsn.registerDefaultInstance(eyyt.class, eyytVar);
    }

    private eyyt() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003\f", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new eyyt();
        }
        if (iOrdinal == 4) {
            return new eyyr();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eyyt.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}

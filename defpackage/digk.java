package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class digk extends evsn implements evui {
    public static final digk a;
    private static volatile evuo c;
    public evub b = evub.a;

    static {
        digk digkVar = new digk();
        a = digkVar;
        evsn.registerDefaultInstance(digk.class, digkVar);
    }

    private digk() {
    }

    public final evub a() {
        evub evubVar = this.b;
        if (!evubVar.b) {
            this.b = evubVar.a();
        }
        return this.b;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", digj.a});
        }
        if (iOrdinal == 3) {
            return new digk();
        }
        if (iOrdinal == 4) {
            return new digi();
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
        synchronized (digk.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}

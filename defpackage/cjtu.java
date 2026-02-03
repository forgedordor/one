package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjtu extends evsn<cjtu, cjtl> implements evui {
    public static final cjtu a;
    private static volatile evuo e;
    public int b;
    public String c = "";
    public evtg d = emptyProtobufList();

    static {
        cjtu cjtuVar = new cjtu();
        a = cjtuVar;
        evsn.registerDefaultInstance(cjtu.class, cjtuVar);
    }

    private cjtu() {
    }

    public final void a() {
        evtg evtgVar = this.d;
        if (evtgVar.c()) {
            return;
        }
        this.d = evsn.mutableCopy(evtgVar);
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ለ\u0000\u0002\u001b", new Object[]{"b", "c", "d", cjtt.class});
        }
        if (iOrdinal == 3) {
            return new cjtu();
        }
        if (iOrdinal == 4) {
            return new cjtl();
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
        synchronized (cjtu.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}

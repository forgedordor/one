package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etoh extends evsn implements evui {
    public static final etoh a;
    private static volatile evuo m;
    public int b;
    public Object d;
    public eyax e;
    public eyax f;
    public etlk j;
    public int k;
    public int l;
    public int c = 0;
    public String g = "";
    public String h = "";
    public evtg i = emptyProtobufList();

    static {
        etoh etohVar = new etoh();
        a = etohVar;
        evsn.registerDefaultInstance(etoh.class, etohVar);
    }

    private etoh() {
    }

    public final void a() {
        evtg evtgVar = this.i;
        if (evtgVar.c()) {
            return;
        }
        this.i = evsn.mutableCopy(evtgVar);
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u000b\u0001\u0001\u0001\u000b\u000b\u0000\u0001\u0000\u0001;\u0000\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဉ\u0004\u0007᠌\u0005\b;\u0000\t7\u0000\n\u001b\u000b᠌\u0006", new Object[]{"d", "c", "b", "e", "f", "g", "h", "j", "k", etoe.a, "i", etnt.class, "l", etny.a});
        }
        if (iOrdinal == 3) {
            return new etoh();
        }
        if (iOrdinal == 4) {
            return new etod();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = m;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (etoh.class) {
            evsgVar = m;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                m = evsgVar;
            }
        }
        return evsgVar;
    }
}

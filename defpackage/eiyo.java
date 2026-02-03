package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiyo extends evsn implements evui {
    public static final eiyo a;
    private static volatile evuo g;
    public String b = "";
    public evtg c;
    public boolean d;
    public boolean e;
    public boolean f;

    static {
        eiyo eiyoVar = new eiyo();
        a = eiyoVar;
        evsn.registerDefaultInstance(eiyo.class, eiyoVar);
    }

    private eiyo() {
        emptyProtobufList();
        this.c = emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0000\u0001\u0006\u0005\u0000\u0001\u0000\u0001Ȉ\u0003\u001b\u0004\u0007\u0005\u0007\u0006\u0007", new Object[]{"b", "c", eiyr.class, "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new eiyo();
        }
        if (iOrdinal == 4) {
            return new eiyn();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eiyo.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}

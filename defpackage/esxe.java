package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esxe extends evsn implements evui {
    public static final esxe a;
    private static volatile evuo f;
    public int b;
    public long c;
    public evta d;
    public evtg e;

    static {
        esxe esxeVar = new esxe();
        a = esxeVar;
        evsn.registerDefaultInstance(esxe.class, esxeVar);
    }

    private esxe() {
        evsn.emptyProtobufList();
        this.d = emptyLongList();
        this.e = emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0004\u0006\u0003\u0000\u0002\u0000\u0004\u001b\u0005စ\u0001\u0006\u0017", new Object[]{"b", "e", esxd.class, "c", "d"});
        }
        if (iOrdinal == 3) {
            return new esxe();
        }
        if (iOrdinal == 4) {
            return new eswx();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (esxe.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}

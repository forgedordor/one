package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exqi extends evsn implements evui {
    public static final exqi a;
    private static volatile evuo h;
    public int b;
    public int c;
    public evsx d = emptyIntList();
    public String e = "";
    public String f = "";
    public evtg g = emptyProtobufList();

    static {
        exqi exqiVar = new exqi();
        a = exqiVar;
        evsn.registerDefaultInstance(exqi.class, exqiVar);
    }

    private exqi() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0002\u0000\u0001\f\u0002\u000b\u0003+\u0004Ȉ\u0005Ȉ\u0006\u001b", new Object[]{"b", "c", "d", "e", "f", "g", exqf.class});
        }
        if (iOrdinal == 3) {
            return new exqi();
        }
        if (iOrdinal == 4) {
            return new exqg();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = h;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (exqi.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}

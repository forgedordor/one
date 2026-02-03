package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezsn extends evsn implements evui {
    public static final ezsn a;
    private static volatile evuo k;
    public int b;
    public int c;
    public ezol d;
    public evtg e = emptyProtobufList();
    public evvp f;
    public int g;
    public evqs h;
    public int i;
    public ezol j;

    static {
        ezsn ezsnVar = new ezsn();
        a = ezsnVar;
        evsn.registerDefaultInstance(ezsn.class, ezsnVar);
    }

    private ezsn() {
        emptyIntList();
        this.h = evqs.b;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\b\u0000\u0001\u0001\u0011\b\u0000\u0001\u0000\u0001\f\u0002ဉ\u0000\u0003\u001b\u0004ဉ\u0001\u0005\f\u000f\n\u0010\f\u0011ဉ\u0006", new Object[]{"b", "c", "d", "e", ezto.class, "f", "g", "h", "i", "j"});
        }
        if (iOrdinal == 3) {
            return new ezsn();
        }
        if (iOrdinal == 4) {
            return new ezsm();
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
        synchronized (ezsn.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}

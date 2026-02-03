package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezto extends evsn implements evui {
    public static final ezto a;
    private static volatile evuo k;
    public int b;
    public Object d;
    public ezol f;
    public ezol g;
    public evvp h;
    public int i;
    public int j;
    public int c = 0;
    public String e = "";

    static {
        ezto eztoVar = new ezto();
        a = eztoVar;
        evsn.registerDefaultInstance(ezto.class, eztoVar);
    }

    private ezto() {
        emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\f\u0001\u0001\u0001\u000e\f\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0006ဉ\u0003\u0007\f\bȻ\u0000\tȻ\u0000\n<\u0000\u000b<\u0000\f<\u0000\r\f\u000e<\u0000", new Object[]{"d", "c", "b", "e", "f", "g", "h", "i", ezsw.class, ezss.class, ezsu.class, "j", ezsy.class});
        }
        if (iOrdinal == 3) {
            return new ezto();
        }
        if (iOrdinal == 4) {
            return new eztn();
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
        synchronized (ezto.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}

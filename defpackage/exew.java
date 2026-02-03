package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exew extends evsn implements evui {
    public static final exew a;
    private static volatile evuo e;
    public int b;
    public int c;
    public String d = "";

    static {
        exew exewVar = new exew();
        a = exewVar;
        evsn.registerDefaultInstance(exew.class, exewVar);
    }

    private exew() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003Ȉ", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new exew();
        }
        if (iOrdinal == 4) {
            return new exev();
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
        synchronized (exew.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}

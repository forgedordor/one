package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exnj extends evsn implements evui {
    public static final exnj a;
    private static volatile evuo h;
    public int b;
    public int c;
    public int d;
    public String e = "";
    public boolean f;
    public exno g;

    static {
        exnj exnjVar = new exnj();
        a = exnjVar;
        evsn.registerDefaultInstance(exnj.class, exnjVar);
    }

    private exnj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003Ȉ\u0004\u0007\u0006ဉ\u0000", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new exnj();
        }
        if (iOrdinal == 4) {
            return new exni();
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
        synchronized (exnj.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejsu extends evsn implements evui {
    public static final ejsu a;
    private static volatile evuo k;
    public int b;
    public int c;
    public int i;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public evta j = emptyLongList();

    static {
        ejsu ejsuVar = new ejsu();
        a = ejsuVar;
        evsn.registerDefaultInstance(ejsu.class, ejsuVar);
    }

    private ejsu() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\t\u0000\u0000\u0001\u000e\t\u0000\u0001\u0000\u0001\f\u0002\f\u0004Ȉ\u0005Ȉ\bȈ\tȈ\u000b\f\r%\u000eȈ", new Object[]{"b", "c", "d", "e", "f", "h", "i", "j", "g"});
        }
        if (iOrdinal == 3) {
            return new ejsu();
        }
        if (iOrdinal == 4) {
            return new ejss();
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
        synchronized (ejsu.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}

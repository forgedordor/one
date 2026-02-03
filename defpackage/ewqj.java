package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewqj extends evsn implements evui {
    public static final ewqj a;
    private static volatile evuo k;
    public int b;
    public Object d;
    public int h;
    public int i;
    public int j;
    public int c = 0;
    public String e = "";
    public String f = "";
    public String g = "";

    static {
        ewqj ewqjVar = new ewqj();
        a = ewqjVar;
        evsn.registerDefaultInstance(ewqj.class, ewqjVar);
    }

    private ewqj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003ဈ\u0000\u0004ဈ\u0001\u0005ဈ\u0002\u0006င\u0003\u0007င\u0004\bဌ\u0005", new Object[]{"d", "c", "b", ewqo.class, ewqq.class, "e", "f", "g", "h", "i", "j"});
        }
        if (iOrdinal == 3) {
            return new ewqj();
        }
        if (iOrdinal == 4) {
            return new ewqi();
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
        synchronized (ewqj.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}

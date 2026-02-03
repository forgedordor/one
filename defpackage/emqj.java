package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emqj extends evsn implements evui {
    public static final emqj a;
    private static volatile evuo i;
    public int b;
    public Object d;
    public int e;
    public int f;
    public int h;
    public int c = 0;
    public String g = "";

    static {
        emqj emqjVar = new emqj();
        a = emqjVar;
        evsn.registerDefaultInstance(emqj.class, emqjVar);
    }

    private emqj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u000e\u0001\u0001\u0001n\u000e\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0004ဈ\u0003\u0005င\u0004e<\u0000f<\u0000g<\u0000h<\u0000i<\u0000j<\u0000k<\u0000l<\u0000m<\u0000n<\u0000", new Object[]{"d", "c", "b", "e", "f", "g", "h", emps.class, empy.class, empw.class, emqa.class, emqg.class, empp.class, emqc.class, emqi.class, emqe.class, empu.class});
        }
        if (iOrdinal == 3) {
            return new emqj();
        }
        if (iOrdinal == 4) {
            return new empq();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = i;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (emqj.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}

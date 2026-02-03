package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewbk extends evsn implements evui {
    public static final ewbk a;
    private static volatile evuo l;
    public int b;
    public Object d;
    public int e;
    public ewbj f;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public int c = 0;
    public String g = "";

    static {
        ewbk ewbkVar = new ewbk();
        a = ewbkVar;
        evsn.registerDefaultInstance(ewbk.class, ewbkVar);
    }

    private ewbk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\t\u0001\u0001\u0001\n\t\u0000\u0000\u0000\u0001;\u0000\u0003င\u0000\u0004ဉ\u0001\u0005ဈ\u0002\u0006ဇ\u0003\u0007ဇ\u0004\bဇ\u0005\t;\u0000\n᠌\u0006", new Object[]{"d", "c", "b", "e", "f", "g", "h", "i", "j", "k", ewbg.a});
        }
        if (iOrdinal == 3) {
            return new ewbk();
        }
        if (iOrdinal == 4) {
            return new ewbf();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = l;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ewbk.class) {
            evsgVar = l;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                l = evsgVar;
            }
        }
        return evsgVar;
    }
}

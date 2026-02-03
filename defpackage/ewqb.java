package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewqb extends evsn implements evui {
    public static final ewqb a;
    private static volatile evuo h;
    public int b;
    public int c;
    public String d = "";
    public evtg e = emptyProtobufList();
    public int f;
    public boolean g;

    static {
        ewqb ewqbVar = new ewqb();
        a = ewqbVar;
        evsn.registerDefaultInstance(ewqb.class, ewqbVar);
    }

    private ewqb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဆ\u0002\u0005ဇ\u0003", new Object[]{"b", "c", ewqa.a, "d", "e", ewpy.class, "f", "g"});
        }
        if (iOrdinal == 3) {
            return new ewqb();
        }
        if (iOrdinal == 4) {
            return new ewpz();
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
        synchronized (ewqb.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}

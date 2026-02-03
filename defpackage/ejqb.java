package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejqb extends evsn implements evui {
    public static final ejqb a;
    private static volatile evuo p;
    public int b;
    public int c;
    public int h;
    public long k;
    public float n;
    public int o;
    public String d = "";
    public String e = "";
    public evtg f = evsn.emptyProtobufList();
    public evtg g = emptyProtobufList();
    public String i = "";
    public String j = "";
    public String l = "";
    public String m = "";

    static {
        ejqb ejqbVar = new ejqb();
        a = ejqbVar;
        evsn.registerDefaultInstance(ejqb.class, ejqbVar);
    }

    private ejqb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0002\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003\u001a\u0004\u001b\u0005᠌\u0003\u0006ဈ\u0004\u0007ဈ\u0005\bဂ\u0006\tဈ\u0002\nဈ\u0007\u000bဈ\b\fခ\t\r᠌\n", new Object[]{"b", "c", ezam.a, "d", "f", "g", ejpz.class, "h", ezap.a, "i", "j", "k", "e", "l", "m", "n", "o", ezak.a});
        }
        if (iOrdinal == 3) {
            return new ejqb();
        }
        if (iOrdinal == 4) {
            return new ejqa();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = p;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ejqb.class) {
            evsgVar = p;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                p = evsgVar;
            }
        }
        return evsgVar;
    }
}

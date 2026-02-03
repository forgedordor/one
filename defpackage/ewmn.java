package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewmn extends evsn implements evui {
    public static final ewmn a;
    private static volatile evuo m;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public String g = "";
    public evtg h = evsn.emptyProtobufList();
    public String i = "";
    public int j;
    public boolean k;
    public int l;

    static {
        ewmn ewmnVar = new ewmn();
        a = ewmnVar;
        evsn.registerDefaultInstance(ewmn.class, ewmnVar);
    }

    private ewmn() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\n\u0000\u0001\u0001\f\n\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဈ\u0005\u0005ဈ\u0006\u0006᠌\u0003\t\u001a\nဇ\t\u000bင\u0007\f᠌\n", new Object[]{"b", "c", ewmg.a, "d", ewml.a, "e", ewmj.a, "g", "i", "f", ewmh.a, "h", "k", "j", "l", ewme.a});
        }
        if (iOrdinal == 3) {
            return new ewmn();
        }
        if (iOrdinal == 4) {
            return new ewmd();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = m;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ewmn.class) {
            evsgVar = m;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                m = evsgVar;
            }
        }
        return evsgVar;
    }
}

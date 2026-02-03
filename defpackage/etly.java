package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etly extends evsn implements evui {
    public static final etly a;
    private static volatile evuo o;
    public int b;
    public Object d;
    public int g;
    public int i;
    public int j;
    public int l;
    public int m;
    public int n;
    public int c = 0;
    public String e = "";
    public String f = "";
    public evtg h = emptyProtobufList();
    public evtg k = emptyProtobufList();

    static {
        etly etlyVar = new etly();
        a = etlyVar;
        evsn.registerDefaultInstance(etly.class, etlyVar);
    }

    private etly() {
    }

    public final void a() {
        evtg evtgVar = this.h;
        if (evtgVar.c()) {
            return;
        }
        this.h = evsn.mutableCopy(evtgVar);
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\f\u0001\u0001\u0001\u000f\f\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b\u0005;\u0000\u0006᠌\b\b᠌\u0003\t᠌\u0004\n᠌\u0002\u000b᠌\u0007\f;\u0000\r\u001b\u000f᠌\t", new Object[]{"d", "c", "b", "e", "f", "h", etlk.class, "m", etlu.a, "i", etln.a, "j", etll.a, "g", etlw.a, "l", etls.a, "k", etnt.class, "n", etlq.a});
        }
        if (iOrdinal == 3) {
            return new etly();
        }
        if (iOrdinal == 4) {
            return new etlp();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = o;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (etly.class) {
            evsgVar = o;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                o = evsgVar;
            }
        }
        return evsgVar;
    }
}

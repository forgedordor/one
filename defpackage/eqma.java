package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqma extends evsn implements evui {
    public static final eqma a;
    private static volatile evuo k;
    public int b;
    public eqny c;
    public String d = "";
    public evtg e;
    public int f;
    public String g;
    public String h;
    public boolean i;
    public evvp j;

    static {
        eqma eqmaVar = new eqma();
        a = eqmaVar;
        evsn.registerDefaultInstance(eqma.class, eqmaVar);
    }

    private eqma() {
        emptyIntList();
        emptyIntList();
        evsn.emptyProtobufList();
        this.e = evsn.emptyProtobufList();
        this.g = "";
        this.h = "";
    }

    public final void a() {
        evtg evtgVar = this.e;
        if (evtgVar.c()) {
            return;
        }
        this.e = evsn.mutableCopy(evtgVar);
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\b\u0000\u0001\u0003ϧ\b\u0000\u0001\u0000\u0003Ȉ\u0006\u0004\u0007Ȉ\u000bȈ\fȚ\u000e\u0007\u0011ဉ\u0005ϧဉ\u0000", new Object[]{"b", "d", "f", "g", "h", "e", "i", "j", "c"});
        }
        if (iOrdinal == 3) {
            return new eqma();
        }
        if (iOrdinal == 4) {
            return new eqlz();
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
        synchronized (eqma.class) {
            evsgVar = k;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                k = evsgVar;
            }
        }
        return evsgVar;
    }
}

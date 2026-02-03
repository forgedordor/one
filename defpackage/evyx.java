package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class evyx extends evsn implements evui {
    public static final evyx a;
    private static volatile evuo o;
    public int b;
    public int c;
    public int d;
    public int e;
    public evym f;
    public boolean g;
    public int h;
    public int i;
    public long j;
    public long k;
    public evtg l;
    public int m;
    public evyo n;

    static {
        evyx evyxVar = new evyx();
        a = evyxVar;
        evsn.registerDefaultInstance(evyx.class, evyxVar);
    }

    private evyx() {
        emptyIntList();
        this.l = emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\f\u0000\u0001\u0002\u000e\f\u0000\u0001\u0000\u0002င\u0000\u0003င\u0001\u0004င\u0002\u0005ဉ\u0003\u0007ဇ\u0005\bဂ\b\tဂ\t\n\u001b\u000b᠌\n\fဉ\u000b\rင\u0006\u000eင\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "j", "k", "l", evyu.class, "m", evyw.a, "n", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new evyx();
        }
        if (iOrdinal == 4) {
            return new evyv();
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
        synchronized (evyx.class) {
            evsgVar = o;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                o = evsgVar;
            }
        }
        return evsgVar;
    }
}

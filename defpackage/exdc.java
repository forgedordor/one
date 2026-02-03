package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exdc extends evsn implements evui {
    public static final exdc a;
    private static volatile evuo o;
    public int b;
    public int c;
    public String d = "";
    public int e;
    public long f;
    public long g;
    public int h;
    public evsx i;
    public evsx j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;

    static {
        exdc exdcVar = new exdc();
        a = exdcVar;
        evsn.registerDefaultInstance(exdc.class, exdcVar);
    }

    private exdc() {
        emptyIntList();
        emptyIntList();
        emptyIntList();
        emptyIntList();
        emptyIntList();
        evsn.emptyProtobufList();
        evsn.emptyProtobufList();
        evsn.emptyProtobufList();
        evsn.emptyProtobufList();
        emptyIntList();
        this.i = emptyIntList();
        this.j = emptyIntList();
        emptyIntList();
        emptyIntList();
        emptyIntList();
        emptyLongList();
        emptyIntList();
        emptyIntList();
        emptyLongList();
        emptyIntList();
        emptyIntList();
        emptyIntList();
        emptyIntList();
        emptyIntList();
        emptyIntList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u000b\u0000\u0002\u0005ȯ\u000b\u0000\u0002\u0000\u0005᠌\u000e\tဂ\u000f\u008cဃ\u0010Ċဈ\bųင+ſ'ƀ,Ƅဇ1Ɠဇ3ƹဇ/ȯ᠌0", new Object[]{"b", "c", "e", evpo.a, "f", "g", "d", "h", "i", "j", "m", "n", "k", "l", evpq.a});
        }
        if (iOrdinal == 3) {
            return new exdc();
        }
        if (iOrdinal == 4) {
            return new exdb();
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
        synchronized (exdc.class) {
            evsgVar = o;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                o = evsgVar;
            }
        }
        return evsgVar;
    }
}

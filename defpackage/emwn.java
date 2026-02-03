package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emwn extends evsn implements evui {
    public static final evsy a = new emvz();
    public static final emwn b;
    private static volatile evuo s;
    public int c;
    public long e;
    public int f;
    public evrj g;
    public int j;
    public int k;
    public boolean l;
    public int n;
    public int o;
    public emwi p;
    public int q;
    public emwy r;
    public String d = "";
    public evsx h = emptyIntList();
    public evtg i = emptyProtobufList();
    public String m = "";

    static {
        emwn emwnVar = new emwn();
        b = emwnVar;
        evsn.registerDefaultInstance(emwn.class, emwnVar);
    }

    private emwn() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0004\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0002\u0000\u0001ለ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဉ\u0003\u0005ࠬ\u0006\u001b\u0007ဌ\u0004\bင\u0005\tဇ\u0006\nለ\u0007\u000bဌ\b\fင\t\rဉ\n\u000eဌ\u000b\u000fဉ\f", new Object[]{"c", "d", "e", "f", emwb.a, "g", "h", emwl.a, "i", emwk.class, "j", "k", "l", "m", "n", "o", "p", "q", "r"});
        }
        if (iOrdinal == 3) {
            return new emwn();
        }
        if (iOrdinal == 4) {
            return new emwa();
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = s;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (emwn.class) {
            evsgVar = s;
            if (evsgVar == null) {
                evsgVar = new evsg(b);
                s = evsgVar;
            }
        }
        return evsgVar;
    }
}

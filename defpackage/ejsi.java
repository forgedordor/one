package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejsi extends evsn implements evui {
    public static final evsy a = new ejsb();
    public static final ejsi b;
    private static volatile evuo s;
    public Object d;
    public int f;
    public int g;
    public int h;
    public long i;
    public long j;
    public int k;
    public int l;
    public long m;
    public evsx n;
    public evta o;
    public int p;
    public int q;
    public int r;
    public int c = 0;
    public String e = "";

    static {
        ejsi ejsiVar = new ejsi();
        b = ejsiVar;
        evsn.registerDefaultInstance(ejsi.class, ejsiVar);
    }

    private ejsi() {
        emptyProtobufList();
        this.n = emptyIntList();
        this.o = emptyLongList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0000\u000f\u0001\u0000\u0001k\u000f\u0000\u0002\u0000\u0001Ȉ\u0002\u000b\u0003\f\u0011\f\u0013\f\u0016\u000b\u0017\u0002\u0018\u0002\u001a\u0003d,g\fh%i\fj\fk<\u0000", new Object[]{"d", "c", "e", "f", "g", "k", "l", "h", "i", "j", "m", "n", "p", "o", "q", "r", ejsh.class});
        }
        if (iOrdinal == 3) {
            return new ejsi();
        }
        if (iOrdinal == 4) {
            return new ejsc();
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
        synchronized (ejsi.class) {
            evsgVar = s;
            if (evsgVar == null) {
                evsgVar = new evsg(b);
                s = evsgVar;
            }
        }
        return evsgVar;
    }
}

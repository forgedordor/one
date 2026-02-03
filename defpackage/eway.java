package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eway extends evsn implements evui {
    public static final evsy a = new ewaw();
    public static final eway b;
    private static volatile evuo o;
    public boolean c;
    public boolean d;
    public boolean e;
    public ewap f;
    public boolean g;
    public boolean h;
    public boolean i;
    public evsx j = emptyIntList();
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    private int p;

    static {
        eway ewayVar = new eway();
        b = ewayVar;
        evsn.registerDefaultInstance(eway.class, ewayVar);
    }

    private eway() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0001\f\u0000\u0001\u0004\u001d\f\u0000\u0001\u0000\u0004ဇ\u0003\fဇ\u000b\rဇ\f\u0011ဉ\u0010\u0013ဇ\u0012\u0016ဇ\u0015\u0017ဇ\u0016\u0019ࠬ\u001aဇ\u0018\u001bဇ\u0019\u001cဇ\u001a\u001dဇ\u001b", new Object[]{"p", "c", "d", "e", "f", "g", "h", "i", "j", ewus.a, "k", "l", "m", "n"});
        }
        if (iOrdinal == 3) {
            return new eway();
        }
        if (iOrdinal == 4) {
            return new ewax();
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = o;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eway.class) {
            evsgVar = o;
            if (evsgVar == null) {
                evsgVar = new evsg(b);
                o = evsgVar;
            }
        }
        return evsgVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eswn extends evsn implements evui {
    public static final eswn a;
    private static volatile evuo k;
    public int b;
    public int c;
    public long d;
    public feeg e;
    public eswe f;
    public eoid g;
    public eswg h;
    public evtg i;
    public eswm j;
    private byte l = 2;

    static {
        eswn eswnVar = new eswn();
        a = eswnVar;
        evsn.registerDefaultInstance(eswn.class, eswnVar);
    }

    private eswn() {
        evqs evqsVar = evqs.b;
        this.i = emptyProtobufList();
        emptyLongList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\b\u0000\u0001\u0002\u0010\b\u0000\u0001\u0002\u0002ဉ\u0004\u0003ᐉ\u0005\u0007ဉ\u0006\t\u001b\f᠌\u0000\rဂ\u0001\u000eᐉ\u0002\u0010ဉ\b", new Object[]{"b", "f", "g", "h", "i", esws.class, "c", eswk.a, "d", "e", "j"});
            case 3:
                return new eswn();
            case 4:
                return new eswj();
            case 5:
                return a;
            case 6:
                evuo evuoVar = k;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (eswn.class) {
                    evsgVar = k;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        k = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}

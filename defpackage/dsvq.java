package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsvq extends evsi implements dsvr {
    public static final dsvq a;
    private static volatile evuo i;
    public int b;
    public eohx d;
    public int e;
    public long f;
    public long g;
    public long h;
    private byte j = 2;
    public evsx c = emptyIntList();

    static {
        dsvq dsvqVar = new dsvq();
        a = dsvqVar;
        evsn.registerDefaultInstance(dsvq.class, dsvqVar);
    }

    private dsvq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0002\b\u0006\u0000\u0001\u0001\u0002\u0016\u0004ᐉ\u0000\u0005᠌\u0001\u0006ဂ\u0002\u0007ဂ\u0003\bဂ\u0004", new Object[]{"b", "c", "d", "e", emmx.a, "f", "g", "h"});
            case 3:
                return new dsvq();
            case 4:
                return new dsvp();
            case 5:
                return a;
            case 6:
                evuo evuoVar = i;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (dsvq.class) {
                    evsgVar = i;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        i = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}

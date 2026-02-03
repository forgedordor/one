package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewyo extends evsn implements evui {
    public static final ewyo a;
    private static volatile evuo i;
    public Object c;
    public int d;
    public int e;
    public int h;
    public int b = 0;
    public String f = "";
    public String g = "";

    static {
        ewyo ewyoVar = new ewyo();
        a = ewyoVar;
        evsn.registerDefaultInstance(ewyo.class, ewyoVar);
    }

    private ewyo() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u000b\u0001\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001\f\u0002\f\u0003Ȉ\u0004Ȉ\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b\f", new Object[]{"c", "b", "d", "e", "f", "g", ewya.class, ewye.class, ewyh.class, ewyn.class, ewyl.class, ewyj.class, "h"});
        }
        if (iOrdinal == 3) {
            return new ewyo();
        }
        if (iOrdinal == 4) {
            return new ewxy();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = i;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ewyo.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}

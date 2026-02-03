package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sfx extends evsn implements evui {
    public static final sfx a;
    private static volatile evuo c;
    public sfr b;
    private int d;

    static {
        sfx sfxVar = new sfx();
        a = sfxVar;
        evsn.registerDefaultInstance(sfx.class, sfxVar);
    }

    private sfx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"d", "b"});
        }
        if (iOrdinal == 3) {
            return new sfx();
        }
        if (iOrdinal == 4) {
            return new sfw();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (sfx.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}

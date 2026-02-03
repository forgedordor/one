package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezdm extends evsn implements evui {
    public static final ezdm a;
    private static volatile evuo h;
    public long e;
    public String b = "";
    public String c = "";
    public String d = "";
    public String f = "";
    public String g = "";

    static {
        ezdm ezdmVar = new ezdm();
        a = ezdmVar;
        evsn.registerDefaultInstance(ezdm.class, ezdmVar);
    }

    private ezdm() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0002\u0005Ȉ\u0006Ȉ", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new ezdm();
        }
        if (iOrdinal == 4) {
            return new ezdl();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = h;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ezdm.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}

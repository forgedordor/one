package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezdk extends evsn implements evui {
    public static final ezdk a;
    private static volatile evuo g;
    public int b;
    public String c = "";
    public ezbd d;
    public ezdm e;
    public ezhi f;

    static {
        ezdk ezdkVar = new ezdk();
        a = ezdkVar;
        evsn.registerDefaultInstance(ezdk.class, ezdkVar);
    }

    private ezdk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new ezdk();
        }
        if (iOrdinal == 4) {
            return new ezdj();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ezdk.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}

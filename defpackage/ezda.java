package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezda extends evsn implements evui {
    public static final ezda a;
    private static volatile evuo g;
    public evtg b = emptyProtobufList();
    public evsx c = emptyIntList();
    public String d = "";
    public String e = "";
    public int f;

    static {
        ezda ezdaVar = new ezda();
        a = ezdaVar;
        evsn.registerDefaultInstance(ezda.class, ezdaVar);
    }

    private ezda() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0000\u0002\u0006\u0005\u0000\u0002\u0000\u0002\u001b\u0003'\u0004Ȉ\u0005Ȉ\u0006\f", new Object[]{"b", ezgi.class, "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new ezda();
        }
        if (iOrdinal == 4) {
            return new ezcz();
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
        synchronized (ezda.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}

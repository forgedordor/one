package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezdv extends evsn implements evui {
    public static final ezdv a;
    private static volatile evuo h;
    public Object c;
    public long e;
    public int b = 0;
    private byte i = 2;
    public String d = "";
    public evtg f = emptyProtobufList();
    public evtg g = emptyProtobufList();

    static {
        ezdv ezdvVar = new ezdv();
        a = ezdvVar;
        evsn.registerDefaultInstance(ezdv.class, ezdvVar);
    }

    private ezdv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0007\u0001\u0000\u0001\"\u0007\u0000\u0002\u0001\u0001Ȉ\u0002\u0002\u001eȻ\u0000\u001f<\u0000 Л!\u001b\"<\u0000", new Object[]{"c", "b", "d", "e", ezdg.class, "f", ezds.class, "g", ezgi.class, ezbh.class});
            case NEW_MUTABLE_INSTANCE:
                return new ezdv();
            case NEW_BUILDER:
                return new ezdu();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = h;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (ezdv.class) {
                    evsgVar = h;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        h = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}

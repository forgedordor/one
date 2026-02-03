package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emkr extends evsn implements evui {
    public static final emkr a;
    private static volatile evuo o;
    public int b;
    public Object d;
    public Object f;
    public emkl g;
    public emkl h;
    public ewdo i;
    public int j;
    public int k;
    public ewel n;
    public int c = 0;
    public int e = 0;
    private byte p = 2;
    public String l = "";
    public String m = "";

    static {
        emkr emkrVar = new emkr();
        a = emkrVar;
        evsn.registerDefaultInstance(emkr.class, emkrVar);
    }

    private emkr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.p);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.p = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004#\u0002\u0001\u0002(#\u0000\u0000\u0001\u0002ဉ\u0001\u0003ဉ\u0002\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0001\n<\u0001\u000b<\u0001\f<\u0001\r<\u0001\u000e<\u0001\u000f<\u0001\u0010<\u0001\u0011<\u0001\u0012м\u0001\u0014<\u0001\u0015<\u0001\u0016<\u0001\u0017<\u0001\u0018ဉ\u0006\u0019<\u0001\u001a᠌\u0007\u001b᠌\b\u001c<\u0001\u001d<\u0001\u001eဈ\t\u001f<\u0001 <\u0001!<\u0001#ဈ\n$<\u0001%<\u0001&<\u0001'<\u0001(ဉ\u000b", new Object[]{"d", "c", "f", "e", "b", "g", "h", ewfc.class, ewfa.class, ewfg.class, ewgc.class, ewco.class, ewjy.class, ewen.class, ewfm.class, ewdt.class, ewcv.class, ewey.class, ewgi.class, ewse.class, ewsa.class, ewck.class, ewkr.class, ewgg.class, "i", ewnz.class, "j", emkn.a, "k", emkp.a, ewdm.class, ewcm.class, "l", ewge.class, ewct.class, ewdr.class, "m", ewpi.class, ewkz.class, ewej.class, fecc.class, "n"});
            case NEW_MUTABLE_INSTANCE:
                return new emkr();
            case NEW_BUILDER:
                return new emkm();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                evuo evuoVar = o;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (emkr.class) {
                    evsgVar = o;
                    if (evsgVar == null) {
                        evsgVar = new evsg(a);
                        o = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}

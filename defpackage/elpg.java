package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elpg extends evsn implements evui {
    public static final evsy a = new elnc();
    private static volatile evuo aE;
    public static final elpg b;
    public int A;
    public int B;
    public long C;
    public int D;
    public int E;
    public int F;
    public long G;
    public eltf K;
    public int L;
    public enxu M;
    public elwq N;
    public int O;
    public int P;
    public int Q;
    public elho S;
    public elvp T;
    public elyy U;
    public int W;
    public int Y;
    public int Z;
    public int aA;
    public elwa aB;
    public int aC;
    public enph aD;
    public long aa;
    public boolean ab;
    public int ac;
    public int af;
    public boolean ag;
    public int ah;
    public int ai;
    public int aj;
    public emwy ak;
    public embp al;
    public int am;
    public int an;
    public emiv ao;
    public int ap;
    public emws aq;
    public int as;
    public int at;
    public boolean au;
    public emwy av;
    public int aw;
    public elnh ax;
    public int ay;
    public long az;
    public int c;
    public int d;
    public int e;
    public Object g;
    public int h;
    public int i;
    public elpy j;
    public elpl k;
    public elua l;
    public eltk m;
    public int n;
    public long o;
    public fhaz p;
    public ella q;
    public ella r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public elvv y;
    public long z;
    public int f = 0;
    private byte aF = 2;
    public String H = "";
    public evsr I = emptyBooleanList();
    public String J = "";
    public String R = "";
    public evtg V = emptyProtobufList();
    public evsx X = emptyIntList();
    public String ad = "";
    public String ae = "";
    public String ar = "";

    static {
        elpg elpgVar = new elpg();
        b = elpgVar;
        evsn.registerDefaultInstance(elpg.class, elpgVar);
    }

    private elpg() {
    }

    public final void a() {
        evtg evtgVar = this.V;
        if (evtgVar.c()) {
            return;
        }
        this.V = evsn.mutableCopy(evtgVar);
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        switch (evsmVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.aF);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.aF = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                evsv evsvVar = enyv.a;
                return newMessageInfo(b, "\u0001N\u0001\u0003\u0001^N\u0000\u0003\u0001\u0001᠌\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ᐉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007<\u0000\b᠌\u0006\tဂ\u0007\nဉ\u000b\f᠌\u000e\u000e᠌\u0010\u000f᠌\u0011\u0010᠌\u0012\u0011᠌\u0013\u0012᠌\u0014\u0014ဉ\u0016\u0015ဂ\u0017\u0016᠌\u0018\u0017᠌\u0019\u0018᠌\u001b\u0019᠌\u001c\u001a᠌\u001d\u001bဂ\u001e\u001cဉ\r\u001dဈ\u001f\u001e\u0019\u001fဈ %ဉ%)<\u0000*᠌)+ဉ*,ဉ+-᠌,.᠌-/᠌.0ဈ/1ဉ02ဉ13ဉ24\u001b5᠌37ࠞ8᠌59ဂ\u001a:ဂ7;ဇ8<<\u0000=᠌9>ဈ:?ဈ;A᠌=Bဇ>C᠌?D᠌@E᠌AFဉBGဉCHငDI᠌EJဉFMဉ\nN᠌GOဉHPဈIQ᠌JR᠌KSဇLTဉMVငNWဉOX᠌6Y᠌PZဂQ[᠌R\\ဉS]᠌T^ဉU", new Object[]{"g", "f", "c", "d", "e", "h", elob.a, "i", elnz.a, "j", "k", "l", "m", elpv.class, "n", elnx.a, "o", "q", "s", elkd.a, "t", elnv.a, "u", elnl.a, "v", elod.a, "w", elnt.a, "x", enwq.a, "y", "z", "A", elnq.a, VCardConstants.PARAM_ENCODING_B, elot.a, "D", emif.a, "E", eloh.a, "F", eloo.a, "G", "r", "H", "I", "J", "K", eltq.class, "L", elvf.a, "M", VCardConstants.PROPERTY_N, "O", elou.a, "P", elor.a, "Q", elni.a, "R", "S", "T", "U", "V", elyy.class, "W", elov.a, "X", elnr.a, "Y", evsvVar, "C", "aa", "ab", elrs.class, "ac", eloy.a, "ad", "ae", "af", elnj.a, "ag", "ah", elok.a, "ai", elop.a, "aj", elom.a, "ak", "al", "am", "an", elpe.a, "ao", "p", "ap", elpd.a, "aq", "ar", "as", eloj.a, "at", elpb.a, "au", "av", "aw", "ax", "Z", evsvVar, "ay", eloz.a, "az", "aA", elog.a, "aB", "aC", elnd.a, "aD"});
            case NEW_MUTABLE_INSTANCE:
                return new elpg();
            case NEW_BUILDER:
                return new elof();
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                evuo evuoVar = aE;
                if (evuoVar != null) {
                    return evuoVar;
                }
                synchronized (elpg.class) {
                    evsgVar = aE;
                    if (evsgVar == null) {
                        evsgVar = new evsg(b);
                        aE = evsgVar;
                    }
                }
                return evsgVar;
            default:
                throw null;
        }
    }
}

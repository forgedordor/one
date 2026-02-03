package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eluz extends evsn implements evui {
    public static final eluz a;
    private static volatile evuo au;
    public int A;
    public long B;
    public int C;
    public int D;
    public int E;
    public long G;
    public long H;
    public long I;
    public long J;
    public long K;
    public long L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public elrq U;
    public int V;
    public int W;
    public long X;
    public long Y;
    public long Z;
    public long aa;
    public long ab;
    public int ac;
    public long ad;
    public int ae;
    public int af;
    public elyv ag;
    public boolean ah;
    public boolean ai;
    public elxp aj;
    public int al;
    public elzv am;
    public int an;
    public int ao;
    public evvp ap;
    public elqz aq;
    public elqv ar;
    public boolean as;
    public cdjp at;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public elua f;
    public elua g;
    public boolean j;
    public int k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public elip p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public elvv z;
    public int h = -1;
    public evtg i = emptyProtobufList();
    public String F = "";
    public String ak = "";

    static {
        eluz eluzVar = new eluz();
        a = eluzVar;
        evsn.registerDefaultInstance(eluz.class, eluzVar);
    }

    private eluz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            evsv evsvVar = eluk.a;
            return newMessageInfo(a, "\u0001D\u0000\u0003\u0001ND\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005င\u0004\u0007\u001b\bဇ\u0006\tင\u0007\u000bဇ\t\u000e᠌\f\u000f᠌\r\u0010᠌\u000e\u0011ဉ\u000f\u0012င\u0010\u0013᠌\u0011\u0014င\u0012\u0015င\u0013\u0016င\u0014\u0017င\u0015\u0018᠌\u0016\u0019᠌\u0017\u001a᠌\u0018\u001bဉ\u0019\u001c᠌\u001a\u001dဂ\u001b\u001eင\u001c\u001fင\u001d ᠌\u001e!ဈ\u001f\"ဂ #ဂ!$ဂ\"%ဂ#&ဂ$'ဂ%(᠌&)င'*᠌(+᠌),᠌*.᠌,/᠌-0᠌.1ဉ/2᠌04᠌25ဂ36ဂ47ဂ58ဂ69ဂ7:᠌8;ဂ9<᠌:=င;>ဉ<?ဇ=@ဇ>Aဉ?Bဈ@C᠌AEဉCG᠌EH᠌FIဉGJဉHKဉIMဇJNဉK", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", eltk.class, "j", "k", "l", "m", eluc.a, "n", eluh.a, "o", elui.a, "p", "q", "r", elug.a, "s", "t", "u", "v", "w", evsvVar, "x", evsvVar, "y", elut.a, "z", "A", elus.a, VCardConstants.PARAM_ENCODING_B, "C", "D", "E", elub.a, "F", "G", "H", "I", "J", "K", "L", "M", eluo.a, VCardConstants.PROPERTY_N, "O", evsvVar, "P", evsvVar, "Q", evsvVar, "R", eluf.a, "S", elum.a, "T", ewrr.a, "U", "V", eluv.a, "W", elux.a, "X", "Y", "Z", "aa", "ab", "ac", emfd.a, "ad", "ae", elvf.a, "af", "ag", "ah", "ai", "aj", "ak", "al", eluq.a, "am", "an", elur.a, "ao", elue.a, "ap", "aq", "ar", "as", "at"});
        }
        if (iOrdinal == 3) {
            return new eluz();
        }
        if (iOrdinal == 4) {
            return new elud();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = au;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eluz.class) {
            evsgVar = au;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                au = evsgVar;
            }
        }
        return evsgVar;
    }
}

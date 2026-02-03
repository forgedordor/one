package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aumq extends evsn<aumq, aumg> implements evui {
    private static volatile evuo S;
    public static final aumq a;
    public boolean A;
    public boolean B;
    public ausj C;
    public boolean D;
    public int E;
    public ausg G;
    public evvp H;
    public evvp I;
    public evvp M;
    public evvp N;
    public evrj P;
    public evrj R;
    public int b;
    public int c;
    public boolean e;
    public int f;
    public evvp i;
    public boolean k;
    public int l;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public int r;
    public ausb s;
    public aumf t;
    public aulz u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public aump z;
    public evub F = evub.a;
    public boolean d = true;
    public String g = "";
    public String h = "";
    public String j = "";
    public String m = "";
    public String J = "";
    public String K = "";
    public evtg L = evsn.emptyProtobufList();
    public String O = "";
    public String Q = "";

    static {
        aumq aumqVar = new aumq();
        a = aumqVar;
        evsn.registerDefaultInstance(aumq.class, aumqVar);
    }

    private aumq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            evsv evsvVar = aumk.a;
            return newMessageInfo(a, "\u0001)\u0000\u0002\u00014)\u0001\u0001\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဉ\u0005\u0007ဈ\u0006\bဇ\u0007\t᠌\b\nဈ\t\u000bင\n\f᠌\u000b\rင\f\u000eဇ\r\u000f᠌\u000e\u0010ဉ\u000f\u0011ဉ\u0010\u0012ဉ\u0011\u0014ဇ\u0013\u0015ဇ\u0014\u0016ဇ\u0015\u001a᠌\u0018\u001eဉ\u001b\u001fဇ\u001c ဇ\u001d!ဉ\u001e\"ဇ\u001f#င $2&ဉ\"'ဉ#(ဉ$*ဈ%,ဈ&-\u001a.ဉ'/ဉ(0ဈ)1ဉ*3ဈ,4ဉ-", new Object[]{"b", "c", "d", "e", "f", auts.a, "g", "h", "i", "j", "k", "l", evsvVar, "m", "n", "o", aumm.a, "p", "q", "r", evsvVar, "s", "t", "u", "v", "w", "x", "y", aumi.a, "z", "A", VCardConstants.PARAM_ENCODING_B, "C", "D", "E", "F", aumh.a, "G", "H", "I", "J", "K", "L", "M", VCardConstants.PROPERTY_N, "O", "P", "Q", "R"});
        }
        if (iOrdinal == 3) {
            return new aumq();
        }
        if (iOrdinal == 4) {
            return new aumg();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = S;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (aumq.class) {
            evsgVar = S;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                S = evsgVar;
            }
        }
        return evsgVar;
    }
}

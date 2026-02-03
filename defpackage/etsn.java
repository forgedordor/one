package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etsn extends evsn implements evui {
    private static volatile evuo T;
    public static final etsn a;
    public int A;
    public int C;
    public boolean D;
    public boolean E;
    public boolean G;
    public boolean H;
    public int I;
    public int K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public int P;
    public int Q;
    public boolean R;
    public boolean S;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean i;
    public int j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;
    public int t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;
    public boolean y;
    public evrj z;
    public String g = "";
    public String h = "";
    public String B = "";
    public String F = "";
    public String J = "";

    static {
        etsn etsnVar = new etsn();
        a = etsnVar;
        evsn.registerDefaultInstance(etsn.class, etsnVar);
    }

    private etsn() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000*\u0000\u0002\u0001**\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ဇ\u0005\u0007င\u0006\bဇ\u0007\tဇ\b\nင\t\u000bင\n\fင\u000b\rဇ\f\u000eဇ\r\u000fဇ\u000e\u0010ဋ\u000f\u0011ဋ\u0010\u0012ဇ\u0011\u0013ဇ\u0012\u0014ဇ\u0013\u0015င\u0014\u0016ဇ\u0015\u0017ဉ\u0016\u0018င\u0017\u0019ለ\u0018\u001aင\u0019\u001bဇ\u001a\u001cဇ\u001b\u001dለ\u001c\u001eဇ\u001d\u001fဇ\u001e င\u001f!ለ \"င!#ဇ\"$ဇ#%ဇ$&ဇ%'ဌ&(င')ဇ(*ဇ)", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", VCardConstants.PARAM_ENCODING_B, "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", VCardConstants.PROPERTY_N, "O", "P", "Q", "R", "S"});
        }
        if (iOrdinal == 3) {
            return new etsn();
        }
        if (iOrdinal == 4) {
            return new etsm();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = T;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (etsn.class) {
            evsgVar = T;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                T = evsgVar;
            }
        }
        return evsgVar;
    }
}

package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elvp extends evsn implements evui {
    private static volatile evuo O;
    public static final elvp a;
    public embi A;
    public embi B;
    public embi C;
    public embi D;
    public embi E;
    public embi F;
    public emit G;
    public elhv H;
    public elhv I;
    public elhv J;
    public elhv K;
    public elhv L;
    public elhv M;
    public elhv N;
    public int b;
    public int c;
    public elhv d;
    public elhv e;
    public elhv f;
    public elhv g;
    public elhv h;
    public embi i;
    public embi j;
    public embi k;
    public elhv l;
    public elhv m;
    public elhv n;
    public embi o;
    public emit p;
    public emit q;
    public emit r;
    public emit s;
    public elhv t;
    public embi u;
    public embi v;
    public elhv w;
    public elhv x;
    public elhv y;
    public elhv z;

    static {
        elvp elvpVar = new elvp();
        a = elvpVar;
        evsn.registerDefaultInstance(elvp.class, elvpVar);
    }

    private elvp() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001%\u0000\u0002\u0001&%\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\nဉ\t\u000bဉ\n\fဉ\u000b\rဉ\f\u000eဉ\r\u000fဉ\u000e\u0010ဉ\u000f\u0011ဉ\u0010\u0012ဉ\u0011\u0013ဉ\u0012\u0014ဉ\u0013\u0015ဉ\u0014\u0016ဉ\u0015\u0017ဉ\u0016\u0018ဉ\u0017\u0019ဉ\u0018\u001aဉ\u0019\u001bဉ\u001a\u001cဉ\u001b\u001dဉ\u001c\u001eဉ\u001d\u001fဉ\u001e ဉ\u001f!ဉ \"ဉ!#ဉ\"$ဉ#%ဉ$&ဉ%", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", VCardConstants.PARAM_ENCODING_B, "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", VCardConstants.PROPERTY_N});
        }
        if (iOrdinal == 3) {
            return new elvp();
        }
        if (iOrdinal == 4) {
            return new elvo();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = O;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (elvp.class) {
            evsgVar = O;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                O = evsgVar;
            }
        }
        return evsgVar;
    }
}

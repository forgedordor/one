package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eutz extends evsn implements evui {
    public static final eutz a;
    private static volatile evuo ao;
    public int A;
    public int C;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public eutq R;
    public eybi U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean aa;
    public boolean ab;
    public boolean ac;
    public boolean ad;
    public boolean ae;
    public boolean af;
    public eutu ag;
    public euts ah;
    public eutb aj;
    public eusp ak;
    public eusj al;
    public boolean am;
    public euuf an;
    public int b;
    public int c;
    public eybi f;
    public eybi i;
    public eutw o;
    public eybg p;
    public esxi q;
    public double r;
    public eutq v;
    public int w;
    public int z;
    public String d = "";
    public String e = "";
    public evtg g = evsn.emptyProtobufList();
    public String h = "";
    public String j = "";
    public String k = "";
    public String l = "";
    public String m = "";
    public evtg n = emptyProtobufList();
    public String s = "";
    public String t = "";
    public evtg u = emptyProtobufList();
    public evtg x = emptyProtobufList();
    public String y = "";
    public evtg B = emptyProtobufList();
    public String D = "";
    public String E = "";
    public evtg S = emptyProtobufList();
    public evtg T = emptyProtobufList();
    public evtg ai = emptyProtobufList();

    static {
        eutz eutzVar = new eutz();
        a = eutzVar;
        evsn.registerDefaultInstance(eutz.class, eutzVar);
    }

    private eutz() {
        emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000?\u0000\u0002\u0001V?\u0000\b\u0000\u0001Ȉ\u0002Ȉ\u0005Ț\u0007Ȉ\bȈ\tȈ\n\u001b\u000bဉ\u0003\fဉ\u0004\rဉ\u0005\u000e\u0000\u000fȈ\u0010Ȉ\u0015ဉ\u0006\u0016င\u0007\u0018Ȉ\u0019\f\u001a\f\u001b\u001b\u001cင\t\u001dȈ\u001eȈ\u001fဉ\u0000 ဉ\u0001!ဇ\n\"ဇ\u000b#ဇ\f$ဇ\r&ဇ\u000e'ဇ\u000f(ဇ\u0010)ဇ\u0011*ဇ\u0012+ဇ\u0013,ဇ\u0014-ဇ\u0015.ဉ\u0016/\u001b1\u001b2Ȉ3Ȉ4ဉ\u00175\u001b6\u001b7ဇ\u00188ဇ\u00199ဇ\u001a:ဇ\u001b;ဇ\u001c<ဇ\u001d>ဇ\u001f?ဇ @ဇ!Aဇ\"Bဇ#Cဉ$Fဉ%G\u001bHဉ&Nဉ,Oဉ-Sဇ0Vဉ3", new Object[]{"b", "c", "d", "e", "g", "j", "k", "l", "n", eutd.class, "o", "p", "q", "r", "s", "t", "v", "w", "y", "z", "A", VCardConstants.PARAM_ENCODING_B, eutf.class, "C", "D", "E", "f", "i", "F", "G", "H", "I", "J", "K", "L", "M", VCardConstants.PROPERTY_N, "O", "P", "Q", "R", "S", eutq.class, "T", eutq.class, "h", "m", "U", "u", euuh.class, "x", eusx.class, "V", "W", "X", "Y", "Z", "aa", "ab", "ac", "ad", "ae", "af", "ag", "ah", "ai", euty.class, "aj", "ak", "al", "am", "an"});
        }
        if (iOrdinal == 3) {
            return new eutz();
        }
        if (iOrdinal == 4) {
            return new eutg();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = ao;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eutz.class) {
            evsgVar = ao;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                ao = evsgVar;
            }
        }
        return evsgVar;
    }
}

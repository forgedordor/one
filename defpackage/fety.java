package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fety extends feno {
    public static final fety b = new fety("BINARY");
    public static final fety c = new fety("BOOLEAN");
    public static final fety d = new fety("CAL-ADDRESS");
    public static final fety e = new fety("DATE");
    public static final fety f = new fety("DATE-TIME");
    public static final fety g = new fety("DURATION");
    public static final fety h = new fety("FLOAT");
    public static final fety i = new fety("INTEGER");
    public static final fety j = new fety("PERIOD");
    public static final fety k = new fety("RECUR");
    public static final fety l = new fety("TEXT");
    public static final fety m = new fety("TIME");
    public static final fety n = new fety("URI");
    public static final fety o = new fety("UTC-OFFSET");
    private static final long serialVersionUID = -7238642734500301768L;
    private final String p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fety(String str) {
        super(VCardConstants.PARAM_VALUE);
        int i2 = feop.a;
        this.p = fexb.e(str);
    }

    @Override // defpackage.fenc
    public final String a() {
        return this.p;
    }
}

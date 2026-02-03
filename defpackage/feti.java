package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feti extends feno {
    public static final feti b;
    public static final feti c;
    public static final feti d;
    private static final long serialVersionUID = 7536336461076399077L;
    private final String e;

    static {
        new feti(VCardConstants.PARAM_ENCODING_7BIT);
        b = new feti(VCardConstants.PARAM_ENCODING_8BIT);
        new feti("BINARY");
        c = new feti(VCardConstants.PARAM_ENCODING_QP);
        d = new feti(VCardConstants.PARAM_ENCODING_BASE64);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public feti(String str) {
        super(VCardConstants.PARAM_ENCODING);
        int i = feop.a;
        this.e = fexb.e(str);
    }

    @Override // defpackage.fenc
    public final String a() {
        return this.e;
    }
}

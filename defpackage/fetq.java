package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fetq extends feno {
    public static final fetq b = new fetq("START");
    public static final fetq c = new fetq(VCardConstants.PROPERTY_END);
    private static final long serialVersionUID = 1570525804115869565L;
    private final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fetq(String str) {
        super(VCardConstants.PROPERTY_RELATED);
        int i = feop.a;
        String strE = fexb.e(str);
        this.d = strE;
        if ("START".equals(strE) || VCardConstants.PROPERTY_END.equals(strE)) {
            return;
        }
        throw new IllegalArgumentException("Invalid value [" + strE + "]");
    }

    @Override // defpackage.fenc
    public final String a() {
        return this.d;
    }
}

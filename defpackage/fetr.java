package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fetr extends feno {
    public static final fetr b = new fetr("CHAIR");
    public static final fetr c = new fetr("REQ-PARTICIPANT");
    public static final fetr d = new fetr("OPT-PARTICIPANT");
    public static final fetr e = new fetr("NON-PARTICIPANT");
    private static final long serialVersionUID = 1438225631470825963L;
    private final String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fetr(String str) {
        super(VCardConstants.PROPERTY_ROLE);
        int i = feop.a;
        this.f = fexb.e(str);
    }

    @Override // defpackage.fenc
    public final String a() {
        return this.f;
    }
}

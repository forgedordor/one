package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fetl extends feno {
    private static final long serialVersionUID = 4864176270266226608L;
    private final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fetl(String str) {
        super(VCardConstants.PARAM_LANGUAGE);
        int i = feop.a;
        this.b = fexb.e(str);
    }

    @Override // defpackage.fenc
    public final String a() {
        return this.b;
    }
}

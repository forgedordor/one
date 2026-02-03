package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fetm extends feno {
    private static final long serialVersionUID = 287348849443687499L;
    private final femr b;

    public fetm(String str) {
        femr femrVar = new femr(fexb.e(str));
        int i = feop.a;
        super(VCardConstants.PROPERTY_MEMBER);
        this.b = femrVar;
    }

    @Override // defpackage.fenc
    public final String a() {
        return this.b.toString();
    }

    @Override // defpackage.feno
    protected final boolean b() {
        return false;
    }
}

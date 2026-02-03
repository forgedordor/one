package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fevo extends feou implements fenk {
    private static final long serialVersionUID = -2433059917714523286L;
    private String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fevo() {
        super(VCardConstants.PROPERTY_PRODID);
        fera feraVar = fera.a;
    }

    @Override // defpackage.fenc
    public final String a() {
        return this.c;
    }

    @Override // defpackage.feou
    public final void c(String str) {
        this.c = str;
    }
}

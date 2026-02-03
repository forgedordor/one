package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fevi extends feou implements fenk {
    private static final long serialVersionUID = -6930099834219160086L;
    private String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fevi() {
        super(VCardConstants.PROPERTY_NAME);
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

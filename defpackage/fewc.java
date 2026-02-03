package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fewc extends feou implements fenk {
    private static final long serialVersionUID = 3159826142152932485L;
    private String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fewc() {
        super(VCardConstants.PROPERTY_TEL);
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

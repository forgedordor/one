package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feuh extends feou {
    private static final long serialVersionUID = -7769987073466681634L;
    private fere c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public feuh() {
        super(VCardConstants.PROPERTY_CATEGORIES);
        fera feraVar = fera.a;
        this.c = new fere();
    }

    @Override // defpackage.fenc
    public final String a() {
        return this.c.toString();
    }

    @Override // defpackage.feou
    public final void c(String str) {
        this.c = new fere(str);
    }
}

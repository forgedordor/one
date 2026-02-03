package defpackage;

import com.android.vcard.VCardConstants;
import java.net.URI;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fewm extends feou {
    private static final long serialVersionUID = 1092576402256525737L;
    private URI c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fewm() {
        super(VCardConstants.PROPERTY_URL);
        fera feraVar = fera.a;
    }

    @Override // defpackage.fenc
    public final String a() {
        String strF = fexb.f(this.c);
        int i = fexd.a;
        return strF;
    }

    @Override // defpackage.feou
    public final void c(String str) {
        this.c = fexd.b(str);
    }
}

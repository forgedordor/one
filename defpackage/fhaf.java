package defpackage;

import com.android.vcard.VCardConstants;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhaf extends fgyj {
    public final HashMap f;

    public fhaf() {
        super("Type", 2);
        f(VCardConstants.PARAM_TYPE);
        this.f = new HashMap();
    }

    @Override // defpackage.fgyj
    public final void a(int i) {
        fhag.b(i);
    }

    public final void g(int i, String str, fgzh fgzhVar) {
        super.d(i, str);
        this.f.put(fgyj.b(i), fgzhVar);
    }
}

package defpackage;

import java.text.ParseException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fewf extends fewn {
    private static final long serialVersionUID = 5049421499261722194L;
    private fenj d;

    public fewf() {
        super("TRIGGER", fera.a);
    }

    @Override // defpackage.feuq, defpackage.fenc
    public final String a() {
        fenj fenjVar = this.d;
        return fenjVar != null ? fenjVar.toString() : super.a();
    }

    @Override // defpackage.feuq, defpackage.feou
    public final void c(String str) {
        try {
            super.c(str);
            this.d = null;
        } catch (ParseException unused) {
            this.d = new fenj(str);
            d(null);
        }
    }
}

package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class feup extends feou {
    private static final long serialVersionUID = 5233773091972759919L;
    public fene c;
    private ferg d;

    public feup(String str) {
        fety fetyVar = fety.f;
        fene feneVar = new fene(fetyVar);
        super(str, new feor());
        this.c = feneVar;
        if (fetyVar.equals(feneVar.a)) {
            return;
        }
        this.b.b(feneVar.a);
    }

    @Override // defpackage.fenc
    public String a() {
        return fexb.f(this.c);
    }

    @Override // defpackage.feou
    public void c(String str) {
        this.c = new fene(str, (fety) b(VCardConstants.PARAM_VALUE), this.d);
    }

    public void d(ferg fergVar) {
        if (this.c == null) {
            throw new UnsupportedOperationException("TimeZone is not applicable to current value");
        }
        this.d = fergVar;
        if (!fety.f.equals(this.c.a)) {
            throw new UnsupportedOperationException("TimeZone is not applicable to current value");
        }
        this.c.a(fergVar);
        this.b.a(b("TZID"));
        this.b.b(new fetx(fergVar.getID()));
    }
}

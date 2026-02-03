package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class feuq extends feou {
    private static final long serialVersionUID = 3160883132732961321L;
    public fend c;
    private ferg d;

    public feuq(String str) {
        super(str);
    }

    private final void h(ferg fergVar) {
        this.d = fergVar;
        if (fergVar == null) {
            f(g());
            return;
        }
        fend fendVar = this.c;
        if (fendVar != null && !(fendVar instanceof fenh)) {
            throw new UnsupportedOperationException("TimeZone is not applicable to current value");
        }
        if (fendVar != null) {
            ((fenh) fendVar).a(fergVar);
        }
        this.b.b(new fetx(fergVar.getID()));
    }

    @Override // defpackage.fenc
    public String a() {
        return fexb.f(this.c);
    }

    @Override // defpackage.feou
    public void c(String str) {
        String strTrim = str.trim();
        if (strTrim.length() != 8 && !fety.e.equals(b(VCardConstants.PARAM_VALUE))) {
            this.c = new fenh(strTrim, this.d);
        } else {
            h(null);
            this.c = new fend(strTrim);
        }
    }

    public final void d(fend fendVar) {
        this.c = fendVar;
        if (fendVar instanceof fenh) {
            if (fety.e.equals(b(VCardConstants.PARAM_VALUE))) {
                this.b.b(fety.f);
            }
            h(((fenh) fendVar).a);
        } else {
            if (fendVar != null) {
                this.b.b(fety.e);
            }
            h(null);
        }
    }

    public void e(ferg fergVar) {
        h(fergVar);
    }

    public final void f(boolean z) {
        fend fendVar = this.c;
        if (fendVar != null && (fendVar instanceof fenh)) {
            ((fenh) fendVar).b(z);
        }
        this.b.a(b("TZID"));
    }

    public final boolean g() {
        fend fendVar = this.c;
        if (fendVar instanceof fenh) {
            return ((fenh) fendVar).c();
        }
        return false;
    }

    @Override // defpackage.feou
    public final int hashCode() {
        return this.c.hashCode();
    }
}

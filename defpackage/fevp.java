package defpackage;

import com.android.vcard.VCardConstants;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fevp extends feup {
    private static final long serialVersionUID = -3320381650013860193L;
    private feot d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fevp() {
        super("RDATE");
        fera feraVar = fera.a;
        this.d = new feot(false, true);
    }

    @Override // defpackage.feup, defpackage.fenc
    public final String a() {
        feot feotVar = this.d;
        return (feotVar == null || (feotVar.isEmpty() && this.d.c)) ? super.a() : fexb.f(this.d);
    }

    @Override // defpackage.feup, defpackage.feou
    public final void c(String str) {
        if (fety.j.equals(b(VCardConstants.PARAM_VALUE))) {
            this.d = new feot(str);
        } else {
            super.c(str);
        }
    }

    @Override // defpackage.feup
    public final void d(ferg fergVar) {
        feot feotVar = this.d;
        if (feotVar == null || (feotVar.isEmpty() && this.d.c)) {
            super.d(fergVar);
            return;
        }
        feot feotVar2 = this.d;
        Iterator it = feotVar2.iterator();
        while (it.hasNext()) {
            feos feosVar = (feos) it.next();
            fenh fenhVar = (fenh) feosVar.a;
            fenhVar.b(false);
            fenhVar.a(fergVar);
            fenh fenhVar2 = (fenh) feosVar.b;
            fenhVar2.b(false);
            fenhVar2.a(fergVar);
        }
        feotVar2.a = fergVar;
        feotVar2.b = false;
    }
}

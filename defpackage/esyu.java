package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esyu extends esyv {
    final /* synthetic */ esyv a;

    public esyu(esyv esyvVar) {
        this.a = esyvVar;
    }

    @Override // defpackage.esyv
    public final Object a(etdb etdbVar) {
        if (etdbVar.t() != 9) {
            return this.a.a(etdbVar);
        }
        etdbVar.p();
        return null;
    }

    @Override // defpackage.esyv
    public final void b(etdd etddVar, Object obj) throws IOException {
        if (obj == null) {
            etddVar.j();
        } else {
            this.a.b(etddVar, obj);
        }
    }

    public final String toString() {
        return "NullSafeTypeAdapter[" + this.a.toString() + "]";
    }
}

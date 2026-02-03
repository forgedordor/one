package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esyc extends etbn {
    public esyv a = null;

    private final esyv e() {
        esyv esyvVar = this.a;
        if (esyvVar != null) {
            return esyvVar;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // defpackage.esyv
    public final Object a(etdb etdbVar) {
        return e().a(etdbVar);
    }

    @Override // defpackage.esyv
    public final void b(etdd etddVar, Object obj) {
        e().b(etddVar, obj);
    }

    @Override // defpackage.etbn
    public final esyv c() {
        return e();
    }
}

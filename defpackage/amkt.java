package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amkt implements cqto {
    final /* synthetic */ amkw a;

    public amkt(amkw amkwVar) {
        this.a = amkwVar;
    }

    @Override // defpackage.cqto
    public final void fJ() {
        final amkw amkwVar = this.a;
        amkwVar.g = cqty.b(amkwVar.b.a(amkwVar.d(), "ClassificationObservableSupplier#suggestionsQuery").f(new cqtk() { // from class: amkj
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                amkw amkwVar2 = amkwVar;
                return auvw.c(amkwVar2.a, fcyi.a, fdjz.a, new amkv(amkwVar2, null));
            }
        }, "ClassificationObservableSupplier::register", "ClassificationObservableSupplier::callback", "ClassificationObservableSupplier::unregister"));
    }

    @Override // defpackage.cqto
    public final void fK() {
        amkw amkwVar = this.a;
        cquc cqucVar = amkwVar.g;
        if (cqucVar != null) {
            cqucVar.a();
        }
        amkwVar.g = null;
    }
}

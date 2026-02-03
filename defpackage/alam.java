package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alam implements cqto {
    final /* synthetic */ alap a;

    public alam(alap alapVar) {
        this.a = alapVar;
    }

    @Override // defpackage.cqto
    public final void fJ() {
        final alap alapVar = this.a;
        alapVar.d = alapVar.b.a(alap.d(alapVar.c.a), "RbmSuggestionObservableSupplier#suggestionsQueryRbm").f(new cqtk() { // from class: alah
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                alap alapVar2 = alapVar;
                return auvw.c(alapVar2.a, fcyi.a, fdjz.a, new alao(alapVar2, null));
            }
        }, "RbmSuggestionObservableSupplier::register", "RbmSuggestionObservableSupplier::callback", "RbmSuggestionObservableSupplier::unregister");
    }

    @Override // defpackage.cqto
    public final void fK() {
        alap alapVar = this.a;
        cquc cqucVar = alapVar.d;
        if (cqucVar != null) {
            cqucVar.a();
        }
        alapVar.d = null;
    }
}

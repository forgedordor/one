package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alaw implements cqto {
    final /* synthetic */ alaz a;

    public alaw(alaz alazVar) {
        this.a = alazVar;
    }

    @Override // defpackage.cqto
    public final void fJ() {
        final alaz alazVar = this.a;
        alazVar.d = alazVar.b.a(alaz.d(alazVar.c.a), "RbmSuggestionObservableSupplierV2#suggestionsQueryRbm").f(new cqtk() { // from class: alau
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                alaz alazVar2 = alazVar;
                return auvw.c(alazVar2.a, fcyi.a, fdjz.a, new alay(alazVar2, null));
            }
        }, "RbmSuggestionObservableSupplierV2::register", "RbmSuggestionObservableSupplierV2::callback", "RbmSuggestionObservableSupplierV2::unregister");
    }

    @Override // defpackage.cqto
    public final void fK() {
        alaz alazVar = this.a;
        cquc cqucVar = alazVar.d;
        if (cqucVar != null) {
            cqucVar.a();
        }
        alazVar.d = null;
    }
}

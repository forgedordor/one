package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alab implements cqto {
    final /* synthetic */ alae a;

    public alab(alae alaeVar) {
        this.a = alaeVar;
    }

    @Override // defpackage.cqto
    public final void fJ() {
        final alae alaeVar = this.a;
        alaeVar.d = alaeVar.b.a(alae.d(alaeVar.c.a), "MessageAnnotationSuggestionObservableSupplierV2#suggestionsQueryMessageAnnotations").f(new cqtk() { // from class: akzx
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                alae alaeVar2 = alaeVar;
                return auvw.c(alaeVar2.a, fcyi.a, fdjz.a, new alad(alaeVar2, null));
            }
        }, "MessageAnnotationSuggestionObservableSupplierV2::register", "MessageAnnotationSuggestionObservableSupplierV2::callback", "MessageAnnotationSuggestionObservableSupplierV2::unregister");
    }

    @Override // defpackage.cqto
    public final void fK() {
        alae alaeVar = this.a;
        cquc cqucVar = alaeVar.d;
        if (cqucVar != null) {
            cqucVar.a();
        }
        alaeVar.d = null;
    }
}

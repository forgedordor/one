package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akzq implements cqto {
    final /* synthetic */ akzt a;

    public akzq(akzt akztVar) {
        this.a = akztVar;
    }

    @Override // defpackage.cqto
    public final void fJ() {
        final akzt akztVar = this.a;
        akztVar.d = akztVar.b.a(akzt.d(akztVar.c.a), "MessageAnnotationSuggestionObservableSupplier#suggestionsQueryMessageAnnotations").f(new cqtk() { // from class: akzo
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                akzt akztVar2 = akztVar;
                return auvw.c(akztVar2.a, fcyi.a, fdjz.a, new akzs(akztVar2, null));
            }
        }, "MessageAnnotationSuggestionObservableSupplier::register", "MessageAnnotationSuggestionObservableSupplier::callback", "MessageAnnotationSuggestionObservableSupplier::unregister");
    }

    @Override // defpackage.cqto
    public final void fK() {
        akzt akztVar = this.a;
        cquc cqucVar = akztVar.d;
        if (cqucVar != null) {
            cqucVar.a();
        }
        akztVar.d = null;
    }
}

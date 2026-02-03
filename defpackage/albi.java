package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class albi implements cqto {
    final /* synthetic */ albl a;

    public albi(albl alblVar) {
        this.a = alblVar;
    }

    @Override // defpackage.cqto
    public final void fJ() {
        final albl alblVar = this.a;
        alblVar.e = cqty.b(alblVar.b.a(crjq.c(alblVar.d.a, null, null), "ScreenEffectSuggestionObservableSupplier#suggestionsQuery").f(new cqtk() { // from class: albf
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                albl alblVar2 = alblVar;
                return auvw.c(alblVar2.a, fcyi.a, fdjz.a, new albk(alblVar2, null));
            }
        }, "ScreenEffectSuggestionObservableSupplier::register", "ScreenEffectSuggestionObservableSupplier::callback", "ScreenEffectSuggestionObservableSupplier::unregister"));
    }

    @Override // defpackage.cqto
    public final void fK() {
        albl alblVar = this.a;
        cquc cqucVar = alblVar.e;
        if (cqucVar != null) {
            cqucVar.a();
        }
        alblVar.e = null;
    }
}

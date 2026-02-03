package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class albq implements cqto {
    final /* synthetic */ albu a;

    public albq(albu albuVar) {
        this.a = albuVar;
    }

    @Override // defpackage.cqto
    public final void fJ() {
        final albu albuVar = this.a;
        albuVar.e = cqty.b(albuVar.b.a(crjq.c(albuVar.d.a, null, null), "ScreenEffectSuggestionObservableSupplierV2#suggestionsQuery").f(new cqtk() { // from class: albo
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                albu albuVar2 = albuVar;
                return auvw.c(albuVar2.a, fcyi.a, fdjz.a, new albs(albuVar2, null));
            }
        }, "ScreenEffectSuggestionObservableSupplierV2::register", "ScreenEffectSuggestionObservableSupplierV2::callback", "ScreenEffectSuggestionObservableSupplierV2::unregister"));
    }

    @Override // defpackage.cqto
    public final void fK() {
        albu albuVar = this.a;
        cquc cqucVar = albuVar.e;
        if (cqucVar != null) {
            cqucVar.a();
        }
        albuVar.e = null;
    }
}

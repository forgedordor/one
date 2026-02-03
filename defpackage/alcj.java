package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alcj implements cqto {
    final /* synthetic */ alcm a;

    public alcj(alcm alcmVar) {
        this.a = alcmVar;
    }

    @Override // defpackage.cqto
    public final void fJ() {
        final alcm alcmVar = this.a;
        alcmVar.k = cqty.b(alcmVar.a.a(crjq.c(alcmVar.g.a, null, null), "SmartSuggestionObservableSupplier#suggestionsQuery").f(new cqtk() { // from class: albx
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return alcmVar.d();
            }
        }, "SmartSuggestionObservableSupplier::register", "SmartSuggestionObservableSupplier::callback", "SmartSuggestionObservableSupplier::unregister"), alcmVar.h.a(new anpi() { // from class: alcg
            @Override // defpackage.anpi
            public final eiju a() {
                return alcmVar.d();
            }
        }), alcmVar.i.a(new anpi() { // from class: alch
            @Override // defpackage.anpi
            public final eiju a() {
                return alcmVar.d();
            }
        }), alcmVar.j.a(new anpi() { // from class: alci
            @Override // defpackage.anpi
            public final eiju a() {
                return alcmVar.d();
            }
        }));
    }

    @Override // defpackage.cqto
    public final void fK() {
        alcm alcmVar = this.a;
        cquc cqucVar = alcmVar.k;
        if (cqucVar != null) {
            cqucVar.a();
        }
        alcmVar.k = null;
    }
}

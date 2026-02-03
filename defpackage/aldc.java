package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aldc implements cqto {
    final /* synthetic */ aldf a;

    public aldc(aldf aldfVar) {
        this.a = aldfVar;
    }

    @Override // defpackage.cqto
    public final void fJ() {
        final aldf aldfVar = this.a;
        aldfVar.l = cqty.b(aldfVar.b.a(crjq.c(aldfVar.g.a, null, null), "SmartSuggestionObservableSupplier#suggestionsQuery").f(new cqtk() { // from class: alco
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return aldfVar.d();
            }
        }, "SmartSuggestionObservableSupplierV2::register", "SmartSuggestionObservableSupplierV2::callback", "SmartSuggestionObservableSupplierV2::unregister"), aldfVar.h.a(new anpi() { // from class: alcz
            @Override // defpackage.anpi
            public final eiju a() {
                return aldfVar.d();
            }
        }), aldfVar.i.a(new anpi() { // from class: alda
            @Override // defpackage.anpi
            public final eiju a() {
                return aldfVar.d();
            }
        }), aldfVar.j.a(new anpi() { // from class: aldb
            @Override // defpackage.anpi
            public final eiju a() {
                return aldfVar.d();
            }
        }));
    }

    @Override // defpackage.cqto
    public final void fK() {
        aldf aldfVar = this.a;
        cquc cqucVar = aldfVar.l;
        if (cqucVar != null) {
            cqucVar.a();
        }
        aldfVar.l = null;
    }
}

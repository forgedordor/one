package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anwc implements cqto {
    final /* synthetic */ anwf a;

    public anwc(anwf anwfVar) {
        this.a = anwfVar;
    }

    @Override // defpackage.cqto
    public final void fJ() {
        final anwf anwfVar = this.a;
        anwfVar.e = anwfVar.b.a(anwf.d(null), "RecipientBusinessInfoObservableSupplier#businessInfoQuery").f(new cqtk() { // from class: anvz
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                anwf anwfVar2 = anwfVar;
                return auvw.c(anwfVar2.a, fcyi.a, fdjz.a, new anwe(anwfVar2, null));
            }
        }, "RecipientBusinessInfoObservableSupplier::register", "RecipientBusinessInfoObservableSupplier::callback", "RecipientBusinessInfoObservableSupplier::unregister");
    }

    @Override // defpackage.cqto
    public final void fK() {
        anwf anwfVar = this.a;
        cquc cqucVar = anwfVar.e;
        if (cqucVar != null) {
            cqucVar.a();
        }
        anwfVar.e = null;
    }
}

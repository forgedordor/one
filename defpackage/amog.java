package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amog implements cqto {
    final /* synthetic */ amok a;

    public amog(amok amokVar) {
        this.a = amokVar;
    }

    @Override // defpackage.cqto
    public final void fJ() {
        final amok amokVar = this.a;
        amokVar.c = amokVar.b.a(new anpi() { // from class: amof
            @Override // defpackage.anpi
            public final eiju a() {
                amok amokVar2 = amokVar;
                return auvw.c(amokVar2.a, fcyi.a, fdjz.a, new amoj(amokVar2, null));
            }
        });
    }

    @Override // defpackage.cqto
    public final void fK() {
        amok amokVar = this.a;
        cquc cqucVar = amokVar.c;
        if (cqucVar != null) {
            cqucVar.a();
        }
        amokVar.c = null;
    }
}

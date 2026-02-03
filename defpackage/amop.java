package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amop implements cqto {
    final /* synthetic */ amos a;

    public amop(amos amosVar) {
        this.a = amosVar;
    }

    @Override // defpackage.cqto
    public final void fJ() {
        final amos amosVar = this.a;
        amosVar.d = cqty.a(fcva.b(amosVar.c.a(new anpi() { // from class: amoo
            @Override // defpackage.anpi
            public final eiju a() {
                amos amosVar2 = amosVar;
                return auvw.c(amosVar2.b, fcyi.a, fdjz.a, new amor(amosVar2, null));
            }
        })));
    }

    @Override // defpackage.cqto
    public final void fK() {
        amos amosVar = this.a;
        cquc cqucVar = amosVar.d;
        if (cqucVar != null) {
            cqucVar.a();
        }
        amosVar.d = null;
    }
}

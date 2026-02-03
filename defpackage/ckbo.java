package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckbo implements cqto {
    final /* synthetic */ ckbr a;
    private cquc b;

    public ckbo(ckbr ckbrVar) {
        this.a = ckbrVar;
    }

    @Override // defpackage.cqto
    public final void fJ() {
        final ckbr ckbrVar = this.a;
        this.b = cqty.b(ckbrVar.a.c(new cqtk() { // from class: ckbn
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                ckbr ckbrVar2 = ckbrVar;
                return auvw.c(ckbrVar2.b, fcyi.a, fdjz.a, new ckbq(ckbrVar2, null));
            }
        }));
    }

    @Override // defpackage.cqto
    public final void fK() {
        cquc cqucVar = this.b;
        if (cqucVar != null) {
            cqucVar.a();
        }
        this.b = null;
    }
}

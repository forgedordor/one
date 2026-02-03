package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akeu implements cqto {
    final /* synthetic */ akex a;
    private cquc b;

    public akeu(akex akexVar) {
        this.a = akexVar;
    }

    @Override // defpackage.cqto
    public final void fJ() {
        final akex akexVar = this.a;
        this.b = akexVar.b.n().a(new anpi() { // from class: aket
            @Override // defpackage.anpi
            public final eiju a() {
                akex akexVar2 = akexVar;
                return auvw.c(akexVar2.a, fcyi.a, fdjz.a, new akew(akexVar2, null));
            }
        });
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

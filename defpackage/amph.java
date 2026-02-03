package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amph implements cqto {
    final /* synthetic */ ampk a;

    public amph(ampk ampkVar) {
        this.a = ampkVar;
    }

    @Override // defpackage.cqto
    public final void fJ() {
        final ampk ampkVar = this.a;
        ampkVar.d = ampkVar.b.a(new anpi() { // from class: ampg
            @Override // defpackage.anpi
            public final eiju a() {
                ampk ampkVar2 = ampkVar;
                return auvw.c(ampkVar2.a, fcyi.a, fdjz.a, new ampj(ampkVar2, null));
            }
        });
    }

    @Override // defpackage.cqto
    public final void fK() {
        ampk ampkVar = this.a;
        cquc cqucVar = ampkVar.d;
        if (cqucVar != null) {
            cqucVar.a();
        }
        ampkVar.d = null;
    }
}

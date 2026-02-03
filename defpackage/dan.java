package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dan extends fdbr implements fdap {
    final /* synthetic */ dao a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dan(dao daoVar) {
        super(1);
        this.a = daoVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        dhe dheVar = (dhe) obj;
        cze czeVar = cze.a;
        cze czeVar2 = cze.b;
        if (dheVar.d(czeVar, czeVar2)) {
            ddf ddfVar = this.a.e.b().b;
            return ddfVar != null ? ddfVar.b : dae.b;
        }
        if (!dheVar.d(czeVar2, cze.c)) {
            return dae.b;
        }
        ddf ddfVar2 = this.a.f.b().b;
        return ddfVar2 != null ? ddfVar2.b : dae.b;
    }
}

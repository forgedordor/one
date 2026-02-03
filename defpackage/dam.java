package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dam extends fdbr implements fdap {
    final /* synthetic */ dao a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dam(dao daoVar) {
        super(1);
        this.a = daoVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        dhe dheVar = (dhe) obj;
        cze czeVar = cze.a;
        cze czeVar2 = cze.b;
        Object obj2 = null;
        if (dheVar.d(czeVar, czeVar2)) {
            cyo cyoVar = this.a.e.b().c;
            if (cyoVar != null) {
                obj2 = cyoVar.c;
            }
        } else if (dheVar.d(czeVar2, cze.c)) {
            cyo cyoVar2 = this.a.f.b().c;
            if (cyoVar2 != null) {
                obj2 = cyoVar2.c;
            }
        } else {
            obj2 = dae.c;
        }
        return obj2 == null ? dae.c : obj2;
    }
}

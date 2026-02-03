package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctmi extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ alqm c;
    final /* synthetic */ ctmn d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctmi(alqm alqmVar, ctmn ctmnVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = alqmVar;
        this.d = ctmnVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ctmi ctmiVar = new ctmi(this.c, this.d, (fcxy) obj3);
        ctmiVar.e = (fdpm) obj;
        ctmiVar.b = (ekgp) obj2;
        return ctmiVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        ctmo ctmoVar;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            ctmoVar = (ctmo) this.e;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            fdpm fdpmVar = (fdpm) this.e;
            anyy anyyVar = (anyy) ((ekgp) this.b).get(this.c);
            ctmo ctmoVarF = anyyVar != null ? ctmn.f(anyyVar) : ctmn.b;
            this.e = ctmoVarF;
            this.a = 1;
            if (fdpmVar.fO(ctmoVarF, this) == fcylVar) {
                return fcylVar;
            }
            ctmoVar = ctmoVarF;
        }
        return Boolean.valueOf(ctmoVar.a == 1);
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chsb extends fcyz implements fdat {
    int a;
    final /* synthetic */ chsc b;
    final /* synthetic */ ezny c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chsb(chsc chscVar, ezny eznyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = chscVar;
        this.c = eznyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chsb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarA = this.b.a.a();
            this.a = 1;
            obj = fdxs.c(eijuVarA, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        ezny eznyVar = this.c;
        eznv eznvVar = eznv.a;
        eznt ezntVar = (eznt) eznvVar.createBuilder();
        ezntVar.getClass();
        eznx eznxVar = eznx.a;
        eznw eznwVar = (eznw) eznxVar.createBuilder();
        eznwVar.getClass();
        eykf.b("profile-version", eznwVar);
        eyke.b(eykf.a(eznwVar), ezntVar);
        eznw eznwVar2 = (eznw) eznxVar.createBuilder();
        eznwVar2.getClass();
        eykf.b("1", eznwVar2);
        eyke.c(eykf.a(eznwVar2), ezntVar);
        eyke.d(4, ezntVar);
        eznt ezntVar2 = (eznt) eznvVar.createBuilder();
        ezntVar2.getClass();
        eznw eznwVar3 = (eznw) eznxVar.createBuilder();
        eznwVar3.getClass();
        eykf.b("profile-signed-in", eznwVar3);
        eyke.b(eykf.a(eznwVar3), ezntVar2);
        eznw eznwVar4 = (eznw) eznxVar.createBuilder();
        eznwVar4.getClass();
        eykf.b(((Boolean) obj).toString(), eznwVar4);
        eyke.c(eykf.a(eznwVar4), ezntVar2);
        eyke.d(4, ezntVar2);
        eznyVar.a(fcva.g(eyke.a(ezntVar), eyke.a(ezntVar2)));
        return eznyVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new chsb(this.b, this.c, fcxyVar);
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cybc extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ hox d;
    final /* synthetic */ String e = "getDeltaSyncEligibility";
    final /* synthetic */ fdap f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cybc(hox hoxVar, fdap fdapVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = hoxVar;
        this.f = fdapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cybc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        hox hoxVar;
        fcyl fcylVar = fcyl.a;
        try {
            if (this.c != 0) {
                obj2 = this.b;
                Object obj3 = this.a;
                fctl.b(obj);
                hoxVar = obj3;
            } else {
                fctl.b(obj);
                hox hoxVar2 = this.d;
                hoxVar2.b(this.e.concat(" clicked\n"));
                Object objA = hoxVar2.a();
                fdap fdapVar = this.f;
                this.a = hoxVar2;
                this.b = objA;
                this.c = 1;
                Object objInvoke = fdapVar.invoke(this);
                if (objInvoke == fcylVar) {
                    return fcylVar;
                }
                obj2 = objA;
                obj = objInvoke;
                hoxVar = hoxVar2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(obj2);
            sb.append(obj);
            hoxVar.b(sb.toString());
        } catch (Exception e) {
            hox hoxVar3 = this.d;
            hoxVar3.b(hoxVar3.a() + "Exception: " + e);
        }
        ekrw ekrwVarH = cybf.a.h();
        ekrwVarH.X(eksq.a, "BugleCmsD2d");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.X(cqnc.S, "D2dToolsPage");
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/ui/debug/cloudstore/d2d/D2dToolsPage$ApiTesterButton$1$1$1", "invokeSuspend", 125, "D2dToolsPage.kt")).D("%s result %s", this.e, this.d.a());
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cybc(this.d, this.f, fcxyVar);
    }
}

package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egwn extends fcyz implements fdat {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ fdpl c;
    final /* synthetic */ fdau d;
    final /* synthetic */ fdap e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egwn(Object obj, fdpl fdplVar, fdau fdauVar, fdap fdapVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = obj;
        this.c = fdplVar;
        this.d = fdauVar;
        this.e = fdapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((egwn) c((fdos) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdos fdosVar = (fdos) this.f;
            feaz feazVar = new feaz();
            ArrayList arrayList = new ArrayList();
            fdci fdciVar = new fdci();
            fdciVar.a = new egxk(this.b);
            egwm egwmVar = new egwm(this.c, feazVar, fdciVar, this.d, this.e, arrayList, fdosVar, null);
            this.a = 1;
            if (fdmu.a(egwmVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        egwn egwnVar = new egwn(this.b, this.c, this.d, this.e, fcxyVar);
        egwnVar.f = obj;
        return egwnVar;
    }
}

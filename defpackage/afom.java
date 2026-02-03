package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afom extends fcyz implements fdav {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ afon d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afom(afon afonVar, fcxy fcxyVar) {
        super(4, fcxyVar);
        this.d = afonVar;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        afom afomVar = new afom(this.d, (fcxy) obj4);
        afomVar.a = (djcv) obj;
        afomVar.b = (djcq) obj2;
        afomVar.c = (djew) obj3;
        return afomVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Object obj2 = this.a;
        djcq djcqVar = (djcq) this.b;
        List list = djcqVar.a;
        fdap fdapVar = djcqVar.b;
        fdap fdapVar2 = djcqVar.c;
        Object obj3 = this.c;
        djcq djcqVar2 = new djcq(list, fdapVar, fdapVar2);
        afon afonVar = this.d;
        djcy djcyVar = new djcy((djcv) obj2, djcqVar2, null, (djew) obj3, new djcx(afonVar.a.a()), 52);
        djfn djfnVar = new djfn(fcvo.a, null, new fdap() { // from class: afol
            @Override // defpackage.fdap
            public final Object invoke(Object obj4) {
                return fctx.a;
            }
        });
        boolean zA = afonVar.b.a();
        return new djgb(djcyVar, djfnVar, null, true == zA ? 4 : 1, 0.0f, false, new djga(true, false, false, false, false, false, 62), 48);
    }
}

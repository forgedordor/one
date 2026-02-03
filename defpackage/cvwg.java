package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvwg extends fcyz implements fdaz {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    /* synthetic */ Object e;
    /* synthetic */ Object f;
    /* synthetic */ Object g;
    final /* synthetic */ cvwh h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvwg(cvwh cvwhVar, fcxy fcxyVar) {
        super(8, fcxyVar);
        this.h = cvwhVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ajlh, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ?? r1 = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        Object obj4 = this.d;
        Object obj5 = this.e;
        Object obj6 = this.f;
        Object obj7 = this.g;
        obj2.getClass();
        ajts ajtsVar = (ajts) obj2;
        elwp elwpVarI = ajtsVar.I();
        elwp elwpVar = elwp.SEND_MODE_XMS;
        r1.e();
        fcww fcwwVar = new fcww((byte[]) null);
        if (obj7 != null) {
            dihq dihqVar = (dihq) obj7;
            djrr djrrVar = dihqVar.b;
            djrrVar.getClass();
            fcwwVar.add(new cvxb(new dkeg(dihqVar.a, null, null, null, null, new dkdk(djrrVar), null, dihqVar.k, 94)));
        }
        if (this.h.i.a() && ajtsVar.c() == ajlj.ONE_ON_ONE && obj3 != null) {
            dihq dihqVar2 = (dihq) obj3;
            djrr djrrVar2 = dihqVar2.b;
            djrrVar2.getClass();
            fcwwVar.add(new cvxb(new dkeg(dihqVar2.a, null, null, null, null, new dkdk(djrrVar2), null, dihqVar2.k, 94)));
        }
        dihq dihqVar3 = (dihq) obj4;
        String str = dihqVar3.a;
        djrr djrrVar3 = dihqVar3.b;
        djrrVar3.getClass();
        fcwwVar.add(new cvxb(new dkeg(str, null, null, null, null, new dkdk(djrrVar3), null, dihqVar3.k, 94)));
        if (obj5 != null) {
            final dihq dihqVar4 = (dihq) obj5;
            fcwwVar.add(new cvxb(new dkdh(dihqVar4.a, dihqVar4.b, elwpVarI == elwpVar, new fdae() { // from class: cvwf
                @Override // defpackage.fdae
                public final Object invoke() {
                    dihqVar4.k.invoke();
                    return fctx.a;
                }
            })));
        }
        if (obj6 != null) {
            dihq dihqVar5 = (dihq) obj6;
            djrr djrrVar4 = dihqVar5.b;
            djrrVar4.getClass();
            fcwwVar.add(new cvxb(new dkeg(dihqVar5.a, null, null, null, null, new dkdk(djrrVar4), null, dihqVar5.k, 94), 2));
        }
        return new cvvy(ekfv.a(fcva.a(fcwwVar)));
    }

    @Override // defpackage.fdaz
    public final /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        cvwg cvwgVar = new cvwg(this.h, (fcxy) obj8);
        cvwgVar.a = (ajlh) obj;
        cvwgVar.b = (ajlk) obj2;
        cvwgVar.c = (dihq) obj3;
        cvwgVar.d = (dihq) obj4;
        cvwgVar.e = (dihq) obj5;
        cvwgVar.f = (dihq) obj6;
        cvwgVar.g = (dihq) obj7;
        return cvwgVar.b(fctx.a);
    }
}

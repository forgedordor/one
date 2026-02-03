package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvzl extends fcyz implements fday {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    /* synthetic */ Object e;
    /* synthetic */ boolean f;
    final /* synthetic */ cvzp g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvzl(cvzp cvzpVar, fcxy fcxyVar) {
        super(7, fcxyVar);
        this.g = cvzpVar;
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [ajlk, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ?? r13 = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        Object obj4 = this.d;
        Object obj5 = this.e;
        boolean z = this.f;
        final cvzp cvzpVar = this.g;
        ardk ardkVar = cvzpVar.j;
        fdae fdaeVar = null;
        if (ardkVar.a() && r13.q()) {
            fdaeVar = new fdae() { // from class: cvzk
                @Override // defpackage.fdae
                public final Object invoke() {
                    cvzp cvzpVar2 = cvzpVar;
                    auvw.m(cvzpVar2.b, null, new cvzm(cvzpVar2, null), 3);
                    return fctx.a;
                }
            };
        }
        fdae fdaeVar2 = fdaeVar;
        cvzr cvzrVar = new cvzr(false, cvzpVar.i.a(), ardkVar.a(), ((eoth) ((arcp) cvzpVar.k).a.b()).a("bugle.show_group_icon_update_loading_indicator"));
        return new cvzs((cwba) obj4, (cwbj) obj2, (cwav) obj3, (dihq) obj5, fdaeVar2, z, cvzrVar);
    }

    @Override // defpackage.fday
    public final /* bridge */ /* synthetic */ Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        boolean zBooleanValue = ((Boolean) obj6).booleanValue();
        cvzl cvzlVar = new cvzl(this.g, (fcxy) obj7);
        cvzlVar.a = (ajlk) obj;
        cvzlVar.b = (cwbj) obj2;
        cvzlVar.c = (cwav) obj3;
        cvzlVar.d = (cwba) obj4;
        cvzlVar.e = (dihq) obj5;
        cvzlVar.f = zBooleanValue;
        return cvzlVar.b(fctx.a);
    }
}

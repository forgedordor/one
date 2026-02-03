package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwak extends fcyz implements fdaz {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ boolean c;
    /* synthetic */ Object d;
    /* synthetic */ Object e;
    /* synthetic */ Object f;
    /* synthetic */ Object g;
    final /* synthetic */ cwam h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwak(cwam cwamVar, fcxy fcxyVar) {
        super(8, fcxyVar);
        this.h = cwamVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [ajlk, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        cwam cwamVar = this.h;
        ?? r1 = this.a;
        Object obj2 = this.b;
        boolean z = this.c;
        Object obj3 = this.d;
        Object obj4 = this.e;
        Object obj5 = this.f;
        dihq dihqVar = (dihq) obj5;
        dihq dihqVar2 = (dihq) obj4;
        return cwamVar.b(r1, (ekgb) obj2, z, (dihq) obj3, dihqVar2, dihqVar, (dihq) this.g);
    }

    @Override // defpackage.fdaz
    public final /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        cwak cwakVar = new cwak(this.h, (fcxy) obj8);
        cwakVar.a = (ajlk) obj;
        cwakVar.b = (ekgb) obj2;
        cwakVar.c = zBooleanValue;
        cwakVar.d = (dihq) obj4;
        cwakVar.e = (dihq) obj5;
        cwakVar.f = (dihq) obj6;
        cwakVar.g = (dihq) obj7;
        return cwakVar.b(fctx.a);
    }
}

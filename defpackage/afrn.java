package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afrn extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ afrq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afrn(afrq afrqVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = afrqVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        afrn afrnVar = new afrn(this.c, (fcxy) obj3);
        afrnVar.a = (oux) obj;
        afrnVar.b = (afmy) obj2;
        return afrnVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [afmy, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return ovr.a((oux) this.a, new afrm(this.c, this.b, null));
    }
}

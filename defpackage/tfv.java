package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tfv extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ tfx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tfv(tfx tfxVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.d = tfxVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        tfv tfvVar = new tfv(this.d, (fcxy) obj3);
        tfvVar.b = (fcti) obj;
        tfvVar.c = (ekgb) obj2;
        return tfvVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        Object obj2 = this.b;
        Object obj3 = this.c;
        fcti fctiVar = (fcti) obj2;
        akcf akcfVar = (akcf) fctiVar.a;
        akcf akcfVar2 = (akcf) fctiVar.b;
        tfx tfxVar = this.d;
        this.b = null;
        this.a = 1;
        Object objA = tfxVar.a(akcfVar, akcfVar2, (ekgb) obj3, this);
        return objA == fcylVar ? fcylVar : objA;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vbo extends fcyz implements fdat {
    int a;
    final /* synthetic */ vbv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vbo(vbv vbvVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = vbvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vbo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            vbv vbvVar = this.b;
            fdap fdapVar = new fdap() { // from class: vbn
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    cwtk cwtkVar = (cwtk) ((cwtl) obj2).toBuilder();
                    cwtkVar.copyOnWrite();
                    cwtl cwtlVar = (cwtl) cwtkVar.instance;
                    cwtlVar.b |= 2;
                    cwtlVar.d = 0;
                    evsn evsnVarBuild = cwtkVar.build();
                    evsnVarBuild.getClass();
                    return (cwtl) evsnVarBuild;
                }
            };
            this.a = 1;
            if (vbvVar.c.d(fdapVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new vbo(this.b, fcxyVar);
    }
}

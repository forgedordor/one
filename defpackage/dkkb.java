package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkkb extends fcyz implements fdat {
    /* synthetic */ long a;
    final /* synthetic */ dkly b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkkb(dkly dklyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dklyVar;
    }

    @Override // defpackage.fdat
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dkkb) c(new kjb(((kjb) obj).a), (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        dkly dklyVar = this.b;
        long j = this.a;
        fdap fdapVar = ((dkku) dklyVar).d;
        if (fdapVar != null) {
            fdapVar.invoke(new kjb(j));
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dkkb dkkbVar = new dkkb(this.b, fcxyVar);
        dkkbVar.a = ((kjb) obj).a;
        return dkkbVar;
    }
}

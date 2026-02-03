package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awva extends fcyz implements fdat {
    final /* synthetic */ awvh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awva(awvh awvhVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = awvhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awva) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return awuq.a(this.a.b);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new awva(this.a, fcxyVar);
    }
}

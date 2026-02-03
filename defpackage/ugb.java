package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ugb extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ ugc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ugb(ugc ugcVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = ugcVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ugb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        feav feavVar;
        fcyl fcylVar = fcyl.a;
        if (this.c != 0) {
            obj2 = this.b;
            Object obj3 = this.a;
            fctl.b(obj);
            feavVar = obj3;
        } else {
            fctl.b(obj);
            ugc ugcVar = this.d;
            feav feavVar2 = ugcVar.d;
            this.a = feavVar2;
            this.b = ugcVar;
            this.c = 1;
            if (feavVar2.b(this) == fcylVar) {
                return fcylVar;
            }
            obj2 = ugcVar;
            feavVar = feavVar2;
        }
        try {
            ((ugc) obj2).e = null;
            feavVar.d();
            return fctx.a;
        } catch (Throwable th) {
            feavVar.d();
            throw th;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ugb(this.d, fcxyVar);
    }
}

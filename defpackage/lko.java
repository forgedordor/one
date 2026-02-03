package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lko extends fcyz implements fdat {
    /* synthetic */ Object a;
    final /* synthetic */ lmv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lko(lmv lmvVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = lmvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((lko) c((lmv) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        lmv lmvVar = (lmv) this.a;
        boolean z = false;
        if ((lmvVar instanceof ljt) && ((ljt) lmvVar).c <= ((ljt) this.b).c) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        lko lkoVar = new lko(this.b, fcxyVar);
        lkoVar.a = obj;
        return lkoVar;
    }
}

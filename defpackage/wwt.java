package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wwt extends fcyz implements fdat {
    final /* synthetic */ www a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwt(www wwwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = wwwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wwt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        zwf zwfVar = this.a.f;
        aisq aisqVar = zwfVar.b;
        if (aisqVar != null) {
            aisqVar.b();
        }
        zwfVar.b = null;
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new wwt(this.a, fcxyVar);
    }
}

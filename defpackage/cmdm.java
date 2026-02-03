package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmdm extends fcyz implements fdat {
    final /* synthetic */ cmdo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmdm(cmdo cmdoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cmdoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmdm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        final cmdo cmdoVar = this.a;
        eieu eieuVarH = eiiy.h("ScreenDetectionListener.registerDisplayListener");
        try {
            fczl.a(eieuVarH, null);
            this.a.a();
            return fctx.a;
        } finally {
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cmdm(this.a, fcxyVar);
    }
}

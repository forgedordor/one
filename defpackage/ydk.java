package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ydk extends fcyz implements fdat {
    /* synthetic */ boolean a;
    final /* synthetic */ yek b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydk(yek yekVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = yekVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((ydk) c(bool, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        if (this.a) {
            ((ains) this.b.F.b()).c("Bugle.App.ScrollToBottom.Shown.Count");
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ydk ydkVar = new ydk(this.b, fcxyVar);
        ydkVar.a = ((Boolean) obj).booleanValue();
        return ydkVar;
    }
}

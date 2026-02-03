package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hhg extends fcyz implements fdat {
    /* synthetic */ boolean a;
    final /* synthetic */ hcj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hhg(hcj hcjVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = hcjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((hhg) c(bool, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        if (!this.a) {
            this.b.b();
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        hhg hhgVar = new hhg(this.b, fcxyVar);
        hhgVar.a = ((Boolean) obj).booleanValue();
        return hhgVar;
    }
}

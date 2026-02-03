package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbnz extends fcyz implements fdat {
    /* synthetic */ Object a;
    final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbnz(String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbnz) c((cbdg) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return Boolean.valueOf(fdbq.f(((cbdg) this.a).r(), this.b));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbnz cbnzVar = new cbnz(this.b, fcxyVar);
        cbnzVar.a = obj;
        return cbnzVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvgd extends fcyz implements fdat {
    int a;
    final /* synthetic */ cvgs b;
    final /* synthetic */ dggn c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvgd(cvgs cvgsVar, dggn dggnVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cvgsVar;
        this.c = dggnVar;
        this.d = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvgd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cvgs cvgsVar = this.b;
            cvfw cvfwVar = new cvfw(this.c, this.d);
            this.a = 1;
            if (cvgsVar.j.fO(cvfwVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cvgd(this.b, this.c, this.d, fcxyVar);
    }
}

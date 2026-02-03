package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hgk extends fcyz implements fdau {
    int a;
    final /* synthetic */ hgm b;
    final /* synthetic */ fdat c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgk(hgm hgmVar, fdat fdatVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.b = hgmVar;
        this.c = fdatVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        return new hgk(this.b, this.c, (fcxy) obj3).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            hgm hgmVar = this.b;
            fdat fdatVar = this.c;
            this.a = 1;
            if (fdatVar.a(hgmVar.a, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}

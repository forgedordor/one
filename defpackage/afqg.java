package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afqg extends fcyz implements fdat {
    int a;
    final /* synthetic */ afqm b;
    final /* synthetic */ fdlr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afqg(afqm afqmVar, fdlr fdlrVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = afqmVar;
        this.c = fdlrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((afqg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                this.b.h.b();
                fdlr fdlrVar = this.c;
                this.a = 1;
                if (fdlrVar.o(this) == fcylVar) {
                    return fcylVar;
                }
            }
            ((afzc) this.b.l.b()).h(new agdb(new agdc()));
            afqm afqmVar = this.b;
            afqmVar.h.c();
            afqmVar.r.d();
            return fctx.a;
        } catch (Throwable th) {
            afqm afqmVar2 = this.b;
            afqmVar2.h.c();
            afqmVar2.r.d();
            throw th;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new afqg(this.b, this.c, fcxyVar);
    }
}

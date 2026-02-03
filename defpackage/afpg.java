package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afpg extends fcyz implements fdat {
    int a;
    final /* synthetic */ afph b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afpg(afph afphVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = afphVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((afpg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            wrd wrdVar = (wrd) this.b.c.b();
            this.a = 1;
            obj = wrdVar.d(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        wrc wrcVar = (wrc) obj;
        final vvw vvwVar = wrcVar != null ? wrcVar.a : null;
        if (vvwVar != null) {
            this.b.d.c(new fdap() { // from class: afpf
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    return vvwVar;
                }
            });
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new afpg(this.b, fcxyVar);
    }
}

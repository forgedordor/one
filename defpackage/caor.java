package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caor implements cajw {
    private final bznm a;

    public caor(bznm bznmVar) {
        this.a = bznmVar;
    }

    @Override // defpackage.cajw
    public final Object a(Exception exc, cajn cajnVar, fcxy fcxyVar) {
        return cajv.a.a(exc, cajnVar, fcxyVar);
    }

    @Override // defpackage.cajw
    public final Object b(boolean z, cajn cajnVar, fcxy fcxyVar) {
        if (z) {
            Object objC = fdxs.c(((cazj) this.a.a.b()).b(cbcu.f("cms_key_sync", bznl.a(cajnVar.d, cpyb.a(cajnVar.a)))), fcxyVar);
            if (objC == fcyl.a) {
                return objC;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.cajw
    public final Object c(cpvs cpvsVar) {
        return fctx.a;
    }
}

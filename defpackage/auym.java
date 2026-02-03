package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class auym extends fcyz implements fdat {
    int a;
    final /* synthetic */ auyn b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auym(auyn auynVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = auynVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((auym) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdpm fdpmVar = (fdpm) this.c;
            auyn auynVar = this.b;
            this.a = 1;
            if (fdpmVar.fO(auynVar.a, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        auym auymVar = new auym(this.b, fcxyVar);
        auymVar.c = obj;
        return auymVar;
    }
}

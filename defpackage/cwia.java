package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwia extends fcyz implements fdat {
    final /* synthetic */ cwhs a;
    final /* synthetic */ cwhe b;
    final /* synthetic */ hox c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwia(cwhs cwhsVar, cwhe cwheVar, hox hoxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cwhsVar;
        this.b = cwheVar;
        this.c = hoxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwia) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        cwhe cwheVar;
        fctl.b(obj);
        cwem cwemVar = this.a.i;
        boolean z = false;
        if ((cwemVar != null ? cwemVar.c : null) != cwen.c && ((cwheVar = this.b) == cwhe.b || cwheVar == cwhe.c)) {
            z = true;
        }
        hox hoxVar = this.c;
        hpt hptVar = cwil.a;
        hoxVar.b(Boolean.valueOf(z));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cwia(this.a, this.b, this.c, fcxyVar);
    }
}

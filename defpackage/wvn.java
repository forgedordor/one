package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wvn extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ wvu c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wvn(fcxy fcxyVar, wvu wvuVar) {
        super(3, fcxyVar);
        this.c = wvuVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        wvn wvnVar = new wvn((fcxy) obj3, this.c);
        wvnVar.d = (fdpm) obj;
        wvnVar.b = obj2;
        return wvnVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fdpl wvqVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r6 = this.d;
            wvi wviVar = (wvi) this.b;
            if (wviVar.a.isEmpty()) {
                wvqVar = new fdpu(null);
            } else {
                wvu wvuVar = this.c;
                wvqVar = new wvq((fduj) wvuVar.g.a(), wvuVar, wviVar);
            }
            this.a = 1;
            if (fdpy.c(r6, wvqVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}

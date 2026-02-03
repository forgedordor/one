package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctpz extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ctqd c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctpz(fcxy fcxyVar, ctqd ctqdVar) {
        super(3, fcxyVar);
        this.c = ctqdVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ctpz ctpzVar = new ctpz((fcxy) obj3, this.c);
        ctpzVar.d = (fdpm) obj;
        ctpzVar.b = obj2;
        return ctpzVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fdpl ctpvVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r5 = this.d;
            if (((cudx) this.b).d != cueh.a) {
                ctpvVar = new fdpu(null);
            } else {
                ctqd ctqdVar = this.c;
                ctpvVar = new ctpv(ctqdVar.b.b(), ctqdVar);
            }
            this.a = 1;
            if (fdpy.c(r5, ctpvVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}

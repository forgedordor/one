package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctgo extends fcyz implements fdat {
    int a;
    final /* synthetic */ ctgq b;
    final /* synthetic */ ctgs c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctgo(ctgq ctgqVar, ctgs ctgsVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ctgqVar;
        this.c = ctgsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctgo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final ctgq ctgqVar = this.b;
            fdap fdapVar = new fdap() { // from class: ctgn
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    ctgu ctguVar = (ctgu) obj2;
                    long epochMilli = ((cogw) ctgqVar.h.b()).f().toEpochMilli();
                    ctguVar.copyOnWrite();
                    ctgv ctgvVar = (ctgv) ctguVar.instance;
                    ctgv ctgvVar2 = ctgv.a;
                    ctgvVar.b = epochMilli;
                    return fctx.a;
                }
            };
            this.a = 1;
            if (crrj.b(ctgqVar.b, fdapVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        ctgt ctgtVar = (ctgt) this.b.g.b();
        ctgs ctgsVar = this.c;
        ctgsVar.getClass();
        if (!fcwm.d(ctgs.b, ctgs.c).contains(ctgsVar)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        ctgtVar.a(ctgsVar);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ctgo(this.b, this.c, fcxyVar);
    }
}

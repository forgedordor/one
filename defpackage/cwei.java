package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwei extends fcyz implements fdax {
    /* synthetic */ Object a;
    /* synthetic */ long b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    /* synthetic */ Object e;
    final /* synthetic */ cwdf f;
    final /* synthetic */ cwek g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwei(cwdf cwdfVar, cwek cwekVar, fcxy fcxyVar) {
        super(6, fcxyVar);
        this.f = cwdfVar;
        this.g = cwekVar;
    }

    @Override // defpackage.fdax
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        long j = ((kjb) obj2).a;
        cwei cweiVar = new cwei(this.f, this.g, (fcxy) obj6);
        cweiVar.a = (cwen) obj;
        cweiVar.b = j;
        cweiVar.c = (cwbx) obj3;
        cweiVar.d = (cwcv) obj4;
        cweiVar.e = (cwfq) obj5;
        return cweiVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Object obj2 = this.a;
        long j = this.b;
        Object obj3 = this.c;
        Object obj4 = this.d;
        Object obj5 = this.e;
        final cwek cwekVar = this.g;
        fdae fdaeVar = new fdae() { // from class: cweg
            @Override // defpackage.fdae
            public final Object invoke() {
                cwek cwekVar2 = cwekVar;
                auvw.k(cwekVar2.a, null, null, new cweh(cwekVar2, null), 3);
                return fctx.a;
            }
        };
        return new cwem((cwcv) obj4, (cwbx) obj3, (cwen) obj2, j, this.f.a, new fdae() { // from class: cwel
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        }, fdaeVar, (cwfq) obj5);
    }
}

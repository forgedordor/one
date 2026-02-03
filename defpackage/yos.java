package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yos extends fcyz implements fdat {
    int a;
    final /* synthetic */ you b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yos(you youVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = youVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yos) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            you youVar = this.b;
            cqrd cqrdVar = (cqrd) youVar.f.b();
            final long epochMilli = ((cogw) youVar.e.b()).f().toEpochMilli();
            eiju eijuVarB = cqrdVar.b(new ejvr() { // from class: cqqv
                @Override // defpackage.ejvr
                public final Object apply(Object obj2) {
                    cqqr cqqrVar = (cqqr) obj2;
                    cqqi cqqiVar = (cqqi) cqqrVar.toBuilder();
                    cqqq cqqqVar = cqqrVar.e;
                    if (cqqqVar == null) {
                        cqqqVar = cqqq.a;
                    }
                    long j = epochMilli;
                    cqqp cqqpVar = (cqqp) cqqqVar.toBuilder();
                    cqqpVar.copyOnWrite();
                    cqqq cqqqVar2 = (cqqq) cqqpVar.instance;
                    cqqqVar2.b |= 1;
                    cqqqVar2.c = j;
                    cqqq cqqqVar3 = (cqqq) cqqpVar.build();
                    cqqiVar.copyOnWrite();
                    cqqr cqqrVar2 = (cqqr) cqqiVar.instance;
                    cqqqVar3.getClass();
                    cqqrVar2.e = cqqqVar3;
                    cqqrVar2.b |= 4;
                    return (cqqr) cqqiVar.build();
                }
            });
            eijuVarB.getClass();
            this.a = 1;
            if (fdxs.c(eijuVarB, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new yos(this.b, fcxyVar);
    }
}

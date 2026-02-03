package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdwm extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdpl[] b;
    final /* synthetic */ int c;
    final /* synthetic */ AtomicInteger d;
    final /* synthetic */ fdoa e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdwm(fdpl[] fdplVarArr, int i, AtomicInteger atomicInteger, fdoa fdoaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdplVarArr;
        this.c = i;
        this.d = atomicInteger;
        this.e = fdoaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fdwm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        AtomicInteger atomicInteger;
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                fdpl[] fdplVarArr = this.b;
                int i = this.c;
                fdpl fdplVar = fdplVarArr[i];
                fdwl fdwlVar = new fdwl(this.e, i);
                this.a = 1;
                if (fdplVar.a(fdwlVar, this) == fcylVar) {
                    return fcylVar;
                }
            }
            if (atomicInteger.decrementAndGet() == 0) {
                this.e.e(null);
            }
            return fctx.a;
        } finally {
            if (this.d.decrementAndGet() == 0) {
                this.e.e(null);
            }
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new fdwm(this.b, this.c, this.d, this.e, fcxyVar);
    }
}

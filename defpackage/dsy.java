package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dsy extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ float d;
    final /* synthetic */ dsz e;
    final /* synthetic */ dwy f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsy(float f, dsz dszVar, dwy dwyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = f;
        this.e = dszVar;
        this.f = dwyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [fdcf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        float f;
        final fdcf fdcfVar;
        Object obj2;
        fdcf fdcfVar2;
        fcyl fcylVar = fcyl.a;
        if (this.c != 0) {
            obj2 = this.b;
            fdcfVar = this.a;
            try {
                fctl.b(obj);
                fdcfVar2 = fdcfVar;
            } catch (CancellationException unused) {
                fdcfVar.a = ((Number) ((deb) obj2).b()).floatValue();
                fdcfVar2 = fdcfVar;
                f = fdcfVar2.a;
                return new Float(f);
            }
            f = fdcfVar2.a;
        } else {
            fctl.b(obj);
            float f2 = this.d;
            if (Math.abs(f2) > 1.0f) {
                fdcfVar = new fdcf();
                fdcfVar.a = f2;
                final fdcf fdcfVar3 = new fdcf();
                deb debVarB = dec.b(0.0f, f2, 28);
                try {
                    final dsz dszVar = this.e;
                    dep depVar = dszVar.b;
                    final dwy dwyVar = this.f;
                    fdap fdapVar = new fdap() { // from class: dsx
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj3) {
                            ddy ddyVar = (ddy) obj3;
                            float fFloatValue = ((Number) ddyVar.a()).floatValue();
                            fdcf fdcfVar4 = fdcfVar3;
                            float f3 = fFloatValue - fdcfVar4.a;
                            float fA = dwyVar.a(f3);
                            fdcfVar4.a = ((Number) ddyVar.a()).floatValue();
                            fdcfVar.a = ((Number) ddyVar.b()).floatValue();
                            if (Math.abs(f3 - fA) > 0.5f) {
                                ddyVar.c();
                            }
                            dszVar.a++;
                            return fctx.a;
                        }
                    };
                    this.a = fdcfVar;
                    this.b = debVarB;
                    this.c = 1;
                    fdcfVar2 = fdcfVar;
                    if (dgv.g(debVarB, depVar, false, fdapVar, this) == fcylVar) {
                        return fcylVar;
                    }
                } catch (CancellationException unused2) {
                    obj2 = debVarB;
                    fdcfVar.a = ((Number) ((deb) obj2).b()).floatValue();
                    fdcfVar2 = fdcfVar;
                    f = fdcfVar2.a;
                    return new Float(f);
                }
                f = fdcfVar2.a;
            } else {
                f = this.d;
            }
        }
        return new Float(f);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dsy(this.d, this.e, this.f, fcxyVar);
    }
}

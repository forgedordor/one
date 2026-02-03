package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkoi extends fcyz implements fdat {
    int a;
    final /* synthetic */ ddp b;
    final /* synthetic */ dljn c;
    final /* synthetic */ Set d;
    final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkoi(ddp ddpVar, dljn dljnVar, Set set, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ddpVar;
        this.c = dljnVar;
        this.d = set;
        this.e = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dkoi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ddp ddpVar = this.b;
            Float f = new Float(1.0f);
            dljn dljnVar = this.c;
            dljl dljlVar = dljnVar.q;
            des desVar = dljnVar.r.d;
            final Set set = this.d;
            final String str = this.e;
            dia diaVarC = dea.c(100, 0, desVar, 2);
            fdap fdapVar = new fdap() { // from class: dkoh
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    ddp ddpVar2 = (ddp) obj2;
                    if (((Number) ddpVar2.d()).floatValue() == ((Number) ddpVar2.c()).floatValue()) {
                        set.remove(str);
                    }
                    return fctx.a;
                }
            };
            this.a = 1;
            if (ddp.k(ddpVar, f, diaVarC, fdapVar, this, 4) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dkoi(this.b, this.c, this.d, this.e, fcxyVar);
    }
}

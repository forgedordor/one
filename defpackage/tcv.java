package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tcv extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ tcx c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tcv(fcxy fcxyVar, tcx tcxVar) {
        super(3, fcxyVar);
        this.c = tcxVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        tcv tcvVar = new tcv((fcxy) obj3, this.c);
        tcvVar.d = (fdpm) obj;
        tcvVar.b = obj2;
        return tcvVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fdpl fdpuVar;
        tcj tcjVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r6 = this.d;
            tdh tdhVar = (tdh) this.b;
            tcx tcxVar = this.c;
            if (tdhVar != null) {
                tck tckVar = tcxVar.e;
                if (tdhVar instanceof tdo) {
                    tcjVar = tckVar.a;
                } else {
                    if (!(tdhVar instanceof tdt)) {
                        Objects.toString(tdhVar);
                        throw new IllegalArgumentException("Unknown banner content type: ".concat(tdhVar.toString()));
                    }
                    tcjVar = tckVar.b;
                }
                fdpuVar = tcjVar.a(tdhVar, tcxVar.b);
            } else {
                fdpuVar = new fdpu(null);
            }
            this.a = 1;
            if (fdpy.c(r6, fdpuVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}

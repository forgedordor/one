package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cudc extends fcyz implements fdav {
    boolean a;
    int b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    /* synthetic */ Object e;
    final /* synthetic */ cude f;
    final /* synthetic */ afzc g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cudc(cude cudeVar, afzc afzcVar, fcxy fcxyVar) {
        super(4, fcxyVar);
        this.f = cudeVar;
        this.g = afzcVar;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        cudc cudcVar = new cudc(this.f, this.g, (fcxy) obj4);
        cudcVar.c = (aoer) obj;
        cudcVar.d = (cudx) obj2;
        cudcVar.e = (ctte) obj3;
        return cudcVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        dihq dihqVarB;
        boolean z;
        Context context;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            z = this.a;
            context = (Context) this.d;
            dihqVarB = (dihq) this.c;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            aoer aoerVar = (aoer) this.c;
            cudx cudxVar = (cudx) this.d;
            Object obj2 = this.e;
            boolean z2 = false;
            final boolean z3 = cudxVar.d == cueh.b && cudxVar.a.size() <= cudxVar.e.size();
            final cude cudeVar = this.f;
            if (!((asdv) cudeVar.e.b()).a() ? !cudeVar.g.a || cudeVar.b != null : (!((asds) cudeVar.f.b()).a() || !((ctte) obj2).l) && (cudeVar.b != null || z3 || this.g.i(agbf.a))) {
                z2 = true;
            }
            final afzc afzcVar = this.g;
            dihqVarB = cudeVar.b(z2, new fdae() { // from class: cudb
                @Override // defpackage.fdae
                public final Object invoke() {
                    cude cudeVar2 = cudeVar;
                    ctuu ctuuVar = cudeVar2.d;
                    ctuuVar.d();
                    if (z3) {
                        cudeVar2.c.d(cueh.a);
                    } else {
                        afzc afzcVar2 = afzcVar;
                        ctuuVar.h();
                        afzcVar2.j(agbf.a);
                    }
                    return fctx.a;
                }
            });
            Context context2 = cudeVar.a;
            this.c = dihqVarB;
            this.d = context2;
            this.a = z3;
            this.b = 1;
            obj = cudeVar.d(aoerVar, cudxVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
            z = z3;
            context = context2;
        }
        dihq dihqVar = dihqVarB;
        String string = context.getString(((Number) obj).intValue());
        string.getClass();
        return new cuci(new dloh(new dlnp(string, null, null, false, null, null, null, 254), dihqVar, null, false, false, null, null, 116), z);
    }
}

package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmu extends icr implements jbd, jcd {
    private Map a;

    @Override // defpackage.jcd
    public final ixn b(ixp ixpVar, ixk ixkVar, long j) {
        float fC = fddu.c(((kir) jbe.a(this, gks.c)).a, 0.0f);
        final iyl iylVarE = ixkVar.e(j);
        boolean z = this.C && !Float.isNaN(fC) && Float.compare(fC, 0.0f) > 0;
        int iEp = !Float.isNaN(fC) ? ixpVar.ep(fC) : 0;
        final int iMax = z ? Math.max(iylVarE.a, iEp) : iylVarE.a;
        final int iMax2 = z ? Math.max(iylVarE.b, iEp) : iylVarE.b;
        if (z) {
            Map linkedHashMap = this.a;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.a = linkedHashMap;
            }
            linkedHashMap.put(gks.b, Integer.valueOf(fddu.f(Math.round((iEp - iylVarE.a) / 2.0f), 0)));
            linkedHashMap.put(gks.a, Integer.valueOf(fddu.f(Math.round((iEp - iylVarE.b) / 2.0f), 0)));
        }
        Map map = this.a;
        if (map == null) {
            map = fcvp.a;
        }
        return ixpVar.ej(iMax, iMax2, map, new fdap() { // from class: gmt
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                int i = iMax;
                ((iyk) obj).s(iylVarE, fdcu.b((i - r1.a) / 2.0f), fdcu.b((iMax2 - r1.b) / 2.0f), 0.0f);
                return fctx.a;
            }
        });
    }

    @Override // defpackage.jcd
    public final /* synthetic */ int e(ivu ivuVar, ivt ivtVar, int i) {
        return jcc.a(this, ivuVar, ivtVar, i);
    }

    @Override // defpackage.jcd
    public final /* synthetic */ int f(ivu ivuVar, ivt ivtVar, int i) {
        return jcc.b(this, ivuVar, ivtVar, i);
    }

    @Override // defpackage.jcd
    public final /* synthetic */ int g(ivu ivuVar, ivt ivtVar, int i) {
        return jcc.c(this, ivuVar, ivtVar, i);
    }

    @Override // defpackage.jcd
    public final /* synthetic */ int h(ivu ivuVar, ivt ivtVar, int i) {
        return jcc.d(this, ivuVar, ivtVar, i);
    }
}

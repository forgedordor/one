package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qql extends qqc {
    public qql(List list) {
        super(list);
    }

    @Override // defpackage.qpv
    public final /* bridge */ /* synthetic */ Object f(qxa qxaVar, float f) {
        Object obj;
        qxc qxcVar = this.d;
        if (qxcVar == null) {
            return (f != 1.0f || (obj = qxaVar.c) == null) ? (qsq) qxaVar.b : (qsq) obj;
        }
        float f2 = qxaVar.g;
        Float f3 = qxaVar.h;
        float fFloatValue = f3 == null ? Float.MAX_VALUE : f3.floatValue();
        qsq qsqVar = (qsq) qxaVar.b;
        Object obj2 = qxaVar.c;
        return (qsq) qxcVar.b(f2, fFloatValue, qsqVar, obj2 == null ? qsqVar : (qsq) obj2, f, b(), this.c);
    }
}

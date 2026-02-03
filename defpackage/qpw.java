package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qpw extends qqc {
    public qpw(List list) {
        super(list);
    }

    @Override // defpackage.qpv
    public final /* bridge */ /* synthetic */ Object f(qxa qxaVar, float f) {
        return Integer.valueOf(l(qxaVar, f));
    }

    public final int k() {
        return l(d(), b());
    }

    public final int l(qxa qxaVar, float f) {
        float f2;
        Object obj = qxaVar.b;
        if (obj == null || qxaVar.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        qxc qxcVar = this.d;
        if (qxcVar != null) {
            f2 = f;
            Integer num = (Integer) qxcVar.b(qxaVar.g, qxaVar.h.floatValue(), (Integer) obj, (Integer) qxaVar.c, f2, c(), this.c);
            if (num != null) {
                return num.intValue();
            }
        } else {
            f2 = f;
        }
        return qwq.a(qwu.a(f2, 0.0f, 1.0f), ((Integer) obj).intValue(), ((Integer) qxaVar.c).intValue());
    }
}

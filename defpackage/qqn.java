package defpackage;

import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qqn extends qpv {
    private final Object e;

    public qqn(qxc qxcVar) {
        this(qxcVar, null);
    }

    @Override // defpackage.qpv
    public final float a() {
        return 1.0f;
    }

    @Override // defpackage.qpv
    public final Object e() {
        qxc qxcVar = this.d;
        Object obj = this.e;
        float f = this.c;
        return qxcVar.b(0.0f, 0.0f, obj, obj, f, f, f);
    }

    @Override // defpackage.qpv
    public final Object f(qxa qxaVar, float f) {
        return e();
    }

    @Override // defpackage.qpv
    public final void i() {
        if (this.d != null) {
            super.i();
        }
    }

    @Override // defpackage.qpv
    public final void j(float f) {
        this.c = f;
    }

    public qqn(qxc qxcVar, Object obj) {
        super(Collections.EMPTY_LIST);
        this.d = qxcVar;
        this.e = obj;
    }
}

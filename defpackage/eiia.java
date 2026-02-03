package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiia implements ejvr {
    final /* synthetic */ eifn a;
    final /* synthetic */ ejvr b;

    public eiia(eifn eifnVar, ejvr ejvrVar) {
        this.a = eifnVar;
        this.b = ejvrVar;
    }

    @Override // defpackage.ejvr
    public final Object apply(Object obj) {
        eifn eifnVarH = eidc.h(eidc.b(), this.a);
        try {
            return this.b.apply(obj);
        } finally {
        }
    }

    public final String toString() {
        return "propagating=[" + this.b + "]";
    }
}

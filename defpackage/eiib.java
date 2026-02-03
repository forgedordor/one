package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiib implements eora {
    final /* synthetic */ eifn a;
    final /* synthetic */ eora b;

    public eiib(eifn eifnVar, eora eoraVar) {
        this.a = eifnVar;
        this.b = eoraVar;
    }

    @Override // defpackage.eora
    public final void b(Object obj) {
        eifn eifnVarH = eidc.h(eidc.b(), this.a);
        try {
            this.b.b(obj);
        } finally {
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        th.getClass();
        eifn eifnVarH = eidc.h(eidc.b(), this.a);
        try {
            this.b.hi(th);
        } finally {
        }
    }
}

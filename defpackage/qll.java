package defpackage;

import androidx.work.impl.WorkDatabase;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qll extends fdbr implements fdae {
    final /* synthetic */ WorkDatabase a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qll(WorkDatabase workDatabase) {
        super(0);
        this.a = workDatabase;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        qjo qjoVarD = this.a.D();
        qkk qkkVar = (qkk) qjoVarD;
        pex pexVar = qkkVar.a;
        pexVar.m();
        pkl pklVarD = qkkVar.i.d();
        try {
            pexVar.n();
            try {
                pklVarD.a();
                pexVar.q();
                qkkVar.i.f(pklVarD);
                return fctx.a;
            } finally {
                ((qkk) qjoVarD).a.o();
            }
        } catch (Throwable th) {
            qkkVar.i.f(pklVarD);
            throw th;
        }
    }
}

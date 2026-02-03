package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayog extends aynl {
    private static final cqce o = cqce.g("BugleDataModel", "BackgroundFailureRunnable");
    public final Exception n;

    public ayog(aymr aymrVar, Action action, Exception exc, aynm aynmVar, eosc eoscVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        super(aymrVar, action, "Bugle.DataModel.ActionBreakdown.FailureExecution.Latency", 2785L, aynmVar, eoscVar, fcsuVar, fcsuVar2, fcsuVar3);
        this.n = exc;
    }

    @Override // defpackage.aynl
    public final void b() {
        Action action;
        eieu eieuVarK;
        try {
            action = this.f;
            eieuVarK = eiiy.k("BackgroundFailureRunnable#processBackgroundWorkFailure");
        } catch (Throwable th) {
            th = th;
            try {
                if (((aooo) this.k.b()).a()) {
                    th = this.f.t(th);
                }
                if (((Boolean) b.e()).booleanValue()) {
                    o.o(String.valueOf(this.f) + ".processBackgroundWorkFailure threw", th);
                    auvh.d(this.n);
                } else {
                    cqaz.p(String.valueOf(this.f) + ".processBackgroundWorkFailure threw exception", th);
                }
            } finally {
                this.c.e(this.f, this.d);
            }
        }
        try {
            eieu eieuVarA = action.a();
            try {
                Object obj = action.fR().get();
                eieuVarA.close();
                ayml.c(action, 0, obj, false);
                eieuVarK.close();
            } finally {
            }
        } finally {
        }
    }
}

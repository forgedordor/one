package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayoh extends aynl {
    private static final cqce n = cqce.g("BugleDataModel", "BackgroundResponseRunnable");
    private final Bundle o;

    public ayoh(aymr aymrVar, Action action, Bundle bundle, aynm aynmVar, eosc eoscVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        super(aymrVar, action, "Bugle.DataModel.ActionBreakdown.ResponseExecution.Latency", 2785L, aynmVar, eoscVar, fcsuVar, fcsuVar2, fcsuVar3);
        this.o = bundle;
    }

    @Override // defpackage.aynl
    public final void b() {
        final Action action;
        final Bundle bundle;
        eieu eieuVarK;
        try {
            action = this.f;
            bundle = this.o;
            eieuVarK = eiiy.k("BackgroundResponseRunnable#processBackgroundWorkResponse");
        } catch (Throwable th) {
            th = th;
            try {
                if (th instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                if (((aooo) this.k.b()).a()) {
                    th = this.f.t(th);
                }
                if (((Boolean) b.e()).booleanValue()) {
                    n.o(String.valueOf(this.f) + ".processBackgroundWorkResponse threw", th);
                    auvh.d(th);
                } else {
                    cqaz.p(String.valueOf(this.f) + ".processBackgroundWorkResponse threw " + th.toString(), th);
                }
            } finally {
                this.c.e(this.f, this.d);
            }
        }
        try {
            ayml.d(action, 6, 7);
            eieu eieuVarA = action.a();
            try {
                Object obj = eijx.g(new Callable() { // from class: aymc
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return action.fS(bundle);
                    }
                }, eoqg.a).get();
                eieuVarA.close();
                ayml.c(action, 7, obj, true);
                eieuVarK.close();
            } finally {
            }
        } finally {
        }
    }
}

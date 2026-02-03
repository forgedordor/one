package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayoi extends aynl {
    private static final cqce n = cqce.g("BugleDataModel", "BackgroundWorkerRunnable");

    public ayoi(aymr aymrVar, Action action, aynm aynmVar, eosc eoscVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        super(aymrVar, action, "Bugle.DataModel.ActionBreakdown.BackgroundExecution.Latency", 30174L, aynmVar, eoscVar, fcsuVar, fcsuVar2, fcsuVar3);
    }

    @Override // defpackage.aynl
    public final void b() {
        ArrayList arrayList;
        eieu eieuVarA;
        cqbd cqbdVarA = n.a();
        cqbdVarA.I("running BackgroundWork ");
        Action action = this.f;
        cqbdVarA.v(action.getClass().getSimpleName());
        cqbdVarA.r();
        eieu eieuVarK = eiiy.k("BackgroundWorkerRunnable#runImpl");
        try {
            ayml.d(action, 4, 5);
            try {
                try {
                    eieuVarA = action.a();
                } catch (ExecutionException e) {
                    if (e.getCause() instanceof RuntimeException) {
                        throw ((RuntimeException) e.getCause());
                    }
                    if (!(e.getCause() instanceof Exception)) {
                        throw e;
                    }
                    throw ((Exception) e.getCause());
                }
            } catch (Exception e2) {
                Exception excO = e2;
                if (excO instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                if (!((Boolean) b.e()).booleanValue()) {
                    cqaz.p(String.format("Aborting due to unexpected error (%s) in background worker", excO.getClass().getSimpleName()), excO);
                    n.o("Error in background worker.", excO);
                    Action action2 = this.f;
                    ayml.d(action2, 5, 6);
                    aymr aymrVar = this.d;
                    aynm aynmVar = this.c;
                    aynmVar.f(new ayog(aymrVar, action2, excO, aynmVar, this.i, this.j, this.k, this.l), "Bugle.DataModel.ActionBreakdown.FailureQueue.Latency");
                    aynmVar.d("ACTION_ERROR_QUEUED_", action2);
                } else if (((aoop) this.j.b()).a() && (excO instanceof CancellationException)) {
                    n.s("future failed due to CancellationException", excO);
                } else {
                    if (((aooo) this.k.b()).a() && (arrayList = this.f.z) != null) {
                        excO = Action.o(arrayList, excO);
                    }
                    n.o("Fatal Error in action", excO);
                    auvh.d(excO);
                }
            }
            try {
                Bundle bundle = (Bundle) action.fQ().get();
                eieuVarA.close();
                Action action3 = this.f;
                ayml.d(action3, 5, 6);
                aymr aymrVar2 = this.d;
                aynm aynmVar2 = this.c;
                aynmVar2.f(new ayoh(aymrVar2, action3, bundle, aynmVar2, this.i, this.j, this.k, this.l), "Bugle.DataModel.ActionBreakdown.ResponseQueue.Latency");
                aynmVar2.d("ACTION_RESPONSE_QUEUED_", action3);
                eieuVarK.close();
            } finally {
            }
        } finally {
        }
    }
}

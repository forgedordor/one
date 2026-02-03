package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.action.execution.ActionExecutorImpl;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Optional;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayop extends aynl {
    private static final cqce n = cqce.g("BugleDataModel", "ExecuteActionRunnable");
    private final SettableFuture o;

    public ayop(aymr aymrVar, Action action, SettableFuture settableFuture, aynm aynmVar, eosc eoscVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        super(aymrVar, action, "Bugle.DataModel.ActionBreakdown.Execution.Latency", 2785L, aynmVar, eoscVar, fcsuVar, fcsuVar2, fcsuVar3);
        this.o = settableFuture;
    }

    @Override // defpackage.aynl
    public final void b() {
        aynm aynmVar;
        dzfh dzfhVarC;
        ArrayList arrayList;
        eieu eieuVarA;
        cqbd cqbdVarC = n.c();
        cqbdVarC.I("running action ");
        Action action = this.f;
        cqbdVarC.v(action.getClass().getSimpleName());
        cqbdVarC.r();
        eieu eieuVarK = eiiy.k("ExecuteActionRunnable#runImpl");
        try {
            Optional optionalOf = ccze.a(ThreadLocalRandom.current(), ActionExecutorImpl.a) ? Optional.of(((ActionExecutorImpl) this.c).e.d()) : Optional.empty();
            dzua dzuaVar = dzua.SUCCESS;
            ayml.d(action, 2, 3);
            try {
                try {
                    try {
                        eieuVarA = action.a();
                    } catch (Throwable th) {
                        Action action2 = this.f;
                        ayml.a(action2, null);
                        String strC = action2.c();
                        if (!TextUtils.isEmpty(strC)) {
                            this.c.h(strC, action2.u);
                        }
                        aynm aynmVar2 = this.c;
                        aynmVar2.e(action2, this.d);
                        aynmVar2.g(optionalOf, dzfh.c("ActionExecutionLatency_", action2.y), dzuaVar);
                        throw th;
                    }
                } catch (cmmr e) {
                    dzua dzuaVar2 = dzua.ERROR;
                    if (((aooo) this.k.b()).a() && (arrayList = this.f.z) != null) {
                        throw Action.o(arrayList, e);
                    }
                    throw e;
                }
            } catch (Throwable th2) {
                th = th2;
                dzuaVar = dzua.ERROR;
                if (th instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                if (!((Boolean) b.e()).booleanValue()) {
                    if (((aooo) this.k.b()).a()) {
                        th = this.f.t(th);
                    }
                    this.o.setException(th);
                    cqaz.p(String.valueOf(this.f) + ".executeAction threw " + th.toString(), th);
                } else if (((aoop) this.j.b()).a() && (th instanceof CancellationException)) {
                    n.s("future failed due to CancellationException", th);
                    this.o.setException(th);
                } else {
                    if (((aooo) this.k.b()).a()) {
                        th = this.f.t(th);
                    }
                    n.o("Fatal Error in action", th);
                    auvh.d(th);
                }
                Action action3 = this.f;
                ayml.a(action3, null);
                String strC2 = action3.c();
                if (!TextUtils.isEmpty(strC2)) {
                    this.c.h(strC2, action3.u);
                }
                aynmVar = this.c;
                aynmVar.e(action3, this.d);
                dzfhVarC = dzfh.c("ActionExecutionLatency_", action3.y);
            }
            try {
                SettableFuture settableFuture = this.o;
                settableFuture.o(eork.j(action.e()));
                Object objQ = settableFuture.q();
                eieuVarA.close();
                Action action4 = this.f;
                ayml.a(action4, objQ);
                String strC3 = action4.c();
                if (!TextUtils.isEmpty(strC3)) {
                    this.c.h(strC3, action4.u);
                }
                aynmVar = this.c;
                aynmVar.e(action4, this.d);
                dzfhVarC = dzfh.c("ActionExecutionLatency_", action4.y);
                aynmVar.g(optionalOf, dzfhVarC, dzuaVar);
                eieuVarK.close();
            } catch (Throwable th3) {
                try {
                    eieuVarA.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            try {
                eieuVarK.close();
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        }
    }
}

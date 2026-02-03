package com.google.android.apps.messaging.shared.datamodel.action.execution;

import android.content.Context;
import android.os.PersistableBundle;
import androidx.work.WorkerParameters;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.action.common.ActionParameters;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import defpackage.aooq;
import defpackage.aymh;
import defpackage.aymq;
import defpackage.aymr;
import defpackage.aynz;
import defpackage.ayoe;
import defpackage.ayos;
import defpackage.cqaz;
import defpackage.cqce;
import defpackage.ehli;
import defpackage.eigp;
import defpackage.eiiy;
import defpackage.eork;
import defpackage.fcsu;
import defpackage.pzs;
import defpackage.qam;
import defpackage.qaq;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ActionWorkManagerScheduler {
    public static final cqce a = cqce.g("BugleDataModel", "ActionWorkManagerScheduler");
    public final fcsu b;
    public final Context c;

    /* compiled from: PG */
    public static class ActionWorker extends qaq {
        private final ayoe e;
        private final aymh f;
        private final eigp g;

        public ActionWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
            a aVar = (a) ehli.a(context, a.class);
            this.e = aVar.aO();
            this.f = aVar.aN();
            this.g = aVar.b();
        }

        @Override // defpackage.qaq
        public final ListenableFuture b() {
            AutoCloseable autoCloseableK;
            Action actionB;
            ListenableFuture listenableFutureI;
            try {
                autoCloseableK = this.g.c("ActionWorker#startWork", "com/google/android/apps/messaging/shared/datamodel/action/execution/ActionWorkManagerScheduler$ActionWorker", "getRootOrSpanTrace", 146);
            } catch (IllegalStateException unused) {
                eiiy.e();
                autoCloseableK = eiiy.k("ActionWorker#startWork");
            }
            AutoCloseable autoCloseable = autoCloseableK;
            try {
                final ayoe ayoeVar = this.e;
                final pzs pzsVarF = f();
                final String strD = pzsVarF.d("bundle_action_name");
                final String strD2 = pzsVarF.d("bundle_action_key");
                if (((aooq) ayoeVar.b.b()).a()) {
                    actionB = (Action) Optional.ofNullable(pzsVarF.g("persistable_bundle_action_params_serialized")).flatMap(new Function() { // from class: ayoc
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            byte[] bArr = (byte[]) obj;
                            if (!craf.d) {
                                return Optional.empty();
                            }
                            try {
                                return Optional.of(PersistableBundle.readFromStream(evqs.x(bArr).m()));
                            } catch (IOException e) {
                                cqbd cqbdVarE = ayoe.a.e();
                                cqbdVarE.I("IOException deserializing PersistableBundle");
                                cqbdVarE.s(e);
                                return Optional.empty();
                            }
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).map(new aynz()).or(new Supplier() { // from class: ayod
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            pzs pzsVar = pzsVarF;
                            return Optional.ofNullable((ActionParameters) ayos.a((String) Optional.ofNullable(pzsVar.d("bundle_action_params")).orElse(pzsVar.d("bundle_action_serialized_params")), ActionParameters.class, "ActionParameters"));
                        }
                    }).map(new Function() { // from class: aynu
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ayoeVar.b(strD, strD2, ((aymo) obj).i());
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).orElse(null);
                } else {
                    String strD3 = pzsVarF.d("bundle_action_params");
                    if (strD3 == null) {
                        strD3 = pzsVarF.d("bundle_action_serialized_params");
                    }
                    actionB = ayoeVar.b(strD, strD2, (ActionParameters) ayos.a(strD3, ActionParameters.class, "ActionParameters"));
                }
                if (actionB == null) {
                    cqaz.c("failed to unparcel scheduled Action");
                    listenableFutureI = eork.i(new qam());
                } else {
                    final SettableFuture settableFutureCreate = SettableFuture.create();
                    aymr aymrVar = new aymr(actionB.u, aymr.a(actionB), new aymq() { // from class: ayof
                        @Override // defpackage.aymq
                        public final void a() {
                            settableFutureCreate.set(new qao());
                        }
                    }, null, true);
                    aymrVar.b = toString();
                    try {
                        this.f.a(aymrVar, actionB);
                        listenableFutureI = settableFutureCreate;
                    } catch (RuntimeException e) {
                        ActionWorkManagerScheduler.a.o("RuntimeException when starting job.", e);
                        listenableFutureI = eork.i(new qam());
                    }
                }
                autoCloseable.close();
                return listenableFutureI;
            } finally {
            }
        }
    }

    /* compiled from: PG */
    public interface a {
        aymh aN();

        ayoe aO();

        eigp b();
    }

    public ActionWorkManagerScheduler(fcsu fcsuVar, Context context) {
        this.b = fcsuVar;
        this.c = context;
    }
}

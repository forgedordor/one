package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.apps.messaging.R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.learning.internal.training.IInAppTrainerCanceller;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crff implements craw {
    public static final cczv a = cdag.r(cdag.b, "brella_trainer_configs", new ejxr() { // from class: crex
        @Override // defpackage.ejxr
        public final Object get() {
            cczv cczvVar = crff.a;
            return cpla.a.toByteArray();
        }
    });
    public static final cqce b = cqce.g("Bugle", "P2pConversationTrainingUtils");
    public final eosc c;
    public final cpkw e;
    public final crep f;
    private final crqv g;
    private final Context h;
    private final cogw i;
    private final crre j;
    private final ejxr m;
    private final Object l = new Object();
    public final ejxr d = ejxx.a(new ejxr() { // from class: crez
        @Override // defpackage.ejxr
        public final Object get() {
            cczv cczvVar = crff.a;
            try {
                return (cpla) evsn.parseFrom(cpla.a, (byte[]) crff.a.e(), evrr.a());
            } catch (evtj e) {
                crff.b.o("Failed to parse Brella trainer configs flag.", e);
                return cpla.a;
            }
        }
    });
    private final AtomicBoolean k = new AtomicBoolean(false);

    public crff(crqv crqvVar, final Context context, cogw cogwVar, crre crreVar, final eosc eoscVar, cpkw cpkwVar, crep crepVar) {
        this.g = crqvVar;
        this.h = context;
        this.i = cogwVar;
        this.j = crreVar;
        this.m = ejxx.a(new ejxr() { // from class: crfa
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ejxr
            public final Object get() {
                boolean zBooleanValue = ((Boolean) crbf.C.e()).booleanValue();
                Context context2 = context;
                eosc eoscVar2 = eoscVar;
                ejxr ejxrVar = this.a.d;
                if (!zBooleanValue) {
                    crff.b.m("Brella training not enabled");
                    int i = ekgb.d;
                    return new crfe(false, ekoe.a);
                }
                try {
                    cpla cplaVar = (cpla) ejxrVar.get();
                    ekfw ekfwVar = new ekfw();
                    evtg evtgVar = cplaVar.b;
                    for (int i2 = 0; i2 < evtgVar.size(); i2++) {
                        int i3 = i2 + 3100;
                        if (i3 <= 3200) {
                            cpky cpkyVar = (cpky) evtgVar.get(i2);
                            synchronized (ddis.a) {
                                ddis.b = true;
                            }
                            ekfwVar.h(new eunz(context2, cpkyVar.b, cpkyVar.c, eoscVar2, i3));
                        }
                    }
                    return new crfe(true, ekfwVar.g());
                } catch (Throwable unused) {
                    crff.b.n("Could not instantiate Brella training, Brella GMSCore likely not available");
                    int i4 = ekgb.d;
                    return new crfe(false, ekoe.a);
                }
            }
        });
        this.c = eoscVar;
        this.e = cpkwVar;
        this.f = crepVar;
    }

    private final void k(crrd crrdVar) {
        if (this.j.b(crrdVar)) {
            this.k.set(false);
            d();
        }
    }

    private final void l(boolean z) {
        this.g.h("federated_learning_popup_is_showing", z);
    }

    private final boolean m(crrd crrdVar, boolean z) {
        if (!z || !crrdVar.c()) {
            return false;
        }
        this.g.h(this.h.getString(R.string.p2p_conversation_suggestions_training_enabled_pref_key), false);
        return true;
    }

    @Override // defpackage.craw
    public final void a() {
        Context context = this.h;
        crqv crqvVar = this.g;
        boolean zQ = crqvVar.q(context.getString(R.string.p2p_conversation_suggestions_training_enabled_pref_key), false);
        crrd crrdVarA = this.j.a("federated_learning_feature_consent");
        if (m(crrdVarA, zQ) || crrdVarA.b() == zQ) {
            return;
        }
        crqvVar.h(context.getString(R.string.p2p_conversation_suggestions_training_enabled_pref_key), crrdVarA.b());
    }

    @Override // defpackage.craw
    public final void b() {
        this.g.h("p2p_conversation_training_popup_dismissed", true);
        l(false);
    }

    @Override // defpackage.craw
    public final void c() {
        k(this.j.a("federated_learning_feature_consent"));
        b();
    }

    @Override // defpackage.craw
    public final void d() {
        AtomicBoolean atomicBoolean = this.k;
        if (atomicBoolean.get()) {
            return;
        }
        synchronized (this.l) {
            if (atomicBoolean.get()) {
                return;
            }
            atomicBoolean.set(true);
            if (((Boolean) crbf.C.e()).booleanValue() && ((crfe) this.m.get()).a) {
                eiju eijuVarG = eiju.g(eika.j(this.e.a.a(), new ejvr() { // from class: cpku
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        cpla cplaVar = ((cpkt) obj).c;
                        return cplaVar == null ? cpla.a : cplaVar;
                    }
                }, eoqg.a));
                eooz eoozVar = new eooz() { // from class: crey
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        final crff crffVar = this.a;
                        if (((cpla) crffVar.d.get()).equals((cpla) obj)) {
                            return eijx.e(null);
                        }
                        crep crepVar = crffVar.f;
                        final defr defrVar = new defr();
                        final Context context = crepVar.a;
                        final eosc eoscVar = crepVar.b;
                        eoscVar.execute(new Runnable() { // from class: ddks
                            @Override // java.lang.Runnable
                            public final void run() {
                                Context context2 = context;
                                defr defrVar2 = defrVar;
                                Executor executor = eoscVar;
                                try {
                                    IInAppTrainerCanceller iInAppTrainerCanceller = (IInAppTrainerCanceller) ddki.a(context2, "com.google.android.gms.learning.dynamite.training.InAppTrainerCancellerImpl", new ddkh() { // from class: ddkt
                                        @Override // defpackage.ddkh
                                        public final IInterface a(IBinder iBinder) {
                                            return IInAppTrainerCanceller.Stub.asInterface(iBinder);
                                        }
                                    });
                                    try {
                                        iInAppTrainerCanceller.init(ObjectWrapper.wrap(context2), ObjectWrapper.wrap(executor), new ddku(defrVar2, iInAppTrainerCanceller));
                                    } catch (RemoteException e) {
                                        defrVar2.c(new dcff(new Status(8, ejxy.a(e))));
                                    }
                                } catch (ddkg e2) {
                                    defrVar2.c(new dcff(new Status(17, "Cannot create in-app canceller: ".concat(String.valueOf(e2.getMessage())))));
                                }
                            }
                        });
                        eiju eijuVarG2 = eiju.g(eooq.g(drgi.a(defrVar.a), new eooz() { // from class: euny
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                ddkw ddkwVar = (ddkw) obj2;
                                defr defrVar2 = new defr();
                                try {
                                    ddkwVar.a.cancelJobsByType(0, new ddkv(defrVar2));
                                } catch (RemoteException e) {
                                    defrVar2.c(new dcff(new Status(8, ejxy.a(e))));
                                }
                                return drgi.a(defrVar2.a);
                            }
                        }, eoscVar));
                        ejvr ejvrVar = new ejvr() { // from class: crfb
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                crff.b.s("Failed to cancel existing in-app trainers, if any.", (Exception) obj2);
                                return null;
                            }
                        };
                        eosc eoscVar2 = crffVar.c;
                        return eijuVarG2.e(Exception.class, ejvrVar, eoscVar2).i(new eooz() { // from class: crfc
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                crff crffVar2 = crffVar;
                                final cpla cplaVar = (cpla) crffVar2.d.get();
                                return crffVar2.e.a.b(new ejvr() { // from class: cpkv
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj3) {
                                        cpks cpksVar = (cpks) ((cpkt) obj3).toBuilder();
                                        cpksVar.copyOnWrite();
                                        cpkt cpktVar = (cpkt) cpksVar.instance;
                                        cpla cplaVar2 = cplaVar;
                                        cplaVar2.getClass();
                                        cpktVar.c = cplaVar2;
                                        cpktVar.b |= 1;
                                        return (cpkt) cpksVar.build();
                                    }
                                }, eoqg.a);
                            }
                        }, eoscVar2);
                    }
                };
                eosc eoscVar = this.c;
                eijuVarG.i(eoozVar, eoscVar).k(auwc.a(new crfd(this)), eoscVar);
            }
        }
    }

    @Override // defpackage.craw
    public final void e() {
        cqaz.g();
        l(true);
        crqv crqvVar = this.g;
        if (crqvVar.e("p2p_conversation_training_popup_seen_timestamp", -1L) == -1) {
            crqvVar.k("p2p_conversation_training_popup_seen_timestamp", this.i.f().toEpochMilli());
        }
        crre crreVar = this.j;
        crreVar.c(crreVar.a("federated_learning_feature_consent"), 3);
    }

    @Override // defpackage.craw
    public final void f(boolean z) {
        cqaz.k(this.j.d("federated_learning_feature_consent", z));
        this.k.set(false);
        d();
    }

    @Override // defpackage.craw
    public final boolean g() {
        return ((Boolean) crbf.C.e()).booleanValue();
    }

    @Override // defpackage.craw
    public final boolean h() {
        return this.j.a("federated_learning_feature_consent").a();
    }

    @Override // defpackage.craw
    public final boolean i() {
        if (((Boolean) crbf.C.e()).booleanValue() && ((Boolean) crbf.D.e()).booleanValue()) {
            crrd crrdVarA = this.j.a("federated_learning_feature_consent");
            if (!crrdVarA.a() && !crrdVarA.d()) {
                if (crrdVarA.c() && m(crrdVarA, this.g.q(this.h.getString(R.string.p2p_conversation_suggestions_training_enabled_pref_key), false))) {
                    return false;
                }
                if (!this.g.q("p2p_conversation_training_popup_dismissed", false)) {
                    return true;
                }
                k(crrdVarA);
                return false;
            }
        }
        return false;
    }

    final List j() {
        return ((crfe) this.m.get()).b;
    }
}

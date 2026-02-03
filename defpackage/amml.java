package defpackage;

import android.os.Build;
import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.stream.Stream;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amml implements amln {
    public static final eksp a = eksp.c("BugleConversation");
    public final cqtq d;
    public final eosc e;
    public final eosc f;
    public final eygg g;
    public final amng h;
    public final BugleConversationId i;
    public final anpj j;
    public final anpj k;
    public final fcsu l;
    public final fcsu m;
    public final fcsu n;
    public final fcsu o;
    public cquc p;
    public anpj r;
    public cquc s;
    public cquc t;
    public aoer u;
    private final cqpz v;
    private final fcsu w;
    public final Object b = new Object();
    public final Object c = new Object();
    public boolean q = false;

    public amml(cqtp cqtpVar, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar, cqpz cqpzVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, eygg eyggVar, fcsu fcsuVar5, BugleConversationId bugleConversationId, anpj anpjVar, anpj anpjVar2, amng amngVar) {
        this.d = cqtpVar.a(new ammj(this));
        this.e = eoscVar;
        this.f = eoscVar2;
        this.l = fcsuVar;
        this.v = cqpzVar;
        this.n = fcsuVar3;
        this.w = fcsuVar4;
        this.g = eyggVar;
        this.h = amngVar;
        this.i = bugleConversationId;
        this.j = anpjVar;
        this.k = anpjVar2;
        this.m = fcsuVar2;
        this.o = fcsuVar5;
    }

    public static boolean j(ajts ajtsVar, ekgb ekgbVar) {
        return ((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue() && ajtsVar.c() == ajlj.ONE_ON_ONE && ((ResolvedRecipient) ekgbVar.get(0)).g().z();
    }

    @Override // defpackage.anpj
    public final cquc a(final anpi anpiVar) {
        return this.d.a(new cqtk() { // from class: amlt
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                eksp ekspVar = amml.a;
                return anpiVar.a();
            }
        }, "ComposeConstraints::register", "ComposeConstraints::callback", "ComposeConstraints::unregister");
    }

    @Override // defpackage.anpj
    public final eiju b() {
        return f(false);
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.amln
    public final eiju d() {
        return f(true);
    }

    public final anpj e(ekgb ekgbVar) {
        anpj anpjVarD;
        synchronized (this.b) {
            if (this.q && this.r == null) {
                anty antyVar = (anty) this.w.b();
                Stream stream = Collection.EL.stream(ekgbVar);
                int i = ekgb.d;
                this.r = antyVar.D((ekgb) stream.collect(ekcv.a), 2);
                eksl ekslVar = (eksl) a.h();
                ekslVar.X(cqnc.t, this.i);
                ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/constraints/DefaultBugleComposeConstraintsSupplier", "maybeUpdateRcsCapabilitiesSubscription", 858, "DefaultBugleComposeConstraintsSupplier.java")).q("Compose Constraints: Listening to RCS Capabilities For All Recipients.");
                ejwl.l(this.s == null);
                anpj anpjVar = this.r;
                anpjVar.getClass();
                this.s = anpjVar.a(new anpi() { // from class: amlx
                    @Override // defpackage.anpi
                    public final eiju a() {
                        return this.a.g("Recipient Rcs Capabilities");
                    }
                });
            }
            if (this.q) {
                anpjVarD = this.r;
                anpjVarD.getClass();
            } else {
                anty antyVar2 = (anty) this.w.b();
                Stream stream2 = Collection.EL.stream(ekgbVar);
                int i2 = ekgb.d;
                anpjVarD = antyVar2.D((ekgb) stream2.collect(ekcv.a), 2);
            }
        }
        return anpjVarD;
    }

    public final eiju f(final boolean z) {
        anpj anpjVar = this.k;
        final eiju eijuVarB = this.j.b();
        final eiju eijuVarB2 = anpjVar.b();
        final eosc eoscVar = Build.VERSION.SDK_INT <= 26 ? this.f : this.e;
        return eijx.k(eijuVarB, eijuVarB2).b(new eooy() { // from class: amls
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                final ajts ajtsVar = (ajts) eork.q(eijuVarB);
                final ekgb ekgbVar = (ekgb) eork.q(eijuVarB2);
                final amml ammlVar = this.a;
                eiju eijuVarA = ammlVar.h.a(ajtsVar, ekgbVar);
                final boolean z2 = z;
                return eijuVarA.i(new eooz() { // from class: ammc
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        final amml ammlVar2 = ammlVar;
                        final ajts ajtsVar2 = ajtsVar;
                        ajli ajliVar = (ajli) obj;
                        final aoer aoerVarH = ajtsVar2.h();
                        ammlVar2.h(aoerVarH);
                        final amlj amljVar = new amlj();
                        amljVar.g(ajlj.ONE_ON_ONE);
                        amljVar.n(false);
                        int i = ekgb.d;
                        amljVar.l(ekoe.a);
                        amljVar.c = null;
                        amljVar.e = 2;
                        amljVar.j(false);
                        amljVar.k(Long.MAX_VALUE);
                        amljVar.d(0);
                        amljVar.m(Alert.DURATION_SHOW_INDEFINITELY);
                        amljVar.d = new akgk(akgl.HIDDEN, null);
                        amljVar.f = 1;
                        amljVar.h((elwq) ((elwm) elwq.a.createBuilder()).build());
                        amljVar.i(awjl.a);
                        amljVar.b = aoerVarH;
                        BugleConversationId bugleConversationId = ammlVar2.i;
                        if (bugleConversationId == null) {
                            throw new NullPointerException("Null conversationId");
                        }
                        final ekgb ekgbVar2 = ekgbVar;
                        amljVar.a = bugleConversationId;
                        amljVar.g(ajtsVar2.c());
                        amljVar.n(ajtsVar2.R());
                        amljVar.e(ajna.NONE);
                        amljVar.l(ekgbVar2);
                        amljVar.f(ajliVar);
                        amljVar.d = ajtsVar2.E();
                        amljVar.i(ajtsVar2.G());
                        if (ajtsVar2.z()) {
                            eksl ekslVar = (eksl) amml.a.e();
                            ekslVar.X(cqnc.t, bugleConversationId);
                            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/constraints/DefaultBugleComposeConstraintsSupplier", "getComposeConstraints", 287, "DefaultBugleComposeConstraintsSupplier.java")).q("Compose Constraints: Race condition detected deleted conversation.");
                            ajliVar = ajli.CONVERSATION_UNKNOWN;
                            amljVar.f(ajliVar);
                        }
                        if (aoerVarH == null && ajliVar == ajli.NONE) {
                            eksl ekslVar2 = (eksl) amml.a.e();
                            ekslVar2.X(cqnc.t, bugleConversationId);
                            ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/constraints/DefaultBugleComposeConstraintsSupplier", "getComposeConstraints", 300, "DefaultBugleComposeConstraintsSupplier.java")).q("Compose Constraints: Race condition detected with null Self Identity.");
                            ajliVar = ajli.SELFIDENTITY_UNAVAILABLE;
                            amljVar.f(ajliVar);
                        }
                        if (ajliVar != ajli.NONE) {
                            eksl ekslVar3 = (eksl) amml.a.j();
                            ekslVar3.X(cqnc.t, bugleConversationId);
                            ((eksl) ekslVar3.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/constraints/DefaultBugleComposeConstraintsSupplier", "getComposeConstraints", 310, "DefaultBugleComposeConstraintsSupplier.java")).t("Compose Constraints: Compose Disabled: %s.", ajliVar);
                            return eijx.e(amljVar.o());
                        }
                        amljVar.e = 1;
                        amljVar.j(true);
                        eiju eijuVarB3 = aoerVarH != null ? aoerVarH.f().b() : eijx.e(aoio.b);
                        eiju eijuVarB4 = aoerVarH != null ? aoerVarH.g().b() : eijx.e(false);
                        final eiju eijuVarB5 = ammlVar2.e(ekgbVar2).b();
                        eiju eijuVarL = aoerVarH != null ? aoerVarH.l() : eijx.e(null);
                        final boolean z3 = z2;
                        ListenableFuture[] listenableFutureArr = {eijuVarB3, eijuVarB4, eijuVarB5, eijuVarL};
                        final eiju eijuVar = eijuVarB4;
                        final eiju eijuVar2 = eijuVarL;
                        final eiju eijuVar3 = eijuVarB3;
                        return eijx.k(listenableFutureArr).b(new eooy() { // from class: amlu
                            /* JADX WARN: Removed duplicated region for block: B:109:0x043b  */
                            /* JADX WARN: Removed duplicated region for block: B:115:0x0466  */
                            /* JADX WARN: Removed duplicated region for block: B:95:0x03d1  */
                            /* JADX WARN: Removed duplicated region for block: B:96:0x03df  */
                            /* JADX WARN: Removed duplicated region for block: B:99:0x03f5  */
                            @Override // defpackage.eooy
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final com.google.common.util.concurrent.ListenableFuture a() {
                                /*
                                    Method dump skipped, instructions count: 1428
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.amlu.a():com.google.common.util.concurrent.ListenableFuture");
                            }
                        }, ammlVar2.e);
                    }
                }, eoscVar);
            }
        }, eoscVar);
    }

    public final eiju g(String str) {
        eksl ekslVar = (eksl) a.e();
        ekslVar.X(cqnc.t, this.i);
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/constraints/DefaultBugleComposeConstraintsSupplier", "notifyUpdate", 919, "DefaultBugleComposeConstraintsSupplier.java")).t("Compose Constraints: Update notification from %s.", str);
        return eijx.f(new Runnable() { // from class: amlz
            @Override // java.lang.Runnable
            public final void run() {
                this.a.d.c(new Supplier() { // from class: ammb
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        eksp ekspVar = amml.a;
                        return null;
                    }
                }, "ComposeConstraints::Notify");
            }
        }, this.e);
    }

    public final void h(aoer aoerVar) {
        synchronized (this.c) {
            if (Objects.equals(this.u, aoerVar)) {
                return;
            }
            cquc cqucVar = this.t;
            if (cqucVar != null) {
                cqucVar.a();
                this.t = null;
            }
            this.u = aoerVar;
            if (aoerVar != null) {
                eksl ekslVar = (eksl) a.h();
                ekslVar.X(cqnc.t, this.i);
                eksl ekslVar2 = (eksl) ekslVar.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/constraints/DefaultBugleComposeConstraintsSupplier", "maybeUpdateRcsAvailabilitySubscription", 893, "DefaultBugleComposeConstraintsSupplier.java");
                aoer aoerVar2 = this.u;
                aoerVar2.getClass();
                ekslVar2.t("Compose Constraints: Switching RCS Availability listener to SelfIdentity %s.", aoerVar2);
                aoer aoerVar3 = this.u;
                aoerVar3.getClass();
                aoer aoerVar4 = this.u;
                aoerVar4.getClass();
                this.t = cqty.b(aoerVar3.f().a(new anpi() { // from class: ammd
                    @Override // defpackage.anpi
                    public final eiju a() {
                        return this.a.g("SelfIdentity Rcs");
                    }
                }), aoerVar4.g().a(new anpi() { // from class: amme
                    @Override // defpackage.anpi
                    public final eiju a() {
                        return this.a.g("SelfIdentity Encryption");
                    }
                }));
            } else {
                eksl ekslVar3 = (eksl) a.j();
                ekslVar3.X(cqnc.t, this.i);
                ((eksl) ekslVar3.h("com/google/android/apps/messaging/shared/api/messaging/message/compose/constraints/DefaultBugleComposeConstraintsSupplier", "maybeUpdateRcsAvailabilitySubscription", 908, "DefaultBugleComposeConstraintsSupplier.java")).q("Compose Constraints: Cleared RCS Availability listener. No activeSelfIdentity.");
            }
        }
    }

    public final void i(ajna ajnaVar, amll amllVar) {
        if (amllVar.c() != 2) {
            amllVar.d(ajnaVar != ajna.NONE ? ajnaVar.g ? this.v.b("bugle_rcs_attachment_limit", 10) : this.v.b("bugle_mms_attachment_limit", 10) : 0);
        } else {
            amllVar.d(0);
        }
    }
}

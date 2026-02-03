package defpackage;

import android.content.Intent;
import com.google.android.rcs.client.messaging.GetGroupNotificationsRequest;
import com.google.android.rcs.client.messaging.GetGroupNotificationsResponse;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.RcsMessagingService;
import com.google.android.rcs.client.messaging.data.GroupEvent;
import com.google.android.rcs.client.messaging.data.GroupInformation;
import com.google.android.rcs.client.messaging.data.GroupMember;
import com.google.android.rcs.client.messaging.data.GroupNotification;
import com.google.android.rcs.client.messaging.data.GroupRemoteCapabilities;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import com.google.android.rcs.client.messaging.data.SubjectExtension;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.BiFunction;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ciyq implements cjad {
    public static final cqce a = cqce.g("BugleRcs", "GetGroupNotificationsMethod");
    public final asrc b;
    public final cjbr c;
    public final eosc d;
    public final cjae e;
    private final crru f;
    private final BiFunction g;
    private final ciyd h;
    private final eosc i;
    private final eosc j;

    public ciyq(asrc asrcVar, cjbr cjbrVar, crru crruVar, BiFunction biFunction, ciyd ciydVar, cjae cjaeVar, eosc eoscVar, eosc eoscVar2, eosc eoscVar3) {
        this.b = asrcVar;
        this.c = cjbrVar;
        this.f = crruVar;
        this.g = biFunction;
        this.h = ciydVar;
        this.e = cjaeVar;
        this.d = eoscVar;
        this.i = eoscVar2;
        this.j = eoscVar3;
    }

    public static void c(String str, aubl aublVar) {
        aubk aubkVar = aubk.OK;
        aubk aubkVarB = aubk.b(aublVar.c);
        if (aubkVarB == null) {
            aubkVarB = aubk.UNKNOWN_STATUS;
        }
        if (aubkVar.equals(aubkVarB)) {
            return;
        }
        cqbd cqbdVarE = a.e();
        cqbdVarE.I("Processing incoming RCS group notification failed");
        cqbdVarE.g(str);
        aubi aubiVarB = aubi.b(aublVar.d);
        if (aubiVarB == null) {
            aubiVarB = aubi.UNKNOWN_CAUSE;
        }
        cqbdVarE.A("errorCode", aubiVarB);
        aubi aubiVarB2 = aubi.b(aublVar.d);
        if (aubiVarB2 == null) {
            aubiVarB2 = aubi.UNKNOWN_CAUSE;
        }
        cqbdVarE.A("errorCause", aubiVarB2);
        cqbdVarE.r();
    }

    @Override // defpackage.cjad
    public final eiju a(Intent intent) {
        ejwl.a("com.google.android.apps.messaging.shared.messaging.incoming_group_notification_action".equals(intent.getAction()));
        return this.h.a(this.f.a(this.g, RcsMessagingService.class).h(new ejvr() { // from class: ciyo
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((RcsMessagingService) obj).getGroupNotifications(GetGroupNotificationsRequest.a);
            }
        }, this.j).i(new eooz() { // from class: ciyp
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ekgb ekgbVar;
                Optional optionalOf;
                GetGroupNotificationsResponse getGroupNotificationsResponse = (GetGroupNotificationsResponse) obj;
                if (!MessagingResult.d.equals(getGroupNotificationsResponse.a())) {
                    cqbd cqbdVarE = ciyq.a.e();
                    cqbdVarE.I("Fetching incoming RCS group notifications failed");
                    cqbdVarE.y("errorCode", getGroupNotificationsResponse.a().b());
                    cqbdVarE.r();
                    return eijx.e(null);
                }
                ciyq ciyqVar = this.a;
                ekgb ekgbVarB = getGroupNotificationsResponse.b();
                ciyqVar.e.b.e("Bugle.MessagingService.GetGroupNotifications.BatchSize.Count", cjae.a(ekgbVarB.size()));
                if (ekgbVarB.isEmpty()) {
                    cqbd cqbdVarE2 = ciyq.a.e();
                    cqbdVarE2.I("Fetching incoming RCS group notifications successful but no messages returned");
                    cqbdVarE2.r();
                    return eijx.e(null);
                }
                ekfw ekfwVar = new ekfw();
                int size = ekgbVarB.size();
                int i = 0;
                while (i < size) {
                    GroupNotification groupNotification = (GroupNotification) ekgbVarB.get(i);
                    if (groupNotification.c().isPresent()) {
                        final String strB = groupNotification.a().b();
                        try {
                            final cjbr cjbrVar = ciyqVar.c;
                            ejwl.b(groupNotification.c().isPresent(), "Unexpected missing groupInformation");
                            Object obj2 = groupNotification.c().get();
                            ejwl.b(!((GroupInformation) obj2).d().isEmpty(), "Unexpected empty conversation URI ");
                            ejwl.b(!((GroupInformation) obj2).e().isEmpty(), "Unexpected empty group conversation id");
                            fcsu fcsuVar = cjbrVar.a;
                            aubq aubqVarA = ((asqx) fcsuVar.b()).a(((GroupInformation) obj2).d(), true);
                            final audj audjVar = (audj) audk.b.createBuilder();
                            String strE = ((GroupInformation) obj2).e();
                            audjVar.copyOnWrite();
                            audk audkVar = (audk) audjVar.instance;
                            audkVar.c |= 1;
                            audkVar.d = strE;
                            audjVar.copyOnWrite();
                            audk audkVar2 = (audk) audjVar.instance;
                            aubqVarA.getClass();
                            audkVar2.f = aubqVarA;
                            audkVar2.c |= 8;
                            ekfw ekfwVar2 = new ekfw();
                            ekgb ekgbVarA = ((GroupInformation) obj2).a();
                            int size2 = ekgbVarA.size();
                            int i2 = 0;
                            while (i2 < size2) {
                                GroupMember groupMember = (GroupMember) ekgbVarA.get(i2);
                                final aueh auehVar = (aueh) auek.a.createBuilder();
                                Object obj3 = obj2;
                                ekgbVar = ekgbVarB;
                                try {
                                    aubq aubqVarA2 = ((asqx) fcsuVar.b()).a(groupMember.b().a(), false);
                                    auehVar.copyOnWrite();
                                    auek auekVar = (auek) auehVar.instance;
                                    aubqVarA2.getClass();
                                    auekVar.c = aubqVarA2;
                                    auekVar.b |= 1;
                                    efjf efjfVarA = groupMember.a();
                                    auej auejVar = (dfpg.d() && efjfVarA.equals(efjf.ABSENT)) ? auej.DEPARTED : efjfVarA.equals(efjf.PENDING) ? auej.PENDING : auej.JOINED;
                                    auehVar.copyOnWrite();
                                    auek auekVar2 = (auek) auehVar.instance;
                                    auekVar2.d = auejVar.e;
                                    auekVar2.b |= 2;
                                    groupMember.c().ifPresent(new Consumer() { // from class: cjbq
                                        @Override // java.util.function.Consumer
                                        /* renamed from: accept */
                                        public final void z(Object obj4) {
                                            aufa aufaVar = (aufa) aufb.a.createBuilder();
                                            aubq aubqVarA3 = ((asqx) cjbrVar.a.b()).a(((RcsDestinationId) obj4).a(), false);
                                            aufaVar.copyOnWrite();
                                            aufb aufbVar = (aufb) aufaVar.instance;
                                            aubqVarA3.getClass();
                                            aufbVar.c = aubqVarA3;
                                            aufbVar.b |= 1;
                                            aueh auehVar2 = auehVar;
                                            auehVar2.copyOnWrite();
                                            auek auekVar3 = (auek) auehVar2.instance;
                                            aufb aufbVar2 = (aufb) aufaVar.build();
                                            auek auekVar4 = auek.a;
                                            aufbVar2.getClass();
                                            auekVar3.e = aufbVar2;
                                            auekVar3.b |= 4;
                                        }

                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                            return Consumer$CC.$default$andThen(this, consumer);
                                        }
                                    });
                                    ekfwVar2.h((auek) auehVar.build());
                                    i2++;
                                    ekgbVarB = ekgbVar;
                                    obj2 = obj3;
                                } catch (IllegalArgumentException e) {
                                    e = e;
                                    cqbd cqbdVarB = ciyq.a.b();
                                    cqbdVarB.I("Ignoring invalid incoming RCS group notification with group information");
                                    cqbdVarB.g(strB);
                                    cqbdVarB.s(e);
                                    i++;
                                    ekgbVarB = ekgbVar;
                                }
                            }
                            Object obj4 = obj2;
                            ekgbVar = ekgbVarB;
                            audjVar.b(ekfwVar2.g());
                            ekhv ekhvVar = new ekhv();
                            Optional optionalB = ((GroupInformation) obj4).b();
                            if (optionalB.isPresent()) {
                                if (((GroupRemoteCapabilities) optionalB.get()).c()) {
                                    ekhvVar.c(aucp.SUBJECT_UPDATE);
                                }
                                if (((GroupRemoteCapabilities) optionalB.get()).a().isPresent() && ((Boolean) ((GroupRemoteCapabilities) optionalB.get()).a().get()).booleanValue()) {
                                    ekhvVar.c(aucp.REMOVE_PARTICIPANT_BY_ADMIN);
                                } else if (((GroupRemoteCapabilities) optionalB.get()).b().isPresent() && ((Boolean) ((GroupRemoteCapabilities) optionalB.get()).b().get()).booleanValue()) {
                                    ekhvVar.c(aucp.REMOVE_PARTICIPANT_BY_ALL);
                                }
                            }
                            audjVar.a(ekhvVar.g());
                            aubq aubqVarA3 = cjbrVar.a();
                            audjVar.copyOnWrite();
                            audk audkVar3 = (audk) audjVar.instance;
                            aubqVarA3.getClass();
                            audkVar3.m = aubqVarA3;
                            audkVar3.c |= 256;
                            if (((GroupInformation) obj4).f().isEmpty() && ((GroupInformation) obj4).c().isEmpty()) {
                                optionalOf = Optional.empty();
                            } else {
                                aues auesVar = (aues) auet.a.createBuilder();
                                String strF = ((GroupInformation) obj4).f();
                                auesVar.copyOnWrite();
                                auet auetVar = (auet) auesVar.instance;
                                auetVar.b |= 1;
                                auetVar.c = strF;
                                if (((GroupInformation) obj4).c().isPresent()) {
                                    Object obj5 = ((GroupInformation) obj4).c().get();
                                    if (((SubjectExtension) obj5).a().isPresent()) {
                                        final aufa aufaVar = (aufa) aufb.a.createBuilder();
                                        aubq aubqVarA4 = ((asqx) fcsuVar.b()).a(((RcsDestinationId) ((SubjectExtension) obj5).a().get()).a(), false);
                                        aufaVar.copyOnWrite();
                                        aufb aufbVar = (aufb) aufaVar.instance;
                                        aubqVarA4.getClass();
                                        aufbVar.c = aubqVarA4;
                                        aufbVar.b |= 1;
                                        ((SubjectExtension) obj5).b().ifPresent(new Consumer() { // from class: cjbp
                                            @Override // java.util.function.Consumer
                                            /* renamed from: accept */
                                            public final void z(Object obj6) {
                                                evvp evvpVarB = evwz.b((Instant) obj6);
                                                aufa aufaVar2 = aufaVar;
                                                aufaVar2.copyOnWrite();
                                                aufb aufbVar2 = (aufb) aufaVar2.instance;
                                                aufb aufbVar3 = aufb.a;
                                                evvpVarB.getClass();
                                                aufbVar2.d = evvpVarB;
                                                aufbVar2.b |= 2;
                                            }

                                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                return Consumer$CC.$default$andThen(this, consumer);
                                            }
                                        });
                                        aufb aufbVar2 = (aufb) aufaVar.build();
                                        auesVar.copyOnWrite();
                                        auet auetVar2 = (auet) auesVar.instance;
                                        aufbVar2.getClass();
                                        auetVar2.d = aufbVar2;
                                        auetVar2.b |= 2;
                                    }
                                }
                                optionalOf = Optional.of((auet) auesVar.build());
                            }
                            optionalOf.ifPresent(new Consumer() { // from class: cjbo
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void z(Object obj6) {
                                    audj audjVar2 = audjVar;
                                    auet auetVar3 = (auet) obj6;
                                    audjVar2.copyOnWrite();
                                    audk audkVar4 = (audk) audjVar2.instance;
                                    evsy evsyVar = audk.a;
                                    auetVar3.getClass();
                                    audkVar4.i = auetVar3;
                                    audkVar4.c |= 16;
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            ekfwVar.h(ciyqVar.b.d((audk) audjVar.build()).h(new ejvr() { // from class: ciym
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj6) {
                                    ciyq.c(strB, (aubl) obj6);
                                    return null;
                                }
                            }, ciyqVar.d));
                        } catch (IllegalArgumentException e2) {
                            e = e2;
                            ekgbVar = ekgbVarB;
                        }
                    } else {
                        ekgbVar = ekgbVarB;
                        if (groupNotification.b().isPresent() && dfpg.n()) {
                            final String strB2 = groupNotification.a().b();
                            try {
                                cjbr cjbrVar2 = ciyqVar.c;
                                ejwl.b(groupNotification.b().isPresent(), "Unexpected missing groupEvent");
                                Object obj6 = groupNotification.b().get();
                                ejwl.b(!((GroupEvent) obj6).a().isEmpty(), "Unexpected empty changedMember");
                                audb audbVar = (audb) audc.c.createBuilder();
                                String strB3 = groupNotification.a().b();
                                audbVar.copyOnWrite();
                                audc audcVar = (audc) audbVar.instance;
                                audcVar.d |= 1;
                                audcVar.e = strB3;
                                fcsu fcsuVar2 = cjbrVar2.a;
                                try {
                                    aubq aubqVarA5 = ((asqx) fcsuVar2.b()).a(((GroupMember) ((GroupEvent) obj6).a().get(0)).b().a(), false);
                                    if (((GroupMember) ((GroupEvent) obj6).a().get(0)).a() == efjf.ABSENT) {
                                        audbVar.f(aubqVarA5);
                                    } else if (((GroupMember) ((GroupEvent) obj6).a().get(0)).a() == efjf.PRESENT) {
                                        audbVar.a(aubqVarA5);
                                    }
                                    aubq aubqVarA6 = cjbrVar2.a();
                                    audbVar.copyOnWrite();
                                    audc audcVar2 = (audc) audbVar.instance;
                                    aubqVarA6.getClass();
                                    audcVar2.t = aubqVarA6;
                                    audcVar2.d |= 4096;
                                    if (((GroupMember) ((GroupEvent) obj6).a().get(0)).c().isPresent()) {
                                        aufa aufaVar2 = (aufa) aufb.a.createBuilder();
                                        aubq aubqVarA7 = ((asqx) fcsuVar2.b()).a(((RcsDestinationId) ((GroupMember) ((GroupEvent) obj6).a().get(0)).c().get()).a(), false);
                                        aufaVar2.copyOnWrite();
                                        aufb aufbVar3 = (aufb) aufaVar2.instance;
                                        aubqVarA7.getClass();
                                        aufbVar3.c = aubqVarA7;
                                        aufbVar3.b |= 1;
                                        aufb aufbVar4 = (aufb) aufaVar2.build();
                                        audbVar.copyOnWrite();
                                        audc audcVar3 = (audc) audbVar.instance;
                                        aufbVar4.getClass();
                                        audcVar3.r = aufbVar4;
                                        audcVar3.d |= 1024;
                                    }
                                    ekfwVar.h(ciyqVar.b.c((audc) audbVar.build()).h(new ejvr() { // from class: ciyn
                                        @Override // defpackage.ejvr
                                        public final Object apply(Object obj7) {
                                            ciyq.c(strB2, (aubl) obj7);
                                            return null;
                                        }
                                    }, ciyqVar.d));
                                } catch (IllegalArgumentException e3) {
                                    e = e3;
                                    cqbd cqbdVarB2 = ciyq.a.b();
                                    cqbdVarB2.I("Ignoring invalid incoming RCS group notification with group event");
                                    cqbdVarB2.g(strB2);
                                    cqbdVarB2.s(e);
                                    i++;
                                    ekgbVarB = ekgbVar;
                                }
                            } catch (IllegalArgumentException e4) {
                                e = e4;
                            }
                        }
                        i++;
                        ekgbVarB = ekgbVar;
                    }
                    i++;
                    ekgbVarB = ekgbVar;
                }
                return eijx.j(ekfwVar.g()).b(new eooy() { // from class: ciyl
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        cqbd cqbdVarC = ciyq.a.c();
                        cqbdVarC.I("Finished processing incoming RCS messages");
                        cqbdVarC.r();
                        return eijx.e(null);
                    }
                }, ciyqVar.d);
            }
        }, this.i), "GetGroupNotifications");
    }

    @Override // defpackage.cjad
    public final String b() {
        return "Bugle.MessagingService.Intent.IncomingGroupNotification.Latency";
    }
}

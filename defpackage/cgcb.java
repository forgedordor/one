package defpackage;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.util.Size;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.notification.receiver.DismissNotificationReceiver;
import com.google.android.apps.messaging.ui.gaia.verification.GaiaPairingVerificationActivity;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgcb implements cgbn {
    public static final eksp a = eksp.c("BugleNotifications");
    public final Context b;
    public final fcsu c;
    public final fcsu d;
    Notification e = null;
    private final eygg f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private final fcsu j;
    private final eosc k;
    private final fcsu l;
    private final ejxr m;
    private final fcsu n;
    private final fcsu o;
    private final fcsu p;
    private final fcsu q;
    private final Optional r;
    private final Optional s;
    private final fcsu t;
    private final ejxr u;
    private final eygg v;

    public cgcb(final Context context, eygg eyggVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, eosc eoscVar, fcsu fcsuVar10, fcsu fcsuVar11, Optional optional, Optional optional2, fcsu fcsuVar12, eygg eyggVar2) {
        this.b = context;
        this.f = eyggVar;
        this.g = fcsuVar;
        this.h = fcsuVar2;
        this.i = fcsuVar3;
        this.j = fcsuVar4;
        this.k = eoscVar;
        this.c = fcsuVar10;
        this.l = fcsuVar11;
        this.t = fcsuVar12;
        this.u = new ejxr() { // from class: cgbw
            @Override // defpackage.ejxr
            public final Object get() {
                eksp ekspVar = cgcb.a;
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                rvi.f(notificationManager);
                return notificationManager;
            }
        };
        this.n = fcsuVar5;
        this.o = fcsuVar6;
        this.p = fcsuVar7;
        this.q = fcsuVar8;
        this.d = fcsuVar9;
        this.r = optional;
        this.s = optional2;
        this.v = eyggVar2;
        this.m = new ejxr() { // from class: cgbx
            @Override // defpackage.ejxr
            public final Object get() {
                eksp ekspVar = cgcb.a;
                Resources resources = context.getResources();
                int dimension = (int) resources.getDimension(R.dimen.notification_large_icon_height);
                return new cgar(new Size(720, 720), new Size((int) resources.getDimension(R.dimen.notification_large_icon_width), dimension));
            }
        };
    }

    private final eiju ab(final emgm emgmVar, final cgbf cgbfVar, final long j) {
        eiju eijuVarI;
        final clgv clgvVar = (clgv) this.c.b();
        if (j < 0) {
            eijuVarI = eijx.d(new IllegalArgumentException("backoffTimeMs cannot be negative."));
        } else {
            eiju eijuVarB = clgv.a.b();
            eooz eoozVar = new eooz() { // from class: clgt
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    final long jLongValue = ((Long) obj).longValue();
                    final clgv clgvVar2 = clgvVar;
                    return eiju.g(clgvVar2.c.a.a()).h(new ejvr() { // from class: clgn
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            return Long.valueOf(((clgl) obj2).d);
                        }
                    }, eoqg.a).h(new ejvr() { // from class: clgs
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            return Boolean.valueOf(clgvVar2.a((Long) obj2, jLongValue));
                        }
                    }, clgvVar2.d);
                }
            };
            eosc eoscVar = clgvVar.d;
            eijuVarI = eijuVarB.i(eoozVar, eoscVar).i(new eooz() { // from class: clgu
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    if (!((Boolean) obj).booleanValue()) {
                        return eijx.e(false);
                    }
                    final long j2 = j;
                    emgm emgmVar2 = emgmVar;
                    final clgv clgvVar2 = clgvVar;
                    final String strName = emgmVar2.name();
                    return eiju.g(clgvVar2.c.a.a()).h(new ejvr() { // from class: clgm
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            String str = strName;
                            str.getClass();
                            evub evubVar = ((clgl) obj2).c;
                            return Long.valueOf(evubVar.containsKey(str) ? ((Long) evubVar.get(str)).longValue() : 0L);
                        }
                    }, eoqg.a).h(new ejvr() { // from class: clgr
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            return Boolean.valueOf(clgvVar2.a((Long) obj2, j2));
                        }
                    }, clgvVar2.d);
                }
            }, eoscVar);
        }
        return eijuVarI.i(new eooz() { // from class: cgbt
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                cgcb cgcbVar = this.a;
                emgm emgmVar2 = emgmVar;
                Boolean bool = (Boolean) obj;
                if (bool == null || !bool.booleanValue()) {
                    cgcbVar.aa(7, emgmVar2);
                    return eijx.e(null);
                }
                cgcbVar.V(emgmVar2, cgbfVar);
                clgv clgvVar2 = (clgv) cgcbVar.c.b();
                clgp clgpVar = clgvVar2.c;
                final String strName = emgmVar2.name();
                final long epochMilli = clgvVar2.b.f().toEpochMilli();
                return eiju.g(clgpVar.a.b(new ejvr() { // from class: clgo
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        clgj clgjVar = (clgj) ((clgl) obj2).toBuilder();
                        String str = strName;
                        str.getClass();
                        clgjVar.copyOnWrite();
                        clgl clglVar = (clgl) clgjVar.instance;
                        evub evubVar = clglVar.c;
                        if (!evubVar.b) {
                            clglVar.c = evubVar.a();
                        }
                        long j2 = epochMilli;
                        clglVar.c.put(str, Long.valueOf(j2));
                        clgjVar.copyOnWrite();
                        clgl clglVar2 = (clgl) clgjVar.instance;
                        clglVar2.b |= 1;
                        clglVar2.d = j2;
                        return (clgl) clgjVar.build();
                    }
                }, eoqg.a));
            }
        }, this.k);
    }

    @Override // defpackage.cgbn
    public final void A() {
        Z(((cgbl) this.j.b()).g(this));
    }

    @Override // defpackage.cgbn
    public final void B() {
        if (J()) {
            ((cgct) ((cgbl) this.j.b()).d.b()).a(this).m();
        } else {
            ((eksl) a.o().h("com/google/android/apps/messaging/shared/notification/BugleNotificationManagerImpl", "refreshMessageFailureNotification", 171, "BugleNotificationManagerImpl.java")).q("Notifications disabled, won't refresh message failure.");
        }
    }

    @Override // defpackage.cgbn
    public final void C(ekgb ekgbVar) {
        if (!J()) {
            ((eksl) a.o().h("com/google/android/apps/messaging/shared/notification/BugleNotificationManagerImpl", "refreshRcsNotDeliveredNotification", BasePaymentResult.ERROR_REQUEST_TIMEOUT, "BugleNotificationManagerImpl.java")).q("Notifications disabled, cannot refresh the RCS not delivered notification.");
            return;
        }
        cgdp cgdpVarE = ((cgbl) this.j.b()).e(this);
        int size = ekgbVar.size();
        cgdpVarE.l = size;
        if (size == 0) {
            cgbn cgbnVar = cgdpVarE.a;
            if (cgbnVar.G(cgdpVarE)) {
                cgdpVarE.c.c("Bugle.Notification.RcsNotDelivered.AutoDismissed.Count");
            }
            cgbnVar.k("rcs_not_delivered_notification_tag", cgdpVarE.c());
            return;
        }
        final ekgb ekgbVar2 = (ekgb) Collection.EL.stream(ekgbVar).map(new Function() { // from class: cgdm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bple) obj).m();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(ekcv.a);
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("+RcsNotDeliveredNotification#refresh");
        brdrVarD.h(new Function() { // from class: cgdn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                brecVar.t(ekgbVar2);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ekhx ekhxVar = (ekhx) Collection.EL.stream(brdrVarD.b().f()).collect(ekcv.b);
        int size2 = ekhxVar.size();
        cgdpVarE.k = size2;
        if (size2 == 1) {
            cgdpVarE.i = (ConversationIdType) Collection.EL.stream(ekhxVar).iterator2().next();
            fcsu fcsuVar = cgdpVarE.b;
            bojh bojhVarR = ((bakt) fcsuVar.b()).r(cgdpVarE.i);
            bojhVarR.getClass();
            cgdpVarE.h = Optional.ofNullable(bojhVarR.Y());
            cgdpVarE.m = bojhVarR.an();
            cgdpVarE.j = ((ajsn) cgdpVarE.e.b()).a(cgdpVarE.i, bojhVarR.ab(), cgdpVarE.m);
            if (((aquo) cgdpVarE.f.b()).a()) {
                List listK = ((bakt) fcsuVar.b()).K(cgdpVarE.i);
                if (listK.size() == 1) {
                    cgdpVarE.n = ((alrj) cgdpVarE.g.b()).q((ParticipantsTable.BindData) listK.get(0));
                }
            }
        }
        if (Collection.EL.stream(ekgbVar).anyMatch(new Predicate() { // from class: cgdo
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return !((bple) obj).q();
            }
        })) {
            cgbn cgbnVar2 = cgdpVarE.a;
            if (cgbnVar2.G(cgdpVarE)) {
                cgbnVar2.N(cgdpVarE);
            } else if (cgbnVar2.H(cgdpVarE)) {
                cgdpVarE.c.c("Bugle.Notification.RcsNotDelivered.Posted.Count");
                cgdpVarE.d.d(3);
            }
        }
    }

    @Override // defpackage.cgbn
    public final void D(final ekgb ekgbVar) {
        if (!J()) {
            ((eksl) a.o().h("com/google/android/apps/messaging/shared/notification/BugleNotificationManagerImpl", "refreshRcsStillSendingNotification", 230, "BugleNotificationManagerImpl.java")).q("Notifications disabled, cannot refresh the RCS still sending notification.");
            return;
        }
        cgds cgdsVarF = ((cgbl) this.j.b()).f(this);
        int size = ekgbVar.size();
        cgdsVarF.k = size;
        if (size == 0) {
            cgbn cgbnVar = cgdsVarF.b;
            if (cgbnVar.G(cgdsVarF)) {
                cgdsVarF.d.c("Bugle.Notification.RcsStillSending.AutoDismissed.Count");
            }
            cgbnVar.k("rcs_still_sending_notification_tag", cgdsVarF.c());
            return;
        }
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("+RcsStillSendingNotification.refresh");
        brdrVarD.h(new Function() { // from class: cgdr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                eksp ekspVar = cgds.a;
                brecVar.t(ekgbVar);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ekhx ekhxVarO = ekhx.o(brdrVarD.b().f());
        int size2 = ekhxVarO.size();
        cgdsVarF.j = size2;
        if (size2 == 1) {
            cgdsVarF.h = (ConversationIdType) Collection.EL.stream(ekhxVarO).iterator2().next();
            bojh bojhVarR = ((bakt) cgdsVarF.c.b()).r(cgdsVarF.h);
            if (bojhVarR == null) {
                eksl ekslVar = (eksl) cgds.a.j();
                ekslVar.X(cqnc.r, cgdsVarF.h.toString());
                ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/notification/RcsStillSendingNotification", "refresh", 168, "RcsStillSendingNotification.java")).q("Skipping RCS still sending notification for missing conversation.");
                return;
            } else {
                cgdsVarF.g = Optional.ofNullable(bojhVarR.Y());
                cgdsVarF.l = bojhVarR.an();
                cgdsVarF.i = ((ajsn) cgdsVarF.f.b()).a(cgdsVarF.h, bojhVarR.ab(), cgdsVarF.l);
            }
        }
        cgbn cgbnVar2 = cgdsVarF.b;
        if (cgbnVar2.G(cgdsVarF)) {
            cgbnVar2.N(cgdsVarF);
        } else if (cgbnVar2.H(cgdsVarF)) {
            cgdsVarF.d.c("Bugle.Notification.RcsStillSending.Posted.Count");
            cgdsVarF.e.d(5);
        }
    }

    /* JADX WARN: Type inference failed for: r19v0, types: [eygg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r20v2, types: [eygg, java.lang.Object] */
    @Override // defpackage.cgbn
    public final void E(ekgb ekgbVar) {
        eieu eieuVarK;
        ArrayList arrayList;
        if (!J()) {
            ((eksl) a.o().h("com/google/android/apps/messaging/shared/notification/BugleNotificationManagerImpl", "refreshStuckMessagesNotification", 186, "BugleNotificationManagerImpl.java")).q("Notifications disabled, won't refresh stuck messages.");
            return;
        }
        cger cgerVarG = ((cgbl) this.j.b()).g(this);
        int size = ekgbVar.size();
        cgerVarG.h = size;
        if (size == 0) {
            cgbn cgbnVar = cgerVarG.d;
            if (cgbnVar.G(cgerVarG)) {
                cgbnVar.k("stuck_messages_notification_tag", cgerVarG.c());
                ajgb ajgbVar = (ajgb) cgerVarG.c.b();
                emgj emgjVar = (emgj) emgo.a.createBuilder();
                emgjVar.copyOnWrite();
                emgo emgoVar = (emgo) emgjVar.instance;
                emgoVar.c = 5;
                emgoVar.b = 1 | emgoVar.b;
                emgm emgmVar = emgm.MESSAGE_STUCK_IN_SENDING;
                emgjVar.copyOnWrite();
                emgo emgoVar2 = (emgo) emgjVar.instance;
                emgoVar2.d = emgmVar.o;
                emgoVar2.b |= 2;
                ajgbVar.a((emgo) emgjVar.build());
                return;
            }
            return;
        }
        List list = (List) Collection.EL.stream(ekgbVar).map(new Function() { // from class: cgem
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bple) obj).m();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(ekcv.a);
        baua bauaVar = (baua) cgerVarG.b.b();
        eieu eieuVarK2 = eiiy.k("ConversationMessageListDatabaseOperations#loadConversationMessagesIn");
        try {
            cqaz.h();
            cqaz.q(list.size());
            cqbd cqbdVarA = baua.a.a();
            cqbdVarA.I("ConversationMessageListDatabaseOperations LoadConversationMessagesIn starts.");
            cqbdVarA.r();
            baea baeaVar = null;
            if (bauaVar.e.a()) {
                bfrj bfrjVar = (bfrj) ((baes) bauaVar.d.b()).e((MessageIdType[]) list.toArray(new MessageIdType[0])).p();
                try {
                    fcsu fcsuVar = bauaVar.b;
                    eieuVarK = eiiy.k("ConversationMessageListDatabaseOperations#bindConversationMessageDataCursor");
                    try {
                        baeb baebVar = (baeb) fcsuVar.b();
                        arrayList = new ArrayList(bfrjVar.getCount());
                        baea baeaVar2 = null;
                        while (bfrjVar.moveToNext()) {
                            cpbn cpbnVar = (cpbn) baebVar.a.b();
                            cpbnVar.getClass();
                            bahv bahvVar = (bahv) baebVar.b.b();
                            bahvVar.getClass();
                            baui bauiVar = (baui) baebVar.c.b();
                            bauiVar.getClass();
                            bvur bvurVar = (bvur) baebVar.d.b();
                            bvurVar.getClass();
                            bwfx bwfxVar = (bwfx) baebVar.e.b();
                            bwfxVar.getClass();
                            alrj alrjVar = (alrj) baebVar.f.b();
                            alrjVar.getClass();
                            baebVar.g.b().getClass();
                            fcsu fcsuVar2 = baebVar.h;
                            fcsu fcsuVar3 = baebVar.i;
                            byen byenVar = (byen) baebVar.j.b();
                            byenVar.getClass();
                            byed byedVar = (byed) baebVar.k.b();
                            byedVar.getClass();
                            ?? B = baebVar.l.b();
                            B.getClass();
                            ((arvk) baebVar.m.b()).getClass();
                            baea baeaVar3 = new baea(cpbnVar, bahvVar, bauiVar, bvurVar, bwfxVar, alrjVar, fcsuVar3, byenVar, byedVar, (eygg) B, bfrjVar, (byte[]) null);
                            arrayList.add(baeaVar3);
                            if (baeaVar2 != null) {
                                if (baeaVar2.ae(baeaVar3)) {
                                    baeaVar2.av(baeaVar3);
                                    baeaVar3.au(baeaVar2);
                                } else {
                                    baeaVar3.av(baeaVar2);
                                    baeaVar2.au(baeaVar3);
                                    baeaVar2 = baeaVar3;
                                }
                            }
                            baeaVar = baeaVar3;
                            baeaVar2 = baeaVar3;
                        }
                        if (baeaVar != null) {
                            baeaVar.at();
                        }
                        eieuVarK.close();
                        bfrjVar.close();
                    } finally {
                    }
                } finally {
                }
            } else {
                bgvb bgvbVar = (bgvb) ((bael) bauaVar.c.b()).f((MessageIdType[]) list.toArray(new MessageIdType[0])).p();
                try {
                    fcsu fcsuVar4 = bauaVar.b;
                    eieuVarK = eiiy.k("ConversationMessageListDatabaseOperations#bindConversationMessageDataCursor");
                    try {
                        baeb baebVar2 = (baeb) fcsuVar4.b();
                        arrayList = new ArrayList(bgvbVar.getCount());
                        baea baeaVar4 = null;
                        while (bgvbVar.moveToNext()) {
                            cpbn cpbnVar2 = (cpbn) baebVar2.a.b();
                            cpbnVar2.getClass();
                            bahv bahvVar2 = (bahv) baebVar2.b.b();
                            bahvVar2.getClass();
                            baui bauiVar2 = (baui) baebVar2.c.b();
                            bauiVar2.getClass();
                            bvur bvurVar2 = (bvur) baebVar2.d.b();
                            bvurVar2.getClass();
                            bwfx bwfxVar2 = (bwfx) baebVar2.e.b();
                            bwfxVar2.getClass();
                            alrj alrjVar2 = (alrj) baebVar2.f.b();
                            alrjVar2.getClass();
                            baebVar2.g.b().getClass();
                            fcsu fcsuVar5 = baebVar2.h;
                            fcsu fcsuVar6 = baebVar2.i;
                            byen byenVar2 = (byen) baebVar2.j.b();
                            byenVar2.getClass();
                            byed byedVar2 = (byed) baebVar2.k.b();
                            byedVar2.getClass();
                            ?? B2 = baebVar2.l.b();
                            B2.getClass();
                            ((arvk) baebVar2.m.b()).getClass();
                            baea baeaVar5 = new baea(cpbnVar2, bahvVar2, bauiVar2, bvurVar2, bwfxVar2, alrjVar2, fcsuVar6, byenVar2, byedVar2, (eygg) B2, bgvbVar, (byte[]) null);
                            arrayList.add(baeaVar5);
                            if (baeaVar4 != null) {
                                if (baeaVar4.ae(baeaVar5)) {
                                    baeaVar4.av(baeaVar5);
                                    baeaVar5.au(baeaVar4);
                                } else {
                                    baeaVar5.av(baeaVar4);
                                    baeaVar4.au(baeaVar5);
                                    baeaVar4 = baeaVar5;
                                }
                            }
                            baeaVar = baeaVar5;
                            baeaVar4 = baeaVar5;
                        }
                        if (baeaVar != null) {
                            baeaVar.at();
                        }
                        eieuVarK.close();
                        bgvbVar.close();
                    } finally {
                        try {
                            eieuVarK.close();
                            throw th;
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                    }
                } finally {
                }
            }
            eieuVarK2.close();
            Set set = (Set) Collection.EL.stream(arrayList).map(new Function() { // from class: cgen
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((bajc) obj).q();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toCollection(new Supplier() { // from class: cgeo
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new HashSet();
                }
            }));
            cgerVarG.k = Collection.EL.stream(arrayList).filter(new Predicate() { // from class: cgej
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo538negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((bajc) obj).b() == 0;
                }
            }).count();
            cgerVarG.l = Collection.EL.stream(arrayList).filter(new Predicate() { // from class: cgek
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo538negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((bajc) obj).b() == 1;
                }
            }).count();
            cgerVarG.m = Collection.EL.stream(arrayList).filter(new Predicate() { // from class: cgel
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo538negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((bajc) obj).b() == 3;
                }
            }).count();
            if (set.size() == 1) {
                ((bajc) arrayList.get(0)).b();
                cgerVarG.f = ((bajc) arrayList.get(0)).q();
                bajf bajfVarA = ((axgh) cgerVarG.a.b()).a(cgerVarG.f);
                cgerVarG.j = bajfVarA != null ? bajfVarA.o() : "";
                if (bajfVarA != null) {
                    cgerVarG.n = bajfVarA.P();
                }
                cgerVarG.g = ((ajsn) cgerVarG.e.b()).a(cgerVarG.f, ((bajc) arrayList.get(0)).D(), cgerVarG.n);
            }
            cgerVarG.i = set.size();
            if (!Collection.EL.stream(ekgbVar).anyMatch(new Predicate() { // from class: cgep
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo538negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return !((bple) obj).q();
                }
            })) {
                cgerVarG.d.N(cgerVarG);
                return;
            }
            cgbn cgbnVar2 = cgerVarG.d;
            if (!cgbnVar2.G(cgerVarG)) {
                ajgb ajgbVar2 = (ajgb) cgerVarG.c.b();
                emgj emgjVar2 = (emgj) emgo.a.createBuilder();
                emgjVar2.copyOnWrite();
                emgo emgoVar3 = (emgo) emgjVar2.instance;
                emgoVar3.c = 1;
                emgoVar3.b = 1 | emgoVar3.b;
                emgm emgmVar2 = emgm.MESSAGE_STUCK_IN_SENDING;
                emgjVar2.copyOnWrite();
                emgo emgoVar4 = (emgo) emgjVar2.instance;
                emgoVar4.d = emgmVar2.o;
                emgoVar4.b |= 2;
                ajgbVar2.a((emgo) emgjVar2.build());
            }
            cgbnVar2.H(cgerVarG);
        } finally {
        }
    }

    @Override // defpackage.cgbn
    public final synchronized void F(cqbf cqbfVar) {
        cqbf cqbfVarO = O();
        if (cqbfVar.equals(cqbfVarO)) {
            return;
        }
        String string = this.b.getString(com.google.android.apps.messaging.R.string.notifications_group_children_key);
        String strB = cqbfVarO.b();
        String strB2 = cqbfVar.b();
        ((crqv) this.i.b()).l(string, strB2);
        ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/notification/BugleNotificationManagerImpl", "updateIncomingMessageNotificationsConversationIdSet", 518, "BugleNotificationManagerImpl.java")).D("Updating notification id set: old - %s, new - %s", strB, strB2);
    }

    @Override // defpackage.cgbn
    public final boolean G(cgbf cgbfVar) {
        return ((cgbg) this.g.b()).c(cgbfVar);
    }

    @Override // defpackage.cgbn
    public final boolean H(cgbf cgbfVar) {
        return ((cgbg) this.g.b()).d(cgbfVar);
    }

    @Override // defpackage.cgbn
    public final boolean I() {
        if (!J()) {
            ((eksl) a.o().h("com/google/android/apps/messaging/shared/notification/BugleNotificationManagerImpl", "refreshReminderNotifications", 401, "BugleNotificationManagerImpl.java")).q("Notifications disabled, won't refresh reminder notifications.");
            U();
            return false;
        }
        cgdu cgduVar = (cgdu) ((Optional) ((cgbl) this.j.b()).e.b()).map(new Function() { // from class: cgbk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((cgdv) obj).a(this);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(null);
        if (cgduVar == null) {
            U();
            return true;
        }
        cgduVar.m();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009f  */
    @Override // defpackage.cgbn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean J() {
        /*
            r7 = this;
            j$.util.Optional r0 = r7.s
            boolean r1 = r0.isPresent()
            r2 = 0
            java.lang.String r3 = "shouldNotify"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/notification/BugleNotificationManagerImpl"
            java.lang.String r5 = "BugleNotificationManagerImpl.java"
            if (r1 == 0) goto L39
            java.lang.Object r0 = r0.get()
            fcsu r0 = (defpackage.fcsu) r0
            java.lang.Object r0 = r0.b()
            ctcf r0 = (defpackage.ctcf) r0
            int r0 = r0.a()
            r1 = 1
            if (r0 == r1) goto L23
            goto L39
        L23:
            eksp r0 = defpackage.cgcb.a
            ekrw r0 = r0.h()
            eksl r0 = (defpackage.eksl) r0
            r1 = 361(0x169, float:5.06E-43)
            ekrw r0 = r0.h(r4, r3, r1, r5)
            eksl r0 = (defpackage.eksl) r0
            java.lang.String r1 = "Notification disabled for TMO Digits-enabled wear device"
            r0.q(r1)
            return r2
        L39:
            fcsu r0 = r7.t
            java.lang.Object r0 = r0.b()
            ctan r0 = (defpackage.ctan) r0
            fcsu r1 = r0.c
            java.lang.Object r6 = r1.b()
            ctce r6 = (defpackage.ctce) r6
            fctc r6 = r6.d
            java.lang.Object r6 = r6.a()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L9f
            java.lang.Object r1 = r1.b()
            ctce r1 = (defpackage.ctce) r1
            fctc r1 = r1.e
            java.lang.Object r1 = r1.a()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L9f
            damk r0 = r0.d
            fctc r1 = r0.c
            java.lang.Object r1 = r1.a()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L9f
            fctc r0 = r0.d
            java.lang.Object r0 = r0.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L9f
            eksp r0 = defpackage.cgcb.a
            ekrw r0 = r0.h()
            eksl r0 = (defpackage.eksl) r0
            r1 = 366(0x16e, float:5.13E-43)
            ekrw r0 = r0.h(r4, r3, r1, r5)
            eksl r0 = (defpackage.eksl) r0
            java.lang.String r1 = "Notification is eligible for wear device with force showing all watch conversations."
            r0.q(r1)
            goto Lcf
        L9f:
            j$.util.Optional r0 = r7.r
            boolean r1 = r0.isPresent()
            if (r1 == 0) goto Lcf
            java.lang.Object r0 = r0.get()
            fcsu r0 = (defpackage.fcsu) r0
            java.lang.Object r0 = r0.b()
            ctbt r0 = (defpackage.ctbt) r0
            boolean r0 = r0.a()
            if (r0 != 0) goto Lcf
            eksp r0 = defpackage.cgcb.a
            ekrw r0 = r0.h()
            eksl r0 = (defpackage.eksl) r0
            r1 = 372(0x174, float:5.21E-43)
            ekrw r0 = r0.h(r4, r3, r1, r5)
            eksl r0 = (defpackage.eksl) r0
            java.lang.String r1 = "Notification disabled for wear device without local watch account."
            r0.q(r1)
            return r2
        Lcf:
            fcsu r0 = r7.h
            java.lang.Object r0 = r0.b()
            crmx r0 = (defpackage.crmx) r0
            boolean r0 = r0.G()
            if (r0 != 0) goto Lf3
            eksp r0 = defpackage.cgcb.a
            ekrw r0 = r0.h()
            eksl r0 = (defpackage.eksl) r0
            r1 = 379(0x17b, float:5.31E-43)
            ekrw r0 = r0.h(r4, r3, r1, r5)
            eksl r0 = (defpackage.eksl) r0
            java.lang.String r1 = "Notification disabled as it's not default sms app."
            r0.q(r1)
            return r2
        Lf3:
            fcsu r0 = r7.g
            java.lang.Object r0 = r0.b()
            cgbg r0 = (defpackage.cgbg) r0
            boolean r0 = r0.e()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgcb.J():boolean");
    }

    @Override // defpackage.cgbn
    public final void K(final cpyb cpybVar, final int i) {
        cgbe cgbeVar;
        final tyq tyqVar = (tyq) ((cgbl) this.j.b()).i.b();
        int iOrdinal = cpybVar.ordinal();
        if (iOrdinal == 0) {
            throw new IllegalArgumentException("Cannot create a notification for an undefined CMS feature.");
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new IllegalStateException("Not expected to exit out of exhaustive switch statement for CmsFeature and BoxPrimaryDeviceStatus enums");
            }
            if (i == 0) {
                throw null;
            }
            cgbeVar = i == 2 ? cgbe.PRIMARY_DEVICE_CHANGED_BNR : i == 3 ? cgbe.BACKUP_DELETED_BNR : cgbe.UNSPECIFIED_PRIMARY_DEVICE_ENFORCEMENT_BNR;
        } else {
            if (i == 0) {
                throw null;
            }
            cgbeVar = i == 2 ? cgbe.PRIMARY_DEVICE_CHANGED_MD : i == 3 ? cgbe.BACKUP_DELETED_MD : cgbe.UNSPECIFIED_PRIMARY_DEVICE_ENFORCEMENT_MD;
        }
        Z(tyqVar.d.a(new cgeg() { // from class: typ
            @Override // defpackage.cgeg
            public final Notification a(String str) {
                String string;
                String string2;
                Intent intentA;
                tyq tyqVar2 = tyqVar;
                cpyb cpybVar2 = cpybVar;
                int i2 = i;
                if (cpyl.a()) {
                    int iOrdinal2 = cpybVar2.ordinal();
                    if (iOrdinal2 == 0) {
                        throw new IllegalArgumentException("Cannot create a notification for an undefined CMS feature.");
                    }
                    if (iOrdinal2 != 1) {
                        if (iOrdinal2 != 2) {
                            throw new IllegalStateException("Not expected to exit out of exhaustive switch statement for CmsFeature and BoxPrimaryDeviceStatus enums");
                        }
                        if (i2 == 1) {
                            string = tyqVar2.a.getString(com.google.android.apps.messaging.R.string.unspecified_opt_out_bnr_notification_title);
                            i2 = 1;
                        } else {
                            string = tyqVar2.a.getString(com.google.android.apps.messaging.R.string.opt_out_bnr_notification_title);
                        }
                    } else if (i2 == 1) {
                        string = tyqVar2.a.getString(com.google.android.apps.messaging.R.string.unspecified_opt_out_multidevice_notification_title);
                        i2 = 1;
                    } else {
                        string = tyqVar2.a.getString(com.google.android.apps.messaging.R.string.opt_out_multidevice_notification_title);
                    }
                } else {
                    string = tyqVar2.a.getString(com.google.android.apps.messaging.R.string.opt_out_multidevice_notification_title_legacy);
                }
                if (cpyl.a()) {
                    int iOrdinal3 = cpybVar2.ordinal();
                    if (iOrdinal3 == 0) {
                        throw new IllegalArgumentException("Cannot create a notification for an undefined CMS feature.");
                    }
                    if (iOrdinal3 == 1) {
                        string2 = i2 == 2 ? tyqVar2.a.getString(com.google.android.apps.messaging.R.string.primary_device_changed_multidevice_notification_body) : i2 == 3 ? tyqVar2.a.getString(com.google.android.apps.messaging.R.string.backup_deleted_multidevice_notification_body) : tyqVar2.a.getString(com.google.android.apps.messaging.R.string.unspecified_opt_out_multidevice_notification_body);
                    } else {
                        if (iOrdinal3 != 2) {
                            throw new IllegalStateException("Not expected to exit out of exhaustive switch statement for CmsFeature and BoxPrimaryDeviceStatus enums");
                        }
                        string2 = i2 == 2 ? tyqVar2.a.getString(com.google.android.apps.messaging.R.string.primary_device_changed_bnr_notification_body) : i2 == 3 ? tyqVar2.a.getString(com.google.android.apps.messaging.R.string.backup_deleted_bnr_notification_body) : tyqVar2.a.getString(com.google.android.apps.messaging.R.string.unspecified_opt_out_bnr_notification_body);
                    }
                } else {
                    string2 = tyqVar2.a.getString(com.google.android.apps.messaging.R.string.primary_device_changed_multidevice_notification_body_legacy);
                }
                Context context = tyqVar2.a;
                kvq kvqVar = new kvq(context, str);
                kvqVar.i(string);
                kvqVar.h(string2);
                kvqVar.r(com.google.android.apps.messaging.R.drawable.notification_icon);
                kvqVar.l = 0;
                kvj kvjVar = new kvj(kvqVar);
                kvjVar.e(string2);
                kvqVar.u(kvjVar);
                if (cpyl.a()) {
                    int iOrdinal4 = cpybVar2.ordinal();
                    if (iOrdinal4 == 0) {
                        throw new IllegalArgumentException("Cannot create a notification for an undefined CMS feature.");
                    }
                    Intent intentA2 = null;
                    if (iOrdinal4 != 1) {
                        if (iOrdinal4 == 2) {
                            intentA2 = tyqVar2.c.e(context);
                        }
                    } else if (((Boolean) cpyl.q.e()).booleanValue()) {
                        intentA2 = tyqVar2.c.e(context);
                    } else {
                        Optional optional = tyqVar2.b;
                        if (optional.isPresent()) {
                            intentA2 = tlz.a(context);
                        }
                    }
                    intentA2.getClass();
                    kxg kxgVar = new kxg(context);
                    kxgVar.e(intentA2);
                    PendingIntent pendingIntentA = kxgVar.a(0, crag.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
                    pendingIntentA.getClass();
                    kvqVar.g(true);
                    kvqVar.g = pendingIntentA;
                } else {
                    Optional optional2 = tyqVar2.b;
                    if (optional2.isPresent()) {
                        if (((Boolean) cpyl.q.e()).booleanValue()) {
                            intentA = tyqVar2.c.e(context);
                        } else {
                            intentA = tlz.a(context);
                        }
                        kxg kxgVar2 = new kxg(context);
                        kxgVar2.e(intentA);
                        PendingIntent pendingIntentA2 = kxgVar2.a(0, crag.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
                        pendingIntentA2.getClass();
                        kvqVar.g(true);
                        kvqVar.g = pendingIntentA2;
                        kvqVar.d(com.google.android.apps.messaging.R.drawable.notification_icon, context.getString(com.google.android.apps.messaging.R.string.primary_device_changed_notification_action_sign_in), pendingIntentA2);
                    }
                }
                return kvqVar.a();
            }
        }, cgbeVar));
    }

    @Override // defpackage.cgbn
    public final synchronized void L(ConversationIdType conversationIdType) {
        String strConcat = !conversationIdType.b() ? ":".concat(String.valueOf(String.valueOf(conversationIdType))) : "";
        String str = this.b.getPackageName() + ":sms" + strConcat;
        cgbb cgbbVar = (cgbb) this.l.b();
        if (craf.d) {
            StatusBarNotification[] activeNotifications = cgbbVar.a.getActiveNotifications();
            int length = activeNotifications.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                StatusBarNotification statusBarNotification = activeNotifications[i];
                if (!TextUtils.equals(statusBarNotification.getTag(), str)) {
                    i++;
                } else if ((statusBarNotification.getNotification().flags & 4096) == 4096) {
                    eksl ekslVar = (eksl) a.h();
                    ekslVar.X(cqnc.r, conversationIdType.toString());
                    ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/notification/BugleNotificationManagerImpl", "cancelIncomingMessageNotifications", 252, "BugleNotificationManagerImpl.java")).q("Notification bubbled, will not be canceled");
                    return;
                }
            }
        }
        k(str, cgbe.INCOMING_MESSAGE);
        cqbf cqbfVarO = O();
        if (cqbfVarO.isEmpty() || conversationIdType.b()) {
            return;
        }
        cqbfVarO.remove(conversationIdType);
        F(cqbfVarO);
    }

    @Override // defpackage.cgbn
    public final eiju M() {
        return eijx.e(null);
    }

    @Override // defpackage.cgbn
    public final void N(cgbf cgbfVar) {
        ((cgbg) this.g.b()).f(cgbfVar);
    }

    public final synchronized cqbf O() {
        cqbf cqbfVar;
        Notification.BubbleMetadata bubbleMetadata;
        cqbfVar = new cqbf();
        for (StatusBarNotification statusBarNotification : ((NotificationManager) this.u.get()).getActiveNotifications()) {
            if (statusBarNotification.getId() == cgbe.INCOMING_MESSAGE.G && statusBarNotification.getTag() != null) {
                Matcher matcher = Pattern.compile("\\d+$").matcher(statusBarNotification.getTag());
                ConversationIdType conversationIdTypeB = matcher.find() ? barn.b(matcher.group()) : barn.a;
                boolean z = craf.d && (bubbleMetadata = statusBarNotification.getNotification().getBubbleMetadata()) != null && bubbleMetadata.isNotificationSuppressed();
                if (!conversationIdTypeB.b() && !z) {
                    cqbfVar.add(conversationIdTypeB);
                }
            }
        }
        return cqbfVar;
    }

    @Override // defpackage.cgeb
    public final eiju P(Throwable th, long j) {
        ((eksl) ((eksl) ((eksl) a.h()).g(th)).h("com/google/android/apps/messaging/shared/notification/BugleNotificationManagerImpl", "postReportIssueNotification", (char) 622, "BugleNotificationManagerImpl.java")).q("Messages automatically detected an error. Showing notification");
        fcsu fcsuVar = this.j;
        emgm emgmVar = emgm.SILENT_CRASH;
        cgea cgeaVar = (cgea) ((cgbl) fcsuVar.b()).f.b();
        cgdw cgdwVarE = cgdx.e();
        cgdwVarE.b(emgmVar);
        ((cgau) cgdwVarE).b = Optional.of(th);
        return ab(emgmVar, cgeaVar.a(cgdwVarE.a()), j);
    }

    @Override // defpackage.cgeb
    public final eiju Q(emgm emgmVar, long j, String str) {
        return ab(emgmVar, ((cgbl) this.j.b()).d(emgmVar, str, null), j);
    }

    @Override // defpackage.cgeb
    public final eiju R(emgm emgmVar, String str, long j, ekgp ekgpVar) {
        return ab(emgmVar, ((cgbl) this.j.b()).d(emgmVar, str, ekgpVar), j);
    }

    public final ListenableFuture S() {
        return (ListenableFuture) ((Optional) this.o.b()).map(new Function() { // from class: cgbv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((czwb) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(eork.i(new ArrayList()));
    }

    public final void T(final String str) {
        k((String) ((Optional) this.p.b()).map(new Function() { // from class: cgbu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return czwe.a(this.a.b, str);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(null), cgbe.REMINDER);
    }

    final void U() {
        eika.l(S(), new cgby(this), eoqg.a);
    }

    public final void V(emgm emgmVar, cgbf cgbfVar) {
        Optional optionalEmpty;
        Bundle bundle;
        StatusBarNotification[] activeNotifications = ((NotificationManager) this.u.get()).getActiveNotifications();
        int length = activeNotifications.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                optionalEmpty = Optional.empty();
                break;
            }
            StatusBarNotification statusBarNotification = activeNotifications[i];
            if (statusBarNotification.getId() == cgbe.REPORT_ISSUE.G && (bundle = statusBarNotification.getNotification().extras) != null) {
                optionalEmpty = Optional.of(emgm.b(bundle.getInt("issue_type_extra")));
                break;
            }
            i++;
        }
        if (Z(cgbfVar)) {
            optionalEmpty.ifPresent(new Consumer() { // from class: cgbr
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    this.a.aa(8, (emgm) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            aa(2, emgmVar);
        }
    }

    @Override // defpackage.cgeb
    public final void W(emgm emgmVar, String str) {
        V(emgmVar, ((cgbl) this.j.b()).d(emgmVar, str, null));
    }

    final void X(final List list) {
        ((Optional) this.o.b()).ifPresent(new Consumer() { // from class: cgbp
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                eksp ekspVar = cgcb.a;
                ((czwb) obj).b(list);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final boolean Y(cgbe cgbeVar) {
        for (StatusBarNotification statusBarNotification : ((NotificationManager) this.u.get()).getActiveNotifications()) {
            if (statusBarNotification.getId() == cgbeVar.G) {
                return true;
            }
        }
        return false;
    }

    final boolean Z(cgbf cgbfVar) {
        if (J()) {
            return H(cgbfVar);
        }
        eksl ekslVar = (eksl) a.h();
        ekslVar.X(cgbf.p, cgbfVar);
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/notification/BugleNotificationManagerImpl", "notifyIfAllowed", 421, "BugleNotificationManagerImpl.java")).q("Notifications disabled, won't notify");
        return false;
    }

    @Override // defpackage.cgbn
    public final Notification a(String str) {
        return ((cgbl) this.j.b()).a(str).b();
    }

    public final void aa(int i, emgm emgmVar) {
        ajgb ajgbVar = (ajgb) this.q.b();
        emgj emgjVar = (emgj) emgo.a.createBuilder();
        emgjVar.copyOnWrite();
        emgo emgoVar = (emgo) emgjVar.instance;
        emgoVar.c = i - 1;
        emgoVar.b |= 1;
        emgjVar.copyOnWrite();
        emgo emgoVar2 = (emgo) emgjVar.instance;
        emgoVar2.d = emgmVar.o;
        emgoVar2.b |= 2;
        ajgbVar.a((emgo) emgjVar.build());
    }

    @Override // defpackage.cgbn
    public final Notification b() {
        return c(this.b.getString(com.google.android.apps.messaging.R.string.foreground_service_notification_generic_text));
    }

    @Override // defpackage.cgbn
    public final Notification c(String str) {
        return ((cgbl) this.j.b()).b(str).b();
    }

    @Override // defpackage.cgbn
    public final Notification d() {
        return this.e;
    }

    @Override // defpackage.cgbn
    public final cgbm e() {
        return (cgbm) this.m.get();
    }

    @Override // defpackage.cgbn
    public final cgcl f() {
        return (cgcl) this.f.b();
    }

    @Override // defpackage.cgbn
    public final /* synthetic */ void g() {
        j(cgbe.AUTOMOVED_SPAM);
    }

    @Override // defpackage.cgbn
    public final /* synthetic */ void h() {
        j(cgbe.DIAGNOSTICS_TOOL);
    }

    @Override // defpackage.cgbn
    public final /* synthetic */ void i() {
        j(cgbe.LOW_STORAGE_SPACE);
    }

    @Override // defpackage.cgbn
    public final void j(cgbe cgbeVar) {
        k(null, cgbeVar);
    }

    @Override // defpackage.cgbn
    public final void k(String str, cgbe cgbeVar) {
        ((cgbg) this.g.b()).b(str, cgbeVar);
    }

    @Override // defpackage.cgbn
    public final /* synthetic */ void l() {
        j(cgbe.REPORT_ISSUE);
    }

    @Override // defpackage.cgbn
    public final void m() {
        final tyk tykVar = (tyk) ((cgbl) this.j.b()).j.b();
        Z(tykVar.c.a(new cgeg() { // from class: tyj
            @Override // defpackage.cgeg
            public final Notification a(String str) {
                tyk tykVar2 = tykVar;
                Context context = tykVar2.a;
                String string = context.getString(com.google.android.apps.messaging.R.string.account_removed_notification_title);
                String string2 = context.getString(com.google.android.apps.messaging.R.string.account_removed_notification_body);
                kvq kvqVar = new kvq(context, str);
                kvqVar.i(string);
                kvqVar.h(string2);
                kvqVar.r(com.google.android.apps.messaging.R.drawable.notification_icon);
                kvqVar.l = 0;
                kvj kvjVar = new kvj(kvqVar);
                kvjVar.e(string2);
                kvqVar.u(kvjVar);
                Optional optional = tykVar2.b;
                if (optional.isPresent() && !((Boolean) cpyl.q.e()).booleanValue()) {
                    Intent intentA = tlz.a(context);
                    TaskStackBuilder taskStackBuilderCreate = TaskStackBuilder.create(context);
                    taskStackBuilderCreate.addNextIntentWithParentStack(intentA);
                    PendingIntent pendingIntent = taskStackBuilderCreate.getPendingIntent(0, crag.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
                    pendingIntent.getClass();
                    kvqVar.g(true);
                    kvqVar.g = pendingIntent;
                }
                return kvqVar.a();
            }
        }, cgbe.ACCOUNT_REMOVED));
    }

    @Override // defpackage.cgbn
    public final void n() {
        final cgbl cgblVar = (cgbl) this.j.b();
        cgblVar.getClass();
        eijx.g(new Callable() { // from class: cgbq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ecem.b();
                final cgaq cgaqVar = (cgaq) cgblVar.g.b();
                ecem.b();
                ecem.b();
                cgbn cgbnVar = cgaqVar.d;
                int width = ((cgar) cgbnVar.e()).a.getWidth();
                int height = ((cgar) cgbnVar.e()).a.getHeight();
                final Bitmap bitmapA = cgaqVar.f.a(cgaqVar.a, cgaqVar.e.f(null, null, ((alrj) cgaqVar.h.b()).f(), null, false, true, false), width, height);
                return cgaqVar.b.b(new cgeg() { // from class: cgao
                    @Override // defpackage.cgeg
                    public final Notification a(String str) throws Resources.NotFoundException {
                        cgaq cgaqVar2 = cgaqVar;
                        Context context = cgaqVar2.a;
                        kvq kvqVar = new kvq(context, str);
                        PendingIntent pendingIntentF = DismissNotificationReceiver.f(context, cgbe.AUTOMOVED_SPAM);
                        Optional optionalD = cgaqVar2.g.d(context);
                        if (optionalD.isEmpty()) {
                            return null;
                        }
                        Bitmap bitmap = bitmapA;
                        if (bitmap != null) {
                            kvqVar.m(bitmap);
                        }
                        kvqVar.i(context.getString(com.google.android.apps.messaging.R.string.automoved_spam_notification_content_title));
                        kvqVar.h(context.getString(com.google.android.apps.messaging.R.string.automoved_spam_notification_content_text));
                        kvqVar.l = 2;
                        kvqVar.r(com.google.android.apps.messaging.R.drawable.notification_icon);
                        kvqVar.d(com.google.android.apps.messaging.R.drawable.ic_check_circle_gray, context.getString(com.google.android.apps.messaging.R.string.automoved_spam_notification_action_dismiss), pendingIntentF);
                        kvqVar.d(com.google.android.apps.messaging.R.drawable.quantum_ic_googleplus_reshare_googblue_24, context.getString(com.google.android.apps.messaging.R.string.automoved_spam_notification_action_view), (PendingIntent) optionalD.get());
                        kvqVar.g = (PendingIntent) optionalD.get();
                        kvqVar.g(true);
                        kvqVar.p(true);
                        kvqVar.C = context.getColor(com.google.android.apps.messaging.R.color.silent_notification_icon_color);
                        return kvqVar.a();
                    }
                }, cgbe.AUTOMOVED_SPAM, new cgda() { // from class: cgap
                    @Override // defpackage.cgda
                    public final NotificationChannel a() {
                        cqzr cqzrVar = cgaqVar.c;
                        if (!cqzrVar.m()) {
                            return null;
                        }
                        NotificationChannel notificationChannel = ((NotificationManager) cqzrVar.a.b()).getNotificationChannel("bugle_auto_moved_spam_channel");
                        String string = cqzrVar.b.getString(com.google.android.apps.messaging.R.string.automoved_spam_notification_channel_name);
                        if (notificationChannel != null) {
                            if (!TextUtils.equals(notificationChannel.getName(), string)) {
                                notificationChannel.setName(string);
                            }
                            return notificationChannel;
                        }
                        cqzp cqzpVar = new cqzp("bugle_auto_moved_spam_channel", string, 2);
                        cqzpVar.b(false);
                        cqzpVar.a(false);
                        cqzpVar.d();
                        NotificationChannel notificationChannel2 = cqzpVar.a;
                        cqzrVar.n(notificationChannel2);
                        return notificationChannel2;
                    }
                });
            }
        }, this.k).k(auwc.a(new cgca(this)), eoqg.a);
    }

    @Override // defpackage.cgbn
    public final void o() {
        Z(((cgbl) this.j.b()).a(this.b.getString(com.google.android.apps.messaging.R.string.foreground_service_notification_generic_text)));
    }

    @Override // defpackage.cgbn
    public final void p(final Intent intent) {
        if (Y(cgbe.UNSPECIFIED_PRIMARY_DEVICE_ENFORCEMENT_MD) || Y(cgbe.UNSPECIFIED_PRIMARY_DEVICE_ENFORCEMENT_BNR)) {
            return;
        }
        final tym tymVar = (tym) ((cgbl) this.j.b()).k.b();
        Z(tymVar.b.a(new cgeg() { // from class: tyl
            @Override // defpackage.cgeg
            public final Notification a(String str) {
                Context context = tymVar.a;
                kxg kxgVar = new kxg(context);
                Intent intent2 = intent;
                kxgVar.e(intent2);
                PendingIntent pendingIntentA = kxgVar.a(0, crag.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
                context.getString(com.google.android.apps.messaging.R.string.cms_vital_error_notification_title);
                context.getString(com.google.android.apps.messaging.R.string.cms_vital_error_notification_message);
                String string = context.getString(com.google.android.apps.messaging.R.string.unspecified_opt_out_bnr_notification_title);
                String string2 = context.getString(com.google.android.apps.messaging.R.string.unspecified_opt_out_bnr_notification_body);
                if (intent2.getIntExtra("CMS_FEATURE_KEY", -1) == cpyb.MULTI_DEVICE.d) {
                    string = context.getString(com.google.android.apps.messaging.R.string.unspecified_opt_out_multidevice_notification_title);
                    string2 = context.getString(com.google.android.apps.messaging.R.string.unspecified_opt_out_multidevice_notification_body);
                }
                kvq kvqVar = new kvq(context, str);
                kvqVar.i(string);
                kvqVar.h(string2);
                kvqVar.r(com.google.android.apps.messaging.R.drawable.notification_icon);
                kvqVar.g(true);
                kvqVar.l = 0;
                kvqVar.g = pendingIntentA;
                return kvqVar.a();
            }
        }, cgbe.CMS_VITAL_ERROR));
    }

    @Override // defpackage.cgbn
    public final void q(final String str) {
        final tyo tyoVar = (tyo) ((cgbl) this.j.b()).h.b();
        Z(tyoVar.d.a(new cgeg() { // from class: tyn
            @Override // defpackage.cgeg
            public final Notification a(String str2) {
                Intent intentA;
                Object[] objArr = {str};
                tyo tyoVar2 = tyoVar;
                Context context = tyoVar2.a;
                String string = context.getString(com.google.android.apps.messaging.R.string.dasher_disabled_notification_title, objArr);
                String string2 = context.getString(com.google.android.apps.messaging.R.string.dasher_disabled_notification_body);
                kvq kvqVar = new kvq(context, str2);
                kvqVar.i(string);
                kvqVar.h(string2);
                kvqVar.r(com.google.android.apps.messaging.R.drawable.notification_icon);
                kvqVar.l = 0;
                kvj kvjVar = new kvj(kvqVar);
                kvjVar.e(string2);
                kvqVar.u(kvjVar);
                Optional optional = tyoVar2.b;
                if (optional.isPresent()) {
                    if (((Boolean) cpyl.q.e()).booleanValue()) {
                        intentA = tyoVar2.c.e(context);
                    } else {
                        intentA = tlz.a(context);
                    }
                    TaskStackBuilder taskStackBuilderCreate = TaskStackBuilder.create(context);
                    taskStackBuilderCreate.addNextIntentWithParentStack(intentA);
                    PendingIntent pendingIntent = taskStackBuilderCreate.getPendingIntent(0, crag.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
                    pendingIntent.getClass();
                    kvqVar.g(true);
                    kvqVar.g = pendingIntent;
                }
                return kvqVar.a();
            }
        }, cgbe.DASHER_DISABLED));
    }

    @Override // defpackage.cgbn
    public final void r() {
        final cgch cgchVar = (cgch) ((cgbl) this.j.b()).b.b();
        Z(cgchVar.b.a(new cgeg() { // from class: cgcg
            @Override // defpackage.cgeg
            public final Notification a(String str) {
                kvq kvqVar = new kvq(cgchVar.a, str);
                kvqVar.i("Messages In-App Diagnostics");
                kvqVar.h("Diagnosing in progress...");
                kvqVar.r(com.google.android.apps.messaging.R.drawable.ic_warning_light);
                return kvqVar.a();
            }
        }, cgbe.DIAGNOSTICS_TOOL));
    }

    @Override // defpackage.cgbn
    public final void s() {
        Z(((cgbl) this.j.b()).b(this.b.getString(com.google.android.apps.messaging.R.string.foreground_service_notification_generic_text)));
    }

    @Override // defpackage.cgbn
    public final void t() {
        if (Collection.EL.stream((Set) this.v.b()).allMatch(new Predicate() { // from class: cgbs
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((bvmk) obj).c();
            }
        })) {
            final cfkv cfkvVar = (cfkv) ((cgbl) this.j.b()).l.b();
            Z(cfkvVar.c.a(new cgeg() { // from class: cfku
                @Override // defpackage.cgeg
                public final Notification a(String str) {
                    cfkv cfkvVar2 = cfkvVar;
                    Context context = cfkvVar2.a;
                    String string = context.getString(com.google.android.apps.messaging.R.string.gaia_pairing_verification_notification_title);
                    if (craf.e) {
                        string = context.getString(com.google.android.apps.messaging.R.string.gaia_pairing_verification_notification_short_title);
                    }
                    kvq kvqVar = new kvq(context, str);
                    kvqVar.h(string);
                    kvqVar.C = context.getColor(com.google.android.apps.messaging.R.color.primary_brand_non_icon_color);
                    kvqVar.r(com.google.android.apps.messaging.R.drawable.notification_icon);
                    kvqVar.l = 1;
                    kvqVar.g(true);
                    kvqVar.J = ((Long) bvfd.a.e()).longValue();
                    Optional optional = cfkvVar2.b;
                    optional.isPresent();
                    Object obj = optional.get();
                    context.getClass();
                    cyta cytaVar = (cyta) obj;
                    Intent intentE = cytaVar.a.e(context);
                    intentE.setFlags(268468224);
                    kxg kxgVar = new kxg(context);
                    kxgVar.d(intentE);
                    Intent intent = new Intent(context, (Class<?>) GaiaPairingVerificationActivity.class);
                    intent.putExtra("prompt_launch_source", 1);
                    bvsh bvshVar = (bvsh) cytaVar.c.b();
                    String str2 = (String) ((cecr) bvshVar.b.b()).a.get();
                    if (bvshVar.d.a()) {
                        auvw.c(bvshVar.e, fcyi.a, fdjz.a, new bvsd(bvshVar, null));
                    } else {
                        ((bvio) bvshVar.a.b()).w(2, str2, ewyb.ATTEMPT_TO_LAUNCH_VERIFICATION_PROMPT_FROM_NOTIFICATION);
                    }
                    kxgVar.e(intent);
                    ((ains) cytaVar.b.b()).e("Bugle.Gaia.Verification.Prompt.Launched", 1);
                    ClipData clipData = ebsn.a;
                    PendingIntent pendingIntentA = kxgVar.a(0, 1140850688);
                    pendingIntentA.getClass();
                    kvqVar.g = pendingIntentA;
                    return kvqVar.a();
                }
            }, cgbe.GAIA_PAIRING_VERIFICATION));
        }
    }

    @Override // defpackage.cgbn
    public final void u(final ConversationId conversationId, final int i, final int i2) {
        final cgco cgcoVar = (cgco) ((cgbl) this.j.b()).c.b();
        cgbe cgbeVar = cgbe.MEDIA_RESIZING;
        String strValueOf = String.valueOf(cgbeVar.H);
        cgei cgeiVar = cgcoVar.c;
        cgeg cgegVar = new cgeg() { // from class: cgcn
            @Override // defpackage.cgeg
            public final Notification a(String str) throws Resources.NotFoundException {
                String quantityString;
                int i3 = i;
                int i4 = i2;
                cgco cgcoVar2 = cgcoVar;
                Context context = cgcoVar2.a;
                Resources resources = context.getResources();
                if (i3 <= 0 || i4 <= 0) {
                    quantityString = (i3 <= 0 || i4 != 0) ? (i3 != 0 || i4 <= 0) ? "" : resources.getQuantityString(com.google.android.apps.messaging.R.plurals.resize_service_notification_title_video_plural, i4, Integer.valueOf(i4)) : resources.getQuantityString(com.google.android.apps.messaging.R.plurals.resize_service_notification_title_photo_plural, i3, Integer.valueOf(i3));
                } else {
                    int i5 = i3 + i4;
                    quantityString = resources.getQuantityString(com.google.android.apps.messaging.R.plurals.resize_service_notification_title_attachment_plural, i5, Integer.valueOf(i5));
                }
                ConversationId conversationId2 = conversationId;
                kvq kvqVar = new kvq(context, str);
                kvqVar.r(com.google.android.apps.messaging.R.drawable.notification_icon);
                kvqVar.C = context.getColor(com.google.android.apps.messaging.R.color.primary_brand_non_icon_color);
                kvqVar.i(quantityString);
                kvqVar.h(context.getText(com.google.android.apps.messaging.R.string.resize_service_notification_text));
                kvqVar.p(true);
                kvqVar.l = 2;
                kvqVar.O = true;
                if (!(conversationId2 instanceof InvalidConversationId)) {
                    kvqVar.g = cgcoVar2.b.r(context, conversationId2);
                }
                return kvqVar.a();
            }
        };
        cgaz cgazVar = (cgaz) cgeiVar.a.b();
        cgazVar.getClass();
        cgbeVar.getClass();
        cgeh cgehVar = new cgeh(cgazVar, cgegVar, cgbeVar, strValueOf.concat("[silent]"), null);
        this.e = cgehVar.b();
        Z(cgehVar);
    }

    @Override // defpackage.cgbn
    public final void v(ConversationIdType conversationIdType, alqm alqmVar) {
        cgbl cgblVar = (cgbl) this.j.b();
        avmp avmpVar = (avmp) this.n.b();
        cczv cczvVar = alvx.a;
        Z(cgblVar.c(avmpVar, conversationIdType, alqmVar.G(((Boolean) new aluq().get()).booleanValue()).toString()));
    }

    @Override // defpackage.cgbn
    public final void w(ConversationIdType conversationIdType, String str) {
        Z(((cgbl) this.j.b()).c((avmp) this.n.b(), conversationIdType, str));
    }

    @Override // defpackage.cgbn
    public final void x() {
        Z(((cgbl) this.j.b()).e(this));
    }

    @Override // defpackage.cgbn
    public final void y() {
        Z(((cgbl) this.j.b()).f(this));
    }

    @Override // defpackage.cgbn
    public final void z(final int i, final String str) {
        final cged cgedVar = (cged) ((cgbl) this.j.b()).a.b();
        Z(cgedVar.b.a(new cgeg() { // from class: cgec
            @Override // defpackage.cgeg
            public final Notification a(String str2) throws Resources.NotFoundException {
                cged cgedVar2 = cgedVar;
                Context context = cgedVar2.a;
                Optional optionalA = cgedVar2.c.a(context, i, str);
                if (optionalA.isEmpty()) {
                    return null;
                }
                Resources resources = context.getResources();
                String string = resources.getString(com.google.android.apps.messaging.R.string.sim_storage_full_text);
                kvq kvqVar = new kvq(context, str2);
                kvqVar.i(resources.getString(com.google.android.apps.messaging.R.string.sim_storage_full_title));
                kvqVar.h(string);
                kvqVar.r(com.google.android.apps.messaging.R.drawable.ic_warning_light);
                kvj kvjVar = new kvj(kvqVar);
                kvjVar.e(string);
                kvqVar.u(kvjVar);
                kvqVar.g = (PendingIntent) optionalA.get();
                return kvqVar.a();
            }
        }, cgbe.SIM_STORAGE_FULL));
    }
}

package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Telephony;
import com.google.android.apps.messaging.shared.datamodel.action.SendMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.DeviceData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import defpackage.ainv;
import defpackage.aipo;
import defpackage.ajjt;
import defpackage.alqm;
import defpackage.alre;
import defpackage.alve;
import defpackage.alvx;
import defpackage.asbu;
import defpackage.auvh;
import defpackage.avmr;
import defpackage.avos;
import defpackage.axtl;
import defpackage.aygx;
import defpackage.ayih;
import defpackage.ayjm;
import defpackage.ayls;
import defpackage.aylx;
import defpackage.aylz;
import defpackage.aymo;
import defpackage.aypy;
import defpackage.ayql;
import defpackage.bojh;
import defpackage.botb;
import defpackage.botl;
import defpackage.botm;
import defpackage.bvur;
import defpackage.bxjh;
import defpackage.cczv;
import defpackage.ceag;
import defpackage.ceah;
import defpackage.cgwx;
import defpackage.chue;
import defpackage.chuf;
import defpackage.chve;
import defpackage.chvf;
import defpackage.chvp;
import defpackage.chwn;
import defpackage.cmmr;
import defpackage.cmoi;
import defpackage.cmqf;
import defpackage.cmqj;
import defpackage.cmxm;
import defpackage.cmxn;
import defpackage.cnqj;
import defpackage.cnqk;
import defpackage.cogw;
import defpackage.cohh;
import defpackage.coty;
import defpackage.coue;
import defpackage.cous;
import defpackage.coyz;
import defpackage.cqbh;
import defpackage.cqjy;
import defpackage.cqnc;
import defpackage.crny;
import defpackage.dggw;
import defpackage.dqle;
import defpackage.dzfh;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.ejvr;
import defpackage.ejwk;
import defpackage.ejwl;
import defpackage.ejxr;
import defpackage.ejxx;
import defpackage.ekcv;
import defpackage.ekgb;
import defpackage.ekrd;
import defpackage.ekrg;
import defpackage.ekrw;
import defpackage.eksq;
import defpackage.elgm;
import defpackage.elpf;
import defpackage.emwt;
import defpackage.emwy;
import defpackage.enxi;
import defpackage.enxt;
import defpackage.enxu;
import defpackage.enxv;
import defpackage.enxw;
import defpackage.eooz;
import defpackage.eosc;
import defpackage.evxc;
import defpackage.fcsu;
import defpackage.fdae;
import defpackage.febt;
import defpackage.fhaz;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.OptionalInt;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class SendMessageAction extends Action<Void> implements Parcelable, ayjm {
    private final fcsu A;
    private final fcsu B;
    private final eosc C;
    private final ejxr D;
    private final fcsu E;
    private final ejxr F;
    private final ejxr G;
    private final fcsu H;
    private final fcsu I;
    private final fcsu J;
    private final fcsu K;
    private final fcsu L;
    private final fcsu M;
    private final fcsu N;
    private final fcsu O;
    private final fcsu P;
    private final fcsu Q;
    private final fcsu R;
    private final fcsu S;
    private final fcsu T;
    private final ejxr U;
    private final fcsu V;
    private final fcsu W;
    private final fcsu X;
    private final fcsu Y;
    private final fcsu Z;
    public final ejxr a;
    private final fcsu aa;
    private final fcsu ab;
    private final fcsu ac;
    private final fcsu ad;
    private final fcsu ae;
    private final fcsu af;
    private final fcsu ag;
    private final fcsu ah;
    private final fcsu ai;
    private final fcsu aj;
    private final fcsu ak;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    private final Context g;
    private final fcsu h;
    private final ejxr i;
    private final fcsu j;
    private final fcsu k;
    private final cogw l;
    private final fcsu m;
    private final fcsu n;
    private final ejxr o;
    private final fcsu p;
    private final fcsu q;
    private final fcsu r;
    private final fcsu s;
    private static final ekrg f = ekrg.c("com/google/android/apps/messaging/shared/datamodel/action/SendMessageAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new aygx();

    /* compiled from: PG */
    public interface a {
        ayql br();
    }

    public SendMessageAction(Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, final fcsu fcsuVar4, final fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, cogw cogwVar, fcsu fcsuVar8, fcsu fcsuVar9, final fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, fcsu fcsuVar15, eosc eoscVar, final fcsu fcsuVar16, fcsu fcsuVar17, final fcsu fcsuVar18, final fcsu fcsuVar19, fcsu fcsuVar20, fcsu fcsuVar21, fcsu fcsuVar22, fcsu fcsuVar23, fcsu fcsuVar24, fcsu fcsuVar25, fcsu fcsuVar26, fcsu fcsuVar27, fcsu fcsuVar28, fcsu fcsuVar29, fcsu fcsuVar30, fcsu fcsuVar31, fcsu fcsuVar32, final fcsu fcsuVar33, fcsu fcsuVar34, fcsu fcsuVar35, fcsu fcsuVar36, fcsu fcsuVar37, fcsu fcsuVar38, fcsu fcsuVar39, fcsu fcsuVar40, fcsu fcsuVar41, fcsu fcsuVar42, fcsu fcsuVar43, fcsu fcsuVar44, fcsu fcsuVar45, fcsu fcsuVar46, fcsu fcsuVar47, fcsu fcsuVar48, fcsu fcsuVar49, Parcel parcel, fcsu fcsuVar50, fcsu fcsuVar51, fcsu fcsuVar52) {
        super(parcel, elgm.SEND_MESSAGE_ACTION);
        this.g = context;
        this.h = fcsuVar;
        this.p = fcsuVar2;
        this.i = ejxx.a(new ejxr() { // from class: aygt
            @Override // defpackage.ejxr
            public final Object get() {
                return (bbdl) fcsuVar4.b();
            }
        });
        this.a = ejxx.a(new ejxr() { // from class: aygu
            @Override // defpackage.ejxr
            public final Object get() {
                return (ayih) fcsuVar5.b();
            }
        });
        this.j = fcsuVar6;
        this.k = fcsuVar7;
        this.l = cogwVar;
        this.m = fcsuVar8;
        this.n = fcsuVar9;
        this.o = ejxx.a(new ejxr() { // from class: aygv
            @Override // defpackage.ejxr
            public final Object get() {
                return (crny) fcsuVar10.b();
            }
        });
        this.q = fcsuVar11;
        this.r = fcsuVar12;
        this.s = fcsuVar13;
        this.A = fcsuVar14;
        this.B = fcsuVar15;
        this.C = eoscVar;
        this.D = ejxx.a(new ejxr() { // from class: aygg
            @Override // defpackage.ejxr
            public final Object get() {
                return (bvur) fcsuVar16.b();
            }
        });
        this.E = fcsuVar17;
        this.F = ejxx.a(new ejxr() { // from class: aygh
            @Override // defpackage.ejxr
            public final Object get() {
                return (coty) fcsuVar18.b();
            }
        });
        this.G = ejxx.a(new ejxr() { // from class: aygi
            @Override // defpackage.ejxr
            public final Object get() {
                return (cohh) fcsuVar19.b();
            }
        });
        this.H = fcsuVar20;
        this.I = fcsuVar21;
        this.J = fcsuVar22;
        this.K = fcsuVar3;
        this.L = fcsuVar23;
        this.M = fcsuVar24;
        this.b = fcsuVar25;
        this.N = fcsuVar26;
        this.O = fcsuVar27;
        this.P = fcsuVar28;
        this.Q = fcsuVar29;
        this.R = fcsuVar30;
        this.S = fcsuVar31;
        this.T = fcsuVar32;
        this.U = ejxx.a(new ejxr() { // from class: aygj
            @Override // defpackage.ejxr
            public final Object get() {
                return (ajjt) fcsuVar33.b();
            }
        });
        this.W = fcsuVar34;
        this.V = fcsuVar35;
        this.X = fcsuVar36;
        this.c = fcsuVar37;
        this.d = fcsuVar38;
        this.Y = fcsuVar39;
        this.Z = fcsuVar40;
        this.aa = fcsuVar41;
        this.ab = fcsuVar42;
        this.ac = fcsuVar43;
        this.ad = fcsuVar44;
        this.e = fcsuVar45;
        this.af = fcsuVar47;
        this.ag = fcsuVar48;
        this.ae = fcsuVar46;
        this.ah = fcsuVar49;
        this.ai = fcsuVar50;
        this.aj = fcsuVar51;
        this.ak = fcsuVar52;
    }

    private final chvf H(MessageCoreData messageCoreData, Uri uri, ekgb ekgbVar, aylx aylxVar) {
        ((coyz) this.N.b()).c(messageCoreData);
        try {
            cous cousVarA = ((coty) this.F.get()).a(messageCoreData, ekgbVar);
            if (messageCoreData == null) {
                throw new NullPointerException("Null messageCoreData");
            }
            coue coueVar = new coue(messageCoreData, cousVarA);
            N(aylxVar, febt.BUGLE_SENDING_INTERNAL_STATUS_PASSING_TO_FILE_TRANSFER);
            try {
                chvf chvfVar = (chvf) dqle.a(((cohh) this.G.get()).b().c(coueVar));
                if (chvfVar.c() != 0 && chvfVar.c() != -1) {
                    emwt emwtVar = (emwt) emwy.a.createBuilder();
                    emwtVar.copyOnWrite();
                    emwy emwyVar = (emwy) emwtVar.instance;
                    emwyVar.e = 0;
                    emwyVar.b |= 1;
                    ((coyz) this.N.b()).a(messageCoreData, (emwy) emwtVar.build(), Optional.empty());
                }
                return chvfVar;
            } catch (InterruptedException | ExecutionException e) {
                ekrw ekrwVarI = f.i();
                ekrwVarI.X(eksq.a, "BugleDataModel");
                ekrd ekrdVar = (ekrd) ekrwVarI;
                ekrdVar.X(cqnc.f, messageCoreData.F());
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageAction", "startFileTransfer", 1566, "SendMessageAction.java")).q("Cannot start RCS FT, failed to get active transport.");
                emwt emwtVar2 = (emwt) emwy.a.createBuilder();
                emwtVar2.copyOnWrite();
                emwy emwyVar2 = (emwy) emwtVar2.instance;
                emwyVar2.e = 16;
                emwyVar2.b |= 1;
                ((coyz) this.N.b()).a(messageCoreData, (emwy) emwtVar2.build(), Optional.empty());
                if (e instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                throw new IllegalStateException("Failed to get active transport.", e);
            }
        } catch (IOException | IllegalArgumentException e2) {
            ekrw ekrwVarI2 = f.i();
            ekrwVarI2.X(eksq.a, "BugleDataModel");
            ekrd ekrdVar2 = (ekrd) ekrwVarI2;
            ekrdVar2.X(cqnc.f, messageCoreData.F());
            ((ekrd) ((ekrd) ekrdVar2.g(e2)).h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageAction", "startFileTransfer", 1515, "SendMessageAction.java")).q("Unable to prepare file for uploading to content server.");
            emwt emwtVar3 = (emwt) emwy.a.createBuilder();
            emwtVar3.copyOnWrite();
            emwy emwyVar3 = (emwy) emwtVar3.instance;
            emwyVar3.e = 15;
            emwyVar3.b |= 1;
            int i = true != (e2 instanceof IllegalArgumentException) ? 3 : 2;
            emwtVar3.copyOnWrite();
            emwy emwyVar4 = (emwy) emwtVar3.instance;
            emwyVar4.d = Integer.valueOf(i - 1);
            emwyVar4.c = 8;
            ((coyz) this.N.b()).a(messageCoreData, (emwy) emwtVar3.build(), Optional.empty());
            chve chveVarJ = chvf.j(3, 10001);
            chue chueVar = (chue) chveVarJ;
            chueVar.c = uri;
            chveVarJ.b(1);
            enxt enxtVar = (enxt) enxu.a.createBuilder();
            enxv enxvVar = (enxv) enxw.a.createBuilder();
            enxvVar.copyOnWrite();
            enxw enxwVar = (enxw) enxvVar.instance;
            enxwVar.e = 1;
            enxwVar.b |= 4;
            enxi enxiVar = enxi.CHAT_API_UPLOAD_START_FAILED;
            enxvVar.copyOnWrite();
            enxw enxwVar2 = (enxw) enxvVar.instance;
            enxwVar2.f = enxiVar.D;
            enxwVar2.b = 8 | enxwVar2.b;
            enxw enxwVar3 = (enxw) enxvVar.build();
            enxtVar.copyOnWrite();
            enxu enxuVar = (enxu) enxtVar.instance;
            enxwVar3.getClass();
            enxuVar.c = enxwVar3;
            enxuVar.b |= 1;
            chueVar.d = (enxu) enxtVar.build();
            return chveVarJ.a();
        }
    }

    private final chvf I(MessageCoreData messageCoreData) {
        try {
            return chvf.i;
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException("Error during starting message processing.", e);
        }
    }

    private static ekgb J(ekgb ekgbVar) {
        Stream map = Collection.EL.stream(ekgbVar).map(new Function() { // from class: aygn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Parcelable.Creator<Action<Void>> creator = SendMessageAction.CREATOR;
                cczv cczvVar = alvx.a;
                return ejwk.b(((alqm) obj).k(((Boolean) new alve().get()).booleanValue()));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        return (ekgb) map.collect(ekcv.a);
    }

    private final Optional K(Uri uri, int i) {
        fcsu fcsuVar = this.A;
        if (((cqjy) fcsuVar.b()).p) {
            ekrw ekrwVarJ = f.j();
            ekrwVarJ.X(eksq.a, "BugleDataModel");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageAction", "getRcsPreconditionsError", 1222, "SendMessageAction.java")).q("Emulate RCS send failure for debugging");
            return Optional.of(chwn.b(true, uri));
        }
        if (((cqjy) fcsuVar.b()).q) {
            ekrw ekrwVarJ2 = f.j();
            ekrwVarJ2.X(eksq.a, "BugleDataModel");
            ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageAction", "getRcsPreconditionsError", 1228, "SendMessageAction.java")).q("Emulate RCS send permanent failure for debugging");
            return Optional.of(chwn.b(false, uri));
        }
        int iA = ((crny) this.o.get()).h(i).a();
        if (((dggw) this.p.b()).w(iA)) {
            return Optional.empty();
        }
        ekrw ekrwVarI = f.i();
        ekrwVarI.X(eksq.a, "BugleDataModel");
        ekrd ekrdVar = (ekrd) ekrwVarI;
        ekrdVar.X(cqnc.w, Integer.valueOf(iA));
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageAction", "getRcsPreconditionsError", 1238, "SendMessageAction.java")).q("Cannot send RCS on non-RCS.");
        chve chveVarJ = chvf.j(2, 10002);
        chue chueVar = (chue) chveVarJ;
        chueVar.c = uri;
        chveVarJ.b(4);
        enxt enxtVar = (enxt) enxu.a.createBuilder();
        enxv enxvVar = (enxv) enxw.a.createBuilder();
        enxvVar.copyOnWrite();
        enxw enxwVar = (enxw) enxvVar.instance;
        enxwVar.e = 1;
        enxwVar.b = 4 | enxwVar.b;
        enxi enxiVar = enxi.CHAT_API_NO_RCS_SUBSCRIPTION;
        enxvVar.copyOnWrite();
        enxw enxwVar2 = (enxw) enxvVar.instance;
        enxwVar2.f = enxiVar.D;
        enxwVar2.b |= 8;
        enxw enxwVar3 = (enxw) enxvVar.build();
        enxtVar.copyOnWrite();
        enxu enxuVar = (enxu) enxtVar.instance;
        enxwVar3.getClass();
        enxuVar.c = enxwVar3;
        enxuVar.b |= 1;
        chueVar.d = (enxu) enxtVar.build();
        return Optional.of(chveVarJ.a());
    }

    private static String L(ConversationIdType conversationIdType) {
        botb botbVarE = botm.e();
        botbVarE.A("getRcsConferenceUriForConversation");
        botbVarE.c(botm.c.ab);
        botl botlVar = new botl();
        botlVar.r(conversationIdType);
        botbVarE.h(botlVar);
        return ((bojh) botbVarE.b().m()).ad();
    }

    private final void M(final MessageCoreData messageCoreData, eiju eijuVar, SettableFuture settableFuture) {
        eieu eieuVarK = eiiy.k("SendMessageAction::saveForEarlySend");
        try {
            ekrw ekrwVarH = f.h();
            ekrwVarH.X(eksq.a, "BugleDataModel");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageAction", "saveForEarlySend", 1783, "SendMessageAction.java")).q("Starting save for early send");
            if (eijuVar == null) {
                eijuVar = eijx.e(null);
            }
            eooz eoozVar = new eooz() { // from class: aygl
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    final SendMessageAction sendMessageAction = this.a;
                    final MessageCoreData messageCoreData2 = messageCoreData;
                    return kol.a(new koi() { // from class: aygf
                        @Override // defpackage.koi
                        public final Object a(final kog kogVar) {
                            SendMessageAction sendMessageAction2 = sendMessageAction;
                            axrj axrjVar = (axrj) sendMessageAction2.d.b();
                            aymo aymoVar = sendMessageAction2.v;
                            axrjVar.d(new axqf(sendMessageAction2, messageCoreData2, (DeviceData) aymoVar.h("secondary_device"), (MessageUsageStatisticsData) aymoVar.h("message_usage_stats_data"), elny.b(aymoVar.a("message_source")), aymoVar.d("sent_realtime"), aymoVar.b("sub_id", -1), aymoVar.b("locked_default_sms_sub_id", -1), aymoVar.z("update_draft", true), aymoVar.l("archive"), aymoVar.z("should_refresh_notification", false), aymoVar.y("from_notification"), aymoVar.y("is_rbm_conversation"), aymoVar.y("is_early_send"), aymoVar.y("ui_has_been_notified"), new axrf() { // from class: aygo
                                @Override // defpackage.axrf
                                public final void a() {
                                    kogVar.b(null);
                                }
                            }));
                            return "Start save future";
                        }
                    });
                }
            };
            eosc eoscVar = this.C;
            eiju eijuVarI = eijuVar.i(eoozVar, eoscVar);
            if (!((asbu) this.ai.b()).a() || settableFuture == null) {
                ((cmoi) this.Y.b()).d(messageCoreData.F(), eijuVarI);
            } else {
                settableFuture.o(eijuVarI);
            }
            auvh.h(eijuVarI);
            auvh.h(eijuVarI.h(new ejvr() { // from class: aygm
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    Void r3 = (Void) obj;
                    ((ckfo) this.a.c.b()).d(messageCoreData);
                    return r3;
                }
            }, eoscVar));
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private final void N(aylx aylxVar, febt febtVar) {
        ayls aylsVar = (ayls) aylxVar;
        aylsVar.c = febtVar;
        aylsVar.d = evxc.c(this.l.f().toEpochMilli());
    }

    private static boolean O(MessageCoreData messageCoreData) {
        return ((Boolean) cgwx.a.e()).booleanValue() && messageCoreData.R() != null;
    }

    private final Uri l(MessageCoreData messageCoreData, ekgb ekgbVar) {
        aymo aymoVar = this.v;
        int iB = aymoVar.b("sub_id", -1);
        String strL = aymoVar.l("sub_phone_number");
        long jO = messageCoreData.o();
        ((cmqf) this.B.b()).i(jO);
        int iD = messageCoreData.d();
        ConversationIdType conversationIdTypeA = messageCoreData.A();
        cnqj cnqjVarA = ((Boolean) avos.a.e()).booleanValue() ? ((avmr) this.P.b()).a(conversationIdTypeA) : ((bxjh) this.K.b()).a(conversationIdTypeA);
        if (iD == 1 || iD == 2) {
            cmqj cmqjVar = (cmqj) this.j.b();
            Context context = this.g;
            return cmqjVar.W(context, J(ekgbVar), messageCoreData, ((ceag) this.k.b()).a(context, messageCoreData, iB), cnqk.a(cnqjVarA), iB, strL, jO);
        }
        if (iD != 0 || !O(messageCoreData)) {
            return m(messageCoreData, ((ceag) this.k.b()).a(this.g, messageCoreData, iB), ekgbVar, cnqk.a(cnqjVarA), iB);
        }
        ejwl.n(ekgbVar.size() == 1, "Expected 1 recipient, got %s", ekgbVar.size());
        cmqj cmqjVar2 = (cmqj) this.j.b();
        Context context2 = this.g;
        Uri uri = Telephony.Sms.CONTENT_URI;
        alqm alqmVar = (alqm) ekgbVar.get(0);
        cczv cczvVar = alvx.a;
        String strK = alqmVar.k(((Boolean) new alve().get()).booleanValue());
        String strB = ((Boolean) cgwx.b.e()).booleanValue() ? ejwk.b(messageCoreData.as()) : messageCoreData.aE();
        long epochMilli = messageCoreData.ad().toEpochMilli();
        messageCoreData.aI();
        return cmqjVar2.ak(context2, uri, iB, strK, strB, epochMilli, -1, 2, cnqjVarA, messageCoreData.ae());
    }

    private final Uri m(MessageCoreData messageCoreData, ceah ceahVar, ekgb ekgbVar, long j, int i) {
        Uri uriB;
        eieu eieuVarK = eiiy.k("SendMessageAction::updateMessageUri");
        try {
            if (((bvur) this.D.get()).l()) {
                try {
                    uriB = (Uri) dqle.a(((chvp) this.q.b()).h(messageCoreData, ceahVar, ekgbVar, j, L(messageCoreData.A()), i));
                } catch (InterruptedException | ExecutionException e) {
                    ekrw ekrwVarI = f.i();
                    ekrwVarI.X(eksq.a, "BugleDataModel");
                    ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e)).h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageAction", "updateMessageUriInSpan", (char) 1432, "SendMessageAction.java")).q("Exception when inserting sending RCS message in telephony");
                    uriB = null;
                }
            } else {
                uriB = ((chvp) this.q.b()).b(messageCoreData, ceahVar, J(ekgbVar), j, L(messageCoreData.A()), i);
            }
            if (uriB != null) {
                ekrw ekrwVarG = f.g();
                ekrwVarG.X(eksq.a, "BugleDataModel");
                ekrd ekrdVar = (ekrd) ekrwVarG;
                ekrdVar.X(cqnc.b, messageCoreData.C());
                ekrdVar.X(cqnc.ab, uriB);
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageAction", "updateMessageUriInSpan", 1452, "SendMessageAction.java")).q("Updated message with new URI.");
            }
            eieuVarK.close();
            return uriB;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:211:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0855 A[Catch: all -> 0x0a1d, TryCatch #20 {all -> 0x0a1d, blocks: (B:244:0x0797, B:247:0x07a7, B:249:0x07ad, B:251:0x07b3, B:253:0x07bf, B:254:0x07cb, B:256:0x07d1, B:258:0x07ed, B:260:0x07f3, B:261:0x07f5, B:263:0x07f9, B:265:0x0802, B:266:0x0804, B:269:0x0827, B:273:0x084d, B:275:0x0855, B:276:0x0858, B:257:0x07dd, B:272:0x0836), top: B:383:0x0797 }] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0898 A[Catch: InterruptedException -> 0x0a37, InterruptedException | ExecutionException -> 0x0a39, TRY_LEAVE, TryCatch #22 {InterruptedException | ExecutionException -> 0x0a39, blocks: (B:224:0x0738, B:278:0x0861, B:280:0x0898, B:300:0x09b2, B:312:0x09ca, B:315:0x09d4, B:316:0x09f6, B:317:0x0a13, B:310:0x09c8, B:309:0x09c5, B:336:0x0a33, B:337:0x0a36), top: B:392:0x0738 }] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x09c9  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x09d2  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0a33 A[Catch: InterruptedException -> 0x0a37, InterruptedException | ExecutionException -> 0x0a39, TRY_ENTER, TryCatch #22 {InterruptedException | ExecutionException -> 0x0a39, blocks: (B:224:0x0738, B:278:0x0861, B:280:0x0898, B:300:0x09b2, B:312:0x09ca, B:315:0x09d4, B:316:0x09f6, B:317:0x0a13, B:310:0x09c8, B:309:0x09c5, B:336:0x0a33, B:337:0x0a36), top: B:392:0x0738 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.chvf n(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r23, android.net.Uri r24, final int r25, defpackage.ekgb r26, boolean r27, boolean r28, defpackage.aylx r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2707
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.action.SendMessageAction.n(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, android.net.Uri, int, ekgb, boolean, boolean, aylx):chvf");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("SendMessageAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.SendMessage.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eiju e() {
        return eijx.g(new Callable() { // from class: aygp
            @Override // java.util.concurrent.Callable
            public final Object call() throws Throwable {
                this.a.j();
                return null;
            }
        }, this.C);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final boolean fT() {
        return false;
    }

    public final elpf h(MessageCoreData messageCoreData) {
        return (elpf) ((ajjt) this.U.get()).fM(messageCoreData.P());
    }

    @Override // defpackage.ayjm
    public final void j() throws Throwable {
        ainv ainvVar;
        final MessageCoreData messageCoreData;
        eieu eieuVarK;
        Throwable th;
        eieu eieuVarK2;
        Throwable th2;
        MessageCoreData messageCoreData2;
        MessageIdType messageIdTypeC;
        Uri uriU;
        int iD;
        int iB;
        ekgb ekgbVar;
        boolean zY;
        ConversationIdType conversationIdTypeA;
        boolean zY2;
        ekrd ekrdVar;
        Uri uriD;
        chvf chvfVarN;
        Uri uriD2;
        int i;
        int i2;
        enxu enxuVar;
        Uri uri;
        int i3;
        final SendMessageAction sendMessageAction = this;
        ainv ainvVarB = ((aipo) sendMessageAction.n.b()).b("Bugle.DataModel.Action.SendMessage.BackgroundWork.Latency");
        ayls aylsVar = new ayls();
        aylsVar.e = 10;
        aylsVar.f = 21;
        aylsVar.g = 4;
        try {
            try {
                try {
                    eieuVarK = eiiy.k("SendMessageAction::executeSendMessageAction");
                    try {
                        try {
                            eieuVarK2 = eiiy.k("SendMessageAction::sendMessage");
                            try {
                                aymo aymoVar = sendMessageAction.v;
                                messageCoreData2 = (MessageCoreData) aymoVar.h("message");
                                messageIdTypeC = messageCoreData2.C();
                                uriU = messageCoreData2.u();
                                iD = messageCoreData2.d();
                                iB = aymoVar.b("sub_id", -1);
                                eieu eieuVarK3 = eiiy.k("SendMessageAction::parseRecipients");
                                try {
                                    try {
                                        Stream stream = Collection.EL.stream(aymoVar.m("remote_messaging_identities"));
                                        final alre alreVar = (alre) sendMessageAction.X.b();
                                        alreVar.getClass();
                                        Stream map = stream.map(new Function() { // from class: aygq
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo536andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj) {
                                                return alreVar.a((evwl) obj);
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        });
                                        int i4 = ekgb.d;
                                        ekgbVar = (ekgb) map.collect(ekcv.a);
                                        eieuVarK3.close();
                                        aymo aymoVar2 = sendMessageAction.v;
                                        zY = aymoVar2.y("is_rcs_group");
                                        conversationIdTypeA = messageCoreData2.A();
                                        zY2 = aymoVar2.y("is_rbm_conversation");
                                        aylsVar.a = messageCoreData2.aJ();
                                        if (messageCoreData2.F().k()) {
                                            try {
                                                aylsVar.b = messageCoreData2.F();
                                            } catch (Throwable th3) {
                                                th2 = th3;
                                                try {
                                                    eieuVarK2.close();
                                                    throw th2;
                                                } catch (Throwable th4) {
                                                    th2.addSuppressed(th4);
                                                    throw th2;
                                                }
                                            }
                                        }
                                        ekrw ekrwVarH = f.h();
                                        ekrwVarH.X(eksq.a, "BugleDataModel");
                                        ekrdVar = (ekrd) ekrwVarH;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        th2 = th;
                                        eieuVarK2.close();
                                        throw th2;
                                    }
                                    try {
                                        ekrdVar.X(cqnc.C, MessageData.ay(iD));
                                        ekrdVar.X(cqnc.b, messageIdTypeC);
                                        ekrdVar.X(cqnc.s, conversationIdTypeA);
                                        ekrdVar.X(cqnc.f, messageCoreData2.F());
                                        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageAction", "sendMessage", 639, "SendMessageAction.java")).s("Sending message: %s", messageCoreData2.t());
                                        new Bundle();
                                        uriD = null;
                                        sendMessageAction = this;
                                        ainvVar = ainvVarB;
                                        try {
                                            try {
                                                chvfVarN = sendMessageAction.n(messageCoreData2, uriU, iB, ekgbVar, zY, zY2, aylsVar);
                                            } catch (cqbh e) {
                                                ekrw ekrwVarI = f.i();
                                                ekrwVarI.X(eksq.a, "BugleDataModel");
                                                ekrd ekrdVar2 = (ekrd) ((ekrd) ekrwVarI).g(e);
                                                ekrdVar2.X(cqnc.b, messageIdTypeC);
                                                ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageAction", "sendMessage", 663, "SendMessageAction.java")).q("Failed to insert message into telephony");
                                                ((aypy) sendMessageAction.h.b()).h(messageIdTypeC, messageCoreData2.F(), uriU, null, iB, 3, 10000, -2, null, sendMessageAction.h(messageCoreData2)).z();
                                            }
                                        } catch (SecurityException e2) {
                                            iB = iB;
                                            ekrw ekrwVarI2 = f.i();
                                            ekrwVarI2.X(eksq.a, "BugleDataModel");
                                            ekrd ekrdVar3 = (ekrd) ((ekrd) ekrwVarI2).g(e2);
                                            ekrdVar3.X(cqnc.b, messageIdTypeC);
                                            ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageAction", "sendMessage", 684, "SendMessageAction.java")).q("Failed to send");
                                            chvfVarN = null;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        th2 = th;
                                        eieuVarK2.close();
                                        throw th2;
                                    }
                                } finally {
                                }
                            } catch (Throwable th7) {
                                th = th7;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            th = th;
                            try {
                                eieuVarK.close();
                                throw th;
                            } catch (Throwable th9) {
                                th.addSuppressed(th9);
                                throw th;
                            }
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        th = th;
                        eieuVarK.close();
                        throw th;
                    }
                } catch (Throwable th11) {
                    th = th11;
                    ((aylz) sendMessageAction.O.b()).a(aylsVar.a());
                    ainvVarB.c();
                    throw th;
                }
            } catch (cmmr e3) {
                throw e3;
            } catch (Exception e4) {
                e = e4;
                ekrw ekrwVarI3 = f.i();
                ekrwVarI3.X(eksq.a, "BugleDataModel");
                ((ekrd) ((ekrd) ((ekrd) ekrwVarI3).g(e)).h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageAction", "executeSendMessageAction", 604, "SendMessageAction.java")).q("Error sending message");
                aymo aymoVar3 = sendMessageAction.v;
                messageCoreData = (MessageCoreData) aymoVar3.h("message");
                final MessageIdType messageIdTypeC2 = messageCoreData.C();
                final int iB2 = aymoVar3.b("sub_id", -1);
                final long epochMilli = sendMessageAction.l.f().toEpochMilli();
                try {
                    dqle.a(((cmoi) sendMessageAction.Y.b()).a(messageCoreData.F(), sendMessageAction.C, new fdae() { // from class: aygk
                        @Override // defpackage.fdae
                        public final Object invoke() throws Throwable {
                            SendMessageAction sendMessageAction2 = this.a;
                            ayih ayihVar = (ayih) sendMessageAction2.a.get();
                            MessageCoreData messageCoreData3 = messageCoreData;
                            basd basdVarF = messageCoreData3.F();
                            long jN = messageCoreData3.n();
                            Optional optionalEmpty = Optional.empty();
                            OptionalInt optionalIntEmpty = OptionalInt.empty();
                            enyw enywVar = enyw.UNKNOWN_RCS_TYPE;
                            Duration duration = Duration.ZERO;
                            Optional optionalOf = Optional.of(febt.BUGLE_SENDING_INTERNAL_STATUS_RETURNED_FROM_FAST_FAILURE);
                            long j = epochMilli;
                            ayihVar.e(messageIdTypeC2, basdVarF, jN, null, null, 2, 0, sendMessageAction2, iB2, -2, 0, j, 0L, 0L, -1, 1, null, null, 1, optionalEmpty, optionalIntEmpty, enywVar, 0, duration, optionalOf, Optional.empty(), sendMessageAction2.h(messageCoreData3));
                            return true;
                        }
                    }));
                } catch (InterruptedException | ExecutionException e5) {
                    ekrw ekrwVarI4 = f.i();
                    ekrwVarI4.X(eksq.a, "BugleDataModel");
                    ((ekrd) ((ekrd) ekrwVarI4).h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageAction", "processFailure", 1653, "SendMessageAction.java")).t("Error while processing results message{id:%s}", messageCoreData.C());
                    if (e5 instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    auvh.d(e5);
                }
                axtl.d(ayih.a(messageCoreData, 2), sendMessageAction);
                ((aylz) sendMessageAction.O.b()).a(aylsVar.a());
                ainvVar.c();
            }
        } catch (cmmr e6) {
            throw e6;
        } catch (Exception e7) {
            e = e7;
            ainvVar = ainvVarB;
            ekrw ekrwVarI32 = f.i();
            ekrwVarI32.X(eksq.a, "BugleDataModel");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarI32).g(e)).h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageAction", "executeSendMessageAction", 604, "SendMessageAction.java")).q("Error sending message");
            aymo aymoVar32 = sendMessageAction.v;
            messageCoreData = (MessageCoreData) aymoVar32.h("message");
            final MessageIdType messageIdTypeC22 = messageCoreData.C();
            final int iB22 = aymoVar32.b("sub_id", -1);
            final long epochMilli2 = sendMessageAction.l.f().toEpochMilli();
            dqle.a(((cmoi) sendMessageAction.Y.b()).a(messageCoreData.F(), sendMessageAction.C, new fdae() { // from class: aygk
                @Override // defpackage.fdae
                public final Object invoke() throws Throwable {
                    SendMessageAction sendMessageAction2 = this.a;
                    ayih ayihVar = (ayih) sendMessageAction2.a.get();
                    MessageCoreData messageCoreData3 = messageCoreData;
                    basd basdVarF = messageCoreData3.F();
                    long jN = messageCoreData3.n();
                    Optional optionalEmpty = Optional.empty();
                    OptionalInt optionalIntEmpty = OptionalInt.empty();
                    enyw enywVar = enyw.UNKNOWN_RCS_TYPE;
                    Duration duration = Duration.ZERO;
                    Optional optionalOf = Optional.of(febt.BUGLE_SENDING_INTERNAL_STATUS_RETURNED_FROM_FAST_FAILURE);
                    long j = epochMilli2;
                    ayihVar.e(messageIdTypeC22, basdVarF, jN, null, null, 2, 0, sendMessageAction2, iB22, -2, 0, j, 0L, 0L, -1, 1, null, null, 1, optionalEmpty, optionalIntEmpty, enywVar, 0, duration, optionalOf, Optional.empty(), sendMessageAction2.h(messageCoreData3));
                    return true;
                }
            }));
            axtl.d(ayih.a(messageCoreData, 2), sendMessageAction);
            ((aylz) sendMessageAction.O.b()).a(aylsVar.a());
            ainvVar.c();
        } catch (Throwable th12) {
            th = th12;
            ((aylz) sendMessageAction.O.b()).a(aylsVar.a());
            ainvVarB.c();
            throw th;
        }
        if (chvfVarN == null) {
            ekrw ekrwVarE = f.e();
            ekrwVarE.X(eksq.a, "BugleDataModel");
            ekrd ekrdVar4 = (ekrd) ekrwVarE;
            ekrdVar4.X(cqnc.b, messageIdTypeC);
            ekrdVar4.X(cqnc.s, conversationIdTypeA);
            ((ekrd) ekrdVar4.h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageAction", "sendMessage", 694, "SendMessageAction.java")).q("null result");
            i2 = -2;
            uriD2 = uriU;
            uri = null;
            enxuVar = null;
            i = 2;
            i3 = 0;
        } else {
            if (((chuf) chvf.i).a == chvfVarN.c()) {
                cmxn cmxnVar = (cmxn) sendMessageAction.R.b();
                fhaz fhazVarAJ = messageCoreData2.aJ();
                if (fhazVarAJ != null) {
                    dzfh dzfhVarA = dzfh.a(new dzfh("ToMessagePassedOnToTransport"), cmxn.a(messageCoreData2.d()));
                    String str = fhazVarAJ.b;
                    messageCoreData2.cl();
                    cmxnVar.k(str, dzfhVarA, cmxm.NOTIFICATION, cmxm.SEND_BUTTON_ACCURATE);
                }
                ekrw ekrwVarH2 = f.h();
                ekrwVarH2.X(eksq.a, "BugleDataModel");
                ekrd ekrdVar5 = (ekrd) ekrwVarH2;
                ekrdVar5.X(cqnc.C, MessageData.ay(messageCoreData2.d()));
                ekrdVar5.X(cqnc.b, messageIdTypeC);
                ekrdVar5.X(cqnc.f, messageCoreData2.F());
                ((ekrd) ekrdVar5.h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageAction", "sendMessage", 704, "SendMessageAction.java")).s("Sending %s asynchronously; waiting for callback to finish processing", messageCoreData2.t());
                eieuVarK2.close();
                eieuVarK.close();
                ((aylz) sendMessageAction.O.b()).a(aylsVar.a());
                ainvVar.c();
            }
            cmxn cmxnVar2 = (cmxn) sendMessageAction.R.b();
            fhaz fhazVarAJ2 = messageCoreData2.aJ();
            if (fhazVarAJ2 != null) {
                dzfh dzfhVarA2 = dzfh.a(new dzfh("ToMessagePassedOnToTransportAndCompleted"), cmxn.a(messageCoreData2.d()));
                String str2 = fhazVarAJ2.b;
                messageCoreData2.cl();
                cmxnVar2.j(str2, dzfhVarA2, cmxn.i);
            }
            int iC = chvfVarN.c();
            int iA = chvfVarN.a();
            int iB3 = chvfVarN.b();
            enxu enxuVarG = chvfVarN.g();
            chvf chvfVar = chvfVarN;
            if (iD == 1 && !Objects.equals(uriU, chvfVar.d())) {
                uriD = chvfVar.d();
            }
            uriD2 = uriU == null ? chvfVar.d() : uriU;
            ekrw ekrwVarE2 = f.e();
            ekrwVarE2.X(eksq.a, "BugleDataModel");
            ekrd ekrdVar6 = (ekrd) ekrwVarE2;
            ekrdVar6.X(cqnc.b, messageIdTypeC);
            ekrdVar6.X(cqnc.s, conversationIdTypeA);
            ((ekrd) ekrdVar6.h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageAction", "sendMessage", 725, "SendMessageAction.java")).I("completed, status: %s, rawStatus: %s, resultCode: %s", Integer.valueOf(iC), Integer.valueOf(iA), Integer.valueOf(iB3));
            i = iC;
            i2 = iB3;
            enxuVar = enxuVarG;
            uri = uriD;
            i3 = iA;
        }
        ((aypy) sendMessageAction.h.b()).h(messageIdTypeC, messageCoreData2.F(), uriD2, uri, iB, i, i3, i2, enxuVar, sendMessageAction.h(messageCoreData2)).z();
        eieuVarK2.close();
        eieuVarK.close();
        ((aylz) sendMessageAction.O.b()).a(aylsVar.a());
        ainvVar.c();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public SendMessageAction(Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, final fcsu fcsuVar4, final fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, cogw cogwVar, fcsu fcsuVar8, fcsu fcsuVar9, final fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, fcsu fcsuVar15, eosc eoscVar, final fcsu fcsuVar16, fcsu fcsuVar17, final fcsu fcsuVar18, final fcsu fcsuVar19, fcsu fcsuVar20, fcsu fcsuVar21, fcsu fcsuVar22, fcsu fcsuVar23, fcsu fcsuVar24, fcsu fcsuVar25, fcsu fcsuVar26, fcsu fcsuVar27, fcsu fcsuVar28, fcsu fcsuVar29, fcsu fcsuVar30, fcsu fcsuVar31, fcsu fcsuVar32, final fcsu fcsuVar33, fcsu fcsuVar34, fcsu fcsuVar35, fcsu fcsuVar36, fcsu fcsuVar37, fcsu fcsuVar38, fcsu fcsuVar39, fcsu fcsuVar40, fcsu fcsuVar41, fcsu fcsuVar42, fcsu fcsuVar43, fcsu fcsuVar44, fcsu fcsuVar45, fcsu fcsuVar46, fcsu fcsuVar47, fcsu fcsuVar48, fcsu fcsuVar49, fcsu fcsuVar50, fcsu fcsuVar51, fcsu fcsuVar52) {
        super(elgm.SEND_MESSAGE_ACTION);
        this.g = context;
        this.h = fcsuVar;
        this.p = fcsuVar2;
        this.i = ejxx.a(new ejxr() { // from class: aygt
            @Override // defpackage.ejxr
            public final Object get() {
                return (bbdl) fcsuVar4.b();
            }
        });
        this.a = ejxx.a(new ejxr() { // from class: aygu
            @Override // defpackage.ejxr
            public final Object get() {
                return (ayih) fcsuVar5.b();
            }
        });
        this.j = fcsuVar6;
        this.k = fcsuVar7;
        this.l = cogwVar;
        this.m = fcsuVar8;
        this.n = fcsuVar9;
        this.o = ejxx.a(new ejxr() { // from class: aygv
            @Override // defpackage.ejxr
            public final Object get() {
                return (crny) fcsuVar10.b();
            }
        });
        this.q = fcsuVar11;
        this.r = fcsuVar12;
        this.s = fcsuVar13;
        this.A = fcsuVar14;
        this.B = fcsuVar15;
        this.C = eoscVar;
        this.D = ejxx.a(new ejxr() { // from class: aygg
            @Override // defpackage.ejxr
            public final Object get() {
                return (bvur) fcsuVar16.b();
            }
        });
        this.E = fcsuVar17;
        this.F = ejxx.a(new ejxr() { // from class: aygh
            @Override // defpackage.ejxr
            public final Object get() {
                return (coty) fcsuVar18.b();
            }
        });
        this.G = ejxx.a(new ejxr() { // from class: aygi
            @Override // defpackage.ejxr
            public final Object get() {
                return (cohh) fcsuVar19.b();
            }
        });
        this.H = fcsuVar20;
        this.I = fcsuVar21;
        this.J = fcsuVar22;
        this.K = fcsuVar3;
        this.L = fcsuVar23;
        this.M = fcsuVar24;
        this.b = fcsuVar25;
        this.N = fcsuVar26;
        this.O = fcsuVar27;
        this.P = fcsuVar28;
        this.Q = fcsuVar29;
        this.R = fcsuVar30;
        this.S = fcsuVar31;
        this.T = fcsuVar32;
        this.U = ejxx.a(new ejxr() { // from class: aygj
            @Override // defpackage.ejxr
            public final Object get() {
                return (ajjt) fcsuVar33.b();
            }
        });
        this.V = fcsuVar36;
        this.W = fcsuVar35;
        this.X = fcsuVar34;
        this.c = fcsuVar37;
        this.d = fcsuVar38;
        this.Y = fcsuVar39;
        this.Z = fcsuVar40;
        this.aa = fcsuVar41;
        this.ab = fcsuVar42;
        this.ac = fcsuVar43;
        this.ad = fcsuVar44;
        this.e = fcsuVar45;
        this.ae = fcsuVar46;
        this.af = fcsuVar47;
        this.ag = fcsuVar48;
        this.ah = fcsuVar49;
        this.ai = fcsuVar50;
        this.aj = fcsuVar51;
        this.ak = fcsuVar52;
    }
}

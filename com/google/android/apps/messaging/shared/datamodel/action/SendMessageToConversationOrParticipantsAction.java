package com.google.android.apps.messaging.shared.datamodel.action;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.action.SendMessageToConversationOrParticipantsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.DeviceData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ayho;
import defpackage.aypg;
import defpackage.ayqm;
import defpackage.bagw;
import defpackage.bahv;
import defpackage.bbdl;
import defpackage.bveg;
import defpackage.cmot;
import defpackage.cogw;
import defpackage.cqtf;
import defpackage.dqsn;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.ekrg;
import defpackage.elgm;
import defpackage.eooy;
import defpackage.eooz;
import defpackage.eosc;
import defpackage.fcsu;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class SendMessageToConversationOrParticipantsAction extends Action<Void> implements Parcelable {
    public final fcsu b;
    public final aypg c;
    public final bbdl d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final cmot h;
    public final cogw i;
    public final bveg j;
    public final dqsn k;
    public final bagw l;
    public final bahv m;
    public final eosc n;
    public final eosc o;
    public final fcsu p;
    public final fcsu q;
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/action/SendMessageToConversationOrParticipantsAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new ayho();

    /* compiled from: PG */
    public interface a {
        aypg aV();

        ayqm bs();
    }

    public SendMessageToConversationOrParticipantsAction(Parcel parcel, bbdl bbdlVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, cmot cmotVar, cogw cogwVar, bveg bvegVar, dqsn dqsnVar, bagw bagwVar, bahv bahvVar, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6) {
        super(parcel, elgm.SEND_MESSAGE_TO_CONVERSATION_OR_PARTICIPANTS_ACTION);
        this.d = bbdlVar;
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.h = cmotVar;
        this.i = cogwVar;
        this.j = bvegVar;
        this.k = dqsnVar;
        this.l = bagwVar;
        this.m = bahvVar;
        this.n = eoscVar;
        this.o = eoscVar2;
        this.b = fcsuVar5;
        this.p = fcsuVar4;
        this.q = fcsuVar6;
        this.c = ((a) cqtf.a(a.class)).aV();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("SendMessageToConversationOrParticipantsAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        throw new IllegalStateException("SendMessageToConversationOrParticipantsAction#executeAction called without an implementation. Only executeActionAsync should be called.");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.SendMessageToConversationOrParticipants.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eiju e() {
        return eijx.h(new eooy() { // from class: ayhl
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                eiju eijuVarI;
                final SendMessageToConversationOrParticipantsAction sendMessageToConversationOrParticipantsAction = this.a;
                final long epochMilli = sendMessageToConversationOrParticipantsAction.i.f().toEpochMilli();
                aymo aymoVar = sendMessageToConversationOrParticipantsAction.v;
                final boolean z = aymoVar.z("use_cloud_sync", false);
                final ConversationIdType conversationIdTypeB = barn.b(aymoVar.l("conversation_id"));
                if (conversationIdTypeB.b()) {
                    ekgb ekgbVarN = ekgb.n(aymoVar.m("participants_list"));
                    fcsu fcsuVar = sendMessageToConversationOrParticipantsAction.e;
                    final ekgb ekgbVarB = ((bakt) fcsuVar.b()).B(ekgbVarN);
                    if (z) {
                        conversationIdTypeB = (ConversationIdType) sendMessageToConversationOrParticipantsAction.k.c("SendMessageToConversationOrParticipantsAction#getConversationId", new ejxr() { // from class: ayhn
                            @Override // defpackage.ejxr
                            public final Object get() {
                                return ((auue) sendMessageToConversationOrParticipantsAction.g.b()).b(bvdk.UNARCHIVED, ekgbVarB);
                            }
                        });
                    } else if (((Boolean) avos.a.e()).booleanValue()) {
                        ArrayList arrayList = new ArrayList();
                        int size = ekgbVarB.size();
                        for (int i = 0; i < size; i++) {
                            String strT = ((ParticipantsTable.BindData) ekgbVarB.get(i)).T();
                            if (strT != null) {
                                arrayList.add(strT);
                            }
                        }
                        ekgb ekgbVarN2 = ekgb.n(arrayList);
                        baqz baqzVarZ = bara.z();
                        baqzVarZ.p(ekgbVarB);
                        baqzVarZ.l(false);
                        baqzVarZ.x(new cnqj());
                        baqzVarZ.k(false);
                        final bara baraVarY = baqzVarZ.y();
                        conversationIdTypeB = ((avpc) sendMessageToConversationOrParticipantsAction.b.b()).d(ekgbVarN2, new fcsu() { // from class: ayha
                            @Override // defpackage.fcsu
                            public final Object b() {
                                return baraVarY;
                            }
                        }).C();
                        if (conversationIdTypeB.b()) {
                            conversationIdTypeB = barn.a;
                        }
                    } else {
                        long jD = sendMessageToConversationOrParticipantsAction.h.d(ekgbVarB);
                        if (jD < 0) {
                            ekrw ekrwVarJ = SendMessageToConversationOrParticipantsAction.a.j();
                            ekrwVarJ.X(eksq.a, "Bugle");
                            ekrd ekrdVar = (ekrd) ekrwVarJ;
                            ekrdVar.X(cqnc.I, bbbd.k(ekgbVarB).toString());
                            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageToConversationOrParticipantsAction", "getConversationId", 639, "SendMessageToConversationOrParticipantsAction.java")).q("Couldn't create a threadId in SMS db for the numbers.");
                            conversationIdTypeB = barn.a;
                        } else {
                            conversationIdTypeB = ((bakt) fcsuVar.b()).ar(jD, bvdk.UNARCHIVED, ekgbVarB);
                        }
                    }
                }
                if (conversationIdTypeB.b()) {
                    ekrw ekrwVarJ2 = SendMessageToConversationOrParticipantsAction.a.j();
                    ekrwVarJ2.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageToConversationOrParticipantsAction", "executeInner", 451, "SendMessageToConversationOrParticipantsAction.java")).q("Couldn't find a conversation id.");
                    return eijx.e(null);
                }
                final bajf bajfVarA = ((axgh) sendMessageToConversationOrParticipantsAction.p.b()).a(conversationIdTypeB);
                if (bajfVarA == null) {
                    ekrw ekrwVarJ3 = SendMessageToConversationOrParticipantsAction.a.j();
                    ekrwVarJ3.X(eksq.a, "Bugle");
                    ekrd ekrdVar2 = (ekrd) ekrwVarJ3;
                    ekrdVar2.X(cqnc.s, conversationIdTypeB);
                    ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageToConversationOrParticipantsAction", "executeInner", 461, "SendMessageToConversationOrParticipantsAction.java")).q("Couldn't find conversation item data.");
                    return eijx.e(null);
                }
                axcy axcyVarE = sendMessageToConversationOrParticipantsAction.d.e(bajfVarA.f());
                eiju eijuVarH = (axcyVarE == null || axcyVarE.i()) ? ((aofc) sendMessageToConversationOrParticipantsAction.q.b()).f().h(new ejvr() { // from class: ayhh
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        Optional optional = (Optional) obj;
                        ekrg ekrgVar = SendMessageToConversationOrParticipantsAction.a;
                        if (!optional.isEmpty()) {
                            return optional.map(new Function() { // from class: aygz
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return ((aoer) obj2).h();
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                        }
                        ekrw ekrwVarJ4 = SendMessageToConversationOrParticipantsAction.a.j();
                        ekrwVarJ4.X(eksq.a, "Bugle");
                        ((ekrd) ((ekrd) ekrwVarJ4).h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageToConversationOrParticipantsAction", "getSelfIdentity", 576, "SendMessageToConversationOrParticipantsAction.java")).q("Invalid selfId when creating conversation.");
                        return Optional.empty();
                    }
                }, sendMessageToConversationOrParticipantsAction.o) : eijx.e(Optional.of(axcyVarE.f()));
                final String strL = aymoVar.l("message_text");
                String strL2 = aymoVar.l("message_attachment_type");
                if (strL2 == null) {
                    eijuVarI = eijuVarH.i(new eooz() { // from class: ayhb
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            eiju eijuVarH2;
                            final SendMessageToConversationOrParticipantsAction sendMessageToConversationOrParticipantsAction2 = sendMessageToConversationOrParticipantsAction;
                            Optional optional = (Optional) obj;
                            Optional optionalJ = sendMessageToConversationOrParticipantsAction2.j(optional);
                            if (optionalJ.isEmpty()) {
                                return eijx.e(Optional.empty());
                            }
                            final String str = strL;
                            final ConversationIdType conversationIdType = conversationIdTypeB;
                            boolean z2 = z;
                            final SelfIdentityId selfIdentityId = (SelfIdentityId) optional.get();
                            int iIntValue = ((Integer) optionalJ.get()).intValue();
                            if (z2) {
                                final long epochMilli2 = sendMessageToConversationOrParticipantsAction2.i.f().toEpochMilli();
                                Callable callable = new Callable() { // from class: ayhg
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        ConversationIdType conversationIdType2 = conversationIdType;
                                        SelfIdentityId selfIdentityId2 = selfIdentityId;
                                        return sendMessageToConversationOrParticipantsAction2.j.d(null, conversationIdType2, selfIdentityId2.b(), selfIdentityId2, str, "", 0L, epochMilli2, true, true, 3, null);
                                    }
                                };
                                sendMessageToConversationOrParticipantsAction2 = sendMessageToConversationOrParticipantsAction2;
                                eijuVarH2 = eijx.g(callable, sendMessageToConversationOrParticipantsAction2.o);
                            } else {
                                eijuVarH2 = sendMessageToConversationOrParticipantsAction2.h(conversationIdType, selfIdentityId, iIntValue, str, Collections.singletonList(sendMessageToConversationOrParticipantsAction2.m.i(str)));
                            }
                            return eijuVarH2.h(new ayhm(), sendMessageToConversationOrParticipantsAction2.o);
                        }
                    }, sendMessageToConversationOrParticipantsAction.o);
                } else {
                    if (!le.f(strL2)) {
                        throw new IllegalArgumentException(a.a(strL2, "Attachment type ", " is not supported."));
                    }
                    eijuVarI = eijuVarH.i(new eooz() { // from class: ayhc
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            SendMessageToConversationOrParticipantsAction sendMessageToConversationOrParticipantsAction2 = sendMessageToConversationOrParticipantsAction;
                            Optional optional = (Optional) obj;
                            Optional optionalJ = sendMessageToConversationOrParticipantsAction2.j(optional);
                            if (optionalJ.isEmpty()) {
                                return eijx.e(Optional.empty());
                            }
                            String str = strL;
                            ConversationIdType conversationIdType = conversationIdTypeB;
                            SelfIdentityId selfIdentityId = (SelfIdentityId) optional.get();
                            int iIntValue = ((Integer) optionalJ.get()).intValue();
                            aymo aymoVar2 = sendMessageToConversationOrParticipantsAction2.v;
                            String strL3 = aymoVar2.l("message_attachment_type");
                            Uri uri = (Uri) aymoVar2.h("message_attachment_uri");
                            bahv bahvVar = sendMessageToConversationOrParticipantsAction2.m;
                            long jD2 = aymoVar2.d("message_attachment_duration");
                            bahx bahxVarD = bahy.D();
                            bacm bacmVar = (bacm) bahxVarD;
                            bacmVar.c = strL3;
                            bacmVar.d = uri;
                            bacmVar.e = uri;
                            bahxVarD.g(jD2);
                            return sendMessageToConversationOrParticipantsAction2.h(conversationIdType, selfIdentityId, iIntValue, str, Collections.singletonList(bahvVar.c(bahxVarD.q()))).h(new ayhm(), sendMessageToConversationOrParticipantsAction2.o);
                        }
                    }, sendMessageToConversationOrParticipantsAction.o);
                }
                final eiju eijuVar = eijuVarI;
                final eiju eijuVar2 = eijuVarH;
                return eijx.k(eijuVarH, eijuVarI).a(new Callable() { // from class: ayhi
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Optional optional = (Optional) eork.q(eijuVar2);
                        Optional optional2 = (Optional) eork.q(eijuVar);
                        SendMessageToConversationOrParticipantsAction sendMessageToConversationOrParticipantsAction2 = sendMessageToConversationOrParticipantsAction;
                        Optional optionalJ = sendMessageToConversationOrParticipantsAction2.j(optional);
                        if (optionalJ.isEmpty() || optional2.isEmpty()) {
                            ekrw ekrwVarJ4 = SendMessageToConversationOrParticipantsAction.a.j();
                            ekrwVarJ4.X(eksq.a, "Bugle");
                            ((ekrd) ((ekrd) ekrwVarJ4).h("com/google/android/apps/messaging/shared/datamodel/action/SendMessageToConversationOrParticipantsAction", "executeInner", 477, "SendMessageToConversationOrParticipantsAction.java")).q("Unable to create conversation, invalid selfIdentity.");
                        } else {
                            MessageCoreData messageCoreData = (MessageCoreData) optional2.get();
                            int iIntValue = ((Integer) optionalJ.get()).intValue();
                            aymo aymoVar2 = sendMessageToConversationOrParticipantsAction2.v;
                            elny elnyVar = elny.OBSOLETE_WEARABLE_REPLY;
                            boolean zY = aymoVar2.y("initiated_by_secondary_device");
                            messageCoreData.bE(bajfVarA.h(elnyVar, zY ? new DeviceData(elky.WEARABLE) : null, epochMilli));
                            sendMessageToConversationOrParticipantsAction2.c.e(messageCoreData, iIntValue, zY).z();
                        }
                        return null;
                    }
                }, sendMessageToConversationOrParticipantsAction.n);
            }
        }, this.n);
    }

    public final eiju h(final ConversationIdType conversationIdType, final SelfIdentityId selfIdentityId, final int i, final String str, final List list) {
        Callable callable = new Callable() { // from class: ayhj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ((baqt) this.a.f.b()).b(conversationIdType);
            }
        };
        eosc eoscVar = this.n;
        return eijx.g(callable, eoscVar).i(new eooz() { // from class: ayhk
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                String str2 = str;
                final List list2 = list;
                final SendMessageToConversationOrParticipantsAction sendMessageToConversationOrParticipantsAction = this.a;
                bagw bagwVar = sendMessageToConversationOrParticipantsAction.l;
                final ConversationIdType conversationIdType2 = conversationIdType;
                eiju eijuVarB = bagwVar.b(conversationIdType2, (ekgb) obj, null, str2, list2, i, false, false);
                final SelfIdentityId selfIdentityId2 = selfIdentityId;
                return eijuVarB.h(new ejvr() { // from class: ayhf
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        MessageCoreData messageCoreDataG = sendMessageToConversationOrParticipantsAction.j.g(((Integer) obj2).intValue(), conversationIdType2, selfIdentityId2);
                        ((MessageData) messageCoreDataG).i.addAll(list2);
                        return messageCoreDataG;
                    }
                }, sendMessageToConversationOrParticipantsAction.o);
            }
        }, eoscVar);
    }

    public final Optional j(Optional optional) {
        final bbdl bbdlVar = this.d;
        return optional.map(new Function() { // from class: ayhd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return bbdlVar.e((SelfIdentityId) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).map(new Function() { // from class: ayhe
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((axcy) obj).e());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public SendMessageToConversationOrParticipantsAction(bbdl bbdlVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, cmot cmotVar, cogw cogwVar, bveg bvegVar, dqsn dqsnVar, bagw bagwVar, bahv bahvVar, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, ConversationIdType conversationIdType, Uri uri, long j, String str) {
        super(elgm.SEND_MESSAGE_TO_CONVERSATION_OR_PARTICIPANTS_ACTION);
        this.d = bbdlVar;
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.h = cmotVar;
        this.i = cogwVar;
        this.j = bvegVar;
        this.k = dqsnVar;
        this.l = bagwVar;
        this.m = bahvVar;
        this.n = eoscVar;
        this.o = eoscVar2;
        this.b = fcsuVar4;
        this.p = fcsuVar5;
        this.q = fcsuVar6;
        this.c = ((a) cqtf.a(a.class)).aV();
        this.v.v("conversation_id", conversationIdType.a());
        this.v.t("message_attachment_uri", uri);
        this.v.s("message_attachment_duration", j);
        this.v.v("message_attachment_type", str);
        this.v.p("use_cloud_sync", false);
        this.v.p("initiated_by_secondary_device", true);
    }

    public SendMessageToConversationOrParticipantsAction(bbdl bbdlVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, cmot cmotVar, cogw cogwVar, bveg bvegVar, dqsn dqsnVar, bagw bagwVar, bahv bahvVar, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, ConversationIdType conversationIdType, String str) {
        this(bbdlVar, fcsuVar, fcsuVar2, fcsuVar3, cmotVar, cogwVar, bvegVar, dqsnVar, bagwVar, bahvVar, eoscVar, eoscVar2, fcsuVar4, fcsuVar5, fcsuVar6, str);
        this.v.v("conversation_id", conversationIdType.a());
    }

    public SendMessageToConversationOrParticipantsAction(bbdl bbdlVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, cmot cmotVar, cogw cogwVar, bveg bvegVar, dqsn dqsnVar, bagw bagwVar, bahv bahvVar, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, String str) {
        super(elgm.SEND_MESSAGE_TO_CONVERSATION_OR_PARTICIPANTS_ACTION);
        this.d = bbdlVar;
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.h = cmotVar;
        this.i = cogwVar;
        this.j = bvegVar;
        this.k = dqsnVar;
        this.l = bagwVar;
        this.m = bahvVar;
        this.n = eoscVar;
        this.o = eoscVar2;
        this.b = fcsuVar4;
        this.p = fcsuVar5;
        this.q = fcsuVar6;
        this.c = ((a) cqtf.a(a.class)).aV();
        this.v.v("message_text", str);
        this.v.p("use_cloud_sync", false);
        this.v.p("initiated_by_secondary_device", true);
    }

    public SendMessageToConversationOrParticipantsAction(bbdl bbdlVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, cmot cmotVar, cogw cogwVar, bveg bvegVar, dqsn dqsnVar, bagw bagwVar, bahv bahvVar, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, ArrayList arrayList, String str) {
        this(bbdlVar, fcsuVar, fcsuVar2, fcsuVar3, cmotVar, cogwVar, bvegVar, dqsnVar, bagwVar, bahvVar, eoscVar, eoscVar2, fcsuVar4, fcsuVar5, fcsuVar6, str);
        this.v.u("participants_list", arrayList);
    }
}

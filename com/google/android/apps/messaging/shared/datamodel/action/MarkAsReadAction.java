package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.MarkAsReadAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import defpackage.ains;
import defpackage.ajhd;
import defpackage.auue;
import defpackage.auuh;
import defpackage.axgh;
import defpackage.axru;
import defpackage.axsb;
import defpackage.aymo;
import defpackage.aypj;
import defpackage.ayqn;
import defpackage.bajf;
import defpackage.barn;
import defpackage.bary;
import defpackage.baxe;
import defpackage.brdr;
import defpackage.brdu;
import defpackage.brdv;
import defpackage.brec;
import defpackage.bxjh;
import defpackage.bxlc;
import defpackage.cgbn;
import defpackage.cgdh;
import defpackage.cgfy;
import defpackage.cggb;
import defpackage.cggc;
import defpackage.cggg;
import defpackage.cmqj;
import defpackage.cmvy;
import defpackage.cnqj;
import defpackage.cnqk;
import defpackage.cogw;
import defpackage.cqbd;
import defpackage.cqce;
import defpackage.cqtf;
import defpackage.crmx;
import defpackage.dqsn;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.ejwk;
import defpackage.ejyc;
import defpackage.eksp;
import defpackage.elgm;
import defpackage.elqb;
import defpackage.envi;
import defpackage.fcsu;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class MarkAsReadAction extends Action<Void> implements Parcelable {
    private final cmqj A;
    private final dqsn B;
    private final cmvy C;
    private final auuh D;
    private final bxjh E;
    private final cgdh F;
    private final fcsu G;
    private final fcsu H;
    public final ayqn c;
    public final bxlc d;
    public final cogw e;
    public final fcsu f;
    public final fcsu g;
    public final ajhd h;
    public final fcsu i;
    public final fcsu j;
    public final fcsu k;
    public envi l;
    private final Context m;
    private final cggc n;
    private final cggg o;
    private final crmx p;
    private final fcsu q;
    private final fcsu r;
    private final ains s;
    public static final cqce a = cqce.g("BugleDataModel", "MarkAsReadAction");
    public static final eksp b = eksp.c("BugleNotifications");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new axsb();

    /* compiled from: PG */
    public interface a {
        aypj aX();

        bxlc bI();

        cgbn bY();

        cggc bZ();

        ayqn bt();

        cggg ca();

        fcsu gg();

        fcsu go();
    }

    public MarkAsReadAction(Context context, cogw cogwVar, crmx crmxVar, ains ainsVar, ajhd ajhdVar, cmqj cmqjVar, dqsn dqsnVar, cmvy cmvyVar, auuh auuhVar, bxjh bxjhVar, cgdh cgdhVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, Parcel parcel) {
        super(parcel, elgm.MARK_AS_READ_ACTION);
        this.l = envi.MESSAGE_TYPE_UNKNOWN;
        this.m = context;
        this.e = cogwVar;
        this.p = crmxVar;
        this.s = ainsVar;
        this.h = ajhdVar;
        this.A = cmqjVar;
        this.B = dqsnVar;
        this.C = cmvyVar;
        this.D = auuhVar;
        this.E = bxjhVar;
        this.F = cgdhVar;
        this.G = fcsuVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.i = fcsuVar4;
        this.j = fcsuVar5;
        this.k = fcsuVar6;
        this.H = fcsuVar7;
        a aVar = (a) cqtf.a(a.class);
        aVar.bY();
        this.c = aVar.bt();
        this.n = aVar.bZ();
        this.o = aVar.ca();
        this.d = aVar.bI();
        this.q = aVar.gg();
        this.r = aVar.go();
    }

    private final void h(Exception exc) {
        if (this.v.y("from_notification")) {
            this.F.g(this.l, 3, cgdh.c(exc), Optional.of(true));
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("MarkAsReadAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        try {
            cqce cqceVar = a;
            cqceVar.m("Starting MarkAsReadAction");
            if (!this.p.G()) {
                cqceVar.r("Not default SMS app. Can't mark as read.");
                return null;
            }
            aymo aymoVar = this.v;
            final boolean z = aymoVar.z("should_mark_as_notified", true);
            aymoVar.z("SHOULD_SEND_REPORT", true);
            this.B.d("MarkAsReadAction#executeAction", new Runnable() { // from class: axrv
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r8v1 */
                /* JADX WARN: Type inference failed for: r8v19 */
                /* JADX WARN: Type inference failed for: r8v2, types: [boolean] */
                @Override // java.lang.Runnable
                public final void run() {
                    ekgb ekgbVarN;
                    int i;
                    char c;
                    axrv axrvVar = this;
                    MarkAsReadAction markAsReadAction = axrvVar.a;
                    aymo aymoVar2 = markAsReadAction.v;
                    if (aymoVar2.y("mark_all_as_read")) {
                        ekgbVarN = ((bakt) markAsReadAction.f.b()).A();
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(barn.d(Arrays.asList(aymoVar2.B("conversation_ids"))));
                        ConversationIdType conversationIdTypeB = barn.b(aymoVar2.l("conversation_id"));
                        if (!conversationIdTypeB.b()) {
                            arrayList.add(conversationIdTypeB);
                        }
                        ekgbVarN = ekgb.n(arrayList);
                    }
                    MarkAsReadAction.a.m("Setting markAsUnread to false for " + ekgbVarN.size() + " conversation(s).");
                    bakt baktVar = (bakt) markAsReadAction.f.b();
                    bxlc bxlcVar = markAsReadAction.d;
                    ?? r8 = 0;
                    cawo.k(baktVar, bxlcVar, ekgbVarN, false);
                    aymoVar2.I(new ArrayList());
                    int i2 = 0;
                    while (i2 < ekgbVarN.size()) {
                        final ConversationIdType conversationIdType = (ConversationIdType) ekgbVarN.get(i2);
                        eieu eieuVarK = eiiy.k("MarkAsReadAction::markConversationAsRead");
                        try {
                            String[] strArr = MessagesTable.a;
                            brdu brduVar = new brdu();
                            brduVar.ap("markConversationAsRead#update");
                            brduVar.n(conversationIdType);
                            brduVar.F(true);
                            boolean z2 = z;
                            if (z2) {
                                brduVar.v(true);
                            }
                            String.valueOf(conversationIdType);
                            boolean z3 = cqca.b;
                            brec brecVar = new brec();
                            if (z2) {
                                i = 1;
                                brec[] brecVarArr = new brec[2];
                                brec brecVar2 = new brec();
                                brecVar2.O(r8);
                                brecVarArr[r8] = brecVar2;
                                brec brecVar3 = new brec();
                                brecVar3.E();
                                brecVarArr[1] = brecVar3;
                                brecVar.aq(brecVarArr);
                            } else {
                                i = 1;
                                brecVar.O(r8);
                            }
                            brecVar.m(conversationIdType);
                            String strL = aymoVar2.l("message_id");
                            if (strL != null) {
                                final MessageIdType messageIdTypeB = bary.b(strL);
                                brdr brdrVarD = MessagesTable.d();
                                c = r8;
                                brdrVarD.A("markConversationAsReadInLighter-messages1");
                                brdrVarD.f(new Function() { // from class: axrx
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        cqce cqceVar2 = MarkAsReadAction.a;
                                        return ((bran) obj).i;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                brdrVarD.h(new Function() { // from class: axry
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        brec brecVar4 = (brec) obj;
                                        cqce cqceVar2 = MarkAsReadAction.a;
                                        brecVar4.p(messageIdTypeB);
                                        return brecVar4;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                brecVar.ap(new dqpk("messages.received_timestamp", 10, brdrVarD.b()));
                            } else {
                                c = r8;
                            }
                            brdr brdrVarD2 = MessagesTable.d();
                            brdrVarD2.A("+markConversationAsReadInLighter-messages2");
                            brdrVarD2.f(new Function() { // from class: axrz
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    cqce cqceVar2 = MarkAsReadAction.a;
                                    return ((bran) obj).a;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            brdrVarD2.g(brecVar);
                            List list = (List) Collection.EL.stream(brdrVarD2.b().g()).collect(Collectors.toCollection(new axru()));
                            if (!list.isEmpty()) {
                                aymoVar2.F().addAll((java.util.Collection) Collection.EL.stream(list).map(new Function() { // from class: axsa
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        cqce cqceVar2 = MarkAsReadAction.a;
                                        return ((MessageIdType) obj).b();
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }).collect(Collectors.toCollection(new axru())));
                                brduVar.W(brecVar);
                                if (brduVar.b().e() > 0) {
                                    bxlcVar.m(conversationIdType, list, "read");
                                }
                            }
                            if (!list.isEmpty()) {
                                bxlcVar.d(conversationIdType);
                            }
                            String[] strArr2 = bofr.a;
                            bofo bofoVar = new bofo();
                            bofoVar.ap("markConversationAsRead-conversationsuggestions");
                            bofoVar.c();
                            eieu eieuVarK2 = eiiy.k("ConversationSuggestionDatabaseOperations#updateConversationSuggestionRowsFromConversationId");
                            try {
                                cqaz.h();
                                bofq bofqVar = new bofq();
                                String[] strArr3 = busq.a;
                                busn busnVar = new busn(busq.a);
                                ekgb ekgbVar = ekgbVarN;
                                busk[] buskVarArr = new busk[i];
                                buskVarArr[c] = (busk) new Function() { // from class: crhd
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        return ((busj) obj).a;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }.apply(busq.c);
                                int iA = busq.a().M().a();
                                Integer.valueOf(iA).getClass();
                                int i3 = i2;
                                bxlc bxlcVar2 = bxlcVar;
                                if (((Integer) busq.b.getOrDefault(buskVarArr[c].toString(), -1)).intValue() > iA) {
                                    dqru.x("columnReference.toString()", iA);
                                }
                                busnVar.m(buskVarArr);
                                busnVar.k(new buso((busp) new Function() { // from class: crhe
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        busp buspVar = (busp) obj;
                                        buspVar.ap(new dqpj("messages.conversation_id", 1, Long.valueOf(barn.a(conversationIdType))));
                                        return buspVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }.apply(new busp())));
                                bofqVar.ap(new dqpk("conversation_suggestions._id", 3, busnVar.b()));
                                bofoVar.af(new bofp(bofqVar));
                                bofoVar.a().e();
                                eieuVarK2.close();
                                if (z2) {
                                    eksl ekslVar = (eksl) MarkAsReadAction.b.h();
                                    ekslVar.X(cqnc.r, conversationIdType.toString());
                                    ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/datamodel/action/MarkAsReadAction", "markConversationAsRead", 523, "MarkAsReadAction.java")).q("Canceling incoming message notification from mark as read");
                                    ((cgpi) markAsReadAction.i.b()).a(conversationIdType);
                                }
                                if (aymoVar2.y("from_notification")) {
                                    aill aillVar = (aill) markAsReadAction.j.b();
                                    ellg ellgVar = (ellg) ellh.a.createBuilder();
                                    ellf ellfVar = ellf.BUGLE_CONVERSATION;
                                    ellgVar.copyOnWrite();
                                    ellh ellhVar = (ellh) ellgVar.instance;
                                    ellhVar.j = ellfVar.f11do;
                                    ellhVar.b |= 1;
                                    elkh elkhVar = (elkh) elki.a.createBuilder();
                                    long jB = ((aika) markAsReadAction.k.b()).b(conversationIdType);
                                    elkhVar.copyOnWrite();
                                    elki elkiVar = (elki) elkhVar.instance;
                                    elkiVar.b |= 65536;
                                    elkiVar.r = jB;
                                    ellgVar.copyOnWrite();
                                    ellh ellhVar2 = (ellh) ellgVar.instance;
                                    elki elkiVar2 = (elki) elkhVar.build();
                                    elkiVar2.getClass();
                                    ellhVar2.m = elkiVar2;
                                    ellhVar2.b |= 8;
                                    aillVar.k(ellgVar, emxt.ACTIVE_USER_ENTER_CONVERSATION_WITH_UNREAD_MESSAGE);
                                }
                                markAsReadAction.c.a(bary.a, conversationIdType, 2, elny.MARK_AS_READ_ACTION).B(markAsReadAction);
                                eksl ekslVar2 = (eksl) MarkAsReadAction.b.h();
                                ekslVar2.X(cqnc.r, conversationIdType.toString());
                                ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/datamodel/action/MarkAsReadAction", "markConversationAsRead", 552, "MarkAsReadAction.java")).I("Marking %d message(s) as read (shouldMarkAsNotified = %b, fromNotification = %b)", Integer.valueOf(list.size()), Boolean.valueOf(z2), Boolean.valueOf(aymoVar2.y("from_notification")));
                                eieuVarK.close();
                                i2 = i3 + 1;
                                axrvVar = this;
                                r8 = c;
                                ekgbVarN = ekgbVar;
                                bxlcVar = bxlcVar2;
                            } catch (Throwable th) {
                                try {
                                    eieuVarK2.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        } finally {
                        }
                    }
                    ekgb ekgbVar2 = ekgbVarN;
                    int i4 = r8;
                    markAsReadAction.h.V(markAsReadAction.l == envi.MESSAGE_TYPE_RCS ? 1 : i4);
                    aymo aymoVar3 = markAsReadAction.v;
                    aymoVar3.w("conversation_ids", (String[]) ((ArrayList) Collection.EL.stream(ekgbVar2).map(new Function() { // from class: axrt
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            cqce cqceVar2 = MarkAsReadAction.a;
                            return ((ConversationIdType) obj).a();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.toCollection(new axru()))).toArray(new String[i4]));
                    aymoVar3.s("timestamp", markAsReadAction.e.f().toEpochMilli());
                }
            });
            cgfy cgfyVar = (cgfy) cggb.a.createBuilder();
            if (aymoVar.y("from_notification")) {
                cgfyVar.copyOnWrite();
                cggb cggbVar = (cggb) cgfyVar.instance;
                cggbVar.c = 3;
                cggbVar.b = 1 | cggbVar.b;
            }
            this.n.a((cggb) cgfyVar.build());
            this.o.b();
            v();
            return null;
        } catch (RuntimeException e) {
            h(e);
            throw e;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.MarkAsRead.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fP() {
        ParticipantsTable.BindData bindDataB;
        String[] strArrF;
        cnqj cnqjVarA;
        try {
            ConversationIdType[] conversationIdTypeArr = (ConversationIdType[]) barn.e(Arrays.asList(this.v.B("conversation_ids"))).toArray(new ConversationIdType[0]);
            int length = conversationIdTypeArr.length;
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                try {
                    cnqjVarA = this.E.a(conversationIdTypeArr[i]);
                } catch (ejyc e) {
                    cnqj cnqjVar = new cnqj();
                    h(e);
                    cnqjVarA = cnqjVar;
                }
                jArr[i] = cnqk.a(cnqjVarA);
            }
            aymo aymoVar = this.v;
            long jD = aymoVar.d("timestamp");
            boolean zY = aymoVar.y("should_mark_as_notified");
            for (int i2 = 0; i2 < length; i2++) {
                ConversationIdType conversationIdType = conversationIdTypeArr[i2];
                String[] strArr = MessagesTable.a;
                brec brecVar = new brec();
                brecVar.O(false);
                if (zY) {
                    brec brecVar2 = new brec();
                    brec brecVar3 = new brec();
                    brecVar3.E();
                    brecVar2.aq(brecVar, brecVar3);
                    brecVar = brecVar2;
                }
                fcsu fcsuVar = this.q;
                if (((auue) fcsuVar.b()).d(conversationIdType, cnqj.b(jArr[i2])) && (strArrF = ((auue) fcsuVar.b()).f(conversationIdType, new brdv(brecVar))) != null) {
                    this.D.f(this.m, strArrF, zY);
                }
            }
            for (int i3 = 0; i3 < length; i3++) {
                long j = jArr[i3];
                if (j != -1) {
                    this.A.j(j, jD);
                }
            }
            this.l = envi.MESSAGE_TYPE_UNKNOWN;
            ArrayList arrayListF = aymoVar.F();
            if (arrayListF != null) {
                HashMap map = new HashMap();
                int size = arrayListF.size();
                for (int i4 = 0; i4 < size; i4++) {
                    String str = (String) arrayListF.get(i4);
                    if (!TextUtils.isEmpty(str)) {
                        MessageIdType messageIdTypeB = bary.b(str);
                        MessageCoreData messageCoreDataW = ((baxe) this.r.b()).w(messageIdTypeB);
                        if (messageCoreDataW == null) {
                            cqbd cqbdVarE = a.e();
                            cqbdVarE.d(messageIdTypeB);
                            cqbdVarE.I("no longer exists.");
                            cqbdVarE.r();
                        } else {
                            this.l = cgdh.a(this.l, messageCoreDataW);
                            Optional optionalEmpty = Optional.empty();
                            ConversationIdType conversationIdTypeA = messageCoreDataW.A();
                            if (!map.containsKey(conversationIdTypeA)) {
                                bajf bajfVarA = ((axgh) this.G.b()).a(conversationIdTypeA);
                                if (bajfVarA != null) {
                                    optionalEmpty = Optional.of(Integer.valueOf(bajfVarA.E()));
                                }
                                map.put(conversationIdTypeA, optionalEmpty);
                            }
                            Optional optional = (Optional) map.get(conversationIdTypeA);
                            ajhd ajhdVar = this.h;
                            ajhdVar.ar(messageCoreDataW, optional);
                            String strAB = messageCoreDataW.aB();
                            if (strAB != null && (bindDataB = ParticipantsTable.b(strAB)) != null) {
                                String strT = bindDataB.T();
                                if (!TextUtils.isEmpty(strT) && (messageCoreDataW.O().a() || this.C.i(bindDataB.T()))) {
                                    ajhdVar.l(strT, -1, messageCoreDataW.C().b(), ejwk.b(messageCoreDataW.as()), messageCoreDataW.O());
                                }
                            }
                        }
                    }
                }
                int size2 = arrayListF.size();
                if (aymoVar.y("mark_all_as_read")) {
                    final baxe baxeVar = (baxe) this.r.b();
                    eieu eieuVarK = eiiy.k("MessageDatabaseOperations#hasUnreadMessages");
                    try {
                        brdr brdrVarD = MessagesTable.d();
                        brdrVarD.A("hasUnreadMessages");
                        brdrVarD.c(MessagesTable.c.a);
                        brdrVarD.h(new Function() { // from class: bavt
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                brec brecVar4 = (brec) obj;
                                brecVar4.O(false);
                                return brecVar4;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        boolean zU = brdrVarD.b().U();
                        eieuVarK.close();
                        if (zU) {
                            a.r("Forcing remaining unread msgs to be read.");
                            brdu brduVar = new brdu();
                            brduVar.ap("MarkAsReadAction#runBackgroundWork");
                            brduVar.F(true);
                            brduVar.v(true);
                            brec brecVar4 = new brec();
                            brecVar4.O(false);
                            size2 += brduVar.ae(new brdv(brecVar4), "messages-buildAndUpdateForRead");
                        }
                        this.d.c();
                    } finally {
                    }
                }
                aymoVar.r("total_messages_marked_as_read", size2);
            }
            if (!aymoVar.y("from_notification")) {
                return null;
            }
            this.s.c("Bugle.Notification.MarkAsRead.Count");
            this.h.aj(elqb.INCOMING_MSG_NOTIFICATION, 2, (List) DesugarArrays.stream(conversationIdTypeArr).collect(Collectors.toCollection(new axru())));
            this.F.f(Optional.of(this.l), 2, Duration.between(Instant.ofEpochMilli(aymoVar.d("start_timestamp")), this.e.f()));
            return null;
        } catch (RuntimeException e2) {
            h(e2);
            throw e2;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public MarkAsReadAction(Context context, cogw cogwVar, crmx crmxVar, ains ainsVar, ajhd ajhdVar, cmqj cmqjVar, dqsn dqsnVar, cmvy cmvyVar, auuh auuhVar, bxjh bxjhVar, cgdh cgdhVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, ConversationIdType[] conversationIdTypeArr, MessageIdType messageIdType, boolean z, boolean z2, int i, boolean z3) {
        super(elgm.MARK_AS_READ_ACTION);
        this.l = envi.MESSAGE_TYPE_UNKNOWN;
        this.m = context;
        this.e = cogwVar;
        this.p = crmxVar;
        this.s = ainsVar;
        this.h = ajhdVar;
        this.A = cmqjVar;
        this.B = dqsnVar;
        this.C = cmvyVar;
        this.D = auuhVar;
        this.E = bxjhVar;
        this.G = fcsuVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.F = cgdhVar;
        this.i = fcsuVar4;
        this.j = fcsuVar5;
        this.k = fcsuVar6;
        this.H = fcsuVar7;
        this.v.w("conversation_ids", (String[]) ((ArrayList) DesugarArrays.stream(conversationIdTypeArr).map(new Function() { // from class: axrw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cqce cqceVar = MarkAsReadAction.a;
                return ((ConversationIdType) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new axru()))).toArray(new String[0]));
        if (!messageIdType.c()) {
            this.v.v("message_id", messageIdType.b());
        }
        this.v.p("should_mark_as_notified", z);
        this.v.p("from_notification", z2);
        this.v.s("start_timestamp", cogwVar.f().toEpochMilli());
        this.v.p("SHOULD_SEND_REPORT", z3);
        if (i == 1) {
            this.v.p("mark_all_as_read", true);
        }
        a aVar = (a) cqtf.a(a.class);
        aVar.bY();
        this.c = aVar.bt();
        this.d = aVar.bI();
        this.n = aVar.bZ();
        this.o = aVar.ca();
        this.q = aVar.gg();
        this.r = aVar.go();
    }
}

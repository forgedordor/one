package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.action.InsertNewMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.DeviceData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.alqm;
import defpackage.alre;
import defpackage.alrj;
import defpackage.aoet;
import defpackage.aofa;
import defpackage.apzj;
import defpackage.aqsh;
import defpackage.aqzn;
import defpackage.arnv;
import defpackage.asbr;
import defpackage.atgy;
import defpackage.auau;
import defpackage.auvh;
import defpackage.auvw;
import defpackage.axqa;
import defpackage.axqb;
import defpackage.axrh;
import defpackage.axrj;
import defpackage.aymo;
import defpackage.aypg;
import defpackage.ayql;
import defpackage.bajf;
import defpackage.barn;
import defpackage.bvdk;
import defpackage.cbqz;
import defpackage.cgdh;
import defpackage.coie;
import defpackage.cqaz;
import defpackage.cqnc;
import defpackage.dqsn;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.ejvr;
import defpackage.ejxr;
import defpackage.ekcv;
import defpackage.ekgb;
import defpackage.ekrd;
import defpackage.ekrg;
import defpackage.ekrw;
import defpackage.ekrz;
import defpackage.eksk;
import defpackage.eksl;
import defpackage.eksp;
import defpackage.eksq;
import defpackage.elgm;
import defpackage.elny;
import defpackage.envi;
import defpackage.eooz;
import defpackage.eoqg;
import defpackage.fcsu;
import defpackage.fcyi;
import defpackage.fdjz;
import defpackage.ffhi;
import defpackage.fhaz;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class InsertNewMessageAction extends Action<Void> implements Parcelable {
    public final fcsu b;
    public final fcsu c;
    public final dqsn d;
    public final alrj e;
    public final axqb f;
    public final fcsu g;
    private final cgdh i;
    private final fcsu j;
    private final fcsu k;
    private final fcsu l;
    private final arnv m;
    private final aqzn n;
    private final fcsu o;
    public static final eksp a = eksp.c("BugleDataModel");
    private static final ekrg h = ekrg.c("com/google/android/apps/messaging/shared/datamodel/action/InsertNewMessageAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new axqa();

    /* compiled from: PG */
    public interface a {
        aypg aV();
    }

    public InsertNewMessageAction(fcsu fcsuVar, fcsu fcsuVar2, dqsn dqsnVar, alrj alrjVar, cgdh cgdhVar, fcsu fcsuVar3, fcsu fcsuVar4, axqb axqbVar, fcsu fcsuVar5, fcsu fcsuVar6, arnv arnvVar, aqzn aqznVar, fcsu fcsuVar7, int i, ekgb ekgbVar, String str, String str2, ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, boolean z, boolean z2, elny elnyVar, DeviceData deviceData, boolean z3, ArrayList arrayList, boolean z4, fhaz fhazVar) {
        super(elgm.INSERT_NEW_MESSAGE_ACTION);
        this.o = fcsuVar7;
        if (ekgbVar.isEmpty() && conversationIdType.b()) {
            cqaz.c("InsertNewMessageAction: Can't have empty messaging identities and empty conversation id");
        }
        if (TextUtils.isEmpty(str) && (arrayList == null || arrayList.isEmpty())) {
            cqaz.c("InsertNewMessageAction: Can't have empty message and no attachments");
        }
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = dqsnVar;
        this.e = alrjVar;
        this.i = cgdhVar;
        this.j = fcsuVar3;
        this.k = fcsuVar4;
        this.f = axqbVar;
        this.g = fcsuVar5;
        this.l = fcsuVar6;
        this.m = arnvVar;
        this.n = aqznVar;
        this.v.r("sub_id", i);
        final boolean zA = ((apzj) axqbVar.e.b()).a();
        if (zA) {
            this.v.u("messaging_identities", new ArrayList((Collection) Collection.EL.stream(ekgbVar).map(new Function() { // from class: axpx
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return alre.d((alqm) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(ekcv.a)));
        }
        h("recipients", (String) Collection.EL.stream(ekgbVar).map(new Function() { // from class: axpy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eksp ekspVar = InsertNewMessageAction.a;
                return ejwk.b(((alqm) obj).p(zA));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new Predicate() { // from class: axpz
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
                eksp ekspVar = InsertNewMessageAction.a;
                return !((String) obj).isEmpty();
            }
        }).collect(Collectors.joining(",")));
        h("message_text", str);
        h("subject_text", str2);
        h("self_id", aoet.b(selfIdentityId));
        h("conversation_id", conversationIdType.a());
        this.v.p("require_mms", z);
        this.v.p("has_rbm_bot_recipient", z2);
        this.v.r("message_source", elnyVar.M);
        if (arrayList != null) {
            this.v.u("message_parts", arrayList);
        }
        this.v.t("secondary_device", deviceData);
        this.v.p("should_refresh_notification", z3);
        this.v.p("update_draft", false);
        this.v.s("sent_realtime", 0L);
        this.v.p("from_notification", z4);
        if (fhazVar != null) {
            this.v.q("trace_id", fhazVar.toByteArray());
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("InsertNewMessageAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.InsertNewMessage.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eiju e() throws Throwable {
        int i;
        eieu eieuVar;
        try {
            final axrj axrjVar = (axrj) this.g.b();
            aymo aymoVar = this.v;
            MessageCoreData messageCoreData = (MessageCoreData) aymoVar.h("message");
            eiju eijuVarE = eijx.e(messageCoreData);
            ConversationIdType conversationIdTypeB = barn.b(aymoVar.l("conversation_id"));
            int iB = aymoVar.b("sub_id", -1);
            final int iB2 = aymoVar.b("locked_default_sms_sub_id", -1);
            final elny elnyVarB = elny.b(aymoVar.a("message_source"));
            if (messageCoreData == null) {
                eieu eieuVarK = eiiy.k("InsertNewMessageAction#createMessage");
                try {
                    String strL = aymoVar.l("recipients");
                    String strL2 = aymoVar.l("message_text");
                    String strL3 = aymoVar.l("subject_text");
                    SelfIdentityId selfIdentityIdC = aofa.c(aymoVar.l("self_id"));
                    boolean zY = aymoVar.y("require_mms");
                    boolean zY2 = aymoVar.y("has_rbm_bot_recipient");
                    ArrayList arrayListM = aymoVar.m("message_parts");
                    List listAsList = null;
                    Byte[] bArr = null;
                    if (aymoVar.A("trace_id") != null) {
                        final byte[] bArrA = aymoVar.A("trace_id");
                        if (bArrA != null) {
                            int length = bArrA.length;
                            if (length == 0) {
                                bArr = ffhi.a;
                            } else {
                                bArr = new Byte[length];
                                Arrays.setAll(bArr, new IntFunction() { // from class: ffhh
                                    @Override // java.util.function.IntFunction
                                    public final Object apply(int i2) {
                                        return Byte.valueOf(bArrA[i2]);
                                    }
                                });
                            }
                        }
                        listAsList = Arrays.asList(bArr);
                    }
                    List list = listAsList;
                    ArrayList arrayListM2 = aymoVar.m("messaging_identities");
                    eieuVar = eieuVarK;
                    try {
                        i = iB;
                        eijuVarE = auvw.c(axrjVar.H, fcyi.a, fdjz.a, new axrh(axrjVar, iB, strL, strL2, strL3, selfIdentityIdC, conversationIdTypeB, zY, zY2, arrayListM, list, arrayListM2, null)).h(new ejvr() { // from class: axpv
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj) {
                                MessageCoreData messageCoreData2 = (MessageCoreData) obj;
                                eksp ekspVar = InsertNewMessageAction.a;
                                return messageCoreData2;
                            }
                        }, eoqg.a);
                        eieuVar.b(eijuVarE);
                        eieuVar.close();
                    } catch (Throwable th) {
                        th = th;
                        Throwable th2 = th;
                        try {
                            eieuVar.close();
                            throw th2;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    eieuVar = eieuVarK;
                }
            } else {
                i = iB;
            }
            final int i2 = i;
            eooz eoozVar = new eooz() { // from class: axpw
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    final MessageCoreData messageCoreData2 = (MessageCoreData) obj;
                    final int i3 = i2;
                    final int i4 = iB2;
                    final elny elnyVar = elnyVarB;
                    final InsertNewMessageAction insertNewMessageAction = this.a;
                    final axrj axrjVar2 = axrjVar;
                    return (ListenableFuture) insertNewMessageAction.d.b(new ejxr() { // from class: axpl
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r2v10, types: [axrj] */
                        /* JADX WARN: Type inference failed for: r2v20, types: [axrj] */
                        /* JADX WARN: Type inference failed for: r5v1, types: [elny] */
                        /* JADX WARN: Type inference failed for: r5v10, types: [elny] */
                        /* JADX WARN: Type inference failed for: r5v14 */
                        /* JADX WARN: Type inference failed for: r5v9 */
                        /* JADX WARN: Type inference failed for: r7v1, types: [elny] */
                        /* JADX WARN: Type inference failed for: r7v11, types: [elny] */
                        /* JADX WARN: Type inference failed for: r7v12 */
                        /* JADX WARN: Type inference failed for: r7v13 */
                        /* JADX WARN: Type inference failed for: r7v14 */
                        /* JADX WARN: Type inference failed for: r7v15 */
                        /* JADX WARN: Type inference failed for: r7v16 */
                        /* JADX WARN: Type inference failed for: r7v3, types: [elny] */
                        /* JADX WARN: Type inference failed for: r7v4 */
                        @Override // defpackage.ejxr
                        public final Object get() throws Throwable {
                            InsertNewMessageAction insertNewMessageAction2;
                            ?? r7;
                            Object obj2;
                            ?? r72;
                            bajf bajfVar;
                            final ?? r5;
                            ?? r73;
                            final MessageCoreData messageCoreData3 = messageCoreData2;
                            Integer num = null;
                            if (messageCoreData3 == null) {
                                ((eksl) ((eksl) InsertNewMessageAction.a.j()).h("com/google/android/apps/messaging/shared/datamodel/action/InsertNewMessageAction", "runActionAsync", 480, "InsertNewMessageAction.java")).q("InsertNewMessageAction: Failed to create MessageData.");
                                return eijx.e(null);
                            }
                            final InsertNewMessageAction insertNewMessageAction3 = insertNewMessageAction;
                            final bajf bajfVarA = ((axgh) insertNewMessageAction3.b.b()).a(messageCoreData3.A());
                            eieu eieuVarK2 = eiiy.k("InsertNewMessageAction::getParticipantIdentities");
                            try {
                                ejxr ejxrVarA = ejxx.a(new ejxr() { // from class: axpq
                                    @Override // defpackage.ejxr
                                    public final Object get() {
                                        final InsertNewMessageAction insertNewMessageAction4 = insertNewMessageAction3;
                                        MessageCoreData messageCoreData4 = messageCoreData3;
                                        bajf bajfVar2 = bajfVarA;
                                        ekgb ekgbVarZ = bajfVar2 != null ? ((bakt) insertNewMessageAction4.c.b()).z(messageCoreData4.ah().flatMap(new axps()), messageCoreData4.A(), bajfVar2.E()) : ((bakt) insertNewMessageAction4.c.b()).y(messageCoreData4.ah().flatMap(new axps()), messageCoreData4.A());
                                        final boolean zCw = messageCoreData4.cw();
                                        Stream map = Collection.EL.stream(ekgbVarZ).map(new Function() { // from class: axpn
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo536andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj3) {
                                                InsertNewMessageAction insertNewMessageAction5 = insertNewMessageAction4;
                                                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj3;
                                                boolean z = zCw;
                                                alrj alrjVar = insertNewMessageAction5.e;
                                                return z ? alrjVar.q(bindData) : alrjVar.t(bindData);
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        });
                                        int i5 = ekgb.d;
                                        return (List) map.collect(ekcv.a);
                                    }
                                });
                                ?? r52 = elnyVar;
                                final int i5 = i4;
                                Integer num2 = r52;
                                int i6 = i3;
                                eieuVarK2.close();
                                fcsu fcsuVar = insertNewMessageAction3.g;
                                final boolean zK = ((axrj) fcsuVar.b()).k(messageCoreData3);
                                axqb axqbVar = insertNewMessageAction3.f;
                                if (!((asbr) axqbVar.f.b()).a()) {
                                    if (bajfVarA != null) {
                                        ?? r2 = (axrj) fcsuVar.b();
                                        if (num2 != null) {
                                            obj2 = num2;
                                            r72 = num2;
                                        } else {
                                            obj2 = null;
                                            r72 = elny.UNKNOWN_BUGLE_MESSAGE_SOURCE;
                                        }
                                        Integer numA = r2.a(bajfVarA, messageCoreData3, i6, i5, r72);
                                        if (numA != null && insertNewMessageAction3.j(messageCoreData3, numA.intValue(), ejxrVarA)) {
                                            insertNewMessageAction3.i(messageCoreData3, bajfVarA, numA.intValue(), i5, zK, ejxrVarA);
                                            return eijx.e(null);
                                        }
                                        insertNewMessageAction2 = insertNewMessageAction3;
                                        r7 = obj2;
                                    } else {
                                        insertNewMessageAction2 = insertNewMessageAction3;
                                        r7 = num2;
                                    }
                                    axrj axrjVar3 = axrjVar2;
                                    aymo aymoVar2 = insertNewMessageAction2.v;
                                    axrjVar3.d(new axqf(insertNewMessageAction2, messageCoreData3, (DeviceData) aymoVar2.h("secondary_device"), (MessageUsageStatisticsData) aymoVar2.h("message_usage_stats_data"), r7, aymoVar2.d("sent_realtime"), aymoVar2.b("sub_id", -1), i5, aymoVar2.z("update_draft", true), aymoVar2.l("archive"), aymoVar2.z("should_refresh_notification", false), aymoVar2.y("from_notification"), aymoVar2.y("has_rbm_bot_recipient"), false, zK, null));
                                    return eijx.e(null);
                                }
                                if (bajfVarA != null) {
                                    ?? r22 = (axrj) fcsuVar.b();
                                    if (num2 != null) {
                                        num = num2;
                                        r73 = num2;
                                    } else {
                                        r73 = elny.UNKNOWN_BUGLE_MESSAGE_SOURCE;
                                    }
                                    Integer numA2 = r22.a(bajfVarA, messageCoreData3, i6, i5, r73);
                                    r5 = num;
                                    num = numA2;
                                    bajfVar = bajfVarA;
                                } else {
                                    bajfVar = null;
                                    r5 = num2;
                                }
                                final boolean z = num != null && insertNewMessageAction3.j(messageCoreData3, num.intValue(), ejxrVarA);
                                eooy eooyVar = new eooy() { // from class: axpk
                                    @Override // defpackage.eooy
                                    public final ListenableFuture a() {
                                        final InsertNewMessageAction insertNewMessageAction4 = insertNewMessageAction3;
                                        final MessageCoreData messageCoreData4 = messageCoreData3;
                                        final elny elnyVar2 = r5;
                                        final int i7 = i5;
                                        final boolean z2 = z;
                                        final boolean z3 = zK;
                                        return kol.a(new koi() { // from class: axpt
                                            @Override // defpackage.koi
                                            public final Object a(final kog kogVar) {
                                                InsertNewMessageAction insertNewMessageAction5 = insertNewMessageAction4;
                                                axrj axrjVar4 = (axrj) insertNewMessageAction5.g.b();
                                                aymo aymoVar3 = insertNewMessageAction5.v;
                                                DeviceData deviceData = (DeviceData) aymoVar3.h("secondary_device");
                                                MessageUsageStatisticsData messageUsageStatisticsData = (MessageUsageStatisticsData) aymoVar3.h("message_usage_stats_data");
                                                long jD = aymoVar3.d("sent_realtime");
                                                int iB3 = aymoVar3.b("sub_id", -1);
                                                boolean z4 = aymoVar3.z("update_draft", true);
                                                String strL4 = aymoVar3.l("archive");
                                                boolean z5 = aymoVar3.z("should_refresh_notification", false);
                                                boolean zY3 = aymoVar3.y("from_notification");
                                                boolean zY4 = aymoVar3.y("has_rbm_bot_recipient");
                                                axrf axrfVar = new axrf() { // from class: axpu
                                                    @Override // defpackage.axrf
                                                    public final void a() {
                                                        eksp ekspVar = InsertNewMessageAction.a;
                                                        kogVar.b(null);
                                                    }
                                                };
                                                axrjVar4.d(new axqf(insertNewMessageAction5, messageCoreData4, deviceData, messageUsageStatisticsData, elnyVar2, jD, iB3, i7, z4, strL4, z5, zY3, zY4, z2, z3, axrfVar));
                                                return "Start save future";
                                            }
                                        });
                                    }
                                };
                                boolean z2 = z;
                                eosc eoscVar = axqbVar.d;
                                eiju eijuVarH = eijx.h(eooyVar, eoscVar).h(new ejvr() { // from class: axpr
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj3) {
                                        Void r3 = (Void) obj3;
                                        ((ckfo) insertNewMessageAction3.f.h.b()).d(messageCoreData3);
                                        return r3;
                                    }
                                }, eoscVar);
                                if (z2) {
                                    ((cmoi) axqbVar.g.b()).d(messageCoreData3.F(), eijuVarH);
                                    bajfVar.getClass();
                                    num.getClass();
                                    insertNewMessageAction3.i(messageCoreData3, bajfVar, num.intValue(), i5, zK, ejxrVarA);
                                }
                                return eijuVarH;
                            } finally {
                            }
                        }
                    });
                }
            };
            axqb axqbVar = this.f;
            return eijuVarE.i(eoozVar, axqbVar.d).f(RuntimeException.class, new eooz() { // from class: axpm
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    RuntimeException runtimeException = (RuntimeException) obj;
                    this.a.g(runtimeException);
                    throw runtimeException;
                }
            }, axqbVar.c);
        } catch (RuntimeException e) {
            g(e);
            throw e;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final boolean fT() {
        return false;
    }

    public final void g(Exception exc) {
        if (this.v.y("from_notification")) {
            this.i.g(envi.MESSAGE_TYPE_UNKNOWN, 5, cgdh.c(exc), Optional.of(true));
        }
    }

    protected final void h(String str, String str2) {
        if (str2 != null) {
            this.v.v(str, str2);
        }
    }

    /* JADX WARN: Type inference failed for: r10v29, types: [ayjm, com.google.android.apps.messaging.shared.datamodel.action.common.Action] */
    public final void i(MessageCoreData messageCoreData, bajf bajfVar, int i, int i2, boolean z, ejxr ejxrVar) throws Throwable {
        eieu eieuVar;
        eieu eieuVar2;
        String str;
        String str2;
        if (((aqsh) this.o.b()).a()) {
            if (messageCoreData.cB() != bajfVar.D()) {
                ekrw ekrwVarJ = h.j();
                ekrwVarJ.X(eksq.a, "BugleDataModel");
                ekrd ekrdVar = (ekrd) ekrwVarJ;
                ekrdVar.Z(eksk.MEDIUM);
                ekrdVar.X(cqnc.b, messageCoreData.C());
                ekrdVar.X(cqnc.s, bajfVar.J());
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/action/InsertNewMessageAction", "logEncryptionStatusDiscrepancy", 800, "InsertNewMessageAction.java")).H("Message and conversation e2ee status different: message=%b, conversation=%b", messageCoreData.cB(), bajfVar.D());
            }
            if (this.m.a() && messageCoreData.cB()) {
                messageCoreData.bu(cbqz.b);
            }
        } else if (bajfVar.D()) {
            if (!messageCoreData.cB()) {
                eksl ekslVar = (eksl) a.j();
                ekslVar.Z(eksk.MEDIUM);
                ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/datamodel/action/InsertNewMessageAction", "doUpdateMessageEncryptionProtocolLegacy", 824, "InsertNewMessageAction.java")).t("InsertNewMessageAction: encryption different between conversation and draft message; draftId = %s", messageCoreData.aI());
            }
            messageCoreData.by();
            if (this.m.a()) {
                messageCoreData.bu(cbqz.b);
            }
        }
        if (((axrj) this.g.b()).j(messageCoreData)) {
            eksl ekslVar2 = (eksl) a.h();
            ekslVar2.X(cqnc.b, messageCoreData.C());
            ekrz ekrzVar = coie.j;
            MessagePartCoreData messagePartCoreDataH = messageCoreData.H();
            messagePartCoreDataH.getClass();
            ekslVar2.X(ekrzVar, messagePartCoreDataH.z());
            ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/datamodel/action/InsertNewMessageAction", "startEarlySend", 744, "InsertNewMessageAction.java")).q("InsertNewMessageAction: Early send with file transfer, calling the pipeline.");
            auvh.h(((atgy) this.f.i.b()).c(messageCoreData));
            return;
        }
        eieu eieuVarK = eiiy.k("InsertNewMessageAction::buildMessageIdentityProtos");
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) ejxrVar.get()).iterator();
            while (it.hasNext()) {
                eieuVar = eieuVarK;
                try {
                    arrayList.add(alre.d((alqm) it.next()));
                    eieuVarK = eieuVar;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    try {
                        eieuVar.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
            eieuVarK.close();
            if (messageCoreData.F().i()) {
                messageCoreData.cd(((auau) this.f.a.b()).a());
            }
            eieu eieuVarK2 = eiiy.k("InsertNewMessageAction::createSendMessageAction");
            try {
                eieu eieuVarK3 = eiiy.k("InsertNewMessageAction::createSendMessageAction::create");
                eieuVar2 = eieuVarK2;
                try {
                    try {
                        ?? A = ((ayql) this.l.b()).a();
                        eieuVarK3.close();
                        if (((asbr) this.f.f.b()).a()) {
                            str = "InsertNewMessageAction.java";
                            str2 = "com/google/android/apps/messaging/shared/datamodel/action/InsertNewMessageAction";
                            A.v.p("is_early_send", false);
                        } else {
                            str = "InsertNewMessageAction.java";
                            str2 = "com/google/android/apps/messaging/shared/datamodel/action/InsertNewMessageAction";
                            A.v.p("is_early_send", true);
                        }
                        aymo aymoVar = A.v;
                        aymoVar.s("rcs_session_id", bajfVar.e());
                        aymoVar.t("message", messageCoreData);
                        aymoVar.r("sub_id", i);
                        aymoVar.u("remote_messaging_identities", arrayList);
                        aymo aymoVar2 = this.v;
                        aymoVar.p("is_rbm_conversation", aymoVar2.y("has_rbm_bot_recipient"));
                        aymoVar.p("is_rcs_group", bajfVar.Q());
                        aymoVar.t("secondary_device", aymoVar2.h("secondary_device"));
                        aymoVar.t("message_usage_stats_data", aymoVar2.h("message_usage_stats_data"));
                        aymoVar.r("message_source", aymoVar2.a("message_source"));
                        aymoVar.s("sent_realtime", aymoVar2.d("sent_realtime"));
                        aymoVar.r("locked_default_sms_sub_id", i2);
                        aymoVar.p("update_draft", aymoVar2.y("update_draft"));
                        aymoVar.v("archive", aymoVar2.l("archive"));
                        aymoVar.p("should_refresh_notification", aymoVar2.y("should_refresh_notification"));
                        aymoVar.p("from_notification", aymoVar2.y("from_notification"));
                        aymoVar.p("ui_has_been_notified", z);
                        eieuVar2.close();
                        eieu eieuVarK4 = eiiy.k("InsertNewMessageAction::startSendMessageActionForEarlySend");
                        try {
                            ((eksl) ((eksl) a.h()).h(str2, "startEarlySend", 776, str)).q("InsertNewMessageAction: Starting early send");
                            A.j();
                            eieuVarK4.close();
                        } finally {
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        Throwable th5 = th;
                        try {
                            eieuVar2.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } finally {
                }
            } catch (Throwable th7) {
                th = th7;
                eieuVar2 = eieuVarK2;
            }
        } catch (Throwable th8) {
            th = th8;
            eieuVar = eieuVarK;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00e4 A[Catch: all -> 0x012d, TRY_ENTER, TryCatch #1 {all -> 0x012d, blocks: (B:3:0x0006, B:6:0x000f, B:9:0x0017, B:11:0x001d, B:14:0x0027, B:17:0x0037, B:20:0x003f, B:23:0x004b, B:26:0x005f, B:29:0x006f, B:31:0x0083, B:34:0x0091, B:35:0x0095, B:37:0x009b, B:40:0x00a9, B:43:0x00e4, B:44:0x0103), top: B:56:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0103 A[Catch: all -> 0x012d, TRY_LEAVE, TryCatch #1 {all -> 0x012d, blocks: (B:3:0x0006, B:6:0x000f, B:9:0x0017, B:11:0x001d, B:14:0x0027, B:17:0x0037, B:20:0x003f, B:23:0x004b, B:26:0x005f, B:29:0x006f, B:31:0x0083, B:34:0x0091, B:35:0x0095, B:37:0x009b, B:40:0x00a9, B:43:0x00e4, B:44:0x0103), top: B:56:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r6, int r7, defpackage.ejxr r8) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.action.InsertNewMessageAction.j(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, int, ejxr):boolean");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public InsertNewMessageAction(fcsu fcsuVar, fcsu fcsuVar2, dqsn dqsnVar, alrj alrjVar, cgdh cgdhVar, fcsu fcsuVar3, fcsu fcsuVar4, axqb axqbVar, fcsu fcsuVar5, fcsu fcsuVar6, arnv arnvVar, aqzn aqznVar, fcsu fcsuVar7, Parcel parcel) {
        super(parcel, elgm.INSERT_NEW_MESSAGE_ACTION);
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = dqsnVar;
        this.e = alrjVar;
        this.i = cgdhVar;
        this.j = fcsuVar3;
        this.k = fcsuVar4;
        this.f = axqbVar;
        this.g = fcsuVar5;
        this.l = fcsuVar6;
        this.m = arnvVar;
        this.n = aqznVar;
        this.o = fcsuVar7;
    }

    public InsertNewMessageAction(fcsu fcsuVar, fcsu fcsuVar2, dqsn dqsnVar, alrj alrjVar, cgdh cgdhVar, fcsu fcsuVar3, fcsu fcsuVar4, axqb axqbVar, fcsu fcsuVar5, fcsu fcsuVar6, arnv arnvVar, aqzn aqznVar, fcsu fcsuVar7, MessageCoreData messageCoreData, boolean z, elny elnyVar, bvdk bvdkVar, int i, Optional optional, long j, boolean z2) {
        super(elgm.INSERT_NEW_MESSAGE_ACTION);
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = dqsnVar;
        this.e = alrjVar;
        this.i = cgdhVar;
        this.j = fcsuVar3;
        this.k = fcsuVar4;
        this.f = axqbVar;
        this.g = fcsuVar5;
        this.l = fcsuVar6;
        this.m = arnvVar;
        this.n = aqznVar;
        this.o = fcsuVar7;
        this.v.t("message", messageCoreData);
        this.v.p("update_draft", z);
        if (elnyVar != null) {
            this.v.r("message_source", elnyVar.M);
        }
        if (bvdkVar != null) {
            this.v.v("archive", bvdkVar.name());
        }
        this.v.r("sub_id", i);
        if (optional.isPresent()) {
            this.v.r("locked_default_sms_sub_id", ((Integer) optional.get()).intValue());
        }
        this.v.s("sent_realtime", j);
        if (messageCoreData.z() != null) {
            this.v.t("message_usage_stats_data", messageCoreData.z());
        }
        this.v.p("from_notification", false);
        this.v.p("should_refresh_notification", z2);
    }
}

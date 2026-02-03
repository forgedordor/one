package com.google.android.apps.messaging.shared.datamodel.action;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.InsertRcsMessageInTelephonyAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.contrib.android.ProtoParsers;
import defpackage.aluz;
import defpackage.alvx;
import defpackage.aprl;
import defpackage.aubq;
import defpackage.axrr;
import defpackage.aymo;
import defpackage.ayph;
import defpackage.cavl;
import defpackage.cawa;
import defpackage.cczv;
import defpackage.chvp;
import defpackage.cqce;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.ejvr;
import defpackage.elgm;
import defpackage.eooz;
import defpackage.eoqg;
import defpackage.eosc;
import defpackage.fcsu;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class InsertRcsMessageInTelephonyAction extends Action<Void> implements Parcelable {
    public final fcsu b;
    public final chvp c;
    public final cavl d;
    public final eosc e;
    public final fcsu f;
    public final fcsu g;
    public final aprl h;
    public final cawa i;
    private final eosc j;
    public static final cqce a = cqce.g("BugleDataModel", "InsertRcsMessageInTelephonyAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new axrr();

    /* compiled from: PG */
    public interface a {
        ayph aW();
    }

    public InsertRcsMessageInTelephonyAction(Parcel parcel, fcsu fcsuVar, chvp chvpVar, cavl cavlVar, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar2, fcsu fcsuVar3, aprl aprlVar, cawa cawaVar) {
        super(parcel, elgm.INSERT_RCS_MESSAGE_IN_TELEPHONY_ACTION);
        this.b = fcsuVar;
        this.c = chvpVar;
        this.d = cavlVar;
        this.e = eoscVar;
        this.j = eoscVar2;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.h = aprlVar;
        this.i = cawaVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("InsertRcsMessageInTelephonyAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        v();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.InsertRcsMessageInTelephony.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eiju fQ() {
        final aymo aymoVar = this.v;
        final String strL = aymoVar.l("conversationId");
        Callable callable = new Callable() { // from class: axrn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cnqj cnqjVarA = ((avmr) this.a.g.b()).a(barn.b(strL));
                if (cnqjVarA.c()) {
                    return Long.valueOf(cnqjVarA.a());
                }
                return -1L;
            }
        };
        eosc eoscVar = this.j;
        return eijx.g(callable, eoscVar).i(new eooz() { // from class: axrk
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                alqm alqmVarU;
                eiju eijuVarO;
                long jLongValue = ((Long) obj).longValue();
                aymo aymoVar2 = aymoVar;
                MessageIdType messageIdTypeB = bary.b(aymoVar2.l("messageId"));
                cczv cczvVar = alvx.a;
                boolean zBooleanValue = ((Boolean) new aluz().get()).booleanValue();
                final InsertRcsMessageInTelephonyAction insertRcsMessageInTelephonyAction = this.a;
                if (zBooleanValue && aymoVar2.x("remoteChatEndpoint")) {
                    alqmVarU = ((alrj) insertRcsMessageInTelephonyAction.f.b()).b((aubq) ((evwl) aymoVar2.h("remoteChatEndpoint")).a(aubq.a, evrr.a()));
                } else {
                    alqmVarU = ((alrj) insertRcsMessageInTelephonyAction.f.b()).u(aymoVar2.l("senderId"), aymoVar2.a("subId"));
                }
                int iA = aymoVar2.a("subId");
                String strL2 = aymoVar2.l("rcsConferenceUri");
                final boolean zY = aymoVar2.y("scheduleBusinessInfoDownload");
                MessageCoreData messageCoreDataW = ((baxe) insertRcsMessageInTelephonyAction.b.b()).w(messageIdTypeB);
                final String strB = ejwk.b(alqmVarU.i(((Boolean) new aluz().get()).booleanValue()));
                if (messageCoreDataW == null) {
                    cqbd cqbdVarB = InsertRcsMessageInTelephonyAction.a.b();
                    cqbdVarB.I("Cannot write message to telephony. Unable to read message");
                    cqbdVarB.A("messageId", messageIdTypeB);
                    cqbdVarB.r();
                    return eijx.e(null);
                }
                if (insertRcsMessageInTelephonyAction.h.a() && insertRcsMessageInTelephonyAction.c.p(messageCoreDataW.A())) {
                    cavx cavxVar = (cavx) cavz.a.createBuilder();
                    String str = messageCoreDataW.F().b;
                    str.getClass();
                    cavxVar.copyOnWrite();
                    ((cavz) cavxVar.instance).c = str;
                    cavxVar.copyOnWrite();
                    ((cavz) cavxVar.instance).d = cavy.a(3);
                    cavxVar.copyOnWrite();
                    cavz cavzVar = (cavz) cavxVar.instance;
                    cavzVar.b |= 1;
                    cavzVar.e = jLongValue;
                    alwl alwlVarC = alre.c(alqmVarU);
                    cavxVar.copyOnWrite();
                    cavz cavzVar2 = (cavz) cavxVar.instance;
                    alwlVarC.getClass();
                    cavzVar2.f = alwlVarC;
                    cavzVar2.b |= 2;
                    cavxVar.copyOnWrite();
                    cavz cavzVar3 = (cavz) cavxVar.instance;
                    cavzVar3.b |= 8;
                    cavzVar3.h = iA;
                    if (strL2 != null) {
                        cavxVar.copyOnWrite();
                        cavz cavzVar4 = (cavz) cavxVar.instance;
                        cavzVar4.b |= 4;
                        cavzVar4.g = strL2;
                    }
                    cawa cawaVar = insertRcsMessageInTelephonyAction.i;
                    cavz cavzVar5 = (cavz) cavxVar.build();
                    caxr caxrVar = new caxr();
                    String str2 = messageCoreDataW.F().b;
                    str2.getClass();
                    caxrVar.b = str2;
                    String str3 = messageCoreDataW.F().b;
                    str3.getClass();
                    caxrVar.d = str3;
                    eijuVarO = ((cazj) cawaVar.a.b()).a(cbcu.g("rcs_to_telephony_sync", cavzVar5, caxrVar.a())).b().h(new ejvr() { // from class: axrp
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            cqce cqceVar = InsertRcsMessageInTelephonyAction.a;
                            return null;
                        }
                    }, insertRcsMessageInTelephonyAction.e);
                } else {
                    eijuVarO = insertRcsMessageInTelephonyAction.c.o(messageCoreDataW, jLongValue, alqmVarU, strL2, iA);
                }
                return eijuVarO.i(new eooz() { // from class: axrm
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        final Uri uri = (Uri) obj2;
                        if (!zY) {
                            return eijx.e(uri);
                        }
                        String str4 = strB;
                        InsertRcsMessageInTelephonyAction insertRcsMessageInTelephonyAction2 = insertRcsMessageInTelephonyAction;
                        cavh cavhVar = (cavh) cavk.a.createBuilder();
                        cavhVar.copyOnWrite();
                        ((cavk) cavhVar.instance).b = str4;
                        cavhVar.copyOnWrite();
                        ((cavk) cavhVar.instance).d = cavj.a(6);
                        cavhVar.copyOnWrite();
                        ((cavk) cavhVar.instance).c = cavi.a(3);
                        cavk cavkVar = (cavk) cavhVar.build();
                        caxr caxrVar2 = new caxr();
                        caxrVar2.a = str4;
                        caxrVar2.b = str4;
                        return insertRcsMessageInTelephonyAction2.d.a(cavkVar, caxrVar2.a()).h(new ejvr() { // from class: axro
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                cqce cqceVar = InsertRcsMessageInTelephonyAction.a;
                                return uri;
                            }
                        }, insertRcsMessageInTelephonyAction2.e);
                    }
                }, insertRcsMessageInTelephonyAction.e);
            }
        }, eoscVar).h(new ejvr() { // from class: axrl
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = InsertRcsMessageInTelephonyAction.a;
                return null;
            }
        }, eoqg.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public InsertRcsMessageInTelephonyAction(ConversationIdType conversationIdType, MessageIdType messageIdType, aubq aubqVar, int i, Optional optional, boolean z, fcsu fcsuVar, chvp chvpVar, cavl cavlVar, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar2, fcsu fcsuVar3, aprl aprlVar, cawa cawaVar) {
        super(elgm.INSERT_RCS_MESSAGE_IN_TELEPHONY_ACTION);
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.v.v("messageId", messageIdType.b());
        cczv cczvVar = alvx.a;
        if (((Boolean) new aluz().get()).booleanValue()) {
            this.v.t("remoteChatEndpoint", new ProtoParsers.InternalDontUse(null, aubqVar));
        }
        this.v.v("senderId", aubqVar.d);
        this.v.r("subId", i);
        this.v.p("scheduleBusinessInfoDownload", z);
        optional.ifPresent(new Consumer() { // from class: axrq
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                this.a.v.v("rcsConferenceUri", (String) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.b = fcsuVar;
        this.c = chvpVar;
        this.d = cavlVar;
        this.e = eoscVar;
        this.j = eoscVar2;
        this.v.v("conversationId", conversationIdType.a());
        this.h = aprlVar;
        this.i = cawaVar;
    }
}

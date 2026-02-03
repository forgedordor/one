package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.aika;
import defpackage.aipo;
import defpackage.aiyt;
import defpackage.ajhd;
import defpackage.anty;
import defpackage.aprr;
import defpackage.auvw;
import defpackage.awlc;
import defpackage.axkf;
import defpackage.axsh;
import defpackage.axuq;
import defpackage.axur;
import defpackage.axut;
import defpackage.axvz;
import defpackage.axwa;
import defpackage.axwf;
import defpackage.axwg;
import defpackage.axwp;
import defpackage.axwq;
import defpackage.ayeo;
import defpackage.aymo;
import defpackage.ayqd;
import defpackage.bahv;
import defpackage.barn;
import defpackage.bary;
import defpackage.bbdl;
import defpackage.bbfn;
import defpackage.bbhh;
import defpackage.bxlc;
import defpackage.bydb;
import defpackage.byeb;
import defpackage.ckxh;
import defpackage.cmop;
import defpackage.cmoq;
import defpackage.cmos;
import defpackage.cmqf;
import defpackage.cmqj;
import defpackage.cmvy;
import defpackage.cogw;
import defpackage.cqaz;
import defpackage.cqjy;
import defpackage.cqnc;
import defpackage.crtq;
import defpackage.dghj;
import defpackage.dqsn;
import defpackage.dzuc;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.eiju;
import defpackage.ekrd;
import defpackage.ekrg;
import defpackage.ekrw;
import defpackage.eksq;
import defpackage.elgm;
import defpackage.eyig;
import defpackage.fcsu;
import defpackage.fcyh;
import defpackage.fcyi;
import defpackage.fdjx;
import defpackage.fdjz;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ProcessDownloadedMmsAction extends Action<MessageCoreData> {
    private final fcsu b;
    private final fcsu c;
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/action/ProcessDownloadedMmsAction");
    public static final Parcelable.Creator<Action<MessageCoreData>> CREATOR = new axuq();

    /* compiled from: PG */
    public interface a {
        axut hU();
    }

    public ProcessDownloadedMmsAction(fcsu fcsuVar, fcsu fcsuVar2, int i, Bundle bundle) {
        super(elgm.PROCESS_DOWNLOADED_MMS_ACTION);
        this.b = fcsuVar;
        this.c = fcsuVar2;
        MessageIdType messageIdTypeB = bary.b(bundle.getString("message_id"));
        Uri uri = (Uri) bundle.getParcelable("content_uri");
        Uri uri2 = (Uri) bundle.getParcelable("notification_uri");
        ConversationIdType conversationIdTypeB = barn.b(bundle.getString("conversation_id"));
        String string = bundle.getString("participant_id");
        cqaz.l(messageIdTypeB);
        cqaz.l(uri);
        cqaz.l(uri2);
        cqaz.l(conversationIdTypeB);
        cqaz.l(string);
        this.v.p("downloaded_by_mms_api_or_lib", true);
        this.v.v("message_id", messageIdTypeB.b());
        this.v.r("result_code", i);
        this.v.r("http_status_code", bundle.getInt("android.telephony.extra.MMS_HTTP_STATUS", 0));
        this.v.t("content_uri", uri);
        this.v.t("notification_uri", uri2);
        this.v.r("sub_id", bundle.getInt("sub_id", -1));
        this.v.v("sub_phone_number", bundle.getString("sub_phone_number"));
        this.v.v("transaction_id", bundle.getString("transaction_id"));
        this.v.v("content_location", bundle.getString("content_location"));
        this.v.p("auto_download", bundle.getBoolean("auto_download"));
        this.v.s("received_timestamp", bundle.getLong("received_timestamp"));
        this.v.v("conversation_id", conversationIdTypeB.a());
        this.v.v("participant_id", string);
        this.v.r("status_if_failed", bundle.getInt("status_if_failed"));
        this.v.s("message_logging_id", bundle.getLong("message_logging_id"));
        this.v.r("mms_last_connection_failure_cause_code", bundle.getInt("android.telephony.extra.LAST_CONNECTION_FAILURE_CAUSE_CODE"));
        if (bundle.getBoolean("android.telephony.extra.EXTRA_HANDLED_BY_CARRIER_APP")) {
            this.v.r("mms_api", 3);
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("ProcessDownloadedMmsAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ProcessDownloadedMms.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eiju e() {
        aymo aymoVar = this.v;
        axur axurVarH = h();
        aymoVar.getClass();
        if (((Boolean) axwp.b().e()).booleanValue()) {
            axwp axwpVar = (axwp) axurVarH;
            return auvw.c(axwpVar.t, fcyi.a, fdjz.a, new axvz(axwpVar, null));
        }
        axwp axwpVar2 = (axwp) axurVarH;
        return auvw.c(axwpVar2.u, fcyi.a, fdjz.a, new axwa(axwpVar2, null));
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eiju fR() {
        axur axurVarH = h();
        if (((Boolean) axwp.b().e()).booleanValue()) {
            axwp axwpVar = (axwp) axurVarH;
            return auvw.c(axwpVar.t, fcyi.a, fdjz.a, new axwf(axwpVar, null));
        }
        axwp axwpVar2 = (axwp) axurVarH;
        return auvw.c(axwpVar2.u, fcyi.a, fdjz.a, new axwg(axwpVar2, null));
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final boolean fT() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v85, types: [eygg, java.lang.Object] */
    final axur h() {
        aymo aymoVar = this.v;
        if (TextUtils.isEmpty(aymoVar.l("sub_phone_number"))) {
            int iB = aymoVar.b("sub_id", -1);
            if (iB == -1) {
                ekrw ekrwVarJ = a.j();
                ekrwVarJ.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/action/ProcessDownloadedMmsAction", "populateRcsSelfNumberIfRawIsAbsent", 362, "ProcessDownloadedMmsAction.java")).q("Missing subId when downloading MMS");
            } else {
                Optional map = ((dghj) this.c.b()).g(iB).map(new Function() { // from class: axuo
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((dggk) obj).a;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                ekrw ekrwVarJ2 = a.j();
                ekrwVarJ2.X(eksq.a, "Bugle");
                ekrd ekrdVar = (ekrd) ekrwVarJ2;
                ekrdVar.X(cqnc.w, Integer.valueOf(iB));
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/action/ProcessDownloadedMmsAction", "populateRcsSelfNumberIfRawIsAbsent", 374, "ProcessDownloadedMmsAction.java")).t("Missing self number when downloading MMS, fallback to RCS number on the sub: %s", Boolean.valueOf(map.isPresent()));
                map.ifPresent(new Consumer() { // from class: axup
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        this.a.v.v("sub_phone_number", (String) obj);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }
        axwq axwqVar = (axwq) this.b.b();
        Context context = (Context) axwqVar.a.b();
        context.getClass();
        cogw cogwVar = (cogw) axwqVar.b.b();
        cogwVar.getClass();
        cmos cmosVar = (cmos) axwqVar.c.b();
        cmosVar.getClass();
        cmvy cmvyVar = (cmvy) axwqVar.d.b();
        cmvyVar.getClass();
        fcsu fcsuVar = axwqVar.e;
        bbhh bbhhVar = (bbhh) axwqVar.f.b();
        bbhhVar.getClass();
        Optional optional = (Optional) axwqVar.g.b();
        optional.getClass();
        byeb byebVar = (byeb) axwqVar.h.b();
        byebVar.getClass();
        ajhd ajhdVar = (ajhd) axwqVar.i.b();
        ajhdVar.getClass();
        ((aika) axwqVar.j.b()).getClass();
        fcsu fcsuVar2 = axwqVar.k;
        fcsu fcsuVar3 = axwqVar.l;
        fcsu fcsuVar4 = axwqVar.m;
        fcsu fcsuVar5 = axwqVar.n;
        fcsu fcsuVar6 = axwqVar.o;
        fcsu fcsuVar7 = axwqVar.p;
        aipo aipoVar = (aipo) axwqVar.q.b();
        aipoVar.getClass();
        crtq crtqVar = (crtq) axwqVar.r.b();
        crtqVar.getClass();
        fcsu fcsuVar8 = axwqVar.s;
        cmqj cmqjVar = (cmqj) axwqVar.t.b();
        cmqjVar.getClass();
        fcsu fcsuVar9 = axwqVar.u;
        bbdl bbdlVar = (bbdl) axwqVar.v.b();
        bbdlVar.getClass();
        cmop cmopVar = (cmop) axwqVar.w.b();
        cmopVar.getClass();
        axkf axkfVar = (axkf) axwqVar.x.b();
        axkfVar.getClass();
        cmoq cmoqVar = (cmoq) axwqVar.y.b();
        cmoqVar.getClass();
        ayqd ayqdVar = (ayqd) axwqVar.z.b();
        ayqdVar.getClass();
        bxlc bxlcVar = (bxlc) axwqVar.A.b();
        bxlcVar.getClass();
        bbfn bbfnVar = (bbfn) axwqVar.B.b();
        bbfnVar.getClass();
        dqsn dqsnVar = (dqsn) axwqVar.C.b();
        dqsnVar.getClass();
        ayeo ayeoVar = (ayeo) axwqVar.D.b();
        ayeoVar.getClass();
        axsh axshVar = (axsh) axwqVar.E.b();
        axshVar.getClass();
        bahv bahvVar = (bahv) axwqVar.F.b();
        bahvVar.getClass();
        cqjy cqjyVar = (cqjy) axwqVar.G.b();
        cqjyVar.getClass();
        cmqf cmqfVar = (cmqf) axwqVar.H.b();
        cmqfVar.getClass();
        bydb bydbVar = (bydb) axwqVar.I.b();
        bydbVar.getClass();
        ckxh ckxhVar = (ckxh) axwqVar.J.b();
        ckxhVar.getClass();
        aiyt aiytVar = (aiyt) axwqVar.K.b();
        aiytVar.getClass();
        fcsu fcsuVar10 = axwqVar.L;
        Optional optional2 = (Optional) ((eyig) axwqVar.M).a;
        fcsu fcsuVar11 = axwqVar.N;
        fcsu fcsuVar12 = axwqVar.O;
        fdjx fdjxVar = (fdjx) axwqVar.P.b();
        fdjxVar.getClass();
        fdjx fdjxVar2 = (fdjx) axwqVar.Q.b();
        fdjxVar2.getClass();
        fcyh fcyhVar = (fcyh) axwqVar.R.b();
        fcyhVar.getClass();
        fcyh fcyhVar2 = (fcyh) axwqVar.S.b();
        fcyhVar2.getClass();
        fcsu fcsuVar13 = axwqVar.T;
        fcsu fcsuVar14 = axwqVar.U;
        fcsu fcsuVar15 = axwqVar.V;
        fcsu fcsuVar16 = axwqVar.W;
        ?? B = axwqVar.X.b();
        B.getClass();
        fcsu fcsuVar17 = axwqVar.Y;
        dzuc dzucVar = (dzuc) axwqVar.Z.b();
        dzucVar.getClass();
        fcsu fcsuVar18 = axwqVar.aa;
        fcsu fcsuVar19 = axwqVar.ab;
        fcsu fcsuVar20 = axwqVar.ac;
        fcsu fcsuVar21 = axwqVar.ad;
        fcsu fcsuVar22 = axwqVar.ae;
        fcsu fcsuVar23 = axwqVar.af;
        fcsu fcsuVar24 = axwqVar.ag;
        fcsu fcsuVar25 = axwqVar.ah;
        aprr aprrVar = (aprr) axwqVar.ai.b();
        aprrVar.getClass();
        fcsu fcsuVar26 = axwqVar.aj;
        fcsu fcsuVar27 = axwqVar.ak;
        fcsu fcsuVar28 = axwqVar.al;
        fcsu fcsuVar29 = axwqVar.am;
        fcsu fcsuVar30 = axwqVar.an;
        fcsu fcsuVar31 = axwqVar.ao;
        fcsu fcsuVar32 = axwqVar.ap;
        fcsu fcsuVar33 = axwqVar.aq;
        fcsu fcsuVar34 = axwqVar.ar;
        fcsu fcsuVar35 = axwqVar.as;
        awlc awlcVar = (awlc) axwqVar.at.b();
        awlcVar.getClass();
        anty antyVar = (anty) axwqVar.au.b();
        antyVar.getClass();
        return new axwp(context, cogwVar, cmosVar, cmvyVar, fcsuVar, bbhhVar, optional, byebVar, ajhdVar, fcsuVar2, fcsuVar3, fcsuVar4, fcsuVar5, fcsuVar6, fcsuVar7, aipoVar, crtqVar, fcsuVar8, cmqjVar, fcsuVar9, bbdlVar, cmopVar, axkfVar, cmoqVar, ayqdVar, bxlcVar, bbfnVar, dqsnVar, ayeoVar, axshVar, bahvVar, cqjyVar, cmqfVar, bydbVar, ckxhVar, aiytVar, fcsuVar10, optional2, fcsuVar11, fcsuVar12, fdjxVar, fdjxVar2, fcyhVar, fcyhVar2, fcsuVar13, fcsuVar14, fcsuVar16, B, dzucVar, fcsuVar18, fcsuVar19, fcsuVar20, fcsuVar21, fcsuVar22, fcsuVar24, fcsuVar25, aprrVar, fcsuVar26, fcsuVar27, fcsuVar28, fcsuVar30, fcsuVar33, awlcVar, antyVar, axwqVar.av, axwqVar.aw, axwqVar.ax, axwqVar.ay, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ProcessDownloadedMmsAction(fcsu fcsuVar, fcsu fcsuVar2, int i, String str, String[] strArr, String[] strArr2, Bundle bundle) {
        super(elgm.PROCESS_DOWNLOADED_MMS_ACTION);
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.v.p("downloaded_by_mms_api_or_lib", false);
        if (str != null) {
            this.v.v("cloud_sync_id", str);
        }
        this.v.w("attachments_types", strArr);
        this.v.w("attachments_values", strArr2);
        this.v.r("status", i);
        this.v.p("auto_download", bundle.getBoolean("auto_download"));
        this.v.r("status_if_failed", bundle.getInt("status_if_failed"));
    }

    public ProcessDownloadedMmsAction(fcsu fcsuVar, fcsu fcsuVar2, Parcel parcel) {
        super(parcel, elgm.PROCESS_DOWNLOADED_MMS_ACTION);
        this.b = fcsuVar;
        this.c = fcsuVar2;
    }

    public ProcessDownloadedMmsAction(fcsu fcsuVar, fcsu fcsuVar2, MessageIdType messageIdType, ConversationIdType conversationIdType, String str, int i, int i2, String str2) {
        super(elgm.PROCESS_DOWNLOADED_MMS_ACTION);
        cqaz.l(messageIdType);
        cqaz.l(conversationIdType);
        cqaz.l(str);
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.v.p("downloaded_by_mms_api_or_lib", false);
        this.v.v("message_id", messageIdType.b());
        this.v.r("status", 2);
        this.v.r("raw_status", 0);
        this.v.v("conversation_id", conversationIdType.a());
        this.v.v("participant_id", str);
        this.v.r("status_if_failed", i);
        this.v.r("sub_id", i2);
        this.v.v("transaction_id", str2);
    }

    public ProcessDownloadedMmsAction(fcsu fcsuVar, fcsu fcsuVar2, MessageIdType messageIdType, Uri uri, ConversationIdType conversationIdType, String str, Uri uri2, int i, String str2, int i2, boolean z, String str3, int i3) {
        super(elgm.PROCESS_DOWNLOADED_MMS_ACTION);
        cqaz.l(messageIdType);
        cqaz.l(uri);
        cqaz.l(conversationIdType);
        cqaz.l(str);
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.v.p("downloaded_by_mms_api_or_lib", true);
        this.v.v("message_id", messageIdType.b());
        this.v.r("result_code", i3);
        this.v.t("notification_uri", uri);
        this.v.r("sub_id", i);
        this.v.v("sub_phone_number", str2);
        this.v.v("content_location", uri2.toString());
        this.v.p("auto_download", z);
        this.v.v("conversation_id", conversationIdType.a());
        this.v.v("participant_id", str);
        this.v.r("status_if_failed", i2);
        this.v.v("transaction_id", str3);
    }

    public ProcessDownloadedMmsAction(fcsu fcsuVar, fcsu fcsuVar2, MessageIdType messageIdType, String str, String str2, int i) {
        super(elgm.PROCESS_DOWNLOADED_MMS_ACTION);
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.v.v("message_id", messageIdType.b());
        this.v.v("transaction_id", str);
        this.v.v("content_location", str2);
        this.v.p("send_deferred_resp_status", true);
        this.v.r("sub_id", i);
    }
}

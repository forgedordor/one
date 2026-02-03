package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.wearable.action.CheckWearableAppVersionAction;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dasy extends cayv {
    public static final eksp a = eksp.c("BugleWearable");
    static final cczv b = cdag.e(cdag.b, "sync_data_to_wearable_app_backoff_duration_ms", 500);
    public final Context c;
    public final dens d;
    public final fcsu e;
    public final fcsu f;
    public final eosc g;
    public final fcsu h;
    public final eosc i;
    public final fcsu j;
    public final fcsu k;
    private final fcsu l;
    private final fcsu m;
    private final fcsu n;
    private final fcsu o;
    private final fcsu p;
    private final fcsu q;
    private dzub r;

    public dasy(Context context, dens densVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11) {
        this.c = context;
        this.d = densVar;
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.l = fcsuVar3;
        this.m = fcsuVar4;
        this.n = fcsuVar5;
        this.o = fcsuVar6;
        this.g = eoscVar;
        this.h = fcsuVar7;
        this.i = eoscVar2;
        this.j = fcsuVar8;
        this.p = fcsuVar9;
        this.q = fcsuVar10;
        this.k = fcsuVar11;
    }

    public static dzis k(dcff dcffVar) {
        return new dziu(ctag.a(dcffVar));
    }

    public static dzis l(dcff dcffVar) {
        return new dziu(ctah.a(dcffVar.a()));
    }

    public static void m(Throwable th, String str) {
        eksl ekslVar = (eksl) ((eksl) a.j()).g(th);
        ekslVar.X(cqnc.S, "SyncDataToWearableAppHandler");
        ((eksl) ekslVar.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandler", "logWarning", 642, "SyncDataToWearableAppHandler.java")).q(str);
    }

    private final boolean o() {
        return ((ctap) this.o.b()).b();
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        ((caxk) caxzVarL).d = Duration.ofMillis(((Integer) b.e()).intValue());
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("SyncDataToWearableAppHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return caxy.a.getParserForType();
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final String f() {
        return "wear_sync_queue";
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final /* synthetic */ boolean h(evuh evuhVar) {
        boolean z;
        eieu eieuVarK = eiiy.k("SyncDataToWearableAppHandler#preflight");
        try {
            if (o()) {
                z = true;
            } else {
                ekrw ekrwVarO = a.o();
                ekrwVarO.X(cqnc.S, "SyncDataToWearableAppHandler");
                ((eksl) ekrwVarO.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandler", "preflight", 174, "SyncDataToWearableAppHandler.java")).q("Skipping sync to wear devices.");
                ((ains) this.p.b()).e("Bugle.Wear.SyncRunOnPhone", 4);
                z = false;
            }
            eieuVarK.close();
            return z;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cayv
    public final /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        eieu eieuVarK;
        eksp ekspVar = a;
        eksl ekslVar = (eksl) ekspVar.h();
        ekrz ekrzVar = cqnc.S;
        ekslVar.X(ekrzVar, "SyncDataToWearableAppHandler");
        ((eksl) ekslVar.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandler", "processPendingWorkItemAsync", 217, "SyncDataToWearableAppHandler.java")).q("Start syncing data to wearable devices");
        this.r = ((dzuc) this.q.b()).d();
        if (!o()) {
            eksl ekslVar2 = (eksl) ekspVar.g();
            ekslVar2.X(ekrzVar, "SyncDataToWearableAppHandler");
            ((eksl) ekslVar2.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandler", "processPendingWorkItemAsync", 226, "SyncDataToWearableAppHandler.java")).q("Skip wear sync as the watch is not connected");
            n(7, dzua.CANCEL);
            return eijx.e(cbcw.k());
        }
        Context context = this.c;
        eieu eieuVarK2 = eiiy.k("SyncDataToWearableAppHandler#isWearableAppInstalled");
        try {
            boolean z = context.getSharedPreferences("watch_protocol_version_file", 0).getInt("watch_protocol_version_key", 0) > 0;
            if (!z) {
                eksl ekslVar3 = (eksl) ekspVar.h();
                ekslVar3.X(ekrzVar, "SyncDataToWearableAppHandler");
                ((eksl) ekslVar3.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandler", "isWearableAppInstalled", 615, "SyncDataToWearableAppHandler.java")).q("WATCH_VERSION_KEY is not saved to SharedPreferences.");
            }
            eieuVarK2.close();
            if (!z) {
                CheckWearableAppVersionAction.h();
            }
            eieu eieuVarK3 = eiiy.k("SyncDataToWearableAppHandler#sendPhoneDataToWearable");
            try {
                boolean zG = ((crmx) this.n.b()).G();
                boolean zJ = ((crma) this.l.b()).j();
                int i = zJ ? (zG ? 1 : 0) | 2 : zG ? 1 : 0;
                deoj deojVarB = deoj.b("/bugle/phone_config/");
                denz denzVar = deojVarB.a;
                denzVar.i("1", (byte) i);
                denzVar.l("2", 9);
                denzVar.l("3", ((cmum) this.m.b()).a(-1).e());
                try {
                    eieuVarK = eiiy.k("SyncDataToWearableAppHandler#sendPhoneDataToWearable#putDataItem");
                } catch (IllegalArgumentException e) {
                    m(e, "Failed to sync phone config to data client.");
                }
                try {
                    dens densVar = this.d;
                    PutDataRequest putDataRequestC = deojVarB.c();
                    putDataRequestC.e();
                    densVar.e(putDataRequestC).p(this.g, new defe() { // from class: dasu
                        @Override // defpackage.defe
                        public final void d(Exception exc) {
                            eksp ekspVar2 = dasy.a;
                            if (exc instanceof dcff) {
                                eksl ekslVar4 = (eksl) ((eksl) dasy.a.j()).g(exc);
                                ekslVar4.X(cqnc.S, "SyncDataToWearableAppHandler");
                                dcff dcffVar = (dcff) exc;
                                ((eksl) ekslVar4.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandler", "sendPhoneDataToWearable", 346, "SyncDataToWearableAppHandler.java")).D("Failed to sync phone config to data client with ApiException[status=%s, connectionResult=%s]", dasy.l(dcffVar), dasy.k(dcffVar));
                            }
                        }
                    });
                    eieuVarK.close();
                    if (!zG) {
                        eksl ekslVar4 = (eksl) ekspVar.h();
                        ekslVar4.X(cqnc.S, "SyncDataToWearableAppHandler");
                        ((eksl) ekslVar4.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandler", "sendPhoneDataToWearable", 362, "SyncDataToWearableAppHandler.java")).q("Android Messages is not the default SMS app; skipping wearable sync.");
                    } else {
                        if (zJ) {
                            eieuVarK3.close();
                            eieu eieuVarK4 = eiiy.k("SyncDataToWearableAppHandler#getPreviouslySyncedConversations");
                            try {
                                eiju eijuVarH = eiju.g(drgi.a(this.d.b())).h(new ejvr() { // from class: dast
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj) {
                                        denx denxVar = (denx) obj;
                                        eksp ekspVar2 = dasy.a;
                                        eieu eieuVarK5 = eiiy.k("SyncDataToWearableAppHandler#extractConversationDataMaps");
                                        try {
                                            csq csqVar = new csq();
                                            if (denxVar != null) {
                                                try {
                                                    if (denxVar.b.d()) {
                                                        dcji dcjiVar = new dcji(denxVar);
                                                        while (dcjiVar.hasNext()) {
                                                            denv denvVar = (denv) dcjiVar.next();
                                                            String path = denvVar.a().getPath();
                                                            if (path != null && path.startsWith("/bugle/conversations/")) {
                                                                ConversationIdType conversationIdTypeB = barn.b(denvVar.a().getLastPathSegment());
                                                                if (conversationIdTypeB.b()) {
                                                                    eksl ekslVar5 = (eksl) dasy.a.j();
                                                                    ekslVar5.X(cqnc.S, "SyncDataToWearableAppHandler");
                                                                    ((eksl) ekslVar5.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandler", "extractConversationDataMaps", 410, "SyncDataToWearableAppHandler.java")).q("getPreviousConversations: skipping null conversationId");
                                                                } else {
                                                                    eieu eieuVarK6 = eiiy.k("SyncDataToWearableAppHandler#extractConversationDataMaps#fromDataItem");
                                                                    try {
                                                                        csqVar.put(conversationIdTypeB, deoa.a(denvVar).a);
                                                                        eieuVarK6.close();
                                                                    } finally {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    denxVar.b();
                                                }
                                            }
                                            if (denxVar != null) {
                                            }
                                            eieuVarK5.close();
                                            return csqVar;
                                        } catch (Throwable th) {
                                            try {
                                                eieuVarK5.close();
                                            } catch (Throwable th2) {
                                                th.addSuppressed(th2);
                                            }
                                            throw th;
                                        }
                                    }
                                }, this.g);
                                eieuVarK4.b(eijuVarH);
                                eieuVarK4.close();
                                eiju eijuVarH2 = eijuVarH.h(new ejvr() { // from class: dasv
                                    /* JADX WARN: Finally extract failed */
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj) throws Throwable {
                                        eieu eieuVar;
                                        eieu eieuVar2;
                                        Throwable th;
                                        Throwable th2;
                                        eieu eieuVarK5;
                                        final ConversationIdType conversationIdTypeJ;
                                        deoj deojVarB2;
                                        denz denzVar2;
                                        ArrayList<MessagePartCoreData> arrayList;
                                        fcsu fcsuVar;
                                        cszw cszwVar;
                                        denz denzVar3;
                                        Context context2;
                                        eieu eieuVarK6;
                                        Throwable th3;
                                        badt badtVar;
                                        cszv cszvVar;
                                        ConversationIdType conversationIdTypeJ2;
                                        boolean zQ;
                                        Map map;
                                        cszv cszvVar2;
                                        ArrayList arrayListB;
                                        denz denzVar4;
                                        eieu eieuVar3;
                                        eieu eieuVarK7;
                                        eieu eieuVar4;
                                        Throwable th4;
                                        boolean z2;
                                        cszw cszwVar2;
                                        bxgh bxghVar;
                                        final dasy dasyVar = this.a;
                                        Map map2 = (Map) obj;
                                        eieu eieuVarK8 = eiiy.k("SyncDataToWearableAppHandler#diffPreviouslySyncedAndRecentConversations");
                                        try {
                                            final ArrayList arrayList2 = new ArrayList();
                                            eieu eieuVarK9 = eiiy.k("SyncDataToWearableAppHandler#broadcastMostRecentListOfConversations");
                                            try {
                                                try {
                                                    eiju eijuVarI = ((daqo) dasyVar.h.b()).c(arrayList2).i(new eooz() { // from class: dasm
                                                        @Override // defpackage.eooz
                                                        public final ListenableFuture a(Object obj2) {
                                                            byte[] bArrJ;
                                                            List list = arrayList2;
                                                            ctbm ctbmVar = (ctbm) obj2;
                                                            PutDataRequest putDataRequestA = PutDataRequest.a("/bugle/rpc/proto/v1/conversations_list/");
                                                            eieu eieuVarK10 = eiiy.k("SyncDataToWearableAppHandler#addAttachmentToPutDataRequest");
                                                            try {
                                                                Iterator it = list.iterator();
                                                                while (true) {
                                                                    boolean zHasNext = it.hasNext();
                                                                    dasy dasyVar2 = dasyVar;
                                                                    if (!zHasNext) {
                                                                        eieuVarK10.close();
                                                                        putDataRequestA.c = ctbmVar.toByteArray();
                                                                        eieuVarK10 = eiiy.k("SyncDataToWearableAppHandler#broadcastMostRecentListOfConversations#putDataItem");
                                                                        try {
                                                                            dens densVar2 = dasyVar2.d;
                                                                            putDataRequestA.e();
                                                                            ListenableFuture listenableFutureA = drgi.a(densVar2.e(putDataRequestA));
                                                                            eieuVarK10.b(listenableFutureA);
                                                                            eieuVarK10.close();
                                                                            return listenableFutureA;
                                                                        } finally {
                                                                            try {
                                                                                eieuVarK10.close();
                                                                            } catch (Throwable th5) {
                                                                                th.addSuppressed(th5);
                                                                            }
                                                                        }
                                                                    }
                                                                    MessagePartCoreData messagePartCoreData = (MessagePartCoreData) it.next();
                                                                    ctbo ctboVar = (ctbo) dasyVar2.j.b();
                                                                    messagePartCoreData.getClass();
                                                                    Asset asset = null;
                                                                    if (messagePartCoreData.bj()) {
                                                                        boolean z3 = true;
                                                                        boolean z4 = messagePartCoreData.c() == -1 || messagePartCoreData.c() > 0;
                                                                        if (messagePartCoreData.b() != -1 && messagePartCoreData.b() <= 0) {
                                                                            z3 = false;
                                                                        }
                                                                        if (z4 && z3) {
                                                                            bxgh bxghVar2 = (bxgh) ((bxgr) ctboVar.c.b()).b(new bxev(messagePartCoreData).d((Context) ctboVar.b.b(), 0));
                                                                            if (bxghVar2 != null) {
                                                                                try {
                                                                                    try {
                                                                                        bArrJ = bxghVar2.j();
                                                                                    } finally {
                                                                                    }
                                                                                } catch (bxgg e2) {
                                                                                    eksl ekslVar5 = (eksl) ((eksl) ctbo.a.j()).g(e2);
                                                                                    ekslVar5.X(cqnc.S, "WearableMessageAttachmentAssetBuilder");
                                                                                    ekslVar5.q("Could not get bytes from image type for setting attachment for wearable.");
                                                                                }
                                                                                if (bArrJ != null) {
                                                                                    asset = new Asset(bArrJ, null, null, null);
                                                                                } else {
                                                                                    eksl ekslVar6 = (eksl) ctbo.a.j();
                                                                                    ekslVar6.X(cqnc.S, "WearableMessageAttachmentAssetBuilder");
                                                                                    ekslVar6.q("Null bytes from image.");
                                                                                }
                                                                            }
                                                                        } else {
                                                                            eksl ekslVar7 = (eksl) ctbo.a.j();
                                                                            ekslVar7.X(cqnc.S, "WearableMessageAttachmentAssetBuilder");
                                                                            ekslVar7.X(cqnc.r, messagePartCoreData.A().toString());
                                                                            ekslVar7.X(cqnc.a, messagePartCoreData.B().b());
                                                                            ekslVar7.X(ctbs.b, Integer.valueOf(messagePartCoreData.c()));
                                                                            ekslVar7.X(ctbs.a, Integer.valueOf(messagePartCoreData.b()));
                                                                            ekslVar7.q("Image has invalid dimension.");
                                                                        }
                                                                    }
                                                                    if (asset != null) {
                                                                        int i2 = cszy.a;
                                                                        messagePartCoreData.getClass();
                                                                        String strA = messagePartCoreData.A().a();
                                                                        strA.getClass();
                                                                        String strW = messagePartCoreData.W();
                                                                        strW.getClass();
                                                                        putDataRequestA.d(strA + "-" + strW, asset);
                                                                    }
                                                                }
                                                            } catch (Throwable th6) {
                                                                throw th6;
                                                            }
                                                        }
                                                    }, dasyVar.g);
                                                    ejvr ejvrVar = new ejvr() { // from class: dasp
                                                        @Override // defpackage.ejvr
                                                        public final Object apply(Object obj2) {
                                                            eksl ekslVar5 = (eksl) dasy.a.h();
                                                            ekslVar5.X(cqnc.S, "SyncDataToWearableAppHandler");
                                                            ((eksl) ekslVar5.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandler", "broadcastMostRecentListOfConversations", 552, "SyncDataToWearableAppHandler.java")).q("Successfully synced conversation list to data client");
                                                            return null;
                                                        }
                                                    };
                                                    eosc eoscVar = dasyVar.i;
                                                    eiju eijuVarE = eijuVarI.h(ejvrVar, eoscVar).e(dcff.class, new ejvr() { // from class: dasq
                                                        @Override // defpackage.ejvr
                                                        public final Object apply(Object obj2) {
                                                            dcff dcffVar = (dcff) obj2;
                                                            eksl ekslVar5 = (eksl) ((eksl) dasy.a.j()).g(dcffVar);
                                                            ekslVar5.X(cqnc.S, "SyncDataToWearableAppHandler");
                                                            ((eksl) ekslVar5.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandler", "broadcastMostRecentListOfConversations", 563, "SyncDataToWearableAppHandler.java")).D("Failed to sync conversation list to data client with ApiException[status=%s, connectionResult=%s]", dasy.l(dcffVar), dasy.k(dcffVar));
                                                            return null;
                                                        }
                                                    }, eoscVar).e(Throwable.class, new ejvr() { // from class: dasr
                                                        @Override // defpackage.ejvr
                                                        public final Object apply(Object obj2) {
                                                            eksl ekslVar5 = (eksl) ((eksl) dasy.a.j()).g((Throwable) obj2);
                                                            ekslVar5.X(cqnc.S, "SyncDataToWearableAppHandler");
                                                            ((eksl) ekslVar5.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandler", "broadcastMostRecentListOfConversations", 579, "SyncDataToWearableAppHandler.java")).q("Failed to sync conversation list to data client.");
                                                            return null;
                                                        }
                                                    }, eoscVar);
                                                    eieuVarK9.b(eijuVarE);
                                                    eijuVarE.k(auvh.b(), eoscVar);
                                                    eieuVarK9.close();
                                                    eieu eieuVarK10 = eiiy.k("SyncDataToWearableAppHandler#queryConversationsAndBroadcastV2");
                                                    try {
                                                        try {
                                                            bcvf bcvfVarN = bcvg.n();
                                                            ((bbmq) bcvfVarN).b = true;
                                                            ((bbmq) bcvfVarN).h = 20;
                                                            bcut bcutVar = (bcut) bcvfVarN.a().l().p();
                                                            try {
                                                                badt badtVar2 = (badt) dasyVar.f.b();
                                                                while (bcutVar.moveToNext()) {
                                                                    badtVar2.M(bcutVar);
                                                                    if (!badtVar2.P() && !badtVar2.l().booleanValue()) {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    if (((aqbh) dasyVar.k.b()).a()) {
                                                                                                        try {
                                                                                                            if (badtVar2.m().booleanValue()) {
                                                                                                                continue;
                                                                                                            }
                                                                                                        } catch (Throwable th5) {
                                                                                                            th2 = th5;
                                                                                                            eieuVar = eieuVarK8;
                                                                                                            eieuVar2 = eieuVarK10;
                                                                                                            try {
                                                                                                                bcutVar.close();
                                                                                                                throw th2;
                                                                                                            } catch (Throwable th6) {
                                                                                                                th2.addSuppressed(th6);
                                                                                                                throw th2;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    dens densVar2 = dasyVar.d;
                                                                                                    PutDataRequest putDataRequestC2 = deojVarB2.c();
                                                                                                    putDataRequestC2.e();
                                                                                                    densVar2.e(putDataRequestC2).p(dasyVar.g, new defe() { // from class: dass
                                                                                                        @Override // defpackage.defe
                                                                                                        public final void d(Exception exc) {
                                                                                                            eksp ekspVar2 = dasy.a;
                                                                                                            if (exc instanceof dcff) {
                                                                                                                ConversationIdType conversationIdType = conversationIdTypeJ;
                                                                                                                eksl ekslVar5 = (eksl) ((eksl) dasy.a.j()).g(exc);
                                                                                                                ekslVar5.X(cqnc.S, "SyncDataToWearableAppHandler");
                                                                                                                ekslVar5.X(cqnc.s, conversationIdType);
                                                                                                                dcff dcffVar = (dcff) exc;
                                                                                                                ((eksl) ekslVar5.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandler", "executeDataClientRequest", 511, "SyncDataToWearableAppHandler.java")).D("Failed to sync conversation to data client with ApiException[status=%s, connectionResult=%s]", dasy.l(dcffVar), dasy.k(dcffVar));
                                                                                                            }
                                                                                                        }
                                                                                                    });
                                                                                                    eieuVarK7.close();
                                                                                                    eieuVarK5.close();
                                                                                                    eieuVarK8 = eieuVar;
                                                                                                    map2 = map;
                                                                                                    eieuVarK10 = eieuVar2;
                                                                                                } finally {
                                                                                                }
                                                                                                if (((Boolean) ctan.b.e()).booleanValue()) {
                                                                                                    eieuVarK7 = eiiy.k("SyncDataToWearableAppHandler#executeDataClientRequest#deleteDataItems");
                                                                                                    try {
                                                                                                        dasyVar.d.a(deoj.b("/bugle/rpc/conversation_deleted/" + conversationIdTypeJ.a()).a());
                                                                                                        eieuVarK7.close();
                                                                                                    } finally {
                                                                                                    }
                                                                                                }
                                                                                                eieuVarK7 = eiiy.k("SyncDataToWearableAppHandler#executeDataClientRequest#putDataItem");
                                                                                            } finally {
                                                                                            }
                                                                                            eieuVarK6.close();
                                                                                            if (!arrayList.isEmpty()) {
                                                                                                cszw cszwVar3 = (cszw) fcsuVar.b();
                                                                                                eieu eieuVarK11 = eiiy.k("WearableConversationBuilder#loadNewDataParts");
                                                                                                try {
                                                                                                    for (MessagePartCoreData messagePartCoreData : arrayList) {
                                                                                                        if (messagePartCoreData.bj()) {
                                                                                                            if (messagePartCoreData.c() == -1 || messagePartCoreData.c() > 0) {
                                                                                                                eieuVar4 = eieuVarK11;
                                                                                                                z2 = true;
                                                                                                            } else {
                                                                                                                eieuVar4 = eieuVarK11;
                                                                                                                z2 = false;
                                                                                                            }
                                                                                                            try {
                                                                                                                boolean z3 = messagePartCoreData.b() == -1 || messagePartCoreData.b() > 0;
                                                                                                                if (z2 && z3) {
                                                                                                                    bxgh bxghVar2 = (bxgh) ((bxgr) cszwVar3.d.b()).b(new bxev(messagePartCoreData).d(context2, 0));
                                                                                                                    if (bxghVar2 != null) {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                byte[] bArrJ = bxghVar2.j();
                                                                                                                                if (bArrJ != null) {
                                                                                                                                    cszwVar2 = cszwVar3;
                                                                                                                                    try {
                                                                                                                                        bxghVar = bxghVar2;
                                                                                                                                    } catch (bxgg e2) {
                                                                                                                                        e = e2;
                                                                                                                                        bxghVar = bxghVar2;
                                                                                                                                        eksl ekslVar5 = (eksl) ((eksl) cszw.a.j()).g(e);
                                                                                                                                        ekslVar5.X(cqnc.S, "WearableConversationBuilder");
                                                                                                                                        ((eksl) ekslVar5.h("com/google/android/apps/messaging/shared/wearable/WearableConversationBuilder", "loadImage", 291, "WearableConversationBuilder.java")).q("Could not get bytes from image type for setting attachment for wearable.");
                                                                                                                                        bxghVar.q();
                                                                                                                                        eieuVarK11 = eieuVar4;
                                                                                                                                        cszwVar3 = cszwVar2;
                                                                                                                                    }
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            cszvVar.c(messagePartCoreData.W(), new Asset(bArrJ, null, null, null));
                                                                                                                                        } catch (Throwable th7) {
                                                                                                                                            th = th7;
                                                                                                                                            bxghVar.q();
                                                                                                                                            throw th;
                                                                                                                                        }
                                                                                                                                    } catch (bxgg e3) {
                                                                                                                                        e = e3;
                                                                                                                                        eksl ekslVar52 = (eksl) ((eksl) cszw.a.j()).g(e);
                                                                                                                                        ekslVar52.X(cqnc.S, "WearableConversationBuilder");
                                                                                                                                        ((eksl) ekslVar52.h("com/google/android/apps/messaging/shared/wearable/WearableConversationBuilder", "loadImage", 291, "WearableConversationBuilder.java")).q("Could not get bytes from image type for setting attachment for wearable.");
                                                                                                                                        bxghVar.q();
                                                                                                                                        eieuVarK11 = eieuVar4;
                                                                                                                                        cszwVar3 = cszwVar2;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    cszwVar2 = cszwVar3;
                                                                                                                                    bxghVar = bxghVar2;
                                                                                                                                    eksl ekslVar6 = (eksl) cszw.a.j();
                                                                                                                                    ekslVar6.X(cqnc.S, "WearableConversationBuilder");
                                                                                                                                    ((eksl) ekslVar6.h("com/google/android/apps/messaging/shared/wearable/WearableConversationBuilder", "loadImage", 284, "WearableConversationBuilder.java")).q("Null bytes from image.");
                                                                                                                                }
                                                                                                                            } catch (Throwable th8) {
                                                                                                                                th = th8;
                                                                                                                                bxghVar = bxghVar2;
                                                                                                                            }
                                                                                                                        } catch (bxgg e4) {
                                                                                                                            e = e4;
                                                                                                                            cszwVar2 = cszwVar3;
                                                                                                                        }
                                                                                                                        bxghVar.q();
                                                                                                                        eieuVarK11 = eieuVar4;
                                                                                                                        cszwVar3 = cszwVar2;
                                                                                                                    } else {
                                                                                                                        eieuVarK11 = eieuVar4;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    cszwVar2 = cszwVar3;
                                                                                                                    eksl ekslVar7 = (eksl) cszw.a.j();
                                                                                                                    ekslVar7.X(cqnc.S, "WearableConversationBuilder");
                                                                                                                    ekslVar7.X(cqnc.r, messagePartCoreData.A().toString());
                                                                                                                    ekslVar7.X(cqnc.a, messagePartCoreData.B().b());
                                                                                                                    ekslVar7.X(ctbs.b, Integer.valueOf(messagePartCoreData.c()));
                                                                                                                    ekslVar7.X(ctbs.a, Integer.valueOf(messagePartCoreData.b()));
                                                                                                                    ((eksl) ekslVar7.h("com/google/android/apps/messaging/shared/wearable/WearableConversationBuilder", "loadImage", 262, "WearableConversationBuilder.java")).q("Not syncing image with invalid dimensions.");
                                                                                                                    eieuVarK11 = eieuVar4;
                                                                                                                    cszwVar3 = cszwVar2;
                                                                                                                }
                                                                                                            } catch (Throwable th9) {
                                                                                                                th = th9;
                                                                                                                th4 = th;
                                                                                                                eieuVar4.close();
                                                                                                                throw th4;
                                                                                                            }
                                                                                                        } else {
                                                                                                            try {
                                                                                                                if (messagePartCoreData.aY()) {
                                                                                                                    if (messagePartCoreData.t() == null) {
                                                                                                                        eksl ekslVar8 = (eksl) cszw.a.j();
                                                                                                                        ekslVar8.X(cqnc.S, "WearableConversationBuilder");
                                                                                                                        ekslVar8.X(cqnc.r, messagePartCoreData.A().toString());
                                                                                                                        ekslVar8.X(cqnc.a, messagePartCoreData.B().b());
                                                                                                                        ((eksl) ekslVar8.h("com/google/android/apps/messaging/shared/wearable/WearableConversationBuilder", "loadAudio", 306, "WearableConversationBuilder.java")).q("Not syncing audio with empty uri.");
                                                                                                                    } else {
                                                                                                                        String strW = messagePartCoreData.W();
                                                                                                                        Uri uriT = messagePartCoreData.t();
                                                                                                                        uriT.getClass();
                                                                                                                        cszvVar.c(strW, new Asset(null, null, null, uriT));
                                                                                                                    }
                                                                                                                }
                                                                                                            } catch (Throwable th10) {
                                                                                                                th4 = th10;
                                                                                                                eieuVar4 = eieuVarK11;
                                                                                                                try {
                                                                                                                    eieuVar4.close();
                                                                                                                    throw th4;
                                                                                                                } catch (Throwable th11) {
                                                                                                                    th4.addSuppressed(th11);
                                                                                                                    throw th4;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    eieuVarK11.close();
                                                                                                } catch (Throwable th12) {
                                                                                                    th = th12;
                                                                                                    eieuVar4 = eieuVarK11;
                                                                                                }
                                                                                            }
                                                                                            eieuVarK5 = eiiy.k("SyncDataToWearableAppHandler#executeDataClientRequest");
                                                                                        } catch (Throwable th13) {
                                                                                            th = th13;
                                                                                            th2 = th;
                                                                                            bcutVar.close();
                                                                                            throw th2;
                                                                                        }
                                                                                        denzVar4.m("13", badtVar.G());
                                                                                        denzVar4.h("3", badtVar.B());
                                                                                        denzVar4.h("43", badtVar.R());
                                                                                        denzVar4.h("5", zQ);
                                                                                        denzVar4.n("7", badtVar.o());
                                                                                        denzVar4.n("10", badtVar.t());
                                                                                        bbtk bbtkVar = badtVar.d;
                                                                                        bbtkVar.aA(12, "draft_preview_content_type");
                                                                                        String str = bbtkVar.m;
                                                                                        if (str != null) {
                                                                                            denzVar4.n("21", str);
                                                                                        }
                                                                                        bbtk bbtkVar2 = badtVar.d;
                                                                                        bbtkVar2.aA(9, "draft_snippet_text");
                                                                                        String str2 = bbtkVar2.j;
                                                                                        if (str2 != null) {
                                                                                            denzVar4.n("20", str2);
                                                                                        }
                                                                                        denzVar4.h("19", badtVar.y());
                                                                                        denzVar4.n("22", badtVar.q());
                                                                                        if (badtVar.k().isPresent()) {
                                                                                            alqm alqmVar = (alqm) badtVar.k().get();
                                                                                            cczv cczvVar = alvx.a;
                                                                                            if (((Boolean) new aluk().get()).booleanValue()) {
                                                                                                denzVar4.n("41", alqmVar.o());
                                                                                            }
                                                                                            String strP = alqmVar.p(((Boolean) new alvu().get()).booleanValue());
                                                                                            if (strP != null) {
                                                                                                denzVar4.n("24", strP);
                                                                                            }
                                                                                        }
                                                                                        bbtk bbtkVar3 = badtVar.d;
                                                                                        bbtkVar3.aA(54, "raw_status");
                                                                                        denzVar4.l("33", bbtkVar3.ac);
                                                                                        denzVar4.l("11", badtVar.b());
                                                                                        denzVar4.h("34", bajh.b(badtVar.b()));
                                                                                        denzVar4.h("35", badtVar.A());
                                                                                        bbtk bbtkVar4 = badtVar.d;
                                                                                        bbtkVar4.aA(56, "sms_error_code");
                                                                                        denzVar4.l("37", bbtkVar4.ae);
                                                                                        bbtk bbtkVar5 = badtVar.d;
                                                                                        bbtkVar5.aA(57, "sms_error_desc_map_name");
                                                                                        denzVar4.n("38", bbtkVar5.af);
                                                                                        bbtk bbtkVar6 = badtVar.d;
                                                                                        bbtkVar6.aA(50, "message_protocol");
                                                                                        denzVar4.l("36", bbtkVar6.Y);
                                                                                        ecem.b();
                                                                                        List<ParticipantsTable.BindData> listF = ((baqm) cszwVar.f.b()).f(conversationIdTypeJ2, false);
                                                                                        ArrayList arrayList3 = new ArrayList();
                                                                                        for (ParticipantsTable.BindData bindData : listF) {
                                                                                            cszn csznVar = new cszn();
                                                                                            String strV = bindData.V();
                                                                                            if (strV != null) {
                                                                                                cczv cczvVar2 = alvx.a;
                                                                                                if (((Boolean) new aluk().get()).booleanValue()) {
                                                                                                    strV = ((alrj) cszwVar.e.b()).t(bindData).o();
                                                                                                }
                                                                                                csznVar.a = strV;
                                                                                            }
                                                                                            csznVar.b = bindData.Q();
                                                                                            csznVar.a(bbax.a(bindData));
                                                                                            if (csznVar.c.isPresent()) {
                                                                                                csznVar.a(new ParticipantColor((ParticipantColor) csznVar.c.get()));
                                                                                            }
                                                                                            String str3 = csznVar.a;
                                                                                            if (str3 == null) {
                                                                                                throw new IllegalStateException("Missing required properties: phoneNumber");
                                                                                            }
                                                                                            arrayList3.add(new ctad(str3, csznVar.b, csznVar.c).a());
                                                                                        }
                                                                                        denzVar4.k("31", arrayList3);
                                                                                    } catch (Throwable th14) {
                                                                                        th = th14;
                                                                                        th3 = th;
                                                                                        try {
                                                                                            eieuVarK6.close();
                                                                                            throw th3;
                                                                                        } catch (Throwable th15) {
                                                                                            th3.addSuppressed(th15);
                                                                                            throw th3;
                                                                                        }
                                                                                    }
                                                                                    eieuVar2 = eieuVar3;
                                                                                } catch (Throwable th16) {
                                                                                    th = th16;
                                                                                    eieuVar2 = eieuVar3;
                                                                                }
                                                                                denzVar4.k("6", arrayListB);
                                                                                eieuVar3 = eieuVarK10;
                                                                            } catch (Throwable th17) {
                                                                                th = th17;
                                                                                eieuVar2 = eieuVarK10;
                                                                                th3 = th;
                                                                                eieuVarK6.close();
                                                                                throw th3;
                                                                            }
                                                                            badtVar = (badt) cszwVar.b.b();
                                                                            badtVar.M(bcutVar);
                                                                            cszx cszxVar = cszwVar.c;
                                                                            cszvVar = new cszv(denzVar3);
                                                                            conversationIdTypeJ2 = badtVar.J();
                                                                            cszvVar.d(conversationIdTypeJ2);
                                                                            zQ = badtVar.Q();
                                                                            if (denzVar2 == null) {
                                                                                map = map2;
                                                                                cszvVar2 = null;
                                                                            } else {
                                                                                map = map2;
                                                                                cszvVar2 = new cszv(denzVar2);
                                                                            }
                                                                            arrayListB = cszwVar.b(cszvVar, cszvVar2, arrayList, 0, context2);
                                                                            denzVar4 = cszvVar.a;
                                                                            eieuVar = eieuVarK8;
                                                                        } catch (Throwable th18) {
                                                                            th = th18;
                                                                            eieuVar = eieuVarK8;
                                                                        }
                                                                        conversationIdTypeJ = badtVar2.J();
                                                                        deojVarB2 = deoj.b(a.E(conversationIdTypeJ, "/bugle/conversations/"));
                                                                        denzVar2 = (denz) map2.remove(conversationIdTypeJ);
                                                                        arrayList = new ArrayList();
                                                                        fcsuVar = dasyVar.e;
                                                                        cszwVar = (cszw) fcsuVar.b();
                                                                        denzVar3 = deojVarB2.a;
                                                                        context2 = dasyVar.c;
                                                                        eieuVarK6 = eiiy.k("WearableConversationBuilder#buildV2");
                                                                    }
                                                                }
                                                                Map map3 = map2;
                                                                eieuVar = eieuVarK8;
                                                                eieu eieuVar5 = eieuVarK10;
                                                                bcutVar.close();
                                                                eieuVar5.close();
                                                                eieuVarK5 = eiiy.k("SyncDataToWearableAppHandler#cleanupOlderConversations");
                                                                try {
                                                                    for (ConversationIdType conversationIdType : map3.keySet()) {
                                                                        dasyVar.d.a(new Uri.Builder().scheme("wear").path("/bugle/conversations/" + String.valueOf(conversationIdType)).build());
                                                                    }
                                                                    eieuVarK5.close();
                                                                    eieuVar.close();
                                                                    return null;
                                                                } finally {
                                                                    try {
                                                                        eieuVarK5.close();
                                                                        throw th;
                                                                    } catch (Throwable th19) {
                                                                        th.addSuppressed(th19);
                                                                    }
                                                                }
                                                            } catch (Throwable th20) {
                                                                th = th20;
                                                                eieuVar = eieuVarK8;
                                                                eieuVar2 = eieuVarK10;
                                                            }
                                                        } catch (Throwable th21) {
                                                            th = th21;
                                                            th = th;
                                                            try {
                                                                eieuVar2.close();
                                                                throw th;
                                                            } catch (Throwable th22) {
                                                                th.addSuppressed(th22);
                                                                throw th;
                                                            }
                                                        }
                                                    } catch (Throwable th23) {
                                                        th = th23;
                                                        eieuVar = eieuVarK8;
                                                        eieuVar2 = eieuVarK10;
                                                        th = th;
                                                        eieuVar2.close();
                                                        throw th;
                                                    }
                                                } catch (Throwable th24) {
                                                    eieuVar = eieuVarK8;
                                                    try {
                                                        eieuVarK9.close();
                                                        throw th24;
                                                    } catch (Throwable th25) {
                                                        th24.addSuppressed(th25);
                                                        throw th24;
                                                    }
                                                }
                                            } catch (Throwable th26) {
                                                th = th26;
                                                Throwable th27 = th;
                                                try {
                                                    eieuVar.close();
                                                    throw th27;
                                                } catch (Throwable th28) {
                                                    th27.addSuppressed(th28);
                                                    throw th27;
                                                }
                                            }
                                        } catch (Throwable th29) {
                                            th = th29;
                                            eieuVar = eieuVarK8;
                                        }
                                    }
                                }, this.g);
                                ejvr ejvrVar = new ejvr() { // from class: dasw
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj) {
                                        eksl ekslVar5 = (eksl) dasy.a.h();
                                        ekslVar5.X(cqnc.S, "SyncDataToWearableAppHandler");
                                        ((eksl) ekslVar5.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandler", "processPendingWorkItemAsync", 254, "SyncDataToWearableAppHandler.java")).q("Sync data to wearable devices completed successfully");
                                        this.a.n(2, dzua.SUCCESS);
                                        return cbcw.i();
                                    }
                                };
                                eoqg eoqgVar = eoqg.a;
                                return eijuVarH2.h(ejvrVar, eoqgVar).e(IllegalStateException.class, new ejvr() { // from class: dasx
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj) {
                                        dasy.m((IllegalStateException) obj, "Retrying sync: Inner-Task failed when processing previous conversations.");
                                        this.a.n(3, dzua.ERROR);
                                        return cbcw.m();
                                    }
                                }, eoqgVar).e(dcff.class, new ejvr() { // from class: dasn
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj) {
                                        dcff dcffVar = (dcff) obj;
                                        eksl ekslVar5 = (eksl) ((eksl) dasy.a.j()).g(dcffVar);
                                        ekslVar5.X(cqnc.S, "SyncDataToWearableAppHandler");
                                        ((eksl) ekslVar5.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandler", "processPendingWorkItemAsync", 278, "SyncDataToWearableAppHandler.java")).D("Not retrying sync: Failed to sync conversations to wearable with ApiException[status=%s, connectionResult=%s]", dasy.l(dcffVar), dasy.k(dcffVar));
                                        this.a.n(4, dzua.ERROR);
                                        return cbcw.k();
                                    }
                                }, eoqgVar).e(Throwable.class, new ejvr() { // from class: daso
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj) {
                                        dasy.m((Throwable) obj, "Not retrying sync: Failed to sync conversations to wearable.");
                                        this.a.n(4, dzua.ERROR);
                                        return cbcw.k();
                                    }
                                }, eoqgVar);
                            } finally {
                                try {
                                    eieuVarK4.close();
                                } catch (Throwable th) {
                                    th.addSuppressed(th);
                                }
                            }
                        }
                        eksl ekslVar5 = (eksl) ekspVar.h();
                        ekslVar5.X(cqnc.S, "SyncDataToWearableAppHandler");
                        ((eksl) ekslVar5.h("com/google/android/apps/messaging/wearable/workhandler/SyncDataToWearableAppHandler", "sendPhoneDataToWearable", 369, "SyncDataToWearableAppHandler.java")).q("Does not have minimum required permissions; skipping wearable sync.");
                    }
                    eieuVarK3.close();
                    n(6, dzua.CANCEL);
                    return eijx.e(cbcw.k());
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    eieuVarK3.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            try {
                eieuVarK2.close();
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        }
    }

    public final void n(int i, dzua dzuaVar) {
        eieu eieuVarK = eiiy.k("SyncDataToWearableAppHandler#logWearSyncMetrics");
        try {
            ((ains) this.p.b()).e("Bugle.Wear.SyncRunOnPhone", i - 1);
            dzuc dzucVar = (dzuc) this.q.b();
            dzub dzubVar = this.r;
            dzubVar.getClass();
            dzucVar.f(dzubVar, datb.a, null, dzuaVar);
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
}

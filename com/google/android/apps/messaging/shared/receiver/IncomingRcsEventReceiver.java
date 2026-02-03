package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.receiver.IncomingRcsEventReceiver;
import com.google.android.ims.filetransfer.http.message.HttpFileTransferPushMessage;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import com.google.android.ims.rcsservice.events.Event;
import com.google.android.ims.rcsservice.group.GroupInfo;
import com.google.android.ims.rcsservice.group.UserInfo;
import com.google.android.ims.util.common.RcsIntents;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ckzt;
import defpackage.cqbm;
import defpackage.cqce;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.eksp;
import defpackage.eooy;
import defpackage.eygg;
import defpackage.fcsu;
import j$.time.Instant;
import j$.util.Optional;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class IncomingRcsEventReceiver extends ckzt {
    public static final cqce a = cqce.g("Bugle", "IncomingRcsEventReceiver");
    public static final cqce b = cqce.g("BugleAction", "IncomingRcsEventReceiver");
    public static final eksp c = eksp.c("BugleAction");
    public cqbm d;
    public eygg e;
    public eygg f;
    public fcsu g;
    public fcsu h;
    public fcsu i;
    public fcsu j;
    public fcsu k;
    public eigp l;
    public fcsu m;
    public fcsu n;

    @Override // defpackage.cldb
    protected final int a() {
        return 3;
    }

    @Override // defpackage.cldb
    public final eieh b() {
        return this.l.c("IncomingRcsEventReceiver Receive broadcast", "com/google/android/apps/messaging/shared/receiver/IncomingRcsEventReceiver", "beginRootTrace", 95);
    }

    @Override // defpackage.cldb
    public final String d() {
        return "Bugle.Broadcast.IncomingRcsEvent.Latency";
    }

    @Override // defpackage.clca
    protected final String f() {
        return "Bugle.Broadcast.ForegroundService.IncomingRcsEvent.Latency";
    }

    @Override // defpackage.clca
    public final boolean i(Intent intent) {
        return true;
    }

    @Override // defpackage.clca
    public final eiju j(Context context, final Intent intent) {
        return eijx.h(new eooy() { // from class: clak
            @Override // defpackage.eooy
            public final ListenableFuture a() throws IOException {
                eiju eijuVarE;
                long epochMilli;
                eiju eijuVarB;
                eiju eijuVarB2;
                Action actionA;
                IncomingRcsEventReceiver incomingRcsEventReceiver = this.a;
                chwq chwqVar = (chwq) incomingRcsEventReceiver.h.b();
                Intent intent2 = intent;
                if (!chwqVar.y(intent2)) {
                    IncomingRcsEventReceiver.a.r("Package not authorized. Returning.");
                    return eijx.e(null);
                }
                String action = intent2.getAction();
                if (action == null) {
                    ((eksl) ((eksl) IncomingRcsEventReceiver.c.j()).h("com/google/android/apps/messaging/shared/receiver/IncomingRcsEventReceiver", "handleIncomingRcsEvent", 128, "IncomingRcsEventReceiver.java")).q("Received an intent with no action");
                    return eijx.e(null);
                }
                cqce cqceVar = IncomingRcsEventReceiver.b;
                cqbd cqbdVarC = cqceVar.c();
                cqbdVarC.I("doInBackground");
                cqbdVarC.A(GroupManagementRequest.ACTION_TAG, action);
                cqbdVarC.r();
                chyx chyxVar = chyx.NO_HINT;
                if (!RcsIntents.isProvisioningIntentAction(action)) {
                    chyxVar = chyx.RECEIVED_POST_PROVISIONING_INTENT;
                }
                ((chza) incomingRcsEventReceiver.d.a()).o(chyxVar);
                ((aiwq) incomingRcsEventReceiver.g.b()).f(aiwp.RCS_ACTION, Optional.ofNullable(action));
                Bundle extras = intent2.getExtras();
                if (RcsIntents.ACTION_INCOMING_CHAT_MESSAGE.equals(action)) {
                    ((ekrd) cqceVar.k().h("com/google/android/apps/messaging/shared/receiver/IncomingRcsEventReceiver", "handleIncomingRcsEvent", 148, "IncomingRcsEventReceiver.java")).q("Received unexpected ACTION_INCOMING_CHAT_MESSAGE RCS event.");
                    return eijx.e(null);
                }
                if (RcsIntents.ACTION_LOCATION_RECEIVED.equals(action)) {
                    ((ekrd) cqceVar.k().h("com/google/android/apps/messaging/shared/receiver/IncomingRcsEventReceiver", "handleIncomingRcsEvent", 151, "IncomingRcsEventReceiver.java")).q("Received unexpected ACTION_LOCATION_RECEIVED RCS event.");
                    return eijx.e(null);
                }
                if (RcsIntents.ACTION_INCOMING_GROUP_CHAT.equals(action)) {
                    String stringExtra = intent2.getStringExtra(RcsIntents.EXTRA_REFERRER);
                    long longExtra = intent2.getLongExtra("rcs.intent.extra.sessionid", -1L);
                    GroupInfo groupInfo = (GroupInfo) intent2.getParcelableExtra(RcsIntents.EXTRA_GROUP_INFO);
                    cijc cijcVar = (cijc) cijd.a.createBuilder();
                    String strB = ejwk.b(stringExtra);
                    cijcVar.copyOnWrite();
                    ((cijd) cijcVar.instance).g = strB;
                    cijcVar.copyOnWrite();
                    ((cijd) cijcVar.instance).b = longExtra;
                    if (groupInfo != null) {
                        ArrayList arrayList = new ArrayList();
                        for (UserInfo userInfo : groupInfo.b) {
                            if (!userInfo.d) {
                                arrayList.add(userInfo.a);
                            }
                        }
                        String strB2 = ejwk.b(groupInfo.c);
                        cijcVar.copyOnWrite();
                        ((cijd) cijcVar.instance).c = strB2;
                        String strB3 = ejwk.b(groupInfo.d);
                        cijcVar.copyOnWrite();
                        ((cijd) cijcVar.instance).d = strB3;
                        String strB4 = ejwk.b(groupInfo.a);
                        cijcVar.copyOnWrite();
                        ((cijd) cijcVar.instance).e = strB4;
                        cijcVar.copyOnWrite();
                        cijd cijdVar = (cijd) cijcVar.instance;
                        evtg evtgVar = cijdVar.f;
                        if (!evtgVar.c()) {
                            cijdVar.f = evsn.mutableCopy(evtgVar);
                        }
                        evpz.addAll(arrayList, cijdVar.f);
                    }
                    ((cazj) ((cije) incomingRcsEventReceiver.n.b()).a.b()).a(cbcu.f("incoming_rcs_group_invitation", (cijd) cijcVar.build()));
                    return eijx.e(null);
                }
                if (RcsIntents.ACTION_INCOMING_CONVERSATION_SUGGESTIONS_MESSAGE.equals(action)) {
                    if (extras == null) {
                        cqceVar.r("No extras found in incoming conversation suggestions message intent");
                        return eijx.e(null);
                    }
                    actionA = ((aybx) incomingRcsEventReceiver.j.b()).a(extras);
                } else {
                    if (RcsIntents.ACTION_INCOMING_FILE_TRANSFER.equals(action) || RcsIntents.ACTION_INCOMING_FILE_TRANSFER_PREVIEW_UPDATE.equals(action) || RcsIntents.ACTION_INCOMING_FILE_TRANSFER_COMPLETED.equals(action) || RcsIntents.ACTION_FILE_TRANSFER_METADATA_UPDATE.equals(action)) {
                        if (extras == null) {
                            cqceVar.r("No extras found in incoming file transfer intent");
                            return eijx.e(null);
                        }
                        final clep clepVar = (clep) incomingRcsEventReceiver.f.b();
                        if (RcsIntents.ACTION_INCOMING_FILE_TRANSFER.equals(action)) {
                            ((ekrd) clep.a.k().h("com/google/android/apps/messaging/shared/receiver/rcsprocessor/IncomingRcsFileTransferEventProcessor", "process", 108, "IncomingRcsFileTransferEventProcessor.java")).q("Received unexpected ACTION_INCOMING_FILE_TRANSFER event.");
                            eijuVarE = eijx.e(null);
                        } else if (RcsIntents.ACTION_INCOMING_FILE_TRANSFER_PREVIEW_UPDATE.equals(action)) {
                            byte[] byteArray = extras.getByteArray(RcsIntents.EXTRA_PREVIEW_DATA);
                            if (byteArray == null) {
                                cqbd cqbdVarB = clep.a.b();
                                cqbdVarB.I("Received an incoming file transfer preview update event but there was no preview provided.");
                                cqbdVarB.r();
                                eijuVarB2 = eijx.e(null);
                            } else {
                                byte[] byteArray2 = extras.getByteArray("file_transfer_service_download_response_extra");
                                if (byteArray2 == null) {
                                    cqbd cqbdVarB2 = clep.a.b();
                                    cqbdVarB2.I("Received an incoming file transfer preview update event but there was no opaque data.");
                                    cqbdVarB2.r();
                                    eijuVarB2 = eijx.e(null);
                                } else {
                                    String string = extras.getString(RcsIntents.EXTRA_FILENAME);
                                    cote coteVar = (cote) cotf.a.createBuilder();
                                    evqs evqsVarX = evqs.x(byteArray2);
                                    coteVar.copyOnWrite();
                                    ((cotf) coteVar.instance).b = evqsVarX;
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
                                        try {
                                            String string2 = bxlf.g(byteArrayInputStream, clepVar.c).toString();
                                            coteVar.copyOnWrite();
                                            cotf cotfVar = (cotf) coteVar.instance;
                                            string2.getClass();
                                            cotfVar.d = string2;
                                            byteArrayInputStream.close();
                                        } finally {
                                        }
                                    } catch (IOException e) {
                                        cqbd cqbdVarB3 = clep.a.b();
                                        cqbdVarB3.I("Failed to close input stream after writing thumbnail to scratch space.");
                                        cqbdVarB3.s(e);
                                    }
                                    if (string != null) {
                                        coteVar.copyOnWrite();
                                        ((cotf) coteVar.instance).c = string;
                                    }
                                    eijuVarB2 = ((cazj) clepVar.g.a.b()).b(cbcu.f("persist_thumbnail", (cotf) coteVar.build()));
                                }
                            }
                            eijuVarE = eijuVarB2.i(new eooz() { // from class: clek
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj) {
                                    cqce cqceVar2 = clep.a;
                                    return ((cazi) obj).b().h(new ejvr() { // from class: cleo
                                        @Override // defpackage.ejvr
                                        public final Object apply(Object obj2) {
                                            cqce cqceVar3 = clep.a;
                                            return null;
                                        }
                                    }, eoqg.a);
                                }
                            }, clepVar.d);
                        } else if (RcsIntents.ACTION_INCOMING_FILE_TRANSFER_COMPLETED.equals(action)) {
                            String string3 = extras.getString("rcs.intent.extra.uri");
                            if (string3 == null) {
                                eijuVarB = eijx.d(new IllegalArgumentException("Received an incoming file transfer completed event but there was no URI provided."));
                            } else {
                                byte[] byteArray3 = extras.getByteArray("file_transfer_service_download_response_extra");
                                if (byteArray3 == null) {
                                    throw new IllegalArgumentException("Received an incoming file transfer completed event but there was no opaque data.");
                                }
                                try {
                                    String str = ((coqg) evsn.parseFrom(coqg.a, byteArray3, evrr.a())).b;
                                    if (ejwk.c(str)) {
                                        eijuVarB = eijx.d(new IllegalArgumentException("Received an incoming file transfer completed event cannot find the associating RCS message ID."));
                                    } else {
                                        String string4 = extras.getString(RcsIntents.EXTRA_FILENAME);
                                        coqc coqcVar = (coqc) coqd.a.createBuilder();
                                        coqcVar.copyOnWrite();
                                        coqd coqdVar = (coqd) coqcVar.instance;
                                        str.getClass();
                                        coqdVar.b |= 1;
                                        coqdVar.c = str;
                                        String strB5 = ejwk.b(string4);
                                        coqcVar.copyOnWrite();
                                        coqd coqdVar2 = (coqd) coqcVar.instance;
                                        coqdVar2.b |= 4;
                                        coqdVar2.e = strB5;
                                        coqcVar.copyOnWrite();
                                        coqd coqdVar3 = (coqd) coqcVar.instance;
                                        coqdVar3.b |= 2;
                                        coqdVar3.d = string3;
                                        long j = extras.getLong(RcsIntents.EXTRA_SIZE);
                                        coqcVar.copyOnWrite();
                                        coqd coqdVar4 = (coqd) coqcVar.instance;
                                        coqdVar4.b |= 8;
                                        coqdVar4.f = j;
                                        enyw enywVar = enyw.RCS_SMAPI;
                                        coqcVar.copyOnWrite();
                                        coqd coqdVar5 = (coqd) coqcVar.instance;
                                        coqdVar5.g = enywVar.h;
                                        coqdVar5.b |= 16;
                                        coqd coqdVar6 = (coqd) coqcVar.build();
                                        cqbd cqbdVarA = clep.a.a();
                                        cqbdVarA.I("Scheduling file download completed handler.");
                                        cqbdVarA.h(basd.a(str));
                                        cqbdVarA.r();
                                        eijuVarB = ((cazj) clepVar.h.a.b()).b(cbcu.f("file_download_completed", coqdVar6));
                                    }
                                } catch (evtj e2) {
                                    throw new IllegalArgumentException("Received an incoming file transfer completed event but failed to parse FileDownloadExtras", e2);
                                }
                            }
                            eijuVarE = eijuVarB.i(new eooz() { // from class: clel
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj) {
                                    cqce cqceVar2 = clep.a;
                                    return ((cazi) obj).b().h(new ejvr() { // from class: clen
                                        @Override // defpackage.ejvr
                                        public final Object apply(Object obj2) {
                                            cqce cqceVar3 = clep.a;
                                            return null;
                                        }
                                    }, eoqg.a);
                                }
                            }, clepVar.d);
                        } else if (RcsIntents.ACTION_FILE_TRANSFER_METADATA_UPDATE.equals(action)) {
                            final basd basdVarB = basd.b(extras, RcsIntents.EXTRA_MESSAGE_ID);
                            final String string5 = extras.getString(RcsIntents.EXTRA_FALLBACK_URL);
                            if (extras.containsKey(RcsIntents.EXTRA_EXPIRY)) {
                                epochMilli = extras.getLong(RcsIntents.EXTRA_EXPIRY);
                            } else {
                                epochMilli = clepVar.f.f().toEpochMilli() + ((Long) clep.b.e()).longValue();
                                cqbd cqbdVarA2 = clep.a.a();
                                cqbdVarA2.I("Expiry is absent on file transfer metadata update");
                                cqbdVarA2.r();
                                ((ains) clepVar.e.b()).c("Bugle.Message.Send.RcsFileTransfer.AbsentExpiry.Count");
                            }
                            final Instant instantOfEpochMilli = Instant.ofEpochMilli(epochMilli);
                            final byte[] byteArray4 = extras.getByteArray(RcsIntents.EXTRA_RAW_FILE_TRANSFER_XML_BYTES);
                            if (basdVarB.i()) {
                                clep.a.n("RCS message id is null, cannot update file transfer metadata.");
                                eijuVarE = eijx.e(null);
                            } else {
                                eijuVarE = eijx.h(new eooy() { // from class: clem
                                    @Override // defpackage.eooy
                                    public final ListenableFuture a() throws XmlPullParserException, IOException {
                                        byte[] bArr = byteArray4;
                                        if (bArr == null) {
                                            throw new IllegalStateException("Missing RCS XML response.");
                                        }
                                        basd basdVar = basdVarB;
                                        String str2 = string5;
                                        Instant instant = instantOfEpochMilli;
                                        couf coufVar = new couf();
                                        coufVar.b = Optional.of(instant);
                                        coufVar.b(str2);
                                        coufVar.a = basdVar;
                                        HttpFileTransferPushMessage httpFileTransferPushMessageA = HttpFileTransferPushMessage.a(bArr);
                                        aucj aucjVarA = clep.a(instant, httpFileTransferPushMessageA.mFileInfo);
                                        auck auckVar = (auck) aucl.a.createBuilder();
                                        auckVar.copyOnWrite();
                                        aucl auclVar = (aucl) auckVar.instance;
                                        aucjVarA.getClass();
                                        auclVar.c = aucjVarA;
                                        auclVar.b |= 1;
                                        if (httpFileTransferPushMessageA.b()) {
                                            aucj aucjVarA2 = clep.a(instant, httpFileTransferPushMessageA.mThumbnailInfo);
                                            auckVar.copyOnWrite();
                                            aucl auclVar2 = (aucl) auckVar.instance;
                                            aucjVarA2.getClass();
                                            auclVar2.d = aucjVarA2;
                                            auclVar2.b |= 2;
                                        }
                                        clep clepVar2 = clepVar;
                                        coufVar.c((aucl) auckVar.build());
                                        return clepVar2.i.a(coufVar.a(), Optional.empty());
                                    }
                                }, clepVar.d);
                            }
                        } else {
                            cqbd cqbdVarB4 = clep.a.b();
                            cqbdVarB4.I("Unknown file transfer event:");
                            cqbdVarB4.I(action);
                            cqbdVarB4.r();
                            eijuVarE = eijx.e(null);
                        }
                        return eijuVarE.h(new ejvr() { // from class: clai
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj) {
                                cqce cqceVar2 = IncomingRcsEventReceiver.a;
                                return null;
                            }
                        }, eoqg.a);
                    }
                    if ("com.google.android.ims.ZERO_SESSION_ID".equals(action)) {
                        IncomingRcsEventReceiver.b.m("ClearSessionIds started");
                        ((cazj) ((cati) incomingRcsEventReceiver.k.b()).a.b()).a(cbcu.f("clear_session_ids", caxy.a));
                    } else {
                        Event event = (Event) intent2.getParcelableExtra(RcsIntents.EXTRA_EVENT);
                        if (event != null) {
                            ((clej) incomingRcsEventReceiver.e.b()).c(event, incomingRcsEventReceiver);
                        } else {
                            cqbd cqbdVarD = IncomingRcsEventReceiver.b.d();
                            cqbdVarD.I("ignoring action");
                            cqbdVarD.I(action);
                            cqbdVarD.r();
                        }
                    }
                    actionA = null;
                }
                if (actionA == null) {
                    return eijx.e(null);
                }
                ((cjpo) incomingRcsEventReceiver.i.b()).p(incomingRcsEventReceiver);
                return eiju.g(actionA.q(incomingRcsEventReceiver)).h(new ejvr() { // from class: claj
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        cqce cqceVar2 = IncomingRcsEventReceiver.a;
                        return null;
                    }
                }, eoqg.a);
            }
        }, (Executor) this.m.b());
    }
}

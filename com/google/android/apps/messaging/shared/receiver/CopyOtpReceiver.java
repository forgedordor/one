package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.aika;
import defpackage.aill;
import defpackage.aypj;
import defpackage.barn;
import defpackage.bary;
import defpackage.ckzq;
import defpackage.cpez;
import defpackage.cqnc;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.eksl;
import defpackage.eksp;
import defpackage.elkh;
import defpackage.elki;
import defpackage.ellf;
import defpackage.ellg;
import defpackage.ellh;
import defpackage.emxt;
import defpackage.eyzv;
import defpackage.fcsu;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class CopyOtpReceiver extends ckzq {
    private static final eksp f = eksp.c("Bugle");
    public fcsu a;
    public fcsu b;
    public fcsu c;
    public fcsu d;
    public fcsu e;

    @Override // defpackage.cldb
    protected final int a() {
        return 18;
    }

    @Override // defpackage.cldb
    public final eieh b() {
        return ((eigp) this.c.b()).c("CopyOtpReceiver Receive broadcast", "com/google/android/apps/messaging/shared/receiver/CopyOtpReceiver", "beginRootTrace", 53);
    }

    @Override // defpackage.cldb
    public final eiju c(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("otp_code");
        ConversationIdType conversationIdTypeB = barn.b(intent.getStringExtra("conversation_id"));
        MessageIdType messageIdTypeB = bary.b(intent.getStringExtra("message_id"));
        if (!conversationIdTypeB.b()) {
            eksl ekslVar = (eksl) f.h();
            ekslVar.X(cqnc.r, conversationIdTypeB.toString());
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/receiver/CopyOtpReceiver", "processBroadcast", 85, "CopyOtpReceiver.java")).q("Starting CopyOtpReceiver");
            ((aypj) this.b.b()).f(conversationIdTypeB, messageIdTypeB, false).q(this);
        }
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_CONVERSATION;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        if (!conversationIdTypeB.b()) {
            elkh elkhVar = (elkh) elki.a.createBuilder();
            long jB = ((aika) this.e.b()).b(conversationIdTypeB);
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
        }
        ((aill) this.d.b()).k(ellgVar, emxt.ACTIVE_USER_ENTER_CONVERSATION_WITH_UNREAD_MESSAGE);
        q("copy-otp", ((cpez) this.a.b()).a(stringExtra, messageIdTypeB, eyzv.NOTIFICATION_VIEW));
        return eijx.e(null);
    }

    @Override // defpackage.cldb
    public final String d() {
        return "Bugle.Broadcast.CopyOtp.Latency";
    }
}

package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import defpackage.apsz;
import defpackage.axzo;
import defpackage.ayqb;
import defpackage.ckzu;
import defpackage.cmwd;
import defpackage.cqbd;
import defpackage.cqce;
import defpackage.cqti;
import defpackage.craf;
import defpackage.crmx;
import defpackage.crny;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.fcsu;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public class MmsWapPushDeliverReceiver extends ckzu {
    private static final cqce i = cqce.g("Bugle", "MmsWapPushDeliverReceiver");
    public fcsu a;
    public fcsu b;
    public fcsu c;
    public fcsu d;
    public fcsu e;
    public fcsu f;
    public fcsu g;
    public fcsu h;

    @Override // defpackage.cldb
    protected final int a() {
        return 7;
    }

    @Override // defpackage.cldb
    public final eieh b() {
        return ((eigp) this.f.b()).c("MmsWapPushDeliverReceiver Receive broadcast", "com/google/android/apps/messaging/shared/receiver/MmsWapPushDeliverReceiver", "beginRootTrace", 61);
    }

    @Override // defpackage.cldb
    public final String d() {
        return "Bugle.Broadcast.MmsWapPushDeliver.Latency";
    }

    @Override // defpackage.clca
    public final String f() {
        return "Bugle.Broadcast.ForegroundService.MmsWapPushDeliver.Latency";
    }

    @Override // defpackage.clca
    public final void g(Context context, Intent intent) {
        Action actionA;
        if ("android.provider.Telephony.WAP_PUSH_DELIVER".equals(intent.getAction()) || "com.google.android.apps.messaging.TestAction".equals(intent.getAction())) {
            if (!((crmx) this.b.b()).K()) {
                i.p("Ignoring 'mms received' because SMS is not enabled");
                return;
            }
            String type = intent.getType();
            if ("application/vnd.wap.mms-message".equals(type) || "application/vnd.wap.sic".equals(type)) {
                int iA = ((crny) this.c.b()).h(((apsz) this.g.b()).a() ? ((cqti) this.h.b()).c(intent).orElse(-1) : intent.getIntExtra("subscription", -1)).a();
                int iMax = 0;
                int iMax2 = Math.max(((Integer) Optional.ofNullable(((crny) this.c.b()).h(iA).v()).map(new Function() { // from class: clam
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return eonc.g((String) obj);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(0)).intValue(), 0);
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager != null && craf.b) {
                    iMax = Math.max(telephonyManager.createForSubscriptionId(iA).getSimCarrierId(), 0);
                }
                int i2 = iMax;
                byte[] byteArrayExtra = intent.getByteArrayExtra(GroupManagementRequest.DATA_TAG);
                if (byteArrayExtra == null) {
                    i.n("Received wap push has empty data");
                    return;
                }
                long longExtra = intent.getLongExtra("messageId", 0L);
                if ("application/vnd.wap.mms-message".equals(type)) {
                    cqce cqceVar = i;
                    cqbd cqbdVarC = cqceVar.c();
                    cqbdVarC.I("Received MMS WAP Push");
                    cqbdVarC.w(longExtra);
                    cqbdVarC.r();
                    cqceVar.l("MMS receiving START");
                    actionA = ((axzo) this.d.b()).a(iA, byteArrayExtra, longExtra, iMax2, i2);
                } else {
                    if (!((cmwd) this.a.b()).c(iA)) {
                        i.m("WAP Push SI message ignored because the feature disabled");
                        return;
                    }
                    cqbd cqbdVarC2 = i.c();
                    cqbdVarC2.I("Received WAP Push SI");
                    cqbdVarC2.w(longExtra);
                    cqbdVarC2.r();
                    actionA = ((ayqb) this.e.b()).a(iA, byteArrayExtra, longExtra);
                }
                actionA.q(this);
            }
        }
    }

    @Override // defpackage.clca
    public final boolean i(Intent intent) {
        return true;
    }

    @Override // defpackage.clca
    protected final String k(Context context, Intent intent) {
        return context.getString(R.string.incoming_message_foreground_notification_text);
    }
}

package defpackage;

import android.app.NotificationChannel;
import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgor implements cgoq {
    private static final eksp a = eksp.c("BugleNotifications");
    private final Context b;
    private final cgkb c;
    private final Optional d;
    private final fcsu e;

    public cgor(Context context, cgkb cgkbVar, Optional optional, fcsu fcsuVar) {
        this.b = context;
        this.c = cgkbVar;
        this.d = optional;
        this.e = fcsuVar;
    }

    @Override // defpackage.cgoq
    public final NotificationChannel a() {
        return this.c.d(Optional.of(c()), Optional.empty());
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ac  */
    @Override // defpackage.cgoq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.Intent b(java.lang.String r9, java.lang.String r10, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r11) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgor.b(java.lang.String, java.lang.String, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType):android.content.Intent");
    }

    @Override // defpackage.cgoq
    public final cgjr c() {
        if (!((arpu) this.e.b()).a()) {
            Context context = this.b;
            cgjq cgjqVarL = cgjr.l(context.getString(R.string.im_notification_default_channel_id), context.getString(R.string.im_notification_default_channel_name), cgjs.DEFAULT_SETTINGS);
            ((cggp) cgjqVarL).d = Optional.of(true);
            return cgjqVarL.a();
        }
        Context context2 = this.b;
        cgjq cgjqVarL2 = cgjr.l(context2.getString(R.string.im_notification_default_channel_id_v2), context2.getString(R.string.im_notification_default_channel_name), cgjs.DEFAULT_SETTINGS);
        cggp cggpVar = (cggp) cgjqVarL2;
        cggpVar.d = Optional.of(true);
        ArrayList arrayList = new ArrayList();
        arrayList.add(context2.getString(R.string.im_notification_default_channel_id));
        cggpVar.j = Optional.of(arrayList);
        return cgjqVarL2.a();
    }

    @Override // defpackage.cgoq
    public final void d(ConversationIdType conversationIdType) {
        Optional optional = this.d;
        if (optional.isEmpty()) {
            ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageChannelManagerImpl", "deleteConversationChannel", 74, "IncomingMessageChannelManagerImpl.java")).q("Not deleting conversation channel because shortcutUtil missing");
            return;
        }
        String strE = ((cqdn) optional.get()).e(conversationIdType);
        cgkb cgkbVar = this.c;
        NotificationChannel notificationChannelC = craf.d ? cgkbVar.c(this.b.getString(R.string.im_notification_default_channel_id), strE) : cgkbVar.b(conversationIdType);
        if (notificationChannelC == null) {
            return;
        }
        cgkbVar.j(notificationChannelC.getId());
    }
}

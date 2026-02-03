package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxrr extends cqdj {
    final /* synthetic */ Activity a;
    final /* synthetic */ cxsa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxrr(cxsa cxsaVar, Activity activity) {
        super("Bugle.Async.DebugUtils.showNotificationChannelsInfo.Duration");
        this.a = activity;
        this.b = cxsaVar;
    }

    @Override // defpackage.cqdj
    protected final /* bridge */ /* synthetic */ Object a(Object[] objArr) {
        cxsa cxsaVar = this.b;
        NotificationManager notificationManager = (NotificationManager) cxsaVar.x.getSystemService("notification");
        if (notificationManager == null) {
            return "Unable to retrieve notification manager.";
        }
        ArrayList arrayList = new ArrayList(notificationManager.getNotificationChannels());
        StringBuilder sb = new StringBuilder();
        sb.append("Found ");
        sb.append(arrayList.size());
        sb.append(" channel(s)");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            NotificationChannel notificationChannelM = akc$$ExternalSyntheticApiModelOutline0.m(arrayList.get(i));
            sb.append("\n");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(notificationChannelM.getName().toString());
            String id = notificationChannelM.getId();
            cssr.e(sb2, "Id: ", id, "\n");
            cssr.e(sb2, "Conversation: ", String.valueOf(((bakt) cxsaVar.D.b()).I(barn.b(id))), "\n");
            cssr.e(sb2, "Description: ", notificationChannelM.getDescription(), "\n");
            cssr.e(sb2, "Group: ", notificationChannelM.getGroup(), "\n");
            cssr.e(sb2, "Sound: ", notificationChannelM.getSound().toString(), "\n");
            cssr.e(sb2, "Importance: ", String.valueOf(notificationChannelM.getImportance()), "\n");
            cssr.e(sb2, "Show badge: ", String.valueOf(notificationChannelM.canShowBadge()), "\n");
            cssr.e(sb2, "Vibration: ", String.valueOf(notificationChannelM.shouldVibrate()), "\n");
            cssr.d(sb, sb2.toString(), "\n");
        }
        return sb.toString();
    }

    @Override // defpackage.cqdj
    protected final /* bridge */ /* synthetic */ void d(Object obj) {
        new AlertDialog.Builder(this.a).setTitle("Notification channels").setMessage((String) obj).setCancelable(true).show();
    }
}

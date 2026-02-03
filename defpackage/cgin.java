package defpackage;

import android.app.NotificationManager;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgin {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/notification2o/DittoNotificationChannelManager");
    public final Context b;
    public final cgkb c;
    public final cglm d;
    public final NotificationManager e;

    public cgin(Context context, cgkb cgkbVar, cglm cglmVar) {
        context.getClass();
        cgkbVar.getClass();
        this.b = context;
        this.c = cgkbVar;
        this.d = cglmVar;
        Object systemService = context.getSystemService("notification");
        systemService.getClass();
        this.e = (NotificationManager) systemService;
    }
}

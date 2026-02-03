package defpackage;

import android.content.Context;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cizs {
    public final esty a;

    public cizs(Context context, esty estyVar) {
        this.a = estyVar;
        HashMap map = new HashMap();
        fbus.b("bugle.smapi.rcs.MessagingEngineNotificationService", espo.c(context, ekhx.r("com.google.android.ims", "com.google.android.apps.messaging")), map);
        estyVar.b(fbus.a(map));
    }
}

package defpackage;

import android.content.Intent;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbak implements ehti {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/youtube/YouTubePlayerActionListener");
    public final fcsu b;
    private final fcsu c;

    public dbak(fcsu fcsuVar, fcsu fcsuVar2) {
        fcsuVar.getClass();
        this.c = fcsuVar;
        this.b = fcsuVar2;
    }

    @Override // defpackage.ehti
    public final /* bridge */ /* synthetic */ ListenableFuture a(Intent intent) {
        intent.getClass();
        Object objB = this.c.b();
        objB.getClass();
        return auvw.c((fdjx) objB, fcyi.a, fdjz.a, new dbaj(intent, this, null));
    }
}

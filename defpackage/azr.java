package defpackage;

import android.os.Handler;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class azr implements brm {
    public static final bjo a = new bhd("camerax.core.appConfig.cameraFactoryProvider", bip.class, null);
    public static final bjo b = new bhd("camerax.core.appConfig.deviceSurfaceManagerProvider", bio.class, null);
    public static final bjo c = new bhd("camerax.core.appConfig.useCaseConfigFactoryProvider", bnl.class, null);
    static final bjo d = new bhd("camerax.core.appConfig.cameraExecutor", Executor.class, null);
    static final bjo e = new bhd("camerax.core.appConfig.schedulerHandler", Handler.class, null);
    static final bjo f = new bhd("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE, null);
    static final bjo g = new bhd("camerax.core.appConfig.availableCamerasLimiter", azg.class, null);
    static final bjo h = new bhd("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE, null);
    static final bjo i = new bhd("camerax.core.appConfig.cameraProviderInitRetryPolicy", bcl.class, null);
    static final bjo j = new bhd("camerax.core.appConfig.quirksSettings", blt.class, null);
    public static final bjo k = new bhd("camerax.core.appConfig.configImplType", Integer.TYPE, null);
    public final blo l;

    public azr(blo bloVar) {
        this.l = bloVar;
    }

    @Override // defpackage.bjq
    public final /* synthetic */ bjp i(bjo bjoVar) {
        return blz.a(this, bjoVar);
    }

    @Override // defpackage.bma
    public final bjq j() {
        return this.l;
    }

    @Override // defpackage.bma, defpackage.bjq
    public final /* synthetic */ Object m(bjo bjoVar) {
        return blz.b(this, bjoVar);
    }

    @Override // defpackage.bma, defpackage.bjq
    public final /* synthetic */ Object n(bjo bjoVar, Object obj) {
        return blz.c(this, bjoVar, obj);
    }

    @Override // defpackage.bjq
    public final /* synthetic */ Object o(bjo bjoVar, bjp bjpVar) {
        return blz.d(this, bjoVar, bjpVar);
    }

    @Override // defpackage.brm
    public final /* synthetic */ String p() {
        throw null;
    }

    @Override // defpackage.brm
    public final /* synthetic */ String q(String str) {
        throw null;
    }

    @Override // defpackage.bjq
    public final /* synthetic */ Set r(bjo bjoVar) {
        return blz.e(this, bjoVar);
    }

    @Override // defpackage.bma, defpackage.bjq
    public final /* synthetic */ Set s() {
        return blz.f(this);
    }

    @Override // defpackage.bma, defpackage.bjq
    public final /* synthetic */ boolean t(bjo bjoVar) {
        return blz.g(this, bjoVar);
    }

    @Override // defpackage.bjq
    public final /* synthetic */ void v(ayf ayfVar) {
        blz.h(this, ayfVar);
    }
}

package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;
import org.chromium.net.impl.CronetUrlRequestContext;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fggb extends fgcn {
    private static final AtomicLong q = new AtomicLong(0);

    /* JADX WARN: Illegal instructions before constructor call */
    public fggb(Context context) {
        ClassLoader classLoader = fgcn.class.getClassLoader();
        super(context, classLoader.toString().startsWith("java.lang.BootClassLoader") ? fgcy.CRONET_SOURCE_PLATFORM : !ExperimentalCronetEngine.class.getClassLoader().equals(classLoader) ? fgcy.CRONET_SOURCE_PLAY_SERVICES : fgcy.CRONET_SOURCE_STATICALLY_LINKED);
    }

    @Override // defpackage.fgcn, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder addPublicKeyPins(String str, Set set, boolean z, Date date) {
        super.f(str, set, z, date);
        return this;
    }

    @Override // defpackage.fgcn, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder addQuicHint(String str, int i, int i2) {
        super.g(str, i, i2);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ExperimentalCronetEngine build() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.h == null) {
            this.h = getDefaultUserAgent();
        }
        return new CronetUrlRequestContext(this, jUptimeMillis);
    }

    @Override // defpackage.fgcn, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ ICronetEngineBuilder enableBrotli(boolean z) {
        this.l = z;
        return this;
    }

    @Override // defpackage.fgcn, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ ICronetEngineBuilder enableHttp2(boolean z) {
        this.k = z;
        return this;
    }

    @Override // defpackage.fgcn, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder enableHttpCache(int i, long j) {
        super.h(i, j);
        return this;
    }

    @Override // defpackage.fgcn, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ ICronetEngineBuilder enableNetworkQualityEstimator(boolean z) {
        this.p = z;
        return this;
    }

    @Override // defpackage.fgcn, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
        this.g = z;
        return this;
    }

    @Override // defpackage.fgcn, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ ICronetEngineBuilder enableQuic(boolean z) {
        this.j = z;
        return this;
    }

    @Override // defpackage.fgcn, org.chromium.net.ICronetEngineBuilder
    protected final long getLogCronetInitializationRef() {
        AtomicLong atomicLong = q;
        atomicLong.compareAndSet(0L, this.b.a());
        return atomicLong.get();
    }

    @Override // defpackage.fgcn, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ ICronetEngineBuilder setExperimentalOptions(String str) {
        this.o = str;
        return this;
    }

    @Override // defpackage.fgcn, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder setStoragePath(String str) {
        super.j(str);
        return this;
    }

    @Override // defpackage.fgcn, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder setThreadPriority(int i) {
        super.k(i);
        return this;
    }

    @Override // defpackage.fgcn, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ ICronetEngineBuilder setUserAgent(String str) {
        this.h = str;
        return this;
    }

    @Override // defpackage.fgcn, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder enableSdch(boolean z) {
        return this;
    }

    @Override // defpackage.fgcn, org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        return this;
    }
}

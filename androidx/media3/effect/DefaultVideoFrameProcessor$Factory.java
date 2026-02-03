package androidx.media3.effect;

import android.content.Context;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.Pair;
import androidx.media3.effect.DefaultVideoFrameProcessor$Factory;
import defpackage.mag;
import defpackage.maj;
import defpackage.may;
import defpackage.mcw;
import defpackage.mcy;
import defpackage.mcz;
import defpackage.mgb;
import defpackage.mjy;
import defpackage.mlb;
import defpackage.mml;
import defpackage.mos;
import defpackage.mou;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class DefaultVideoFrameProcessor$Factory implements mcy {
    public final boolean a;
    public final may b;
    public final ExecutorService c;
    public final mml d;
    public final int e;
    public final boolean f;

    /* compiled from: PG */
    public static final class Builder {
        public ExecutorService a;
        public may b;
        public mml c;
        public int d;
        private boolean e;
        private final boolean f;

        public Builder() {
            this.f = true;
        }

        public DefaultVideoFrameProcessor$Factory build() {
            return new DefaultVideoFrameProcessor$Factory(!this.f, this.b, this.a, this.c, this.d, this.e);
        }

        public Builder setEnableReplayableCache(boolean z) {
            this.e = z;
            return this;
        }

        public Builder(DefaultVideoFrameProcessor$Factory defaultVideoFrameProcessor$Factory) {
            this.a = defaultVideoFrameProcessor$Factory.c;
            this.b = defaultVideoFrameProcessor$Factory.b;
            this.c = defaultVideoFrameProcessor$Factory.d;
            this.d = defaultVideoFrameProcessor$Factory.e;
            this.e = defaultVideoFrameProcessor$Factory.f;
            this.f = !defaultVideoFrameProcessor$Factory.a;
        }
    }

    public DefaultVideoFrameProcessor$Factory(boolean z, may mayVar, ExecutorService executorService, mml mmlVar, int i, boolean z2) {
        this.a = z;
        this.b = mayVar;
        this.c = executorService;
        this.d = mmlVar;
        this.e = i;
        this.f = z2;
    }

    @Override // defpackage.mcy
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final mlb a(final Context context, final maj majVar, final mag magVar, final boolean z, final Executor executor, final mcz mczVar) throws mcw {
        ExecutorService executorService = this.c;
        boolean z2 = executorService != null;
        ExecutorService executorServiceR = executorService == null ? mgb.R("Effect:DefaultVideoFrameProcessor:GlThread") : executorService;
        final mou mouVar = new mou(executorServiceR, !z2, new mos() { // from class: mky
            @Override // defpackage.mos
            public final void a(mcw mcwVar) {
                mczVar.b(mcwVar);
            }
        });
        may mjyVar = this.b;
        final boolean z3 = mjyVar == null || executorService == null;
        if (mjyVar == null) {
            mjyVar = new mjy();
        }
        final may mayVar = mjyVar;
        try {
            return (mlb) executorServiceR.submit(new Callable() { // from class: mkz
                @Override // java.util.concurrent.Callable
                public final Object call() throws meu {
                    Pair pairK;
                    int i = mlb.n;
                    may mayVar2 = mayVar;
                    EGLDisplay eGLDisplayH = mev.h();
                    mag magVar2 = magVar;
                    boolean zI = mag.i(magVar2);
                    int[] iArr = zI ? mev.b : mev.a;
                    try {
                        pairK = mlb.k(mayVar2, eGLDisplayH, 3, iArr);
                    } catch (meu unused) {
                        pairK = mlb.k(mayVar2, eGLDisplayH, 2, iArr);
                    }
                    Pair pair = pairK;
                    DefaultVideoFrameProcessor$Factory defaultVideoFrameProcessor$Factory = this.a;
                    mcz mczVar2 = mczVar;
                    Executor executor2 = executor;
                    mou mouVar2 = mouVar;
                    boolean z4 = z;
                    Context context2 = context;
                    mag magVar3 = new mag(magVar2.c, magVar2.d, 1, null, magVar2.g, magVar2.h);
                    if (true != zI) {
                        magVar3 = magVar2;
                    }
                    return new mlb(context2, mayVar2, z3, eGLDisplayH, new mmp(context2, magVar3, mayVar2, mouVar2, executor2, new mkq(mczVar2), defaultVideoFrameProcessor$Factory.a), mouVar2, mczVar2, executor2, new mlx(context2, eGLDisplayH, (EGLContext) pair.first, (EGLSurface) pair.second, magVar2, mouVar2, executor2, mczVar2, defaultVideoFrameProcessor$Factory.d, defaultVideoFrameProcessor$Factory.e, z4), z4, magVar2, majVar, defaultVideoFrameProcessor$Factory.f ? new mno(context2, zI) : null);
                }
            }).get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new mcw(e);
        } catch (ExecutionException e2) {
            throw new mcw(e2);
        }
    }
}

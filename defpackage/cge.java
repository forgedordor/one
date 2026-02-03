package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cge extends MediaCodec.Callback {
    public static final /* synthetic */ int c = 0;
    final /* synthetic */ cgh b;
    private final chf d;
    private boolean e;
    private boolean m;
    private boolean f = false;
    private boolean g = false;
    private boolean h = false;
    private long i = 0;
    private long j = 0;
    private boolean k = false;
    private boolean l = false;
    public boolean a = false;

    public cge(cgh cghVar) {
        this.b = cghVar;
        this.e = true;
        this.m = cghVar.c;
        if (cghVar.c) {
            this.d = new chf(cghVar.D, cghVar.B, (CameraUseInconsistentTimebaseQuirk) ccu.a(CameraUseInconsistentTimebaseQuirk.class));
        } else {
            this.d = null;
        }
        if (((CodecStuckOnFlushQuirk) ccu.a(CodecStuckOnFlushQuirk.class)) == null || !"video/mp4v-es".equals(cghVar.d.getString("mime"))) {
            return;
        }
        this.e = false;
    }

    private final void e(final ceb cebVar, final ceh cehVar, Executor executor) {
        cgh cghVar = this.b;
        cghVar.m.add(cebVar);
        bqk.i(cebVar.f(), new cgd(this, cebVar), cghVar.h);
        try {
            executor.execute(new Runnable() { // from class: cfy
                @Override // java.lang.Runnable
                public final void run() {
                    int i = cge.c;
                    cehVar.c(cebVar);
                }
            });
        } catch (RejectedExecutionException e) {
            bbs.d(this.b.a, "Unable to post to the supplied executor.", e);
            cebVar.close();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x02b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:233:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final /* synthetic */ void a(android.media.MediaCodec.BufferInfo r30, android.media.MediaCodec r31, int r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1130
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cge.a(android.media.MediaCodec$BufferInfo, android.media.MediaCodec, int):void");
    }

    final /* synthetic */ void b(final MediaFormat mediaFormat) {
        final ceh cehVar;
        Executor executor;
        if (this.a) {
            bbs.f(this.b.a, "Receives onOutputFormatChanged after codec is reset.");
            return;
        }
        cgh cghVar = this.b;
        int i = cghVar.C;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 0:
            case 7:
            case 8:
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                if (cghVar.c && !cgh.v(cghVar.o)) {
                    mediaFormat.setInteger("time-lapse-enable", 1);
                    mediaFormat.setInteger("time-lapse-fps", cghVar.d.getInteger("capture-rate"));
                }
                synchronized (cghVar.b) {
                    cehVar = cghVar.q;
                    executor = cghVar.r;
                }
                try {
                    executor.execute(new Runnable() { // from class: cga
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i3 = cge.c;
                            cehVar.d(new cfz(mediaFormat));
                        }
                    });
                    return;
                } catch (RejectedExecutionException e) {
                    bbs.d(this.b.a, "Unable to post to the supplied executor.", e);
                    return;
                }
            default:
                int i3 = this.b.C;
                Objects.toString(cfr.a(i3));
                throw new IllegalStateException("Unknown state: ".concat(cfr.a(i3)));
        }
    }

    final /* synthetic */ void c(Executor executor, final ceh cehVar) {
        if (this.b.C == 8) {
            return;
        }
        try {
            cehVar.getClass();
            executor.execute(new Runnable() { // from class: cfv
                @Override // java.lang.Runnable
                public final void run() {
                    cehVar.b();
                }
            });
        } catch (RejectedExecutionException e) {
            bbs.d(this.b.a, "Unable to post to the supplied executor.", e);
        }
    }

    final void d() {
        final ceh cehVar;
        final Executor executor;
        if (this.h) {
            return;
        }
        this.h = true;
        cgh cghVar = this.b;
        Future future = cghVar.A;
        if (future != null) {
            future.cancel(false);
            cghVar.A = null;
        }
        synchronized (cghVar.b) {
            cehVar = cghVar.q;
            executor = cghVar.r;
        }
        this.b.s(new Runnable() { // from class: cfx
            @Override // java.lang.Runnable
            public final void run() {
                this.a.c(executor, cehVar);
            }
        });
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, final MediaCodec.CodecException codecException) {
        this.b.h.execute(new Runnable() { // from class: cgc
            @Override // java.lang.Runnable
            public final void run() {
                cgh cghVar = this.a.b;
                int i = cghVar.C;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                switch (i2) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        cghVar.j(codecException);
                        return;
                    default:
                        int i3 = cghVar.C;
                        Objects.toString(cfr.a(i3));
                        throw new IllegalStateException("Unknown state: ".concat(cfr.a(i3)));
                }
            }
        });
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, final int i) {
        this.b.h.execute(new Runnable() { // from class: cfs
            @Override // java.lang.Runnable
            public final void run() {
                cge cgeVar = this.a;
                boolean z = cgeVar.a;
                cgh cghVar = cgeVar.b;
                if (z) {
                    bbs.f(cghVar.a, "Receives input frame after codec is reset.");
                    return;
                }
                int i2 = cghVar.C;
                int i3 = i2 - 1;
                if (i2 == 0) {
                    throw null;
                }
                switch (i3) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        cghVar.j.offer(Integer.valueOf(i));
                        cghVar.m();
                        return;
                    default:
                        int i4 = cghVar.C;
                        Objects.toString(cfr.a(i4));
                        throw new IllegalStateException("Unknown state: ".concat(cfr.a(i4)));
                }
            }
        });
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(final MediaCodec mediaCodec, final int i, final MediaCodec.BufferInfo bufferInfo) {
        this.b.h.execute(new Runnable() { // from class: cfu
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.a.a(bufferInfo, mediaCodec, i);
            }
        });
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, final MediaFormat mediaFormat) {
        Objects.toString(mediaFormat);
        String strValueOf = String.valueOf(mediaFormat);
        cgh cghVar = this.b;
        bbs.a(cghVar.a, "onOutputFormatChanged = ".concat(strValueOf));
        cghVar.h.execute(new Runnable() { // from class: cft
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b(mediaFormat);
            }
        });
    }
}

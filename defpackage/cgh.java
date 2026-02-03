package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.util.LruCache;
import android.util.Range;
import android.util.Rational;
import android.view.Surface;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.compat.quirk.PreviewFreezeAfterHighSpeedRecordingQuirk;
import androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk;
import androidx.camera.video.internal.compat.quirk.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgh implements cef {
    public static final /* synthetic */ int E = 0;
    private static final Range F = Range.create(Long.MAX_VALUE, Long.MAX_VALUE);
    public Future A;
    final int B;
    int C;
    final cff D;
    private final kog G;
    final String a;
    final boolean c;
    public final MediaFormat d;
    final MediaCodec e;
    public final ced f;
    public final cgi g;
    public final Executor h;
    public final ListenableFuture i;
    public final Rational o;
    public final boolean p;
    final Object b = new Object();
    final Queue j = new ArrayDeque();
    public final Queue k = new ArrayDeque();
    public final Set l = new HashSet();
    final Set m = new HashSet();
    final Deque n = new ArrayDeque();
    ceh q = ceh.e;
    Executor r = bpc.a();
    Range s = F;
    long t = 0;
    boolean u = false;
    Long v = null;
    Future w = null;
    private cge H = null;
    public boolean x = false;
    public boolean y = false;
    boolean z = false;

    public cgh(Executor executor, cei ceiVar, int i) throws cgm {
        boolean z = false;
        lcg.i(executor);
        lcg.i(ceiVar);
        LruCache lruCache = cgw.a;
        MediaCodec mediaCodecA = cgw.a(ceiVar.h());
        this.e = mediaCodecA;
        MediaCodecInfo codecInfo = mediaCodecA.getCodecInfo();
        this.h = new bpq(executor);
        MediaFormat mediaFormatF = ceiVar.f();
        this.d = mediaFormatF;
        int i2 = ceiVar.i();
        this.B = i2;
        this.D = new cff(new akv() { // from class: cet
            @Override // defpackage.akv
            public final Object a(Object obj) {
                return Long.valueOf(this.a.h(((Long) obj).longValue()));
            }
        });
        if (ceiVar instanceof cdp) {
            cdp cdpVar = (cdp) ceiVar;
            this.a = "AudioEncoder";
            this.c = false;
            this.f = new cfq(this);
            this.g = new cdq(codecInfo, ceiVar.h());
            this.o = new Rational(cdpVar.b(), cdpVar.d());
        } else {
            if (!(ceiVar instanceof cgp)) {
                throw new cgm();
            }
            cgp cgpVar = (cgp) ceiVar;
            this.a = "VideoEncoder";
            this.c = true;
            this.f = new cgg(this);
            cgv cgvVar = new cgv(codecInfo, ceiVar.h());
            lcg.c(true);
            if (mediaFormatF.containsKey("bitrate")) {
                int integer = mediaFormatF.getInteger("bitrate");
                int iIntValue = ((Integer) cgvVar.c().clamp(Integer.valueOf(integer))).intValue();
                if (integer != iIntValue) {
                    mediaFormatF.setInteger("bitrate", iIntValue);
                    bbs.a("VideoEncoder", a.s(iIntValue, integer, "updated bitrate from ", " to "));
                }
            }
            this.g = cgvVar;
            this.o = new Rational(cgpVar.b(), cgpVar.d());
        }
        String str = this.a;
        Objects.toString(bmy.a(i2));
        bbs.a(str, "mInputTimebase = ".concat(bmy.a(i2)));
        String str2 = this.a;
        Objects.toString(mediaFormatF);
        bbs.a(str2, "mMediaFormat = ".concat(String.valueOf(mediaFormatF)));
        String str3 = this.a;
        Rational rational = this.o;
        Objects.toString(rational);
        bbs.a(str3, "mCaptureToEncodeFrameRateRatio = ".concat(String.valueOf(rational)));
        try {
            p();
            final AtomicReference atomicReference = new AtomicReference();
            this.i = bqk.d(kol.a(new koi() { // from class: ceu
                @Override // defpackage.koi
                public final Object a(kog kogVar) {
                    int i3 = cgh.E;
                    atomicReference.set(kogVar);
                    return "mReleasedFuture";
                }
            }));
            kog kogVar = (kog) atomicReference.get();
            lcg.i(kogVar);
            this.G = kogVar;
            if (this.c && i == 1 && ccu.a(PreviewFreezeAfterHighSpeedRecordingQuirk.class) != null) {
                z = true;
            }
            this.p = z;
            u(1);
        } catch (MediaCodec.CodecException e) {
            throw new cgm(e);
        }
    }

    static boolean t(MediaCodec.BufferInfo bufferInfo) {
        return (bufferInfo.flags & 1) != 0;
    }

    public static final boolean v(Rational rational) {
        return rational != null && rational.getDenominator() == rational.getNumerator();
    }

    @Override // defpackage.cef
    public final void a() {
        final long jF = f();
        this.h.execute(new Runnable() { // from class: cev
            @Override // java.lang.Runnable
            public final void run() {
                cgh cghVar = this.a;
                int i = cghVar.C;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                switch (i2) {
                    case 0:
                    case 2:
                    case 3:
                    case 5:
                    case 7:
                        return;
                    case 1:
                        long j = jF;
                        bbs.a(cghVar.a, "Pause on ".concat(String.valueOf(cbd.a(j))));
                        cghVar.n.addLast(Range.create(Long.valueOf(j), Long.MAX_VALUE));
                        cghVar.u(3);
                        return;
                    case 4:
                        cghVar.u(6);
                        return;
                    case 6:
                    case 8:
                        throw new IllegalStateException("Encoder is released");
                    default:
                        int i3 = cghVar.C;
                        Objects.toString(cfr.a(i3));
                        throw new IllegalStateException("Unknown state: ".concat(cfr.a(i3)));
                }
            }
        });
    }

    @Override // defpackage.cef
    public final void b() {
        this.h.execute(new Runnable() { // from class: cex
            @Override // java.lang.Runnable
            public final void run() {
                cgh cghVar = this.a;
                int i = cghVar.C;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 7:
                        cghVar.n();
                        return;
                    case 3:
                    case 4:
                    case 5:
                        cghVar.u(7);
                        return;
                    case 6:
                    case 8:
                        return;
                    default:
                        int i3 = cghVar.C;
                        Objects.toString(cfr.a(i3));
                        throw new IllegalStateException("Unknown state: ".concat(cfr.a(i3)));
                }
            }
        });
    }

    @Override // defpackage.cef
    public final void c(ceh cehVar, Executor executor) {
        synchronized (this.b) {
            this.q = cehVar;
            this.r = executor;
        }
    }

    @Override // defpackage.cef
    public final void d() {
        final long jF = f();
        this.h.execute(new Runnable() { // from class: cem
            @Override // java.lang.Runnable
            public final void run() {
                this.a.l(jF);
            }
        });
    }

    @Override // defpackage.cef
    public final void e(final long j) {
        final long jF = f();
        this.h.execute(new Runnable() { // from class: cen
            @Override // java.lang.Runnable
            public final void run() {
                final cgh cghVar = this.a;
                int i = cghVar.C;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                switch (i2) {
                    case 0:
                    case 3:
                    case 7:
                        return;
                    case 1:
                    case 2:
                        cghVar.u(4);
                        Long l = (Long) cghVar.s.getLower();
                        long jLongValue = l.longValue();
                        if (jLongValue == Long.MAX_VALUE) {
                            throw new AssertionError("There should be a \"start\" before \"stop\"");
                        }
                        long j2 = jF;
                        long j3 = j;
                        if (j3 != -1) {
                            if (j3 < jLongValue) {
                                bbs.f(cghVar.a, "The expected stop time is less than the start time. Use current time as stop time.");
                            } else {
                                j2 = j3;
                            }
                        }
                        if (j2 < jLongValue) {
                            throw new AssertionError("The start time should be before the stop time.");
                        }
                        cghVar.s = Range.create(l, Long.valueOf(j2));
                        bbs.a(cghVar.a, "Stop on ".concat(String.valueOf(cbd.a(j2))));
                        if (i == 3 && cghVar.v != null) {
                            cghVar.r();
                            return;
                        } else {
                            cghVar.u = true;
                            cghVar.w = bpn.a().schedule(new Runnable() { // from class: cel
                                @Override // java.lang.Runnable
                                public final void run() {
                                    final cgh cghVar2 = cghVar;
                                    cghVar2.h.execute(new Runnable() { // from class: cew
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            cgh cghVar3 = cghVar2;
                                            if (cghVar3.u) {
                                                bbs.f(cghVar3.a, "The data didn't reach the expected timestamp before timeout, stop the codec.");
                                                cghVar3.v = null;
                                                cghVar3.r();
                                                cghVar3.u = false;
                                            }
                                        }
                                    });
                                }
                            }, 1000L, TimeUnit.MILLISECONDS);
                            return;
                        }
                    case 4:
                    case 5:
                        cghVar.u(1);
                        return;
                    case 6:
                    case 8:
                        throw new IllegalStateException("Encoder is released");
                    default:
                        int i3 = cghVar.C;
                        Objects.toString(cfr.a(i3));
                        throw new IllegalStateException("Unknown state: ".concat(cfr.a(i3)));
                }
            }
        });
    }

    final long f() {
        return this.D.b();
    }

    final long g(MediaCodec.BufferInfo bufferInfo) {
        return this.t > 0 ? bufferInfo.presentationTimeUs - this.t : bufferInfo.presentationTimeUs;
    }

    public final long h(long j) {
        Rational rational = this.o;
        return v(rational) ? j : Math.round(j * rational.doubleValue());
    }

    final ListenableFuture i() {
        int i = this.C;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 0:
                return new bql(new IllegalStateException("Encoder is not started yet."));
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                final AtomicReference atomicReference = new AtomicReference();
                ListenableFuture listenableFutureA = kol.a(new koi() { // from class: ceq
                    @Override // defpackage.koi
                    public final Object a(kog kogVar) {
                        int i3 = cgh.E;
                        atomicReference.set(kogVar);
                        return "acquireInputBuffer";
                    }
                });
                final kog kogVar = (kog) atomicReference.get();
                lcg.i(kogVar);
                this.k.offer(kogVar);
                kogVar.a(new Runnable() { // from class: cer
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.k.remove(kogVar);
                    }
                }, this.h);
                m();
                return listenableFutureA;
            case 7:
                return new bql(new IllegalStateException("Encoder is in error state."));
            case 8:
                return new bql(new IllegalStateException("Encoder is released."));
            default:
                int i3 = this.C;
                Objects.toString(cfr.a(i3));
                throw new IllegalStateException("Unknown state: ".concat(cfr.a(i3)));
        }
    }

    final void j(MediaCodec.CodecException codecException) {
        k(1, codecException.getMessage(), codecException);
    }

    final void k(final int i, final String str, final Throwable th) {
        int i2 = this.C;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        switch (i3) {
            case 0:
                w(str, th);
                p();
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                u(8);
                s(new Runnable() { // from class: cfb
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.w(str, th);
                    }
                });
                return;
            case 7:
                bbs.g(this.a, "Get more than one error: " + str + "(" + i + ")", th);
                return;
            default:
                return;
        }
    }

    final /* synthetic */ void l(long j) {
        int i = this.C;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 0:
                this.v = null;
                bbs.a(this.a, "Start on ".concat(String.valueOf(cbd.a(j))));
                try {
                    if (this.x) {
                        p();
                    }
                    this.s = Range.create(Long.valueOf(j), Long.MAX_VALUE);
                    this.e.start();
                    ced cedVar = this.f;
                    if (cedVar instanceof cfq) {
                        ((cfq) cedVar).f(true);
                    }
                    u(2);
                    return;
                } catch (MediaCodec.CodecException e) {
                    j(e);
                    return;
                }
            case 1:
            case 4:
            case 7:
                return;
            case 2:
                this.v = null;
                Deque deque = this.n;
                Range range = (Range) deque.removeLast();
                lcg.d(range != null && ((Long) range.getUpper()).longValue() == Long.MAX_VALUE, "There should be a \"pause\" before \"resume\"");
                Long l = (Long) range.getLower();
                long jLongValue = l.longValue();
                deque.addLast(Range.create(l, Long.valueOf(j)));
                bbs.a(this.a, "Resume on " + cbd.a(j) + "\nPaused duration = " + cbd.a(j - jLongValue));
                boolean z = this.c;
                if (z || ccu.a(AudioEncoderIgnoresInputTimestampQuirk.class) == null) {
                    if (!z || ccu.a(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null) {
                        q(false);
                        ced cedVar2 = this.f;
                        if (cedVar2 instanceof cfq) {
                            ((cfq) cedVar2).f(true);
                        }
                    }
                    if (z) {
                        o();
                    }
                }
                u(2);
                return;
            case 3:
            case 5:
                u(5);
                return;
            case 6:
            case 8:
                throw new IllegalStateException("Encoder is released");
            default:
                int i3 = this.C;
                Objects.toString(cfr.a(i3));
                throw new IllegalStateException("Unknown state: ".concat(cfr.a(i3)));
        }
    }

    final void m() {
        while (true) {
            Queue queue = this.k;
            if (queue.isEmpty()) {
                return;
            }
            Queue queue2 = this.j;
            if (queue2.isEmpty()) {
                return;
            }
            kog kogVar = (kog) queue.poll();
            kogVar.getClass();
            Integer num = (Integer) queue2.poll();
            num.getClass();
            try {
                final cfe cfeVar = new cfe(this, this.e, num.intValue());
                if (kogVar.b(cfeVar)) {
                    this.l.add(cfeVar);
                    cfeVar.b().b(new Runnable() { // from class: ces
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.l.remove(cfeVar);
                        }
                    }, this.h);
                } else {
                    cfeVar.d();
                }
            } catch (MediaCodec.CodecException e) {
                j(e);
                return;
            }
        }
    }

    public final void n() {
        Surface surface;
        HashSet hashSet;
        if (this.x) {
            if (!this.p) {
                this.e.stop();
            }
            this.x = false;
        }
        this.e.release();
        ced cedVar = this.f;
        if (cedVar instanceof cgg) {
            cgg cggVar = (cgg) cedVar;
            synchronized (cggVar.a) {
                surface = cggVar.b;
                cggVar.b = null;
                Set set = cggVar.c;
                hashSet = new HashSet(set);
                set.clear();
            }
            if (surface != null) {
                surface.release();
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Surface) it.next()).release();
            }
        }
        u(9);
        this.G.b(null);
    }

    final void o() {
        Bundle bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        this.e.setParameters(bundle);
    }

    public final void p() {
        cee ceeVar;
        Executor executor;
        this.s = F;
        this.t = 0L;
        this.n.clear();
        this.j.clear();
        Queue queue = this.k;
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            ((kog) it.next()).d();
        }
        queue.clear();
        MediaCodec mediaCodec = this.e;
        mediaCodec.reset();
        this.x = false;
        this.y = false;
        this.z = false;
        this.u = false;
        Future future = this.w;
        Surface surface = null;
        if (future != null) {
            future.cancel(true);
            this.w = null;
        }
        Future future2 = this.A;
        if (future2 != null) {
            future2.cancel(false);
            this.A = null;
        }
        cge cgeVar = this.H;
        if (cgeVar != null) {
            cgeVar.a = true;
        }
        cge cgeVar2 = new cge(this);
        this.H = cgeVar2;
        mediaCodec.setCallback(cgeVar2);
        mediaCodec.configure(this.d, (Surface) null, (MediaCrypto) null, 1);
        ced cedVar = this.f;
        if (cedVar instanceof cgg) {
            cgg cggVar = (cgg) cedVar;
            EncoderNotUsePersistentInputSurfaceQuirk encoderNotUsePersistentInputSurfaceQuirk = (EncoderNotUsePersistentInputSurfaceQuirk) ccu.a(EncoderNotUsePersistentInputSurfaceQuirk.class);
            synchronized (cggVar.a) {
                if (encoderNotUsePersistentInputSurfaceQuirk == null) {
                    Surface surface2 = cggVar.b;
                    if (surface2 == null) {
                        cggVar.b = MediaCodec.createPersistentInputSurface();
                        surface = cggVar.b;
                        surface2 = surface;
                    }
                    cggVar.f.e.setInputSurface(surface2);
                } else {
                    Surface surface3 = cggVar.b;
                    if (surface3 != null) {
                        cggVar.c.add(surface3);
                    }
                    cggVar.b = cggVar.f.e.createInputSurface();
                    surface = cggVar.b;
                }
                ceeVar = cggVar.d;
                executor = cggVar.e;
            }
            if (surface == null || ceeVar == null || executor == null) {
                return;
            }
            cggVar.a(executor, ceeVar, surface);
        }
    }

    final void q(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("drop-input-frames", z ? 1 : 0);
        this.e.setParameters(bundle);
    }

    final void r() {
        bbs.a(this.a, "signalCodecStop");
        ced cedVar = this.f;
        if (cedVar instanceof cfq) {
            ((cfq) cedVar).f(false);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.l.iterator();
            while (it.hasNext()) {
                arrayList.add(((cgl) it.next()).b());
            }
            bqk.e(arrayList).b(new Runnable() { // from class: cek
                @Override // java.lang.Runnable
                public final void run() {
                    cgh cghVar = this.a;
                    bqk.i(cghVar.i(), new cfd(cghVar), cghVar.h);
                }
            }, this.h);
            return;
        }
        if (cedVar instanceof cgg) {
            try {
                if (ccu.a(SignalEosOutputBufferNotComeQuirk.class) != null) {
                    final cge cgeVar = this.H;
                    final Executor executor = this.h;
                    Future future = this.A;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.A = bpn.a().schedule(new Runnable() { // from class: ceo
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i = cgh.E;
                            final cge cgeVar2 = cgeVar;
                            cgeVar2.getClass();
                            executor.execute(new Runnable() { // from class: cep
                                @Override // java.lang.Runnable
                                public final void run() {
                                    cgeVar2.d();
                                }
                            });
                        }
                    }, 1000L, TimeUnit.MILLISECONDS);
                }
                this.e.signalEndOfInputStream();
                this.z = true;
            } catch (MediaCodec.CodecException e) {
                j(e);
            }
        }
    }

    final void s(final Runnable runnable) {
        String str = this.a;
        bbs.a(str, "stopMediaCodec");
        final ArrayList arrayList = new ArrayList();
        Set set = this.m;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((ceb) it.next()).f());
        }
        Set set2 = this.l;
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((cgl) it2.next()).b());
        }
        if (!arrayList.isEmpty()) {
            bbs.a(str, "Waiting for resources to return. encoded data = " + set.size() + ", input buffers = " + set2.size());
        }
        bqk.e(arrayList).b(new Runnable() { // from class: cfa
            @Override // java.lang.Runnable
            public final void run() {
                cgh cghVar = this.a;
                if (cghVar.C != 8) {
                    if (!arrayList.isEmpty()) {
                        bbs.a(cghVar.a, "encoded data and input buffers are returned");
                    }
                    if ((cghVar.f instanceof cgg) && !cghVar.y && ccu.a(StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.class) == null) {
                        if (cghVar.p) {
                            cghVar.e.stop();
                        } else {
                            cghVar.e.flush();
                        }
                        cghVar.x = true;
                    } else {
                        cghVar.e.stop();
                    }
                }
                runnable.run();
                int i = cghVar.C;
                if (i == 7) {
                    cghVar.n();
                    return;
                }
                if (!cghVar.x) {
                    cghVar.p();
                }
                cghVar.u(1);
                if (i != 5) {
                    if (i != 6) {
                        return;
                    } else {
                        i = 6;
                    }
                }
                cghVar.d();
                if (i == 6) {
                    cghVar.a();
                }
            }
        }, this.h);
    }

    public final void u(int i) {
        if (this.C == i) {
            return;
        }
        bbs.a(this.a, "Transitioning encoder internal state: " + ((Object) cfr.a(this.C)) + " --> " + ((Object) cfr.a(i)));
        this.C = i;
    }

    final void w(final String str, final Throwable th) {
        final ceh cehVar;
        Executor executor;
        synchronized (this.b) {
            cehVar = this.q;
            executor = this.r;
        }
        try {
            executor.execute(new Runnable() { // from class: cej
                @Override // java.lang.Runnable
                public final void run() {
                    int i = cgh.E;
                    cehVar.a(new cdy(str, th));
                }
            });
        } catch (RejectedExecutionException e) {
            bbs.d(this.a, "Unable to post to the supplied executor.", e);
        }
    }
}

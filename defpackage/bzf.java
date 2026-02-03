package defpackage;

import android.media.AudioManager$AudioRecordingCallback;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Size;
import android.view.Surface;
import androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzf implements cap {
    public static final bxs a;
    public static final bxz ae;
    private static final Set ai = DesugarCollections.unmodifiableSet(EnumSet.of(bze.PENDING_RECORDING, bze.PENDING_PAUSED));
    private static final Set aj = DesugarCollections.unmodifiableSet(EnumSet.of(bze.CONFIGURING, bze.IDLING, bze.RESETTING, bze.STOPPING, bze.ERROR));
    private static final bxh ak;
    private static final Executor al;
    public static final cax b;
    public static final Exception c;
    static final int d;
    static final long e;
    MediaMuxer A;
    final blj B;
    cby C;
    cef D;
    cef E;
    Uri F;
    long G;
    long H;
    long I;
    long J;
    long K;
    long L;
    long M;
    long N;
    int O;
    Throwable P;
    cdz Q;
    Throwable R;
    public boolean S;
    ScheduledFuture T;
    public boolean U;
    can V;
    public cgp W;
    can X;
    public double Y;
    public bzd Z;
    public boolean aa;
    int ab;
    int ac;
    int ad;
    cfz af;
    cfz ag;
    final bsa ah;
    private final blj am;
    private bze an;
    private bdn ao;
    private long ap;
    private cbf aq;
    public final blj f;
    public final Executor g;
    public final Executor h;
    public final Object i = new Object();
    public final boolean j;
    public final blj k;
    public bze l;
    int m;
    public byz n;
    public byz o;
    public long p;
    byz q;
    boolean r;
    public bdn s;
    public cbg t;
    final List u;
    Integer v;
    Integer w;
    bdp x;
    Surface y;
    Surface z;

    /* JADX WARN: Type inference failed for: r0v11, types: [bxz] */
    static {
        bxs bxsVar = cax.f;
        a = bxsVar;
        caw cawVarE = cax.e();
        cawVarE.c(bxsVar);
        cawVarE.b(-1);
        cax caxVarA = cawVarE.a();
        b = caxVarA;
        bxg bxgVarE = bxh.e();
        bxgVarE.c();
        bxgVarE.d(caxVarA);
        ak = bxgVarE.a();
        c = new RuntimeException("The video frame producer became inactive before any data was received.");
        ae = new Object() { // from class: bxz
        };
        al = new bpq(bpm.a());
        d = 3;
        e = 1000L;
    }

    public bzf(bxh bxhVar) {
        this.j = ccu.a(EncoderNotUsePersistentInputSurfaceQuirk.class) != null;
        this.k = new blj(null);
        this.l = bze.CONFIGURING;
        this.an = null;
        this.m = 0;
        this.n = null;
        this.o = null;
        this.p = 0L;
        this.q = null;
        this.r = false;
        this.ao = null;
        this.s = null;
        this.t = null;
        this.u = new ArrayList();
        this.v = null;
        this.w = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.C = null;
        this.D = null;
        this.af = null;
        this.E = null;
        this.ag = null;
        this.ac = 1;
        this.F = Uri.EMPTY;
        this.G = 0L;
        this.H = 0L;
        this.I = 0L;
        this.J = Long.MAX_VALUE;
        this.K = Long.MAX_VALUE;
        this.L = Long.MAX_VALUE;
        this.M = Long.MAX_VALUE;
        this.N = 0L;
        this.O = 1;
        this.P = null;
        this.Q = null;
        this.ah = new bsa(60, null);
        this.R = null;
        this.S = false;
        this.ad = 3;
        this.T = null;
        this.U = false;
        this.W = null;
        this.X = null;
        this.Y = 0.0d;
        this.Z = null;
        this.aq = null;
        this.ap = Long.MAX_VALUE;
        this.aa = false;
        Executor executorA = bpm.a();
        this.g = executorA;
        bpq bpqVar = new bpq(executorA);
        this.h = bpqVar;
        bwq bwqVar = new bwq(bxhVar);
        if (((bwz) ((bwr) bxhVar).a).d == -1) {
            bwqVar.e(new lbz() { // from class: bya
                @Override // defpackage.lbz
                public final void accept(Object obj) {
                    ((caw) obj).b(((bwz) bzf.b).d);
                }
            });
        }
        this.B = new blj(bwqVar.a());
        int i = this.m;
        int iL = L(this.l);
        int i2 = bzj.d;
        this.am = new blj(new bwx(i, iL, null));
        this.f = new blj(false);
        this.V = new can(bpqVar, executorA);
        bbs.a("Recorder", "mRequiredFreeStorageBytes = ".concat(String.valueOf(cgy.a(52428800L))));
    }

    public static boolean A(bzh bzhVar, byz byzVar) {
        return byzVar != null && bzhVar.b == ((bwv) byzVar).c;
    }

    static final Object F(bmq bmqVar) {
        try {
            return bmqVar.b().get();
        } catch (InterruptedException | ExecutionException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private final void H() {
        while (true) {
            bsa bsaVar = this.ah;
            if (bsaVar.c()) {
                return;
            } else {
                bsaVar.a();
            }
        }
    }

    private final void I() {
        final cby cbyVar = this.C;
        if (cbyVar == null) {
            throw new AssertionError("Cannot release null audio source.");
        }
        this.C = null;
        bbs.a("Recorder", String.format("Releasing audio source: 0x%x", Integer.valueOf(cbyVar.hashCode())));
        bqk.i(kol.a(new koi() { // from class: cbn
            @Override // defpackage.koi
            public final Object a(final kog kogVar) {
                final cby cbyVar2 = cbyVar;
                cbyVar2.a.execute(new Runnable() { // from class: cbq
                    @Override // java.lang.Runnable
                    public final void run() {
                        cby cbyVar3 = cbyVar2;
                        kog kogVar2 = kogVar;
                        try {
                            int i = cbyVar3.s;
                            int i2 = i - 1;
                            if (i == 0) {
                                throw null;
                            }
                            if (i2 == 0 || i2 == 1) {
                                cbyVar3.c(null);
                                cbyVar3.e.b.getAndSet(true);
                                ccc cccVar = cbyVar3.d;
                                if (!((ccr) cccVar).b.getAndSet(true)) {
                                    Executor executor = ((ccr) cccVar).d;
                                    final ccr ccrVar = (ccr) cccVar;
                                    executor.execute(new Runnable() { // from class: ccp
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            AudioManager$AudioRecordingCallback audioManager$AudioRecordingCallback;
                                            ccr ccrVar2 = ccrVar;
                                            ccrVar2.i.set(false);
                                            ccf ccfVar = (ccf) ccrVar2.g;
                                            if (!ccfVar.c.getAndSet(true)) {
                                                if (Build.VERSION.SDK_INT >= 29 && (audioManager$AudioRecordingCallback = ccfVar.i) != null) {
                                                    ccfVar.a.unregisterAudioRecordingCallback(audioManager$AudioRecordingCallback);
                                                }
                                                ccfVar.a.release();
                                            }
                                            synchronized (ccrVar2.e) {
                                                ccrVar2.f = null;
                                                ccrVar2.c.clear();
                                            }
                                        }
                                    });
                                }
                                cbyVar3.e();
                                cbyVar3.g(3);
                            }
                            kogVar2.b(null);
                        } catch (Throwable th) {
                            kogVar2.c(th);
                        }
                    }
                });
                return "AudioSource-release";
            }
        }), new byj(cbyVar), bpc.a());
    }

    private final void J() {
        if (this.E != null) {
            bbs.a("Recorder", "Releasing audio encoder.");
            this.E.b();
            this.E = null;
            this.ag = null;
        }
        if (this.C != null) {
            I();
        }
        E(1);
        if (this.D != null) {
            bbs.a("Recorder", "Releasing video encoder.");
            can canVar = this.X;
            if (canVar != null) {
                lcg.c(canVar.c == this.D);
                cef cefVar = this.D;
                Objects.toString(cefVar);
                bbs.a("Recorder", "Releasing video encoder: ".concat(String.valueOf(cefVar)));
                this.X.b();
                this.X = null;
                this.D = null;
                this.af = null;
                o(null);
            } else {
                g();
            }
        }
        synchronized (this.i) {
            switch (this.l.ordinal()) {
                case 1:
                case 2:
                    K(bze.CONFIGURING);
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    p(bze.CONFIGURING);
                    break;
            }
        }
        this.U = false;
        bdp bdpVar = this.x;
        if (bdpVar == null || bdpVar.d()) {
            return;
        }
        B(this.x, this.ab, false);
    }

    private final void K(bze bzeVar) {
        if (!ai.contains(this.l)) {
            bze bzeVar2 = this.l;
            Objects.toString(bzeVar2);
            throw new AssertionError("Can only updated non-pending state from a pending state, but state is ".concat(String.valueOf(bzeVar2)));
        }
        if (!aj.contains(bzeVar)) {
            Objects.toString(bzeVar);
            throw new AssertionError("Invalid state transition. State is not a valid non-pending state while in a pending state: ".concat(String.valueOf(bzeVar)));
        }
        if (this.an != bzeVar) {
            this.an = bzeVar;
            blj bljVar = this.am;
            int i = this.m;
            int iL = L(bzeVar);
            bdn bdnVar = this.ao;
            int i2 = bzj.d;
            bljVar.e(new bwx(i, iL, bdnVar));
        }
    }

    private static final int L(bze bzeVar) {
        DeactivateEncoderSurfaceBeforeStopEncoderQuirk deactivateEncoderSurfaceBeforeStopEncoderQuirk = (DeactivateEncoderSurfaceBeforeStopEncoderQuirk) ccu.a(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class);
        if (bzeVar != bze.RECORDING) {
            return (bzeVar == bze.STOPPING && deactivateEncoderSurfaceBeforeStopEncoderQuirk == null) ? 1 : 2;
        }
        return 1;
    }

    public static ScheduledFuture h(final Runnable runnable, final Executor executor, long j, TimeUnit timeUnit) {
        return bpn.a().schedule(new Runnable() { // from class: bxt
            @Override // java.lang.Runnable
            public final void run() {
                bxs bxsVar = bzf.a;
                executor.execute(runnable);
            }
        }, j, timeUnit);
    }

    static void k(cef cefVar) {
        if (cefVar instanceof cgh) {
            final cgh cghVar = (cgh) cefVar;
            cghVar.h.execute(new Runnable() { // from class: cez
                @Override // java.lang.Runnable
                public final void run() {
                    cgh cghVar2 = cghVar;
                    cghVar2.y = true;
                    if (cghVar2.x) {
                        if (!cghVar2.p) {
                            cghVar2.e.stop();
                        }
                        cghVar2.p();
                    }
                }
            });
        }
    }

    public final void B(bdp bdpVar, int i, boolean z) {
        if (bdpVar.d()) {
            bbs.f("Recorder", "Ignore the SurfaceRequest since it is already served.");
            return;
        }
        bdpVar.c(this.h, new bdo() { // from class: byd
            @Override // defpackage.bdo
            public final void a(bdn bdnVar) {
                this.a.s = bdnVar;
            }
        });
        Size size = bdpVar.c;
        azv azvVar = bdpVar.d;
        bzl bzlVarF = f(bdpVar.f.c(), bdpVar.h);
        bxa bxaVarA = ((bzg) bzlVarF).a(azvVar);
        bxo bxoVarA = bxaVarA == null ? bxo.h : bxaVarA.a(size);
        bbs.a("Recorder", a.i(size, bxoVarA, "Using supported quality of ", " for surface size "));
        if (bxoVarA != bxo.h) {
            cbg cbgVarC = bzlVarF.c(bxoVarA, azvVar);
            this.t = cbgVarC;
            if (cbgVarC == null) {
                throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles  for advertised quality.");
            }
        }
        cbg cbgVar = this.t;
        Objects.toString(cbgVar);
        bbs.a("Recorder", "mResolvedEncoderProfiles = ".concat(String.valueOf(cbgVar)));
        bzd bzdVar = this.Z;
        if (bzdVar != null) {
            bzdVar.a();
        }
        bzd bzdVar2 = new bzd(this, bdpVar, i, this.aa, z ? d : 0);
        this.Z = bzdVar2;
        bzdVar2.b(bzdVar2.a, bzdVar2.g);
    }

    @Override // defpackage.cap
    public final void C(final int i) {
        this.h.execute(new Runnable() { // from class: bxy
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledFuture scheduledFuture;
                cef cefVar;
                bzf bzfVar = this.a;
                int i2 = bzfVar.ad;
                int i3 = i;
                bzfVar.ad = i3;
                if (i2 == i3) {
                    Objects.toString(cao.a(i3));
                    bbs.a("Recorder", "Video source transitions to the same state: ".concat(cao.a(i3)));
                    return;
                }
                Objects.toString(cao.a(i3));
                bbs.a("Recorder", "Video source has transitioned to state: ".concat(cao.a(i3)));
                if (i3 != 3) {
                    if (i3 != 2 || (scheduledFuture = bzfVar.T) == null || !scheduledFuture.cancel(false) || (cefVar = bzfVar.D) == null) {
                        return;
                    }
                    bzf.k(cefVar);
                    return;
                }
                if (bzfVar.z == null) {
                    bzd bzdVar = bzfVar.Z;
                    if (bzdVar != null) {
                        bzdVar.a();
                        bzfVar.Z = null;
                    }
                    bzfVar.G();
                    return;
                }
                bzfVar.U = true;
                byz byzVar = bzfVar.q;
                if (byzVar != null) {
                    bzfVar.l(byzVar, 4, null);
                }
            }
        });
    }

    @Override // defpackage.cap
    public final void D(final bdp bdpVar, final int i, final boolean z) {
        synchronized (this.i) {
            bbs.a("Recorder", "Surface is requested in state: " + this.l + ", Current surface: " + this.m);
            if (this.l == bze.ERROR) {
                p(bze.CONFIGURING);
            }
        }
        this.h.execute(new Runnable() { // from class: bye
            @Override // java.lang.Runnable
            public final void run() {
                bzf bzfVar = this.a;
                bdp bdpVar2 = bzfVar.x;
                if (bdpVar2 != null && !bdpVar2.d()) {
                    bzfVar.x.f();
                }
                boolean z2 = z;
                int i2 = i;
                bdp bdpVar3 = bdpVar;
                bzfVar.aa = z2;
                bzfVar.x = bdpVar3;
                bzfVar.ab = i2;
                bzfVar.B(bdpVar3, i2, true);
            }
        });
    }

    final void E(int i) {
        bbs.a("Recorder", "Transitioning audio state: " + ((Object) byp.a(this.ac)) + " --> " + ((Object) byp.a(i)));
        this.ac = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    final void G() {
        boolean z;
        boolean z2;
        synchronized (this.i) {
            z = true;
            z2 = false;
            switch (this.l.ordinal()) {
                case 0:
                case 3:
                case 8:
                    break;
                case 1:
                case 2:
                    K(bze.RESETTING);
                    break;
                case 4:
                case 5:
                    lcg.d(this.q != null, "In-progress recording shouldn't be null when in state " + this.l);
                    if (this.n != this.q) {
                        throw new AssertionError("In-progress recording does not match the active recording. Unable to reset encoder.");
                    }
                    p(bze.RESETTING);
                    z2 = true;
                    z = false;
                    break;
                case 6:
                    p(bze.RESETTING);
                    z = false;
                    break;
                case 7:
                default:
                    z = false;
                    break;
            }
        }
        if (z) {
            J();
        } else if (z2) {
            t(this.q, -1L, 4, null);
        }
    }

    @Override // defpackage.cap
    public final blm a() {
        return this.B;
    }

    @Override // defpackage.cap
    public final blm b() {
        return this.am;
    }

    @Override // defpackage.cap
    public final blm c() {
        return this.f;
    }

    public final byz d(bze bzeVar) {
        boolean z;
        if (bzeVar == bze.PENDING_PAUSED) {
            z = true;
        } else {
            if (bzeVar != bze.PENDING_RECORDING) {
                throw new AssertionError("makePendingRecordingActiveLocked() can only be called from a pending state.");
            }
            z = false;
        }
        if (this.n != null) {
            throw new AssertionError("Cannot make pending recording active because another recording is already active.");
        }
        byz byzVar = this.o;
        if (byzVar == null) {
            throw new AssertionError("Pending recording should exist when in a PENDING state.");
        }
        this.n = byzVar;
        byzVar.i.c(bpc.a(), new byo(this));
        this.o = null;
        if (z) {
            p(bze.PAUSED);
            return byzVar;
        }
        p(bze.RECORDING);
        return byzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045 A[PHI: r6
      0x0045: PHI (r6v1 int) = (r6v0 int), (r6v0 int), (r6v0 int), (r6v3 int), (r6v2 int) binds: [B:5:0x000b, B:6:0x000d, B:8:0x0010, B:25:0x0044, B:20:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final defpackage.bzi e() {
        /*
            r14 = this;
            long r0 = r14.I
            long r2 = r14.G
            int r4 = r14.ac
            int r5 = r4 + (-1)
            if (r4 == 0) goto L58
            r6 = 1
            if (r5 == 0) goto L45
            if (r5 == r6) goto L45
            r7 = 2
            if (r5 == r7) goto L45
            r6 = 5
            r8 = 3
            if (r5 == r8) goto L34
            r7 = 4
            if (r5 == r7) goto L46
            if (r5 != r6) goto L1d
        L1b:
            r8 = r7
            goto L46
        L1d:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = defpackage.byp.a(r4)
            java.util.Objects.toString(r1)
            java.lang.String r1 = defpackage.byp.a(r4)
            java.lang.String r2 = "Invalid internal audio state: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L34:
            byz r4 = r14.q
            if (r4 == 0) goto L3f
            boolean r4 = r4.k()
            if (r4 == 0) goto L3f
            goto L45
        L3f:
            boolean r4 = r14.S
            if (r4 == 0) goto L44
            goto L1b
        L44:
            r6 = 0
        L45:
            r8 = r6
        L46:
            java.lang.Throwable r13 = r14.R
            double r9 = r14.Y
            long r11 = r14.H
            int r4 = defpackage.bwj.a
            bwm r7 = new bwm
            r7.<init>(r8, r9, r11, r13)
            bzi r0 = defpackage.bzi.d(r0, r2, r7)
            return r0
        L58:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzf.e():bzi");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cap
    public final bzl f(azd azdVar, int i) {
        return new bzg(azdVar, i == 1 ? 2 : 1);
    }

    public final ListenableFuture g() {
        cef cefVar = this.D;
        Objects.toString(cefVar);
        bbs.a("Recorder", "Try to safely release video encoder: ".concat(String.valueOf(cefVar)));
        can canVar = this.V;
        canVar.a();
        return bqk.d(canVar.h);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014e A[Catch: all -> 0x01c8, TryCatch #0 {, blocks: (B:35:0x00cb, B:37:0x00cf, B:38:0x00d3, B:44:0x00f4, B:45:0x00fc, B:81:0x0194, B:48:0x0109, B:50:0x010d, B:52:0x0113, B:56:0x011b, B:58:0x0127, B:59:0x012e, B:60:0x0146, B:63:0x014a, B:65:0x014e, B:66:0x015e, B:68:0x0162, B:70:0x0168, B:74:0x0170, B:75:0x0179, B:77:0x017d, B:100:0x01bf, B:101:0x01c0, B:102:0x01c7, B:39:0x00d4, B:40:0x00e3, B:42:0x00e9, B:43:0x00f3), top: B:109:0x00cb, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015e A[Catch: all -> 0x01c8, TryCatch #0 {, blocks: (B:35:0x00cb, B:37:0x00cf, B:38:0x00d3, B:44:0x00f4, B:45:0x00fc, B:81:0x0194, B:48:0x0109, B:50:0x010d, B:52:0x0113, B:56:0x011b, B:58:0x0127, B:59:0x012e, B:60:0x0146, B:63:0x014a, B:65:0x014e, B:66:0x015e, B:68:0x0162, B:70:0x0168, B:74:0x0170, B:75:0x0179, B:77:0x017d, B:100:0x01bf, B:101:0x01c0, B:102:0x01c7, B:39:0x00d4, B:40:0x00e3, B:42:0x00e9, B:43:0x00f3), top: B:109:0x00cb, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void i(int r10, java.lang.Throwable r11) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzf.i(int, java.lang.Throwable):void");
    }

    public final void j(byz byzVar, int i, Throwable th) {
        byzVar.h(Uri.EMPTY);
        Throwable th2 = this.R;
        int i2 = bwj.a;
        bzi.d(0L, 0L, new bwm(1, 0.0d, 0L, th2));
        bxl.b(Uri.EMPTY);
        byzVar.i(cav.b(((bwv) byzVar).a, i, th));
    }

    final void l(byz byzVar, int i, Throwable th) {
        boolean z;
        if (byzVar != this.q) {
            throw new AssertionError("Internal error occurred on recording that is not the current in-progress recording.");
        }
        synchronized (this.i) {
            z = false;
            switch (this.l.ordinal()) {
                case 0:
                case 3:
                case 8:
                    throw new AssertionError("In-progress recording error occurred while in unexpected state: " + this.l);
                case 4:
                case 5:
                    p(bze.STOPPING);
                    z = true;
                case 1:
                case 2:
                case 6:
                case 7:
                    if (byzVar != this.n) {
                        throw new AssertionError("Internal error occurred for recording but it is not the active recording.");
                    }
                    break;
            }
        }
        if (z) {
            t(byzVar, -1L, i, th);
        }
    }

    public final void m() {
        if (ai.contains(this.l)) {
            p(this.an);
        } else {
            bze bzeVar = this.l;
            Objects.toString(bzeVar);
            throw new AssertionError("Cannot restore non-pending state when in state ".concat(String.valueOf(bzeVar)));
        }
    }

    final void n(bdn bdnVar) {
        Objects.toString(bdnVar);
        bbs.a("Recorder", "Update stream transformation info: ".concat(String.valueOf(bdnVar)));
        this.ao = bdnVar;
        synchronized (this.i) {
            blj bljVar = this.am;
            int i = this.m;
            int iL = L(this.l);
            int i2 = bzj.d;
            bljVar.e(new bwx(i, iL, bdnVar));
        }
    }

    final void o(Surface surface) {
        int iHashCode;
        if (this.y == surface) {
            return;
        }
        this.y = surface;
        synchronized (this.i) {
            if (surface != null) {
                try {
                    iHashCode = surface.hashCode();
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                iHashCode = 0;
            }
            q(iHashCode);
        }
    }

    public final void p(bze bzeVar) {
        if (this.l == bzeVar) {
            throw new AssertionError("Attempted to transition to state " + bzeVar + ", but Recorder is already in state " + bzeVar);
        }
        bbs.a("Recorder", "Transitioning Recorder internal state: " + this.l + " --> " + bzeVar);
        Set set = ai;
        int iL = 0;
        if (set.contains(bzeVar)) {
            if (!set.contains(this.l)) {
                if (!aj.contains(this.l)) {
                    bze bzeVar2 = this.l;
                    Objects.toString(bzeVar2);
                    throw new AssertionError("Invalid state transition. Should not be transitioning to a PENDING state from state ".concat(String.valueOf(bzeVar2)));
                }
                bze bzeVar3 = this.l;
                this.an = bzeVar3;
                iL = L(bzeVar3);
            }
        } else if (this.an != null) {
            this.an = null;
        }
        this.l = bzeVar;
        if (iL == 0) {
            iL = L(bzeVar);
        }
        blj bljVar = this.am;
        int i = this.m;
        bdn bdnVar = this.ao;
        int i2 = bzj.d;
        bljVar.e(new bwx(i, iL, bdnVar));
    }

    public final void q(int i) {
        if (this.m == i) {
            return;
        }
        bbs.a("Recorder", "Transitioning streamId: " + this.m + " --> " + i);
        this.m = i;
        blj bljVar = this.am;
        int iL = L(this.l);
        bdn bdnVar = this.ao;
        int i2 = bzj.d;
        bljVar.e(new bwx(i, iL, bdnVar));
    }

    final void r(byz byzVar) {
        String message;
        int iD;
        lbz lbzVar;
        if (this.A != null) {
            throw new AssertionError("Unable to set up media muxer when one already exists.");
        }
        if (y() && this.ah.c()) {
            throw new AssertionError("Audio is enabled but no audio sample is ready. Cannot start media muxer.");
        }
        cdz cdzVar = this.Q;
        if (cdzVar == null) {
            throw new AssertionError("Media muxer cannot be started without an encoded video frame.");
        }
        try {
            this.Q = null;
            long jA = cdzVar.a();
            ArrayList arrayList = new ArrayList();
            while (true) {
                bsa bsaVar = this.ah;
                if (bsaVar.c()) {
                    break;
                }
                cdz cdzVar2 = (cdz) bsaVar.a();
                if (cdzVar2.a() >= jA) {
                    arrayList.add(cdzVar2);
                }
            }
            cdzVar.b();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((cdz) it.next()).b();
            }
            try {
                bxh bxhVar = (bxh) F(this.B);
                if (bxhVar.a() == -1) {
                    cbg cbgVar = this.t;
                    iD = bxh.d(((bwr) ak).c);
                    if (cbgVar != null) {
                        int iB = cbgVar.b();
                        if (iB == 1) {
                            iD = 2;
                        } else if (iB == 2) {
                            iD = 0;
                        } else if (iB == 9) {
                            iD = 1;
                        }
                    }
                } else {
                    iD = bxh.d(bxhVar.a());
                }
                lbzVar = new lbz() { // from class: byg
                    @Override // defpackage.lbz
                    public final void accept(Object obj) {
                        this.a.F = (Uri) obj;
                    }
                };
            } catch (IOException e2) {
                int i = 5;
                if ((e2 instanceof FileNotFoundException) && (message = e2.getMessage()) != null && fdgn.G(message, "No space left on device", false)) {
                    i = 3;
                }
                l(byzVar, i, e2);
            }
            if (!byzVar.e.get()) {
                throw new AssertionError(a.h(byzVar, "Recording ", " has not been initialized"));
            }
            bys bysVar = (bys) byzVar.f.getAndSet(null);
            if (bysVar == null) {
                Objects.toString(byzVar);
                throw new AssertionError("One-time media muxer creation has already occurred for recording ".concat(byzVar.toString()));
            }
            try {
                bxk bxkVar = bysVar.a;
                ParcelFileDescriptor parcelFileDescriptor = bysVar.b;
                Uri uri = Uri.EMPTY;
                if (!(bxkVar instanceof bxf)) {
                    throw new AssertionError("Invalid output options type: ".concat(String.valueOf(bxkVar.getClass().getSimpleName())));
                }
                MediaMuxer mediaMuxer = new MediaMuxer(parcelFileDescriptor.getFileDescriptor(), iD);
                lbzVar.accept(uri);
                bdn bdnVar = this.s;
                if (bdnVar != null) {
                    n(bdnVar);
                    mediaMuxer.setOrientationHint(((ayu) bdnVar).b);
                }
                bxk bxkVar2 = ((bwv) byzVar).a;
                MediaFormat mediaFormat = this.af.a;
                int i2 = cge.c;
                this.w = Integer.valueOf(mediaMuxer.addTrack(mediaFormat));
                if (y()) {
                    this.v = Integer.valueOf(mediaMuxer.addTrack(this.ag.a));
                }
                try {
                    mediaMuxer.start();
                    this.A = mediaMuxer;
                    x(cdzVar, byzVar);
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        w((cdz) it2.next(), byzVar);
                    }
                } catch (IllegalStateException e3) {
                    lcg.i(this.aq);
                    l(byzVar, 1, e3);
                }
                cdzVar.close();
            } catch (RuntimeException e4) {
                e4.toString();
                throw new IOException("Failed to create MediaMuxer by ".concat(e4.toString()), e4);
            }
        } catch (Throwable th) {
            try {
                cdzVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0194 A[Catch: cgm -> 0x0298, cbz -> 0x029a, TryCatch #3 {cbz -> 0x029a, cgm -> 0x0298, blocks: (B:38:0x00e2, B:41:0x00fa, B:52:0x0184, B:54:0x0194, B:55:0x0196, B:58:0x019f, B:60:0x01a3, B:61:0x01a9, B:63:0x01af, B:65:0x01cd, B:67:0x01dc, B:69:0x01e4, B:71:0x01ef, B:73:0x01fa, B:74:0x01fd, B:76:0x020a, B:78:0x022c, B:80:0x023f, B:82:0x025e, B:83:0x0271, B:84:0x0278, B:79:0x0236, B:85:0x0279, B:86:0x028b, B:70:0x01ea, B:87:0x028c, B:88:0x0297, B:42:0x0114, B:44:0x011b, B:45:0x0136, B:48:0x013e, B:49:0x0158), top: B:125:0x00e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a3 A[Catch: cgm -> 0x0298, cbz -> 0x029a, TryCatch #3 {cbz -> 0x029a, cgm -> 0x0298, blocks: (B:38:0x00e2, B:41:0x00fa, B:52:0x0184, B:54:0x0194, B:55:0x0196, B:58:0x019f, B:60:0x01a3, B:61:0x01a9, B:63:0x01af, B:65:0x01cd, B:67:0x01dc, B:69:0x01e4, B:71:0x01ef, B:73:0x01fa, B:74:0x01fd, B:76:0x020a, B:78:0x022c, B:80:0x023f, B:82:0x025e, B:83:0x0271, B:84:0x0278, B:79:0x0236, B:85:0x0279, B:86:0x028b, B:70:0x01ea, B:87:0x028c, B:88:0x0297, B:42:0x0114, B:44:0x011b, B:45:0x0136, B:48:0x013e, B:49:0x0158), top: B:125:0x00e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01af A[Catch: cgm -> 0x0298, cbz -> 0x029a, TryCatch #3 {cbz -> 0x029a, cgm -> 0x0298, blocks: (B:38:0x00e2, B:41:0x00fa, B:52:0x0184, B:54:0x0194, B:55:0x0196, B:58:0x019f, B:60:0x01a3, B:61:0x01a9, B:63:0x01af, B:65:0x01cd, B:67:0x01dc, B:69:0x01e4, B:71:0x01ef, B:73:0x01fa, B:74:0x01fd, B:76:0x020a, B:78:0x022c, B:80:0x023f, B:82:0x025e, B:83:0x0271, B:84:0x0278, B:79:0x0236, B:85:0x0279, B:86:0x028b, B:70:0x01ea, B:87:0x028c, B:88:0x0297, B:42:0x0114, B:44:0x011b, B:45:0x0136, B:48:0x013e, B:49:0x0158), top: B:125:0x00e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x028c A[Catch: cgm -> 0x0298, cbz -> 0x029a, TryCatch #3 {cbz -> 0x029a, cgm -> 0x0298, blocks: (B:38:0x00e2, B:41:0x00fa, B:52:0x0184, B:54:0x0194, B:55:0x0196, B:58:0x019f, B:60:0x01a3, B:61:0x01a9, B:63:0x01af, B:65:0x01cd, B:67:0x01dc, B:69:0x01e4, B:71:0x01ef, B:73:0x01fa, B:74:0x01fd, B:76:0x020a, B:78:0x022c, B:80:0x023f, B:82:0x025e, B:83:0x0271, B:84:0x0278, B:79:0x0236, B:85:0x0279, B:86:0x028b, B:70:0x01ea, B:87:0x028c, B:88:0x0297, B:42:0x0114, B:44:0x011b, B:45:0x0136, B:48:0x013e, B:49:0x0158), top: B:125:0x00e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02ab  */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(defpackage.byz r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzf.s(byz, boolean):void");
    }

    final void t(byz byzVar, long j, int i, Throwable th) {
        if (this.q != byzVar || this.r) {
            return;
        }
        this.r = true;
        this.O = i;
        this.P = th;
        if (y()) {
            H();
            this.E.e(j);
        }
        cdz cdzVar = this.Q;
        if (cdzVar != null) {
            cdzVar.close();
            this.Q = null;
        }
        if (this.ad != 2) {
            final cef cefVar = this.D;
            this.T = h(new Runnable() { // from class: byh
                @Override // java.lang.Runnable
                public final void run() {
                    bxs bxsVar = bzf.a;
                    bbs.a("Recorder", "The source didn't become non-streaming before timeout. Waited 1000ms");
                    if (ccu.a(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class) != null) {
                        bzf.k(cefVar);
                    }
                }
            }, this.h, 1000L, TimeUnit.MILLISECONDS);
        } else {
            k(this.D);
        }
        this.D.e(j);
    }

    public final void u(final byz byzVar, boolean z) {
        List list = this.u;
        if (!list.isEmpty()) {
            ListenableFuture listenableFutureA = bqk.a(list);
            if (!listenableFutureA.isDone()) {
                listenableFutureA.cancel(true);
            }
            list.clear();
        }
        list.add(kol.a(new koi() { // from class: bxw
            @Override // defpackage.koi
            public final Object a(kog kogVar) {
                byz byzVar2 = byzVar;
                bzf bzfVar = this.a;
                bzfVar.D.c(new byk(bzfVar, kogVar, byzVar2), bzfVar.h);
                return "videoEncodingFuture";
            }
        }));
        if (y() && !z) {
            list.add(kol.a(new koi() { // from class: bxx
                @Override // defpackage.koi
                public final Object a(final kog kogVar) {
                    final bzf bzfVar = this.a;
                    lbz lbzVar = new lbz() { // from class: bxv
                        @Override // defpackage.lbz
                        public final void accept(Object obj) {
                            bzf bzfVar2 = bzfVar;
                            Throwable th = (Throwable) obj;
                            if (bzfVar2.R == null) {
                                if (th instanceof cdy) {
                                    bzfVar2.E(5);
                                } else {
                                    bzfVar2.E(6);
                                }
                                kog kogVar2 = kogVar;
                                bzfVar2.R = th;
                                bzfVar2.v(true);
                                kogVar2.b(null);
                            }
                        }
                    };
                    final cby cbyVar = bzfVar.C;
                    final byl bylVar = new byl(bzfVar, lbzVar);
                    Executor executor = cbyVar.a;
                    final Executor executor2 = bzfVar.h;
                    executor.execute(new Runnable() { // from class: cbr
                        @Override // java.lang.Runnable
                        public final void run() {
                            cby cbyVar2 = cbyVar;
                            int i = cbyVar2.s;
                            int i2 = i - 1;
                            if (i == 0) {
                                throw null;
                            }
                            if (i2 != 0) {
                                if (i2 == 1 || i2 == 2) {
                                    throw new AssertionError("The audio recording callback must be registered before the audio source is started.");
                                }
                            } else {
                                byl bylVar2 = bylVar;
                                cbyVar2.i = executor2;
                                cbyVar2.t = bylVar2;
                            }
                        }
                    });
                    bzfVar.E.c(new bym(bzfVar, kogVar, lbzVar, byzVar), executor2);
                    return "audioEncodingFuture";
                }
            }));
        }
        bqk.i(bqk.a(list), new byn(this), bpc.a());
    }

    public final void v(boolean z) {
        byz byzVar = this.q;
        if (byzVar != null) {
            e();
            byzVar.j(new cau(((bwv) byzVar).a), z);
        }
    }

    final void w(cdz cdzVar, byz byzVar) {
        long jB = this.G + cdzVar.b();
        long jA = cdzVar.a();
        if (this.K == Long.MAX_VALUE) {
            this.K = jA;
            bbs.a("Recorder", String.format("First audio time: %d (%s)", Long.valueOf(jA), cbd.a(this.K)));
        } else {
            long nanos = TimeUnit.MICROSECONDS.toNanos(jA - Math.min(this.J, this.K));
            lcg.d(this.M != Long.MAX_VALUE, "There should be a previous data for adjusting the duration.");
            long nanos2 = nanos + TimeUnit.MICROSECONDS.toNanos(jA - this.M);
            long j = this.N;
            if (j != 0 && nanos2 > j) {
                bbs.a("Recorder", String.format("Audio data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.N)));
                l(byzVar, 9, null);
                return;
            }
        }
        try {
            this.A.writeSampleData(this.v.intValue(), cdzVar.d(), cdzVar.c());
            this.G = jB;
            this.H += cdzVar.b();
            this.M = jA;
        } catch (IllegalStateException e2) {
            lcg.i(this.aq);
            l(byzVar, 1, e2);
        }
    }

    final void x(cdz cdzVar, byz byzVar) {
        long j;
        long nanos;
        int i;
        if (this.w == null) {
            throw new AssertionError("Video data comes before the track is added to MediaMuxer.");
        }
        long jB = this.G + cdzVar.b();
        long jA = cdzVar.a();
        if (this.J == Long.MAX_VALUE) {
            this.J = jA;
            bbs.a("Recorder", String.format("First video time: %d (%s)", Long.valueOf(jA), cbd.a(this.J)));
            j = Long.MAX_VALUE;
            i = 1;
            nanos = 0;
        } else {
            j = Long.MAX_VALUE;
            nanos = TimeUnit.MICROSECONDS.toNanos(jA - Math.min(this.J, this.K));
            lcg.d(this.L != Long.MAX_VALUE, "There should be a previous data for adjusting the duration.");
            long nanos2 = TimeUnit.MICROSECONDS.toNanos(jA - this.L) + nanos;
            i = 1;
            long j2 = this.N;
            if (j2 != 0 && nanos2 > j2) {
                bbs.a("Recorder", String.format("Video data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.N)));
                l(byzVar, 9, null);
                return;
            }
        }
        try {
            this.A.writeSampleData(this.w.intValue(), cdzVar.d(), ((ceb) cdzVar).a);
            this.G = jB;
            this.I = nanos;
            this.L = jA;
            v(cdzVar.e());
            if (jB > this.ap) {
                lcg.i(this.aq);
                bbs.a("Recorder", "availableBytes = ".concat(String.valueOf(cgy.a(j))));
                this.ap = 9223372036802347007L;
            }
        } catch (IllegalStateException e2) {
            lcg.i(this.aq);
            l(byzVar, i, e2);
        }
    }

    final boolean y() {
        return this.ac == 4;
    }

    public final boolean z() {
        return ((bwl) ((bxh) F(this.B)).b()).g != 0;
    }
}

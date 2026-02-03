package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioRouting$OnRoutingChangedListener;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class myx implements mxz {
    public static final Object a = new Object();
    public static ScheduledExecutorService b;
    public static int c;
    public int A;
    public boolean B;
    public boolean C;
    public long D;
    public float E;
    public ByteBuffer F;
    public int G;
    public boolean H;
    public boolean I;
    public boolean J;
    public int K;
    public mad L;
    public mxe M;
    public long N;
    public boolean O;
    public boolean P;
    public Looper Q;
    public long R;
    public long S;
    public Handler T;
    public final myo U;
    public final mye V;
    public mza W;
    private final Context X;
    private final mys Y;
    private long Z;
    private long aa;
    private ByteBuffer ab;
    private boolean ac;
    public final myd d;
    public final mzf e;
    public final ekgb f;
    public final ekgb g;
    public final myc h;
    public final ArrayDeque i;
    public myw j;
    public final mys k;
    public mwx l;
    public myn m;
    public myn n;
    public mdj o;
    public AudioTrack p;
    public mwz q;
    public mxd r;
    public myr s;
    public mac t;
    public myp u;
    public myp v;
    public mca w;
    public boolean x;
    public long y;
    public long z;

    public myx(mym mymVar) {
        Context context = mymVar.a;
        Context applicationContext = context == null ? null : context.getApplicationContext();
        this.X = applicationContext;
        this.t = mac.a;
        this.q = applicationContext == null ? mymVar.b : null;
        this.U = mymVar.f;
        mye myeVar = mymVar.g;
        mee.f(myeVar);
        this.V = myeVar;
        this.h = new myc(new myt(this));
        myd mydVar = new myd();
        this.d = mydVar;
        mzf mzfVar = new mzf();
        this.e = mzfVar;
        this.f = ekgb.t(new mds(), mydVar, mzfVar);
        this.g = ekgb.t(new mze(), mydVar, mzfVar);
        this.E = 1.0f;
        this.K = 0;
        this.L = new mad();
        mca mcaVar = mca.a;
        this.v = new myp(mcaVar, 0L, 0L);
        this.w = mcaVar;
        this.x = false;
        this.i = new ArrayDeque();
        this.k = new mys();
        this.Y = new mys();
    }

    public static boolean s() {
        boolean z;
        synchronized (a) {
            z = c > 0;
        }
        return z;
    }

    public static boolean u(AudioTrack audioTrack) {
        return Build.VERSION.SDK_INT >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x004b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void v(java.nio.ByteBuffer r19) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.myx.v(java.nio.ByteBuffer):void");
    }

    private final void w() {
        mdj mdjVar = this.n.i;
        this.o = mdjVar;
        mdjVar.c();
    }

    private final boolean x() {
        myn mynVar = this.n;
        if (mynVar.c != 0) {
            return false;
        }
        int i = mynVar.a.I;
        return true;
    }

    private static final AudioTrack y(mxu mxuVar, mac macVar, int i, mau mauVar) throws UnsupportedOperationException, IllegalArgumentException, mxw {
        mau mauVar2;
        Exception exc;
        try {
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(macVar.a().a).setAudioFormat(mgb.D(mxuVar.b, mxuVar.c, mxuVar.a)).setTransferMode(1).setBufferSizeInBytes(mxuVar.e).setSessionId(i);
            if (Build.VERSION.SDK_INT >= 29) {
                try {
                    sessionId.setOffloadedPlayback(mxuVar.d);
                } catch (IllegalArgumentException | UnsupportedOperationException e) {
                    exc = e;
                    mauVar2 = mauVar;
                    throw new mxw(0, mxuVar.b, mxuVar.c, mxuVar.a, mxuVar.e, mauVar2, mxuVar.d, exc);
                }
            }
            AudioTrack audioTrackBuild = sessionId.build();
            int state = audioTrackBuild.getState();
            if (state == 1) {
                return audioTrackBuild;
            }
            try {
                audioTrackBuild.release();
            } catch (Exception unused) {
            }
            throw new mxw(state, mxuVar.b, mxuVar.c, mxuVar.a, mxuVar.e, mauVar, mxuVar.d, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e2) {
            mauVar2 = mauVar;
            exc = e2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void z() throws defpackage.mxy {
        /*
            r9 = this;
            java.nio.ByteBuffer r0 = r9.ab
            if (r0 != 0) goto L6
            goto La5
        L6:
            mys r0 = r9.Y
            boolean r1 = r0.c()
            if (r1 != 0) goto La5
            java.nio.ByteBuffer r1 = r9.ab
            int r1 = r1.remaining()
            android.media.AudioTrack r2 = r9.p
            java.nio.ByteBuffer r3 = r9.ab
            r4 = 1
            int r2 = r2.write(r3, r1, r4)
            long r5 = android.os.SystemClock.elapsedRealtime()
            r9.N = r5
            r5 = 0
            r3 = 0
            if (r2 >= 0) goto L68
            r1 = -6
            if (r2 == r1) goto L32
            r1 = -32
            if (r2 != r1) goto L30
            goto L32
        L30:
            r4 = r3
            goto L46
        L32:
            long r7 = r9.i()
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 <= 0) goto L3b
            goto L46
        L3b:
            android.media.AudioTrack r1 = r9.p
            boolean r1 = u(r1)
            if (r1 == 0) goto L30
            r9.l()
        L46:
            mxy r1 = new mxy
            myn r3 = r9.n
            mau r3 = r3.a
            r1.<init>(r2, r3, r4)
            mza r2 = r9.W
            if (r2 == 0) goto L56
            r2.a(r1)
        L56:
            boolean r2 = r1.b
            if (r2 == 0) goto L64
            android.content.Context r2 = r9.X
            if (r2 != 0) goto L5f
            goto L64
        L5f:
            mwz r0 = defpackage.mwz.a
            r9.q = r0
            throw r1
        L64:
            r0.b(r1)
            return
        L68:
            r0.a()
            android.media.AudioTrack r0 = r9.p
            boolean r0 = u(r0)
            if (r0 == 0) goto L7b
            long r7 = r9.aa
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 <= 0) goto L7b
            r9.P = r3
        L7b:
            myn r0 = r9.n
            int r0 = r0.c
            if (r0 != 0) goto L87
            long r5 = r9.Z
            long r7 = (long) r2
            long r5 = r5 + r7
            r9.Z = r5
        L87:
            if (r2 != r1) goto La5
            if (r0 == 0) goto La2
            java.nio.ByteBuffer r0 = r9.ab
            java.nio.ByteBuffer r1 = r9.F
            if (r0 != r1) goto L92
            goto L93
        L92:
            r4 = r3
        L93:
            defpackage.mee.c(r4)
            long r0 = r9.aa
            int r2 = r9.A
            long r2 = (long) r2
            int r4 = r9.G
            long r4 = (long) r4
            long r2 = r2 * r4
            long r0 = r0 + r2
            r9.aa = r0
        La2:
            r0 = 0
            r9.ab = r0
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.myx.z():void");
    }

    @Override // defpackage.mxz
    public final int a(mau mauVar) {
        m();
        if (!"audio/raw".equals(mauVar.o)) {
            return this.q.a(mauVar, this.t) != null ? 2 : 0;
        }
        int i = mauVar.I;
        if (mgb.Y(i)) {
            return i != 2 ? 1 : 2;
        }
        mff.f("DefaultAudioSink", a.g(i, "Invalid PCM encoding: "));
        return 0;
    }

    @Override // defpackage.mxz
    public final void b() throws IllegalStateException {
        if (t()) {
            this.y = 0L;
            this.z = 0L;
            this.Z = 0L;
            this.aa = 0L;
            this.P = false;
            this.A = 0;
            this.v = new myp(this.w, 0L, 0L);
            this.D = 0L;
            this.u = null;
            this.i.clear();
            this.F = null;
            this.G = 0;
            this.ab = null;
            this.ac = false;
            this.H = false;
            this.I = false;
            this.e.g = 0L;
            w();
            myc mycVar = this.h;
            AudioTrack audioTrack = mycVar.a;
            mee.f(audioTrack);
            if (audioTrack.getPlayState() == 3) {
                this.p.pause();
            }
            if (u(this.p)) {
                myw mywVar = this.j;
                mee.f(mywVar);
                this.p.unregisterStreamEventCallback(mywVar.b);
                mywVar.a.removeCallbacksAndMessages(null);
            }
            final mxu mxuVarB = this.n.b();
            myn mynVar = this.m;
            if (mynVar != null) {
                this.n = mynVar;
                this.m = null;
            }
            mycVar.d();
            mycVar.a = null;
            mycVar.c = null;
            myr myrVar = this.s;
            if (myrVar != null) {
                AudioRouting$OnRoutingChangedListener audioRouting$OnRoutingChangedListener = myrVar.c;
                mee.f(audioRouting$OnRoutingChangedListener);
                myrVar.a.removeOnRoutingChangedListener(audioRouting$OnRoutingChangedListener);
                myrVar.c = null;
                this.s = null;
            }
            final AudioTrack audioTrack2 = this.p;
            final mza mzaVar = this.W;
            final Handler handler = new Handler(Looper.myLooper());
            synchronized (a) {
                if (b == null) {
                    b = mgb.S("ExoPlayer:AudioTrackReleaseThread");
                }
                c++;
                b.schedule(new Runnable() { // from class: myf
                    @Override // java.lang.Runnable
                    public final void run() {
                        final mza mzaVar2 = mzaVar;
                        AudioTrack audioTrack3 = audioTrack2;
                        Handler handler2 = handler;
                        final mxu mxuVar = mxuVarB;
                        try {
                            audioTrack3.flush();
                            audioTrack3.release();
                            if (mzaVar2 != null && handler2.getLooper().getThread().isAlive()) {
                                handler2.post(new Runnable() { // from class: myh
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        final mxt mxtVar = mzaVar2.a.j;
                                        Handler handler3 = mxtVar.a;
                                        if (handler3 != null) {
                                            final mxu mxuVar2 = mxuVar;
                                            handler3.post(new Runnable() { // from class: mxm
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    String str = mgb.a;
                                                    mwk mwkVar = (mwk) mxtVar.b.a.j;
                                                    mwkVar.J(mwkVar.I(), 1032, new mez() { // from class: mwc
                                                        @Override // defpackage.mez
                                                        public final void a(Object obj) {
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    }
                                });
                            }
                            synchronized (myx.a) {
                                int i = myx.c - 1;
                                myx.c = i;
                                if (i == 0) {
                                    myx.b.shutdown();
                                    myx.b = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (mzaVar2 != null && handler2.getLooper().getThread().isAlive()) {
                                handler2.post(new Runnable() { // from class: myh
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        final mxt mxtVar = mzaVar2.a.j;
                                        Handler handler3 = mxtVar.a;
                                        if (handler3 != null) {
                                            final mxu mxuVar2 = mxuVar;
                                            handler3.post(new Runnable() { // from class: mxm
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    String str = mgb.a;
                                                    mwk mwkVar = (mwk) mxtVar.b.a.j;
                                                    mwkVar.J(mwkVar.I(), 1032, new mez() { // from class: mwc
                                                        @Override // defpackage.mez
                                                        public final void a(Object obj) {
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    }
                                });
                            }
                            synchronized (myx.a) {
                                int i2 = myx.c - 1;
                                myx.c = i2;
                                if (i2 == 0) {
                                    myx.b.shutdown();
                                    myx.b = null;
                                }
                                throw th;
                            }
                        }
                    }
                }, 20L, TimeUnit.MILLISECONDS);
            }
            this.p = null;
        }
        this.Y.a();
        this.k.a();
        this.R = 0L;
        this.S = 0L;
        Handler handler2 = this.T;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    @Override // defpackage.mxz
    public final void c() {
        this.B = true;
    }

    @Override // defpackage.mxz
    public final void d() throws IllegalStateException {
        this.J = true;
        if (t()) {
            myc mycVar = this.h;
            if (mycVar.p != -9223372036854775807L) {
                mej mejVar = mycVar.v;
                mycVar.p = mgb.w(SystemClock.elapsedRealtime());
            }
            mycVar.h = mycVar.c();
            myb mybVar = mycVar.c;
            mee.f(mybVar);
            mybVar.c();
            this.p.play();
        }
    }

    @Override // defpackage.mxz
    public final void e() throws IllegalStateException {
        b();
        int i = 0;
        while (true) {
            ekgb ekgbVar = this.f;
            if (i >= ((ekoe) ekgbVar).c) {
                break;
            }
            ((mdm) ekgbVar.get(i)).g();
            i++;
        }
        ekgb ekgbVar2 = this.g;
        for (int i2 = 0; i2 < ((ekoe) ekgbVar2).c; i2++) {
            ((mdm) ekgbVar2.get(i2)).g();
        }
        mdj mdjVar = this.o;
        if (mdjVar != null) {
            mdjVar.f();
        }
        this.J = false;
        this.O = false;
    }

    @Override // defpackage.mxz
    public final boolean f() {
        if (!t()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && this.p.isOffloadedPlayback() && this.I) {
            return false;
        }
        myc mycVar = this.h;
        if (i() > mgb.t(mycVar.a(), mycVar.d)) {
            return true;
        }
        boolean z = mycVar.e;
        return false;
    }

    @Override // defpackage.mxz
    public final boolean g(mau mauVar) {
        return a(mauVar) != 0;
    }

    public final long h() {
        return this.n.c == 0 ? this.y / r0.b : this.z;
    }

    public final long i() {
        myn mynVar = this.n;
        if (mynVar.c != 0) {
            return this.aa;
        }
        long j = this.Z;
        long j2 = mynVar.d;
        String str = mgb.a;
        return ((j + j2) - 1) / j2;
    }

    public final AudioTrack j(myn mynVar) throws mxw {
        try {
            return y(mynVar.b(), this.t, this.K, mynVar.a);
        } catch (mxw e) {
            mza mzaVar = this.W;
            if (mzaVar != null) {
                mzaVar.a(e);
            }
            throw e;
        }
    }

    public final void k(long j) {
        mca mcaVar;
        boolean z = false;
        if (x()) {
            myo myoVar = this.U;
            mcaVar = this.w;
            float f = mcaVar.b;
            mee.a(f > 0.0f);
            mdr mdrVar = myoVar.c;
            if (mdrVar.b != f) {
                mdrVar.b = f;
                mdrVar.f = true;
            }
            float f2 = mcaVar.c;
            mee.a(f2 > 0.0f);
            if (mdrVar.c != f2) {
                mdrVar.c = f2;
                mdrVar.f = true;
            }
        } else {
            mcaVar = mca.a;
        }
        mca mcaVar2 = mcaVar;
        this.w = mcaVar2;
        if (x()) {
            myo myoVar2 = this.U;
            z = this.x;
            myoVar2.b.e = z;
        }
        this.x = z;
        this.i.add(new myp(mcaVar2, Math.max(0L, j), this.n.a(i())));
        w();
        mza mzaVar = this.W;
        if (mzaVar != null) {
            final boolean z2 = this.x;
            final mxt mxtVar = mzaVar.a.j;
            Handler handler = mxtVar.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: mxq
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str = mgb.a;
                        mrn mrnVar = mxtVar.b.a;
                        boolean z3 = mrnVar.x;
                        final boolean z4 = z2;
                        if (z3 == z4) {
                            return;
                        }
                        mrnVar.x = z4;
                        mrnVar.h.f(23, new mez() { // from class: mrg
                            @Override // defpackage.mez
                            public final void a(Object obj) {
                                int i = mrk.b;
                                ((mce) obj).x(z4);
                            }
                        });
                    }
                });
            }
        }
    }

    public final void l() {
        if (this.n.c == 1) {
            this.O = true;
        }
    }

    public final void m() {
        Context context;
        mwz mwzVar;
        if (this.r == null && (context = this.X) != null) {
            this.Q = Looper.myLooper();
            mxd mxdVar = new mxd(context, new myi(this), this.t, this.M);
            this.r = mxdVar;
            if (mxdVar.i) {
                mwzVar = mxdVar.f;
                mee.f(mwzVar);
            } else {
                mxdVar.i = true;
                mxb mxbVar = mxdVar.e;
                if (mxbVar != null) {
                    mxbVar.a.registerContentObserver(mxbVar.b, false, mxbVar);
                }
                mxa mxaVar = mxdVar.c;
                if (mxaVar != null) {
                    mdh.a(mxdVar.a).registerAudioDeviceCallback(mxaVar, mxdVar.b);
                }
                Context context2 = mxdVar.a;
                mxdVar.f = mwz.c(context2, context2.registerReceiver(mxdVar.d, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, mxdVar.b), mxdVar.h, mxdVar.g);
                mwzVar = mxdVar.f;
            }
            this.q = mwzVar;
        }
        mee.f(this.q);
    }

    public final void n() throws IllegalStateException {
        if (this.ac) {
            return;
        }
        this.ac = true;
        myc mycVar = this.h;
        long jI = i();
        mycVar.r = mycVar.b();
        mej mejVar = mycVar.v;
        mycVar.p = mgb.w(SystemClock.elapsedRealtime());
        mycVar.s = jI;
        if (u(this.p)) {
            this.I = false;
        }
        this.p.stop();
    }

    public final void o(long j) throws mxy {
        z();
        if (this.ab != null) {
            return;
        }
        if (!this.o.h()) {
            ByteBuffer byteBuffer = this.F;
            if (byteBuffer != null) {
                v(byteBuffer);
                z();
                return;
            }
            return;
        }
        while (!this.o.g()) {
            do {
                ByteBuffer byteBufferB = this.o.b();
                if (byteBufferB.hasRemaining()) {
                    v(byteBufferB);
                    z();
                } else {
                    ByteBuffer byteBuffer2 = this.F;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.o.e(this.F);
                    }
                }
            } while (this.ab == null);
            return;
        }
    }

    public final void p(mca mcaVar) {
        myp mypVar = new myp(mcaVar, -9223372036854775807L, -9223372036854775807L);
        if (t()) {
            this.u = mypVar;
        } else {
            this.v = mypVar;
        }
    }

    public final void q() {
        if (t()) {
            this.p.setVolume(this.E);
        }
    }

    public final boolean r() throws mxy {
        if (!this.o.h()) {
            z();
            return this.ab == null;
        }
        this.o.d();
        o(Long.MIN_VALUE);
        if (!this.o.g()) {
            return false;
        }
        ByteBuffer byteBuffer = this.ab;
        return byteBuffer == null || !byteBuffer.hasRemaining();
    }

    public final boolean t() {
        return this.p != null;
    }
}

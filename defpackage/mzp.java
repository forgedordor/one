package defpackage;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mzp implements nad {
    public final List a;
    public final nav b;
    public final UUID c;
    public final mzn d;
    public int e;
    public byte[] f;
    public nau g;
    public final mzw h;
    public final naz i;
    private final boolean j = true;
    private final boolean k;
    private final HashMap l;
    private final mep m;
    private final mwx n;
    private final Looper o;
    private int p;
    private HandlerThread q;
    private mzl r;
    private mir s;
    private nac t;
    private byte[] u;
    private nat v;
    private final mzy w;

    public mzp(UUID uuid, nav navVar, mzw mzwVar, mzy mzyVar, List list, boolean z, boolean z2, byte[] bArr, HashMap map, naz nazVar, Looper looper, mwx mwxVar) {
        this.c = uuid;
        this.h = mzwVar;
        this.w = mzyVar;
        this.b = navVar;
        this.k = z2;
        if (bArr != null) {
            this.u = bArr;
            this.a = null;
        } else {
            mee.f(list);
            this.a = DesugarCollections.unmodifiableList(list);
        }
        this.l = map;
        this.i = nazVar;
        this.m = new mep();
        this.n = mwxVar;
        this.e = 2;
        this.o = looper;
        this.d = new mzn(this, looper);
    }

    private final void p(meo meoVar) {
        Set set;
        mep mepVar = this.m;
        synchronized (mepVar.a) {
            set = mepVar.c;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            meoVar.a((nak) it.next());
        }
    }

    private final void q(Throwable th, boolean z) {
        if ((th instanceof NotProvisionedException) || naq.a(th)) {
            this.h.b(this);
        } else {
            g(th, true != z ? 2 : 1);
        }
    }

    private final void r(byte[] bArr, int i, boolean z) {
        try {
            this.v = this.b.c(bArr, this.a, i, this.l);
            mzl mzlVar = this.r;
            String str = mgb.a;
            nat natVar = this.v;
            mee.f(natVar);
            mzlVar.a(2, natVar, z);
        } catch (Exception | NoSuchMethodError e) {
            q(e, true);
        }
    }

    private final boolean s() {
        try {
            this.b.i(this.f, this.u);
            return true;
        } catch (Exception | NoSuchMethodError e) {
            g(e, 1);
            return false;
        }
    }

    @Override // defpackage.nad
    public final int a() {
        k();
        return this.e;
    }

    @Override // defpackage.nad
    public final mir b() {
        k();
        return this.s;
    }

    @Override // defpackage.nad
    public final nac c() {
        k();
        if (this.e == 1) {
            return this.t;
        }
        return null;
    }

    @Override // defpackage.nad
    public final UUID d() {
        k();
        return this.c;
    }

    @Override // defpackage.nad
    public final void e(nak nakVar) {
        k();
        int i = this.p;
        if (i < 0) {
            mff.c("DefaultDrmSession", a.g(i, "Session reference count less than zero: "));
            this.p = 0;
        }
        if (nakVar != null) {
            mep mepVar = this.m;
            synchronized (mepVar.a) {
                ArrayList arrayList = new ArrayList(mepVar.d);
                arrayList.add(nakVar);
                mepVar.d = DesugarCollections.unmodifiableList(arrayList);
                Map map = mepVar.b;
                Integer num = (Integer) map.get(nakVar);
                if (num == null) {
                    HashSet hashSet = new HashSet(mepVar.c);
                    hashSet.add(nakVar);
                    mepVar.c = DesugarCollections.unmodifiableSet(hashSet);
                }
                map.put(nakVar, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
            }
        }
        int i2 = this.p + 1;
        this.p = i2;
        if (i2 == 1) {
            mee.c(this.e == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.q = handlerThread;
            handlerThread.start();
            this.r = new mzl(this, this.q.getLooper());
            if (m()) {
                f(true);
            }
        } else if (nakVar != null && l() && this.m.a(nakVar) == 1) {
            nakVar.c(this.e);
        }
        mzz mzzVar = this.w.a;
        mzzVar.e.remove(this);
        Handler handler = mzzVar.j;
        mee.f(handler);
        handler.removeCallbacksAndMessages(this);
    }

    public final void f(boolean z) {
        long jMin;
        if (this.k) {
            return;
        }
        byte[] bArr = this.f;
        String str = mgb.a;
        if (this.u == null) {
            r(bArr, 1, z);
            return;
        }
        if (this.e == 4 || s()) {
            if (maf.d.equals(this.c)) {
                k();
                byte[] bArr2 = this.f;
                Map mapE = bArr2 == null ? null : this.b.e(bArr2);
                Pair pair = mapE != null ? new Pair(Long.valueOf(nbd.a(mapE, "LicenseDurationRemaining")), Long.valueOf(nbd.a(mapE, "PlaybackDurationRemaining"))) : null;
                mee.f(pair);
                jMin = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
            } else {
                jMin = Long.MAX_VALUE;
            }
            if (jMin <= 60) {
                mff.b("DefaultDrmSession", a.u(jMin, "Offline license has expired or will expire soon. Remaining seconds: "));
                r(bArr, 2, z);
            } else {
                this.e = 4;
                p(new meo() { // from class: mzk
                    @Override // defpackage.meo
                    public final void a(Object obj) {
                        ((nak) obj).b();
                    }
                });
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(final java.lang.Throwable r6, int r7) {
        /*
            r5 = this;
            nac r0 = new nac
            boolean r1 = r6 instanceof android.media.MediaDrm.MediaDrmStateException
            r2 = 1
            if (r1 == 0) goto L17
            r7 = r6
            android.media.MediaDrm$MediaDrmStateException r7 = (android.media.MediaDrm.MediaDrmStateException) r7
            java.lang.String r7 = r7.getDiagnosticInfo()
            int r7 = defpackage.mgb.l(r7)
            int r7 = defpackage.mgb.k(r7)
            goto L52
        L17:
            boolean r1 = r6 instanceof android.media.MediaDrmResetException
            r3 = 6006(0x1776, float:8.416E-42)
            if (r1 == 0) goto L1f
        L1d:
            r7 = r3
            goto L52
        L1f:
            boolean r1 = r6 instanceof android.media.NotProvisionedException
            r4 = 6002(0x1772, float:8.41E-42)
            if (r1 != 0) goto L51
            boolean r1 = defpackage.naq.a(r6)
            if (r1 == 0) goto L2c
            goto L51
        L2c:
            boolean r1 = r6 instanceof android.media.DeniedByServerException
            if (r1 == 0) goto L33
            r7 = 6007(0x1777, float:8.418E-42)
            goto L52
        L33:
            boolean r1 = r6 instanceof defpackage.nbc
            if (r1 == 0) goto L3a
            r7 = 6001(0x1771, float:8.409E-42)
            goto L52
        L3a:
            boolean r1 = r6 instanceof defpackage.mzs
            if (r1 == 0) goto L41
            r7 = 6003(0x1773, float:8.412E-42)
            goto L52
        L41:
            boolean r1 = r6 instanceof defpackage.nba
            if (r1 == 0) goto L48
            r7 = 6008(0x1778, float:8.419E-42)
            goto L52
        L48:
            if (r7 != r2) goto L4b
            goto L1d
        L4b:
            r1 = 2
            if (r7 != r1) goto L51
            r7 = 6004(0x1774, float:8.413E-42)
            goto L52
        L51:
            r7 = r4
        L52:
            r0.<init>(r6, r7)
            r5.t = r0
            java.lang.String r7 = "DefaultDrmSession"
            java.lang.String r0 = "DRM session error"
            defpackage.mff.d(r7, r0, r6)
            boolean r7 = r6 instanceof java.lang.Exception
            if (r7 == 0) goto L6b
            mzj r7 = new mzj
            r7.<init>()
            r5.p(r7)
            goto L7f
        L6b:
            boolean r7 = r6 instanceof java.lang.Error
            if (r7 == 0) goto L87
            boolean r7 = defpackage.naq.b(r6)
            if (r7 != 0) goto L7f
            boolean r7 = defpackage.naq.a(r6)
            if (r7 == 0) goto L7c
            goto L7f
        L7c:
            java.lang.Error r6 = (java.lang.Error) r6
            throw r6
        L7f:
            int r6 = r5.e
            r7 = 4
            if (r6 == r7) goto L86
            r5.e = r2
        L86:
            return
        L87:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unexpected Throwable subclass"
            r7.<init>(r0, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mzp.g(java.lang.Throwable, int):void");
    }

    public final void h(Object obj, Object obj2) {
        if (obj == this.v && l()) {
            this.v = null;
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                q((Throwable) obj2, false);
                return;
            }
            try {
                byte[] bArrM = this.b.m(this.f, (byte[]) obj2);
                if (this.u != null && bArrM != null && bArrM.length != 0) {
                    this.u = bArrM;
                }
                this.e = 4;
                p(new meo() { // from class: mzi
                    @Override // defpackage.meo
                    public final void a(Object obj3) {
                        ((nak) obj3).a();
                    }
                });
            } catch (Exception | NoSuchMethodError e) {
                q(e, true);
            }
        }
    }

    final void i() {
        this.g = this.b.d();
        mzl mzlVar = this.r;
        String str = mgb.a;
        nau nauVar = this.g;
        mee.f(nauVar);
        mzlVar.a(1, nauVar, true);
    }

    @Override // defpackage.nad
    public final void j(nak nakVar) {
        k();
        int i = this.p;
        if (i <= 0) {
            mff.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.p = i2;
        if (i2 == 0) {
            this.e = 0;
            mzn mznVar = this.d;
            String str = mgb.a;
            mznVar.removeCallbacksAndMessages(null);
            this.r.b();
            this.r = null;
            this.q.quit();
            this.q = null;
            this.s = null;
            this.t = null;
            this.v = null;
            this.g = null;
            byte[] bArr = this.f;
            if (bArr != null) {
                this.b.f(bArr);
                this.f = null;
            }
        }
        if (nakVar != null) {
            mep mepVar = this.m;
            synchronized (mepVar.a) {
                Map map = mepVar.b;
                Integer num = (Integer) map.get(nakVar);
                if (num != null) {
                    ArrayList arrayList = new ArrayList(mepVar.d);
                    arrayList.remove(nakVar);
                    mepVar.d = DesugarCollections.unmodifiableList(arrayList);
                    if (num.intValue() == 1) {
                        map.remove(nakVar);
                        HashSet hashSet = new HashSet(mepVar.c);
                        hashSet.remove(nakVar);
                        mepVar.c = DesugarCollections.unmodifiableSet(hashSet);
                    } else {
                        map.put(nakVar, Integer.valueOf(num.intValue() - 1));
                    }
                }
            }
            if (this.m.a(nakVar) == 0) {
                nakVar.e();
            }
        }
        mzy mzyVar = this.w;
        int i3 = this.p;
        if (i3 == 1) {
            mzz mzzVar = mzyVar.a;
            if (mzzVar.f > 0) {
                mzzVar.e.add(this);
                Handler handler = mzzVar.j;
                mee.f(handler);
                handler.postAtTime(new Runnable() { // from class: mzx
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.j(null);
                    }
                }, this, SystemClock.uptimeMillis() + mzzVar.b);
            }
        } else if (i3 == 0) {
            mzz mzzVar2 = mzyVar.a;
            mzzVar2.c.remove(this);
            if (mzzVar2.g == this) {
                mzzVar2.g = null;
            }
            if (mzzVar2.h == this) {
                mzzVar2.h = null;
            }
            mzw mzwVar = mzzVar2.a;
            Set set = mzwVar.a;
            set.remove(this);
            if (mzwVar.b == this) {
                mzwVar.b = null;
                if (!set.isEmpty()) {
                    mzwVar.b = (mzp) set.iterator().next();
                    mzwVar.b.i();
                }
            }
            Handler handler2 = mzzVar2.j;
            mee.f(handler2);
            handler2.removeCallbacksAndMessages(this);
            mzzVar2.e.remove(this);
        }
        mzyVar.a.e();
    }

    public final void k() {
        Looper looper = this.o;
        if (Thread.currentThread() != looper.getThread()) {
            mff.g("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }

    public final boolean l() {
        int i = this.e;
        return i == 3 || i == 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m() {
        /*
            r4 = this;
            boolean r0 = r4.l()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            nav r0 = r4.b     // Catch: java.lang.NoSuchMethodError -> L2e java.lang.Exception -> L30 android.media.NotProvisionedException -> L41
            byte[] r2 = r0.l()     // Catch: java.lang.NoSuchMethodError -> L2e java.lang.Exception -> L30 android.media.NotProvisionedException -> L41
            r4.f = r2     // Catch: java.lang.NoSuchMethodError -> L2e java.lang.Exception -> L30 android.media.NotProvisionedException -> L41
            mwx r3 = r4.n     // Catch: java.lang.NoSuchMethodError -> L2e java.lang.Exception -> L30 android.media.NotProvisionedException -> L41
            r0.j(r2, r3)     // Catch: java.lang.NoSuchMethodError -> L2e java.lang.Exception -> L30 android.media.NotProvisionedException -> L41
            byte[] r2 = r4.f     // Catch: java.lang.NoSuchMethodError -> L2e java.lang.Exception -> L30 android.media.NotProvisionedException -> L41
            mir r0 = r0.b(r2)     // Catch: java.lang.NoSuchMethodError -> L2e java.lang.Exception -> L30 android.media.NotProvisionedException -> L41
            r4.s = r0     // Catch: java.lang.NoSuchMethodError -> L2e java.lang.Exception -> L30 android.media.NotProvisionedException -> L41
            r0 = 3
            r4.e = r0     // Catch: java.lang.NoSuchMethodError -> L2e java.lang.Exception -> L30 android.media.NotProvisionedException -> L41
            mzh r0 = new mzh     // Catch: java.lang.NoSuchMethodError -> L2e java.lang.Exception -> L30 android.media.NotProvisionedException -> L41
            r0.<init>()     // Catch: java.lang.NoSuchMethodError -> L2e java.lang.Exception -> L30 android.media.NotProvisionedException -> L41
            r4.p(r0)     // Catch: java.lang.NoSuchMethodError -> L2e java.lang.Exception -> L30 android.media.NotProvisionedException -> L41
            byte[] r0 = r4.f     // Catch: java.lang.NoSuchMethodError -> L2e java.lang.Exception -> L30 android.media.NotProvisionedException -> L41
            defpackage.mee.f(r0)     // Catch: java.lang.NoSuchMethodError -> L2e java.lang.Exception -> L30 android.media.NotProvisionedException -> L41
            return r1
        L2e:
            r0 = move-exception
            goto L31
        L30:
            r0 = move-exception
        L31:
            boolean r2 = defpackage.naq.a(r0)
            if (r2 == 0) goto L3d
            mzw r0 = r4.h
            r0.b(r4)
            goto L46
        L3d:
            r4.g(r0, r1)
            goto L46
        L41:
            mzw r0 = r4.h
            r0.b(r4)
        L46:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mzp.m():boolean");
    }

    @Override // defpackage.nad
    public final boolean n() {
        k();
        return true;
    }

    @Override // defpackage.nad
    public final boolean o(String str) {
        k();
        byte[] bArr = this.f;
        mee.g(bArr);
        return this.b.k(bArr, str);
    }
}

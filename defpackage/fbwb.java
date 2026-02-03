package defpackage;

import android.os.Parcel;
import io.grpc.Status;
import io.grpc.StatusException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class fbwb implements fcmo {
    private InputStream a;
    protected final fbvm b;
    protected final fbmw c;
    final int d;
    protected fbwp e;
    protected fcmm f;
    protected fcmp g;
    private int h;
    private int i;
    private ArrayList j;
    private boolean k;
    private int l;
    private int m;
    private fbvz n = fbvz.UNINITIALIZED;
    private int o;
    private int p;
    private boolean q;
    private boolean r;

    public fbwb(fbvm fbvmVar, fbmw fbmwVar, int i) {
        this.b = fbvmVar;
        this.c = fbmwVar;
        this.d = i;
    }

    private final void f(Status status, Status status2, boolean z) {
        if (p()) {
            return;
        }
        boolean z2 = this.n != fbvz.UNINITIALIZED;
        m(fbvz.CLOSED);
        if (z2) {
            this.f.n();
        }
        if (!z) {
            fbvm fbvmVar = this.b;
            int i = this.d;
            try {
                fbwq fbwqVarC = fbwq.c();
                try {
                    fbwqVarC.a().writeInt(0);
                    fbxg.c(fbwqVarC.a(), fbxg.a(fbwqVarC.a(), status) | 8);
                    fbvmVar.t(i, fbwqVarC);
                    fbwqVarC.close();
                } finally {
                }
            } catch (StatusException e) {
                fbvm.e.logp(Level.FINER, "io.grpc.binder.internal.BinderTransport", "sendOutOfBandClose", "Failed sending oob close transaction", (Throwable) e);
            }
        }
        if (z2) {
            a(status2);
        }
        o();
    }

    private final void q() {
        fbwa fbwaVar;
        if (this.i == 0) {
            int i = 0;
            while (i < this.j.size() && (fbwaVar = (fbwa) this.j.get(i)) != null) {
                i++;
                if (fbwaVar.d) {
                    this.i = i;
                    t();
                    return;
                }
            }
        }
    }

    private final boolean r() {
        return this.a != null || this.i > 0;
    }

    private final boolean s() {
        return this.k && this.h >= this.l;
    }

    private final void t() {
        fcmm fcmmVar = this.f;
        fcmmVar.getClass();
        fcmmVar.f();
        this.f.g();
        this.o++;
    }

    protected abstract void a(Status status);

    protected abstract void b();

    public abstract void c(int i, Parcel parcel);

    public abstract void d(int i, Parcel parcel);

    public boolean e() {
        return false;
    }

    @Override // defpackage.fcmo
    public final synchronized InputStream g() {
        fbvt fbvtVar;
        InputStream inputStream = this.a;
        if (inputStream != null) {
            this.a = null;
        } else if (this.p <= 0 || !r()) {
            inputStream = null;
        } else {
            int i = this.i;
            this.i = 0;
            if (i == 1) {
                fbwa fbwaVar = (fbwa) this.j.remove(0);
                int i2 = fbwaVar.c;
                InputStream inputStream2 = fbwaVar.a;
                fbvtVar = new fbvt(fbwaVar.b);
            } else {
                byte[][] bArr = new byte[i][];
                int length = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    byte[] bArr2 = ((fbwa) this.j.remove(0)).b;
                    bArr[i3] = bArr2;
                    length += bArr2.length;
                }
                fbvtVar = new fbvt(bArr, length);
            }
            this.h += i;
            q();
            inputStream = fbvtVar;
        }
        if (inputStream != null) {
            this.p--;
        } else {
            this.r = false;
            if (s() && !p()) {
                m(fbvz.ALL_MESSAGES_DELIVERED);
                j();
                return null;
            }
        }
        return inputStream;
    }

    final void h(Status status) {
        f(status, status, false);
    }

    final void i(Status status) {
        f(Status.c, status, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0070, code lost:
    
        r4.q = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0073, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x003f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0008 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void j() {
        /*
            r4 = this;
            boolean r0 = r4.q
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.q = r0
        L8:
            fbvz r1 = r4.n
            int r1 = r1.ordinal()
            r2 = 3
            r3 = 2
            if (r1 == r3) goto L1e
            if (r1 == r2) goto L15
            goto L70
        L15:
            fcmp r1 = r4.g
            if (r1 == 0) goto L70
            boolean r1 = r4.k
            if (r1 == 0) goto L70
            goto L37
        L1e:
            fcmp r1 = r4.g
            if (r1 == 0) goto L70
            boolean r1 = r4.r
            if (r1 != 0) goto L70
            boolean r1 = r4.r()
            if (r1 == 0) goto L31
            int r1 = r4.p
            if (r1 == 0) goto L70
            goto L37
        L31:
            boolean r1 = r4.s()
            if (r1 == 0) goto L70
        L37:
            fbvz r1 = r4.n
            int r1 = r1.ordinal()
            if (r1 == r3) goto L48
            if (r1 != r2) goto L42
            goto L63
        L42:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L48:
            boolean r1 = r4.r
            if (r1 != 0) goto L8
            boolean r1 = r4.r()
            if (r1 == 0) goto L5a
            r4.r = r0
            fcmp r1 = r4.g
            r1.d(r4)
            goto L8
        L5a:
            boolean r1 = r4.k
            if (r1 == 0) goto L8
            fbvz r1 = defpackage.fbvz.ALL_MESSAGES_DELIVERED
            r4.m(r1)
        L63:
            boolean r1 = r4.k
            if (r1 == 0) goto L8
            fbvz r1 = defpackage.fbvz.SUFFIX_DELIVERED
            r4.m(r1)
            r4.b()
            goto L8
        L70:
            r0 = 0
            r4.q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fbwb.j():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0093 A[Catch: StatusException -> 0x0118, all -> 0x0120, TryCatch #1 {StatusException -> 0x0118, blocks: (B:7:0x0009, B:9:0x0016, B:12:0x001f, B:14:0x0033, B:17:0x003e, B:19:0x0042, B:21:0x004c, B:22:0x004f, B:26:0x0056, B:28:0x005a, B:31:0x0060, B:33:0x0064, B:37:0x006b, B:38:0x0079, B:39:0x0082, B:41:0x0093, B:42:0x009c, B:44:0x00a4, B:46:0x00b2, B:47:0x00b8, B:48:0x00c1, B:49:0x00d7, B:51:0x00da, B:52:0x00e1, B:54:0x00e5, B:56:0x00e9, B:59:0x00f1, B:60:0x00f9, B:63:0x0108, B:64:0x0113), top: B:75:0x0009, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009c A[Catch: StatusException -> 0x0118, all -> 0x0120, TryCatch #1 {StatusException -> 0x0118, blocks: (B:7:0x0009, B:9:0x0016, B:12:0x001f, B:14:0x0033, B:17:0x003e, B:19:0x0042, B:21:0x004c, B:22:0x004f, B:26:0x0056, B:28:0x005a, B:31:0x0060, B:33:0x0064, B:37:0x006b, B:38:0x0079, B:39:0x0082, B:41:0x0093, B:42:0x009c, B:44:0x00a4, B:46:0x00b2, B:47:0x00b8, B:48:0x00c1, B:49:0x00d7, B:51:0x00da, B:52:0x00e1, B:54:0x00e5, B:56:0x00e9, B:59:0x00f1, B:60:0x00f9, B:63:0x0108, B:64:0x0113), top: B:75:0x0009, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final synchronized void k(android.os.Parcel r12) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fbwb.k(android.os.Parcel):void");
    }

    final void l(fbwp fbwpVar, fcmp fcmpVar) {
        this.e = fbwpVar;
        this.f = fbwpVar.f;
        this.g = fcmpVar;
        if (p()) {
            return;
        }
        m(fbvz.INITIALIZED);
    }

    protected final void m(fbvz fbvzVar) {
        fbvz fbvzVar2 = this.n;
        int iOrdinal = fbvzVar.ordinal();
        if (iOrdinal == 1) {
            ejwl.r(fbvzVar2 == fbvz.UNINITIALIZED, "%s -> %s", fbvzVar2, fbvzVar);
        } else if (iOrdinal == 2) {
            ejwl.r(fbvzVar2 == fbvz.INITIALIZED || fbvzVar2 == fbvz.UNINITIALIZED, "%s -> %s", fbvzVar2, fbvzVar);
        } else if (iOrdinal == 3) {
            ejwl.r(fbvzVar2 == fbvz.PREFIX_DELIVERED, "%s -> %s", fbvzVar2, fbvzVar);
        } else if (iOrdinal == 4) {
            ejwl.r(fbvzVar2 == fbvz.ALL_MESSAGES_DELIVERED, "%s -> %s", fbvzVar2, fbvzVar);
        } else if (iOrdinal != 5) {
            throw new AssertionError();
        }
        this.n = fbvzVar;
    }

    public final void n(int i) {
        this.p += i;
        j();
    }

    final void o() {
        this.b.p(this);
    }

    protected final boolean p() {
        return this.n == fbvz.CLOSED;
    }

    public final synchronized String toString() {
        StringBuilder sb;
        String simpleName = getClass().getSimpleName();
        boolean z = this.k;
        String strValueOf = String.valueOf(this.n);
        boolean zR = r();
        fcmp fcmpVar = this.g;
        sb = new StringBuilder();
        sb.append(simpleName);
        sb.append("[SfxA=");
        sb.append(z);
        sb.append("/De=");
        sb.append(strValueOf);
        sb.append("/Msg=");
        sb.append(zR);
        sb.append("/Lis=");
        sb.append(fcmpVar != null);
        sb.append("]");
        return sb.toString();
    }
}

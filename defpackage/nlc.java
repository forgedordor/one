package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nlc {
    private final nlb b;
    private final nlg c;
    private final long d;
    private boolean e;
    private long h;
    private boolean k;
    private boolean m;
    private boolean n;
    private int f = 0;
    private long g = -9223372036854775807L;
    private long i = -9223372036854775807L;
    private long j = -9223372036854775807L;
    private float l = 1.0f;
    public mej a = mej.a;

    public nlc(Context context, nlb nlbVar, long j) {
        this.b = nlbVar;
        this.d = j;
        this.c = new nlg(context);
    }

    private final void n(int i) {
        this.f = Math.min(this.f, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x012c, code lost:
    
        if (r4 > 100000) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0137, code lost:
    
        if (r28 >= r32) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x013c, code lost:
    
        if (r25.e != false) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(long r26, long r28, long r30, long r32, boolean r34, boolean r35, defpackage.nla r36) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nlc.a(long, long, long, long, boolean, boolean, nla):int");
    }

    public final void b() {
        if (this.f == 0) {
            this.f = 1;
        }
    }

    public final void c(boolean z) {
        this.k = z;
        long j = this.d;
        this.j = j > 0 ? SystemClock.elapsedRealtime() + j : -9223372036854775807L;
    }

    public final void d() {
        this.e = true;
        this.h = mgb.w(SystemClock.elapsedRealtime());
        nlg nlgVar = this.c;
        nlgVar.d = true;
        nlgVar.b();
        nle nleVar = nlgVar.b;
        if (nleVar != null) {
            nlf nlfVar = nlgVar.c;
            mee.f(nlfVar);
            nlfVar.c.sendEmptyMessage(2);
            nleVar.a.registerDisplayListener(nleVar, mgb.E());
            nleVar.b.c(nleVar.a());
        }
        nlgVar.e(false);
    }

    public final void e() {
        this.e = false;
        this.j = -9223372036854775807L;
        nlg nlgVar = this.c;
        nlgVar.d = false;
        nle nleVar = nlgVar.b;
        if (nleVar != null) {
            nleVar.a.unregisterDisplayListener(nleVar);
            nlf nlfVar = nlgVar.c;
            mee.f(nlfVar);
            nlfVar.c.sendEmptyMessage(3);
        }
        nlgVar.a();
    }

    public final void f(int i) {
        if (i == 0) {
            this.f = 1;
        } else if (i != 1) {
            n(2);
        } else {
            this.f = 0;
        }
    }

    public final void g() {
        this.c.b();
        this.i = -9223372036854775807L;
        this.g = -9223372036854775807L;
        n(1);
        this.j = -9223372036854775807L;
    }

    public final void h(int i) {
        nlg nlgVar = this.c;
        if (nlgVar.h == i) {
            return;
        }
        nlgVar.h = i;
        nlgVar.e(true);
    }

    public final void i(float f) {
        nlg nlgVar = this.c;
        nlgVar.f = f;
        njv njvVar = nlgVar.a;
        njvVar.a.d();
        njvVar.b.d();
        njvVar.c = false;
        njvVar.d = -9223372036854775807L;
        njvVar.e = 0;
        nlgVar.d();
    }

    public final void j(Surface surface) {
        this.m = surface != null;
        this.n = false;
        nlg nlgVar = this.c;
        if (nlgVar.e != surface) {
            nlgVar.a();
            nlgVar.e = surface;
            nlgVar.e(true);
        }
        n(1);
    }

    public final void k(float f) {
        mee.a(f > 0.0f);
        if (f == this.l) {
            return;
        }
        this.l = f;
        nlg nlgVar = this.c;
        nlgVar.g = f;
        nlgVar.b();
        nlgVar.e(false);
    }

    public final boolean l(boolean z) {
        if (z && (this.f == 3 || (!this.m && this.n))) {
            this.j = -9223372036854775807L;
            return true;
        }
        if (this.j != -9223372036854775807L) {
            if (SystemClock.elapsedRealtime() < this.j) {
                return true;
            }
            this.j = -9223372036854775807L;
        }
        return false;
    }

    public final boolean m() {
        int i = this.f;
        this.f = 3;
        this.h = mgb.w(SystemClock.elapsedRealtime());
        return i != 3;
    }
}

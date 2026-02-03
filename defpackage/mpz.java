package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import androidx.media3.exoplayer.ExoPlayer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mpz {
    final Context a;
    public mej b;
    ejxr c;
    public ejxr d;
    public ejxr e;
    ejxr f;
    ejxr g;
    ejvr h;
    public Looper i;
    int j;
    mac k;
    int l;
    boolean m;
    mtq n;
    mtp o;
    long p;
    long q;
    long r;
    long s;
    long t;
    public boolean u;
    public boolean v;
    String w;
    mpf x;

    public mpz(final Context context) {
        this(context, new ejxr() { // from class: mpp
            @Override // defpackage.ejxr
            public final Object get() {
                return new mpl(context);
            }
        }, new ejxr() { // from class: mpq
            @Override // defpackage.ejxr
            public final Object get() {
                return new neb(context, new nnn());
            }
        });
    }

    public final ExoPlayer a() {
        mee.c(!this.v);
        this.v = true;
        return new mrn(this);
    }

    public final void b(final mpi mpiVar) {
        mee.c(!this.v);
        this.f = new ejxr() { // from class: mpo
            @Override // defpackage.ejxr
            public final Object get() {
                return mpiVar;
            }
        };
    }

    public mpz(final Context context, ejxr ejxrVar, ejxr ejxrVar2) {
        ejxr ejxrVar3 = new ejxr() { // from class: mpt
            @Override // defpackage.ejxr
            public final Object get() {
                return new nid(context);
            }
        };
        ejxr ejxrVar4 = new ejxr() { // from class: mpu
            @Override // defpackage.ejxr
            public final Object get() {
                return new mpi(new niu(), 50000, 50000, 1000, 2000);
            }
        };
        ejxr ejxrVar5 = new ejxr() { // from class: mpv
            @Override // defpackage.ejxr
            public final Object get() {
                return niw.e(context);
            }
        };
        ejvr ejvrVar = new ejvr() { // from class: mpw
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return new mwk((mej) obj);
            }
        };
        mee.f(context);
        this.a = context;
        this.c = ejxrVar;
        this.d = ejxrVar2;
        this.e = ejxrVar3;
        this.f = ejxrVar4;
        this.g = ejxrVar5;
        this.h = ejvrVar;
        this.i = mgb.G();
        this.k = mac.a;
        this.l = 1;
        this.m = true;
        this.n = mtq.b;
        this.p = 5000L;
        this.q = 15000L;
        this.r = 3000L;
        this.o = mtp.a;
        this.x = new mpf(mgb.w(20L), mgb.w(500L));
        this.b = mej.a;
        this.s = 500L;
        this.t = 2000L;
        this.u = true;
        this.w = "";
        this.j = -1000;
        if (Build.VERSION.SDK_INT >= 35) {
            int i = mpm.a;
        }
    }
}

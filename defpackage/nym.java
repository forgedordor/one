package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nym {
    public final nox a;
    public final byte[] d;
    public int e;
    public long f;
    public boolean g;
    public long h;
    public boolean j;
    public long k;
    public long l;
    public boolean m;
    public boolean n;
    public final boolean b = false;
    public final boolean c = false;
    private final SparseArray o = new SparseArray();
    private final SparseArray p = new SparseArray();
    public final nyl i = new nyl();

    public nym(nox noxVar) {
        this.a = noxVar;
        byte[] bArr = new byte[128];
        this.d = bArr;
        new mgz(bArr, 0, 0);
        c();
    }

    public final void a(mgw mgwVar) {
        this.p.append(mgwVar.a, mgwVar);
    }

    public final void b(mgx mgxVar) {
        this.o.append(mgxVar.d, mgxVar);
    }

    public final void c() {
        this.g = false;
        this.j = false;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dyws {
    public final ejxr a;

    public dyws(ejxr ejxrVar) {
        this.a = ejxx.a(ejxrVar);
    }

    public abstract void a(Runnable runnable);

    public final void b(final String str, final String str2) {
        a(new Runnable() { // from class: dywp
            @Override // java.lang.Runnable
            public final void run() {
                ((ecoe) ((dyxi) this.a.a.get()).i.get()).a(str, str2);
            }
        });
    }

    public final void c(final String str, final String str2, final String str3, final String str4, final boolean z) {
        a(new Runnable() { // from class: dywl
            @Override // java.lang.Runnable
            public final void run() {
                ((ecoe) ((dyxi) this.a.a.get()).f.get()).a(str, str2, str3, str4, Boolean.valueOf(z));
            }
        });
    }

    public final void d(final String str, final String str2, final String str3) {
        a(new Runnable() { // from class: dywi
            @Override // java.lang.Runnable
            public final void run() {
                ((ecoe) ((dyxi) this.a.a.get()).e.get()).a(str, str2, str3);
            }
        });
    }

    public final void e(final String str, final String str2, final int i, final String str3, final boolean z) {
        a(new Runnable() { // from class: dywj
            @Override // java.lang.Runnable
            public final void run() {
                ((ecoe) ((dyxi) this.a.a.get()).d.get()).a(str, str2, Integer.valueOf(i), str3, Boolean.valueOf(z));
            }
        });
    }

    public final void f(final String str, final boolean z, final boolean z2, final boolean z3, final int i, final String str2) {
        a(new Runnable() { // from class: dywq
            @Override // java.lang.Runnable
            public final void run() {
                ((ecoe) ((dyxi) this.a.a.get()).c.get()).a(str, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Integer.valueOf(i), str2);
            }
        });
    }

    public final void g(final double d, final String str, final String str2, final String str3, final String str4, final boolean z) {
        a(new Runnable() { // from class: dywm
            @Override // java.lang.Runnable
            public final void run() {
                ((ecog) ((dyxi) this.a.a.get()).h.get()).b(d, str, str2, str3, str4, Boolean.valueOf(z));
            }
        });
    }

    public final void h(final double d, final String str, final String str2, final int i, final String str3, final boolean z) {
        a(new Runnable() { // from class: dywn
            @Override // java.lang.Runnable
            public final void run() {
                ((ecog) ((dyxi) this.a.a.get()).g.get()).b(d, str, str2, Integer.valueOf(i), str3, Boolean.valueOf(z));
            }
        });
    }
}

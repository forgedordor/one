package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mne implements mcz {
    final /* synthetic */ mnk a;

    public mne(mnk mnkVar) {
        this.a = mnkVar;
    }

    @Override // defpackage.mcz
    public final void a() {
        this.a.d.execute(new Runnable() { // from class: mnd
            @Override // java.lang.Runnable
            public final void run() {
                mnk mnkVar = this.a.a;
                mnkVar.c.a(mnkVar.j);
            }
        });
    }

    @Override // defpackage.mcz
    public final void b(mcw mcwVar) {
        this.a.o(mcwVar);
    }

    @Override // defpackage.mcz
    public final void c(final long j, final boolean z) {
        if (j == 0) {
            this.a.k = true;
            j = 0;
        }
        mnk mnkVar = this.a;
        mnkVar.j = j;
        mnkVar.d.execute(new Runnable() { // from class: mnb
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.c.c(j, z);
            }
        });
    }

    @Override // defpackage.mcz
    public final void d(final float f) {
        this.a.d.execute(new Runnable() { // from class: mnc
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.c.d(f);
            }
        });
    }

    @Override // defpackage.mcz
    public final void e(final int i, final int i2) {
        this.a.d.execute(new Runnable() { // from class: mna
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.c.e(i, i2);
            }
        });
    }

    @Override // defpackage.mcz
    public final void f() {
        this.a.p();
    }
}

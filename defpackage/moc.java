package defpackage;

import androidx.media3.effect.SingleInputVideoGraph;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class moc implements mcz {
    public long a;
    final /* synthetic */ SingleInputVideoGraph b;

    public moc(SingleInputVideoGraph singleInputVideoGraph) {
        this.b = singleInputVideoGraph;
    }

    @Override // defpackage.mcz
    public final void a() {
        this.b.b.execute(new Runnable() { // from class: mnz
            @Override // java.lang.Runnable
            public final void run() {
                moc mocVar = this.a;
                mocVar.b.a.a(mocVar.a);
            }
        });
    }

    @Override // defpackage.mcz
    public final void b(final mcw mcwVar) {
        this.b.b.execute(new Runnable() { // from class: moa
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.a.b(mcwVar);
            }
        });
    }

    @Override // defpackage.mcz
    public final void c(final long j, final boolean z) {
        if (j == 0) {
            this.b.c = true;
            j = 0;
        }
        this.a = j;
        this.b.b.execute(new Runnable() { // from class: mob
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.a.c(j, z);
            }
        });
    }

    @Override // defpackage.mcz
    public final void d(final float f) {
        this.b.b.execute(new Runnable() { // from class: mnx
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.a.d(f);
            }
        });
    }

    @Override // defpackage.mcz
    public final void e(final int i, final int i2) {
        this.b.b.execute(new Runnable() { // from class: mny
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.a.e(i, i2);
            }
        });
    }

    @Override // defpackage.mcz
    public final /* synthetic */ void f() {
    }
}

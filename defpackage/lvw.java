package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lvw implements lvz {
    final lvv a;
    final lvz b;
    int c = -1;

    public lvw(lvv lvvVar, lvz lvzVar) {
        this.a = lvvVar;
        this.b = lvzVar;
    }

    @Override // defpackage.lvz
    public final void a(Object obj) {
        int i = this.c;
        int i2 = this.a.g;
        if (i != i2) {
            this.c = i2;
            this.b.a(obj);
        }
    }

    final void b() {
        this.a.g(this);
    }

    final void c() {
        this.a.k(this);
    }
}

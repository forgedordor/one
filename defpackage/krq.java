package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class krq implements krn, krg {
    public final krj a;
    public int b;
    public int c = -1;
    public int d = -1;
    public float e = 0.0f;
    public Object f;
    private ksd g;

    public krq(krj krjVar) {
        this.a = krjVar;
    }

    @Override // defpackage.krg
    public final krn a() {
        return null;
    }

    @Override // defpackage.krn, defpackage.krg
    public final krz b() {
        if (this.g == null) {
            this.g = new ksd();
        }
        return this.g;
    }

    public final void c(float f) {
        this.c = -1;
        this.d = -1;
        this.e = f;
    }

    @Override // defpackage.krg
    public final Object d() {
        return this.f;
    }

    @Override // defpackage.krn, defpackage.krg
    public final void e() {
        this.g.ag(this.b);
        int i = this.c;
        if (i != -1) {
            this.g.c(i);
            return;
        }
        int i2 = this.d;
        if (i2 != -1) {
            this.g.ae(i2);
        } else {
            this.g.af(this.e);
        }
    }

    @Override // defpackage.krg
    public final void f(krz krzVar) {
        this.g = krzVar instanceof ksd ? (ksd) krzVar : null;
    }
}

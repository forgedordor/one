package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eqp {
    public final hum a = new hum(new emx[16]);
    public int b;
    private emx c;

    public final emx a(int i) {
        if (i < 0 || i >= this.b) {
            ebs.e("Index " + i + ", size " + this.b);
        }
        emx emxVar = this.c;
        if (emxVar != null) {
            int i2 = emxVar.a;
            if (i < emxVar.b + i2 && i2 <= i) {
                return emxVar;
            }
        }
        hum humVar = this.a;
        emx emxVar2 = (emx) humVar.a[emy.a(humVar, i)];
        this.c = emxVar2;
        return emxVar2;
    }

    public final void b(int i, Object obj) {
        if (i < 0) {
            ebs.c("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        emx emxVar = new emx(this.b, i, obj);
        this.b += i;
        this.a.n(emxVar);
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class osa implements mw {
    public final owg a;
    public final owg b;
    public final mw c;
    public int d;
    public int e;
    public int f;
    private int g = 1;
    private int h = 1;

    public osa(owg owgVar, owg owgVar2, mw mwVar) {
        this.a = owgVar;
        this.b = owgVar2;
        this.c = mwVar;
        this.d = owgVar.e();
        this.e = owgVar.d();
        this.f = owgVar.a();
    }

    @Override // defpackage.mw
    public final void a(int i, int i2, Object obj) {
        this.c.a(i + this.d, i2, obj);
    }

    @Override // defpackage.mw
    public final void b(int i, int i2) {
        if (i >= this.f && this.h != 2) {
            int iMin = Math.min(i2, this.e);
            if (iMin > 0) {
                this.h = 3;
                this.c.a(this.d + i, iMin, opr.b);
                this.e -= iMin;
            }
            int i3 = i2 - iMin;
            if (i3 > 0) {
                this.c.b(i + iMin + this.d, i3);
            }
        } else if (i <= 0 && this.g != 2) {
            int iMin2 = Math.min(i2, this.d);
            if (iMin2 > 0) {
                this.g = 3;
                this.c.a((-iMin2) + this.d, iMin2, opr.b);
                this.d -= iMin2;
            }
            int i4 = i2 - iMin2;
            if (i4 > 0) {
                this.c.b(this.d, i4);
            }
        } else {
            this.c.b(i + this.d, i2);
        }
        this.f += i2;
    }

    @Override // defpackage.mw
    public final void c(int i, int i2) {
        int i3 = this.d;
        this.c.c(i + i3, i2 + i3);
    }

    @Override // defpackage.mw
    public final void d(int i, int i2) {
        if (i + i2 >= this.f && this.h != 3) {
            int iF = fddu.f(Math.min(this.b.d() - this.e, i2), 0);
            int i3 = i2 - iF;
            if (iF > 0) {
                this.h = 2;
                this.c.a(this.d + i, iF, opr.a);
                this.e += iF;
            }
            if (i3 > 0) {
                this.c.d(i + iF + this.d, i3);
            }
        } else if (i <= 0 && this.g != 3) {
            int iF2 = fddu.f(Math.min(this.b.e() - this.d, i2), 0);
            int i4 = i2 - iF2;
            if (i4 > 0) {
                this.c.d(this.d, i4);
            }
            if (iF2 > 0) {
                this.g = 2;
                this.c.a(this.d, iF2, opr.a);
                this.d += iF2;
            }
        } else {
            this.c.d(i + this.d, i2);
        }
        this.f -= i2;
    }
}

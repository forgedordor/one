package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsn {
    public hsm a;
    public boolean b;
    public int e;
    public int h;
    private final hmw i;
    private int j;
    public final hog c = new hog();
    public boolean d = true;
    private final ArrayList k = new ArrayList();
    private int l = -1;
    public int f = -1;
    public int g = -1;

    public hsn(hmw hmwVar, hsm hsmVar) {
        this.i = hmwVar;
        this.a = hsmVar;
    }

    public final hqz a() {
        return this.i.s;
    }

    public final void b() {
        if (this.b) {
            j(false);
            j(false);
            this.a.c();
            this.b = false;
        }
    }

    public final void c(hsm hsmVar, hxg hxgVar) {
        hsm hsmVar2 = this.a;
        if (hsmVar.e()) {
            huf hufVar = hsmVar2.a;
            hufVar.c(hsr.a);
            hue.b(hufVar, 0, hsmVar, 1, hxgVar);
        }
    }

    public final void d(Object obj) {
        i();
        this.k.add(obj);
    }

    public final void e(int i) {
        this.e += i - a().f;
    }

    public final void f() {
        i();
        ArrayList arrayList = this.k;
        if (hse.b(arrayList)) {
            hse.a(arrayList);
        } else {
            this.j++;
        }
    }

    public final void g() {
        int i = this.j;
        if (i > 0) {
            huf hufVar = this.a.a;
            hufVar.c(htw.a);
            hufVar.c[hufVar.d - hufVar.a[hufVar.b - 1].b] = i;
            this.j = 0;
        }
        ArrayList arrayList = this.k;
        if (hse.b(arrayList)) {
            hsm hsmVar = this.a;
            int size = arrayList.size();
            Object[] objArr = new Object[size];
            for (int i2 = 0; i2 < size; i2++) {
                objArr[i2] = arrayList.get(i2);
            }
            if (size != 0) {
                huf hufVar2 = hsmVar.a;
                hufVar2.c(hsw.a);
                hue.a(hufVar2, 0, objArr);
            }
            arrayList.clear();
        }
    }

    public final void h() {
        j(false);
        k();
    }

    public final void i() {
        int i = this.h;
        if (i > 0) {
            int i2 = this.l;
            if (i2 >= 0) {
                g();
                huf hufVar = this.a.a;
                hufVar.c(htm.a);
                int i3 = hufVar.d - hufVar.a[hufVar.b - 1].b;
                int[] iArr = hufVar.c;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.l = -1;
            } else {
                int i4 = this.g;
                int i5 = this.f;
                g();
                huf hufVar2 = this.a.a;
                hufVar2.c(hth.a);
                int i6 = hufVar2.d - hufVar2.a[hufVar2.b - 1].b;
                int[] iArr2 = hufVar2.c;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.f = -1;
                this.g = -1;
            }
            this.h = 0;
        }
    }

    public final void j(boolean z) {
        int i = z ? a().h : a().f;
        int i2 = i - this.e;
        if (i2 < 0) {
            hmz.j("Tried to seek backward");
        }
        if (i2 > 0) {
            huf hufVar = this.a.a;
            hufVar.c(hsp.a);
            hufVar.c[hufVar.d - hufVar.a[hufVar.b - 1].b] = i2;
            this.e = i;
        }
    }

    public final void k() {
        if (a().c > 0) {
            hqz hqzVarA = a();
            int i = hqzVarA.h;
            hog hogVar = this.c;
            if (hogVar.a(-2) != i) {
                if (!this.b && this.d) {
                    j(false);
                    this.a.a.c(htc.a);
                    this.b = true;
                }
                if (i > 0) {
                    hlv hlvVarG = hqzVarA.g(i);
                    hogVar.d(i);
                    j(false);
                    huf hufVar = this.a.a;
                    hufVar.c(htb.a);
                    hue.a(hufVar, 0, hlvVarG);
                    this.b = true;
                }
            }
        }
    }

    public final void l(int i, int i2) {
        if (i2 > 0) {
            if (i < 0) {
                hmz.j(a.g(i, "Invalid remove index "));
            }
            if (this.l == i) {
                this.h += i2;
                return;
            }
            i();
            this.l = i;
            this.h = i2;
        }
    }

    public final void m() {
        this.a.a.c(htp.a);
    }
}

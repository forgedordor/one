package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class huf extends hug {
    public int b;
    public int d;
    public int f;
    public hty[] a = new hty[16];
    public int[] c = new int[16];
    public Object[] e = new Object[16];

    private static final int f(int i, int i2) {
        return fddu.f(i + fddu.g(i, 1024), i2);
    }

    public final void a() {
        this.b = 0;
        this.d = 0;
        fcur.d(this.e, null, 0, this.f);
        this.f = 0;
    }

    public final void b(hlw hlwVar, hre hreVar, hqs hqsVar, htz htzVar) {
        if (e()) {
            hud hudVar = new hud(this);
            while (true) {
                hty htyVarB = hudVar.b();
                final hlv hlvVarB = htyVarB.b(hudVar);
                hlw hlwVar2 = hlwVar;
                final hre hreVar2 = hreVar;
                hqs hqsVar2 = hqsVar;
                final htz htzVar2 = htzVar;
                try {
                    htyVarB.a(hudVar, hlwVar2, hreVar2, hqsVar2, htzVar2);
                    int i = hudVar.a;
                    huf hufVar = hudVar.d;
                    if (i < hufVar.b) {
                        hty htyVarB2 = hudVar.b();
                        hudVar.b += htyVarB2.b;
                        hudVar.c += htyVarB2.c;
                        int i2 = hudVar.a + 1;
                        hudVar.a = i2;
                        if (i2 >= hufVar.b) {
                            break;
                        }
                        hlwVar = hlwVar2;
                        hreVar = hreVar2;
                        hqsVar = hqsVar2;
                        htzVar = htzVar2;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        a();
    }

    public final void c(hty htyVar) {
        int i = this.b;
        hty[] htyVarArr = this.a;
        if (i == htyVarArr.length) {
            hty[] htyVarArr2 = new hty[fddu.g(i, 1024) + i];
            System.arraycopy(htyVarArr, 0, htyVarArr2, 0, i);
            this.a = htyVarArr2;
        }
        int i2 = this.d;
        int i3 = htyVar.b;
        int i4 = i2 + i3;
        int[] iArr = this.c;
        int length = iArr.length;
        if (i4 > length) {
            int[] iArr2 = new int[f(length, i4)];
            fcur.l(iArr, iArr2, 0, 0, length);
            this.c = iArr2;
        }
        int i5 = this.f;
        int i6 = htyVar.c;
        int i7 = i5 + i6;
        Object[] objArr = this.e;
        int length2 = objArr.length;
        if (i7 > length2) {
            Object[] objArr2 = new Object[f(length2, i7)];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.e = objArr2;
        }
        hty[] htyVarArr3 = this.a;
        int i8 = this.b;
        this.b = i8 + 1;
        htyVarArr3[i8] = htyVar;
        this.d += i3;
        this.f += i6;
    }

    public final boolean d() {
        return this.b == 0;
    }

    public final boolean e() {
        return this.b != 0;
    }
}

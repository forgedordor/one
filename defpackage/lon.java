package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lon {
    private int a = 1;
    private final lou b;
    private lou c;
    private lou d;
    private int e;
    private int f;
    private final boolean g;
    private final int[] h;

    public lon(lou louVar, boolean z, int[] iArr) {
        this.b = louVar;
        this.c = louVar;
        this.g = z;
        this.h = iArr;
    }

    private static boolean e(int i) {
        return i == 65039;
    }

    private final boolean f() {
        int[] iArr;
        plh plhVarD = this.c.a.d();
        int iB = plhVarD.b(6);
        if ((iB == 0 || plhVarD.b.get(iB + plhVarD.a) == 0) && !e(this.e)) {
            return this.g && ((iArr = this.h) == null || Arrays.binarySearch(iArr, this.c.a.a(0)) < 0);
        }
        return true;
    }

    private final void g() {
        this.a = 1;
        this.c = this.b;
        this.f = 0;
    }

    final int a(int i) {
        lou louVarA = this.c.a(i);
        int i2 = 1;
        int i3 = 2;
        if (this.a == 2) {
            if (louVarA != null) {
                this.c = louVarA;
                this.f++;
            } else if (i == 65038) {
                g();
            } else if (!e(i)) {
                lou louVar = this.c;
                if (louVar.a != null) {
                    i3 = 3;
                    if (this.f != 1) {
                        this.d = louVar;
                        g();
                    } else if (f()) {
                        this.d = this.c;
                        g();
                    } else {
                        g();
                    }
                } else {
                    g();
                }
            }
            i2 = i3;
        } else if (louVarA == null) {
            g();
        } else {
            this.a = 2;
            this.c = louVarA;
            this.f = 1;
            i2 = i3;
        }
        this.e = i;
        return i2;
    }

    final lol b() {
        return this.c.a;
    }

    final lol c() {
        return this.d.a;
    }

    final boolean d() {
        if (this.a != 2 || this.c.a == null) {
            return false;
        }
        return this.f > 1 || f();
    }
}

package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lqf {
    public int a = 1;
    public lqm b;
    public lqm c;
    public int d;
    public int e;
    private final lqm f;
    private final boolean g;
    private final int[] h;

    public lqf(lqm lqmVar, boolean z, int[] iArr) {
        this.f = lqmVar;
        this.b = lqmVar;
        this.g = z;
        this.h = iArr;
    }

    public static boolean c(int i) {
        return i == 65039;
    }

    final lqq a() {
        return this.b.a;
    }

    final lqq b() {
        return this.c.a;
    }

    public final boolean d() {
        int[] iArr;
        lqv lqvVarF = this.b.a.f();
        int iB = lqvVarF.b(6);
        if ((iB == 0 || lqvVarF.b.get(iB + lqvVarF.a) == 0) && !c(this.d)) {
            return this.g && ((iArr = this.h) == null || Arrays.binarySearch(iArr, this.b.a.a(0)) < 0);
        }
        return true;
    }

    public final void e() {
        this.a = 1;
        this.b = this.f;
        this.e = 0;
    }
}

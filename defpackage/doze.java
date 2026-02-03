package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doze extends dobm {
    public final int a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;
    private final boolean f;
    private final boolean g;
    private final dofn h;
    private final boolean i;

    /* JADX WARN: Illegal instructions before constructor call */
    public doze() {
        boolean z = false;
        this(z, z, 2047);
    }

    @Override // defpackage.dobm
    public final int a() {
        return this.c;
    }

    @Override // defpackage.dobm
    public final dofn b() {
        return this.h;
    }

    @Override // defpackage.dobm
    public final boolean c() {
        return this.f;
    }

    @Override // defpackage.dobm
    public final boolean d() {
        return this.e;
    }

    @Override // defpackage.dobm
    public final boolean e() {
        return this.g;
    }

    @Override // defpackage.dobm
    public final boolean f() {
        return this.i;
    }

    @Override // defpackage.dobm
    public final boolean g() {
        return this.d;
    }

    public /* synthetic */ doze(boolean z, boolean z2, int i) {
        dofn dofnVarA;
        if ((i & 64) != 0) {
            fctc fctcVar = dofn.a;
            dofnVarA = dofm.a();
        } else {
            dofnVarA = null;
        }
        int i2 = (i & 32) != 0 ? R.dimen.sticker_item_min_size : 0;
        int i3 = i & 8;
        int i4 = i & 4;
        boolean z3 = (i & 2) == 0;
        int i5 = i & 1;
        boolean z4 = i3 != 0;
        boolean z5 = i4 != 0;
        boolean z6 = z & z3;
        int i6 = 1 != i5 ? 0 : 3;
        boolean z7 = (i & 128) != 0;
        boolean z8 = (i & 256) != 0;
        boolean z9 = (i & 1024) == 0;
        this.a = i6;
        this.b = z6;
        this.f = z5;
        this.g = z4;
        this.c = i2;
        this.h = dofnVarA;
        this.i = z7;
        this.d = z8;
        this.e = z2 & z9;
    }

    @Override // defpackage.dobm
    public final void h() {
    }
}

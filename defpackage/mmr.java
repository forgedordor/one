package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mmr implements mme {
    private final int a;
    private final int b;

    public mmr(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static float d(int i, int i2, int i3, int i4) {
        mee.a(i > 0);
        mee.a(i2 > 0);
        return i2 * i3 <= i4 * i ? i3 / i : i4 / i2;
    }

    @Override // defpackage.mme
    public final mmk b(Context context, boolean z) {
        return new mnw(context, z, new mmq(this.a, this.b));
    }

    @Override // defpackage.mme
    public final boolean c(int i, int i2) {
        mft mftVar = new mft(this.a, this.b);
        return Math.abs(d(i, i2, mftVar.c, mftVar.d) + (-1.0f)) < 0.01f;
    }

    @Override // defpackage.map
    public final /* synthetic */ void a() {
    }
}

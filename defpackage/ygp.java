package defpackage;

import android.content.res.Resources;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ygp {
    public static final ygp a;
    public static final ygp b;
    public static final /* synthetic */ fcza c;
    private static final /* synthetic */ ygp[] e;
    public final int d;

    static {
        ygp ygpVar = new ygp("HALF_SCREEN", 0, Resources.getSystem().getDisplayMetrics().heightPixels / 2);
        a = ygpVar;
        ygp ygpVar2 = new ygp("FULL_SCREEN", 1, Resources.getSystem().getDisplayMetrics().heightPixels);
        b = ygpVar2;
        ygp[] ygpVarArr = {ygpVar, ygpVar2};
        e = ygpVarArr;
        c = fczb.a(ygpVarArr);
    }

    private ygp(String str, int i, int i2) {
        this.d = i2;
    }

    public static ygp[] values() {
        return (ygp[]) e.clone();
    }
}

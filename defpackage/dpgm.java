package defpackage;

import android.R;
import android.content.res.ColorStateList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpgm {
    public static final ColorStateList a(int i, int i2) {
        return new ColorStateList(new int[][]{new int[]{R.attr.state_selected}, new int[]{-16842913}}, new int[]{i, i2});
    }

    public static final dpgl b(gda gdaVar, boolean z, boolean z2) {
        gdaVar.getClass();
        if (!z2) {
            return new dpgl(gdaVar, ijg.b(z ? gdaVar.J : gdaVar.p), 0, 0, ijg.b(gdaVar.a), null, null, ijg.b(z ? gdaVar.I : gdaVar.v), 64374);
        }
        long j = gdaVar.F;
        long j2 = gdaVar.J;
        long j3 = gdaVar.f;
        long j4 = gdaVar.g;
        long j5 = gdaVar.q;
        return new dpgl(gdaVar, ijg.b(j), ijg.b(j2), ijg.b(j3), 0, a(ijg.b(j4), ijg.b(j5)), a(ijg.b(j3), ijg.b(j5)), ijg.b(j2), 63558);
    }
}

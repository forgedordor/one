package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwex implements fdau {
    final /* synthetic */ cvwx a;

    public cwex(cvwx cvwxVar) {
        this.a = cvwxVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) throws Resources.NotFoundException {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((edp) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            cvwz.a(this.a, hmlVar, 0);
        }
        return fctx.a;
    }
}

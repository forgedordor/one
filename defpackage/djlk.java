package defpackage;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djlk implements fdat {
    final /* synthetic */ boolean a;
    final /* synthetic */ hbl b;

    public djlk(boolean z, hbl hblVar) {
        this.a = z;
        this.b = hblVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            if (this.a) {
                hmlVar.v(1870198227);
                dtib.a(this.b, null, null, hmlVar, 0);
                hmlVar.o();
            } else {
                hmlVar.v(1870272100);
                hbl hblVar = this.b;
                hmlVar.v(60334435);
                float f = hbj.a;
                Configuration configuration = (Configuration) hmlVar.e(AndroidCompositionLocals_androidKt.a);
                int i = configuration.screenHeightDp < configuration.screenWidthDp ? 0 : 1;
                int i2 = Float.compare(djmd.g(hmlVar), 425.0f) > 0 ? 1 : 0;
                hmlVar.o();
                dtib.b(hblVar, null, null, (i2 ^ 1) | i, hmlVar, 0);
                hmlVar.o();
            }
        }
        return fctx.a;
    }
}

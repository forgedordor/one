package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmfo implements fdap {
    final /* synthetic */ float a;

    public dmfo(float f) {
        this.a = f;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        kov kovVar = (kov) obj;
        kovVar.getClass();
        kot kotVar = kovVar.e;
        kow kowVar = kovVar.c;
        kqa.a(kotVar, kowVar.b, 0.0f, 6);
        if (Build.VERSION.SDK_INT >= 35) {
            kpt.a(kovVar.f, kowVar.c, this.a, 4);
        } else {
            kpt.a(kovVar.f, kowVar.c, 0.0f, 6);
        }
        return fctx.a;
    }
}

package defpackage;

import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gtp implements fdap {
    final /* synthetic */ boolean a;
    final /* synthetic */ fdap b;
    final /* synthetic */ boolean c;
    final /* synthetic */ float d;
    final /* synthetic */ fdae e;
    final /* synthetic */ fddm f;

    public gtp(boolean z, fdap fdapVar, fddm fddmVar, boolean z2, float f, fdae fdaeVar) {
        this.a = z;
        this.b = fdapVar;
        this.f = fddmVar;
        this.c = z2;
        this.d = f;
        this.e = fdaeVar;
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        fdap fdapVar;
        KeyEvent keyEvent = ((iqh) obj).a;
        boolean z = false;
        if (!this.a || (fdapVar = this.b) == null) {
            return false;
        }
        int iA = iqj.a(keyEvent);
        if (iqi.a(iA, 2)) {
            fddm fddmVar = this.f;
            float fAbs = Math.abs(((Number) fddmVar.b()).floatValue() - ((Number) fddmVar.c()).floatValue()) / 100.0f;
            int i = true != this.c ? 1 : -1;
            long jB = iqj.b(keyEvent);
            if (iqg.a(jB, iqg.d)) {
                fdapVar.invoke(fddu.t(Float.valueOf(this.d + (i * fAbs)), fddmVar));
            } else if (iqg.a(jB, iqg.e)) {
                fdapVar.invoke(fddu.t(Float.valueOf(this.d - (i * fAbs)), fddmVar));
            } else if (iqg.a(jB, iqg.g)) {
                fdapVar.invoke(fddu.t(Float.valueOf(this.d + (i * fAbs)), fddmVar));
            } else if (iqg.a(jB, iqg.f)) {
                fdapVar.invoke(fddu.t(Float.valueOf(this.d - (i * fAbs)), fddmVar));
            } else if (iqg.a(jB, iqg.p)) {
                fdapVar.invoke(fddmVar.c());
            } else if (iqg.a(jB, iqg.q)) {
                fdapVar.invoke(fddmVar.b());
            } else if (iqg.a(jB, iqg.r)) {
                fdapVar.invoke(fddu.t(Float.valueOf(this.d - (fddu.i(10, 1, 10) * fAbs)), fddmVar));
            } else if (iqg.a(jB, iqg.s)) {
                fdapVar.invoke(fddu.t(Float.valueOf(this.d + (fddu.i(10, 1, 10) * fAbs)), fddmVar));
            }
            z = true;
        } else if (iqi.a(iA, 1)) {
            long jB2 = iqj.b(keyEvent);
            if (iqg.a(jB2, iqg.d) || iqg.a(jB2, iqg.e) || iqg.a(jB2, iqg.g) || iqg.a(jB2, iqg.f) || iqg.a(jB2, iqg.p) || iqg.a(jB2, iqg.q) || iqg.a(jB2, iqg.r) || iqg.a(jB2, iqg.s)) {
                fdae fdaeVar = this.e;
                if (fdaeVar != null) {
                    fdaeVar.invoke();
                }
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}

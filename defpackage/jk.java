package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jk extends lfp {
    final /* synthetic */ jz a;

    public jk(jz jzVar) {
        this.a = jzVar;
    }

    @Override // defpackage.lfp, defpackage.lfo
    public final void a() {
        jz jzVar = this.a;
        jzVar.s.setAlpha(1.0f);
        jzVar.v.d(null);
        jzVar.v = null;
    }

    @Override // defpackage.lfp, defpackage.lfo
    public final void b() {
        jz jzVar = this.a;
        jzVar.s.setVisibility(0);
        if (jzVar.s.getParent() instanceof View) {
            View view = (View) jzVar.s.getParent();
            int[] iArr = ley.a;
            lel.c(view);
        }
    }
}

package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jgi extends hlu {
    public jgi(jcr jcrVar) {
        super(jcrVar);
    }

    @Override // defpackage.hlu
    protected final void e() {
        ((jcr) this.a).Y();
    }

    @Override // defpackage.hlu, defpackage.hlw
    public final void f() {
        jfh jfhVar = ((jcr) this.a).k;
        if (jfhVar != null) {
            jfhVar.s();
        }
    }

    @Override // defpackage.hlu, defpackage.hlw
    public final void g() {
        jcr jcrVar = (jcr) this.b;
        if (!jcrVar.d()) {
            itw.c("onReuse is only expected on attached node");
        }
        kkt kktVar = jcrVar.l;
        if (kktVar != null) {
            View view = kktVar.c;
            if (view.getParent() != kktVar) {
                kktVar.addView(view);
            }
        }
        iwy iwyVar = jcrVar.x;
        if (iwyVar != null) {
            iwyVar.i(false);
        }
        jcrVar.p = false;
        if (jcrVar.B) {
            jcrVar.B = false;
        } else {
            jcrVar.ae();
        }
        int i = jcrVar.c;
        jcrVar.c = jsh.a();
        jfh jfhVar = jcrVar.k;
        if (jfhVar != null) {
            cuh cuhVar = ((AndroidComposeView) jfhVar).o;
            cuhVar.d(i);
            cuhVar.f(jcrVar.c, jcrVar);
        }
        jee jeeVar = jcrVar.v;
        jeeVar.b();
        jeeVar.e();
        if (jeeVar.j(8)) {
            jcrVar.R();
        }
        jcrVar.ad(jcrVar);
        jfh jfhVar2 = jcrVar.k;
        if (jfhVar2 != null) {
            AndroidComposeView androidComposeView = (AndroidComposeView) jfhVar2;
            idh idhVar = androidComposeView.x;
            if (idhVar != null) {
                if (idhVar.g.e(i)) {
                    idhVar.i.a(idhVar.b, i, false);
                }
                jsc jscVarY = jcrVar.y();
                if (jscVarY != null && idi.b(jscVarY)) {
                    idhVar.g.d(jcrVar.c);
                    idhVar.i.a(idhVar.b, jcrVar.c, true);
                }
            }
            androidComposeView.p.e(jcrVar, jcrVar.w.o.m, true);
        }
    }

    @Override // defpackage.hlw
    public final /* bridge */ /* synthetic */ void i(int i, Object obj) {
        ((jcr) this.b).N(i, (jcr) obj);
    }

    @Override // defpackage.hlw
    public final /* bridge */ /* synthetic */ void j(int i, Object obj) {
    }

    @Override // defpackage.hlw
    public final void k(int i, int i2, int i3) {
        ((jcr) this.b).W(i, i2, i3);
    }

    @Override // defpackage.hlw
    public final void l(int i, int i2) {
        ((jcr) this.b).Z(i, i2);
    }
}

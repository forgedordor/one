package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jpw implements hna, lvh {
    public final AndroidComposeView a;
    public final hna b;
    public boolean c;
    public lvc d;
    public fdat e = jlh.a;

    public jpw(AndroidComposeView androidComposeView, hna hnaVar) {
        this.a = androidComposeView;
        this.b = hnaVar;
    }

    public final void b(fdat fdatVar) {
        jpv jpvVar = new jpv(this, fdatVar);
        AndroidComposeView androidComposeView = this.a;
        jhd jhdVarE = androidComposeView.E();
        if (jhdVarE != null) {
            jpvVar.invoke(jhdVarE);
        }
        if (androidComposeView.isAttachedToWindow()) {
            return;
        }
        androidComposeView.I = jpvVar;
    }

    @Override // defpackage.hna
    public final void d() {
        if (!this.c) {
            this.c = true;
            this.a.setTag(R.id.wrapped_composition_tag, null);
            lvc lvcVar = this.d;
            if (lvcVar != null) {
                lvcVar.d(this);
            }
        }
        this.b.d();
    }

    @Override // defpackage.hna
    public final boolean e() {
        throw null;
    }

    @Override // defpackage.lvh
    public final void gL(lvj lvjVar, lva lvaVar) {
        if (lvaVar == lva.ON_DESTROY) {
            d();
        } else {
            if (lvaVar != lva.ON_CREATE || this.c) {
                return;
            }
            b(this.e);
        }
    }
}

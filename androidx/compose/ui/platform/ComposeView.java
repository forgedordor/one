package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.fdat;
import defpackage.fdbk;
import defpackage.hml;
import defpackage.hmw;
import defpackage.hox;
import defpackage.hpl;
import defpackage.hpx;
import defpackage.hsi;
import defpackage.jgl;
import defpackage.jli;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ComposeView extends jgl {
    private final hox a;
    private boolean b;

    public ComposeView(Context context) {
        this(context, null, 0, 6, null);
    }

    public final void a(fdat fdatVar) {
        this.b = true;
        this.a.b(fdatVar);
        if (isAttachedToWindow()) {
            e();
        }
    }

    @Override // defpackage.jgl
    public final void b(hml hmlVar, int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(420213850);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (hmlVarC.J((i2 & 3) != 2, i2 & 1)) {
            fdat fdatVar = (fdat) this.a.a();
            if (fdatVar == null) {
                hmlVarC.v(-1238798753);
            } else {
                hmlVarC.v(98586082);
                fdatVar.a(hmlVarC, 0);
            }
            ((hmw) hmlVarC).ab();
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new jli(this, i);
        }
    }

    @Override // defpackage.jgl
    protected final boolean d() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new hpl(null, hsi.a);
    }

    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i, int i2, fdbk fdbkVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}

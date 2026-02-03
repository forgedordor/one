package defpackage;

import android.content.Context;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gmw extends jgl implements knm {
    private final Window a;
    private final hox b;
    private boolean c;

    public gmw(Context context, Window window) {
        super(context, null, 0, 6, null);
        this.a = window;
        this.b = new hpl(gdr.a, hsi.a);
    }

    @Override // defpackage.knm
    public final Window a() {
        return this.a;
    }

    @Override // defpackage.jgl
    public final void b(hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(576708319);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (hmlVarC.J((i2 & 3) != 2, i2 & 1)) {
            ((fdat) this.b.a()).a(hmlVarC, 0);
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gmv
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    this.a.b((hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public final void c(hnb hnbVar, fdat fdatVar) {
        super.i(hnbVar);
        this.b.b(fdatVar);
        this.c = true;
        e();
    }

    @Override // defpackage.jgl
    protected final boolean d() {
        return this.c;
    }
}

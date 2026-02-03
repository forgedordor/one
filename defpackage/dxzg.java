package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dxzg extends FrameLayout implements dyyh {
    private boolean a;
    private boolean b;

    public dxzg(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public abstract int a();

    @Override // defpackage.dyyh
    public final void b(dyyb dyybVar) {
        if (this.a) {
            dyybVar.c(this, a());
            this.b = true;
        }
    }

    public final void c(dyyb dyybVar, dsva dsvaVar) {
        if (this.a) {
            dyybVar.d(this, a(), dsvaVar);
            this.b = true;
        }
    }

    public final void d() {
        this.a = true;
    }

    @Override // defpackage.dyyh
    public final void gW(dyyb dyybVar) {
        if (this.a && this.b) {
            dyybVar.e(this);
            this.b = false;
        }
    }
}

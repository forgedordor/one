package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efuw extends vo {
    public View a;
    private final vo d;
    private final vq e;

    public efuw(vo voVar) {
        efuv efuvVar = new efuv(this);
        this.e = efuvVar;
        this.d = voVar;
        voVar.A(efuvVar);
        B(voVar.b);
    }

    @Override // defpackage.vo
    public final int a() {
        int iA = this.d.a();
        return this.a != null ? iA + 1 : iA;
    }

    @Override // defpackage.vo
    public final int dF(int i) {
        if (this.a != null) {
            i--;
        }
        return i < 0 ? Alert.DURATION_SHOW_INDEFINITELY : this.d.dF(i);
    }

    @Override // defpackage.vo
    public final wv e(ViewGroup viewGroup, int i) {
        if (i != Integer.MAX_VALUE) {
            return this.d.e(viewGroup, i);
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        return new efux(frameLayout);
    }

    @Override // defpackage.vo
    public final void g(wv wvVar, int i) {
        View view = this.a;
        if (view != null) {
            i--;
        }
        if (!(wvVar instanceof efux)) {
            this.d.g(wvVar, i);
        } else {
            if (view == null) {
                throw new IllegalStateException("HeaderViewHolder cannot find mHeader");
            }
            if (view.getParent() != null) {
                ((ViewGroup) this.a.getParent()).removeView(this.a);
            }
            ((FrameLayout) wvVar.a).addView(this.a);
        }
    }

    @Override // defpackage.vo
    public final long gH(int i) {
        if (this.a != null) {
            i--;
        }
        if (i < 0) {
            return Long.MAX_VALUE;
        }
        return this.d.gH(i);
    }
}

package defpackage;

import android.support.v7.widget.RecyclerView;
import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vl implements lcy {
    final /* synthetic */ RecyclerView a;

    public vl(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // defpackage.lcy
    public final float a() {
        float f;
        RecyclerView recyclerView = this.a;
        if (recyclerView.o.af()) {
            f = recyclerView.J;
        } else {
            if (!recyclerView.o.ae()) {
                return 0.0f;
            }
            f = recyclerView.I;
        }
        return -f;
    }

    @Override // defpackage.lcy
    public final void b() {
        this.a.ax();
    }

    @Override // defpackage.lcy
    public final boolean c(float f) {
        int i;
        int i2;
        RecyclerView recyclerView = this.a;
        if (recyclerView.o.af()) {
            i2 = (int) f;
            i = 0;
        } else if (recyclerView.o.ae()) {
            i = (int) f;
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        if (i == 0) {
            if (i2 == 0) {
                return false;
            }
            i = 0;
        }
        recyclerView.ax();
        return recyclerView.aB(i, i2, 0, Alert.DURATION_SHOW_INDEFINITELY);
    }
}

package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acsv extends wg {
    final /* synthetic */ acsw a;

    public acsv(acsw acswVar) {
        this.a = acswVar;
    }

    @Override // defpackage.wg
    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.computeVerticalScrollOffset() == 0 || i2 < -10) {
            acsw acswVar = this.a;
            if (acswVar.j.b()) {
                fduf fdufVar = ((acsi) acswVar.c.b()).a;
                if (((Boolean) fdufVar.c()).booleanValue()) {
                    return;
                }
                fdufVar.f(true);
                return;
            }
            ExtendedFloatingActionButton extendedFloatingActionButton = acswVar.g;
            if (extendedFloatingActionButton != null) {
                extendedFloatingActionButton.v(3);
                return;
            }
            return;
        }
        if (i2 > 10) {
            acsw acswVar2 = this.a;
            if (acswVar2.j.b()) {
                fduf fdufVar2 = ((acsi) acswVar2.c.b()).a;
                if (((Boolean) fdufVar2.c()).booleanValue()) {
                    fdufVar2.f(false);
                    return;
                }
                return;
            }
            ExtendedFloatingActionButton extendedFloatingActionButton2 = acswVar2.g;
            if (extendedFloatingActionButton2 != null) {
                extendedFloatingActionButton2.s();
            }
        }
    }
}

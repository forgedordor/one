package defpackage;

import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dypb extends vq {
    final /* synthetic */ dyfx a;
    final /* synthetic */ RecyclerView b;
    final /* synthetic */ dypf c;

    public dypb(dypf dypfVar, dyfx dyfxVar, RecyclerView recyclerView) {
        this.a = dyfxVar;
        this.b = recyclerView;
        this.c = dypfVar;
    }

    @Override // defpackage.vq
    public final void a() throws Resources.NotFoundException {
        h();
    }

    @Override // defpackage.vq
    public final void d(int i, int i2) throws Resources.NotFoundException {
        h();
    }

    @Override // defpackage.vq
    public final void e(int i, int i2) throws Resources.NotFoundException {
        h();
    }

    public final void h() throws Resources.NotFoundException {
        int dimensionPixelSize = this.c.getResources().getDimensionPixelSize(R.dimen.og_account_menu_top_cards_top_spacing);
        dyfx dyfxVar = this.a;
        my myVar = dyfxVar.a;
        if (myVar.c != 0) {
            ejwi ejwiVarL = dyfxVar.l(((Integer) myVar.a(0)).intValue());
            if (ejwiVarL.g()) {
                if (((dygk) ejwiVarL.c()).equals(dygk.ALWAYS_HIDE_DIVIDER_CARD)) {
                    dimensionPixelSize = 0;
                }
            }
        }
        this.b.setPadding(0, dimensionPixelSize, 0, 0);
    }
}

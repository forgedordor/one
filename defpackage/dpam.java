package defpackage;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.google.android.apps.messaging.R;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpam extends fcyz implements fdat {
    final /* synthetic */ dpao a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpam(dpao dpaoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dpaoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpam) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        dpao dpaoVar = this.a;
        GridLayoutManager gridLayoutManager = dpaoVar.b;
        dpaz dpazVar = null;
        if (gridLayoutManager == null) {
            fdbq.c("stickerPacksListLayoutManager");
            gridLayoutManager = null;
        }
        dpaz dpazVar2 = dpaoVar.c;
        if (dpazVar2 == null) {
            fdbq.c("stickerPacksListAdapter");
        } else {
            dpazVar = dpazVar2;
        }
        dpaoVar.bi(gridLayoutManager, dpazVar);
        if (dpao.bo(dpaoVar).d) {
            TabLayout tabLayout = dpaoVar.ao;
            tabLayout.getClass();
            if (tabLayout.b() > 0) {
                tabLayout.l(tabLayout.d(tabLayout.a()));
            }
            TabLayout tabLayout2 = dpaoVar.ao;
            tabLayout2.getClass();
            RecyclerView recyclerViewR = dpaoVar.r();
            Context contextZ = dpaoVar.z();
            contextZ.getClass();
            recyclerViewR.setPadding(recyclerViewR.getPaddingLeft(), recyclerViewR.getPaddingTop(), recyclerViewR.getPaddingRight(), contextZ.getResources().getDimensionPixelOffset(R.dimen.gifsticker_tab_height));
            tabLayout2.setVisibility(0);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dpam(this.a, fcxyVar);
    }
}

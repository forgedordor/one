package defpackage;

import android.support.v7.widget.GridLayoutManager;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.material.tabs.TabLayout;
import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpak extends fcyz implements fdat {
    int a;
    final /* synthetic */ dpao b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpak(dpao dpaoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dpaoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpak) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Exception {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                dpao dpaoVar = this.b;
                this.a = 1;
                obj = dpao.bw(dpaoVar, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
            final dpao dpaoVar2 = this.b;
            List list = (List) obj;
            if (list.isEmpty()) {
                docj.bk(dpaoVar2, null, new Integer(R.string.sticker_empty_favorites_message), null, new Integer(R.string.sticker_empty_state_show_all_packs_button), new View.OnClickListener() { // from class: dpaj
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TabLayout tabLayout = dpaoVar2.ao;
                        tabLayout.getClass();
                        dpao.bz(tabLayout, dozn.c);
                    }
                }, 5);
            } else {
                dpaz dpazVar = dpaoVar2.c;
                dpaz dpazVar2 = null;
                if (dpazVar == null) {
                    fdbq.c("stickerPacksListAdapter");
                    dpazVar = null;
                }
                dpazVar.l(list, false);
                GridLayoutManager gridLayoutManager = dpaoVar2.b;
                if (gridLayoutManager == null) {
                    fdbq.c("stickerPacksListLayoutManager");
                    gridLayoutManager = null;
                }
                dpaz dpazVar3 = dpaoVar2.c;
                if (dpazVar3 == null) {
                    fdbq.c("stickerPacksListAdapter");
                } else {
                    dpazVar2 = dpazVar3;
                }
                dpaoVar2.bi(gridLayoutManager, dpazVar2);
            }
        } catch (Exception e) {
            if (!(e instanceof RuntimeException) && (!(e instanceof IOException) || !dpao.bo(this.b).b)) {
                throw e;
            }
            ((ekrd) ((ekrd) dpao.a.i()).g(e).h("com/google/android/libraries/compose/sticker/ui/screen/StickerScreen$showFavoriteStickerPacks$1", "invokeSuspend", 422, "StickerScreen.kt")).q("Unable to fetch favorite packs.");
            this.b.bu();
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dpak(this.b, fcxyVar);
    }
}

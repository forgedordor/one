package defpackage;

import android.support.v7.widget.GridLayoutManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dozp implements eeva {
    final /* synthetic */ dpao a;

    public dozp(dpao dpaoVar) {
        this.a = dpaoVar;
    }

    @Override // defpackage.eeuz
    public final void a(eeve eeveVar) {
        if (eeveVar != null) {
            dpao dpaoVar = this.a;
            Object obj = eeveVar.a;
            obj.getClass();
            dpaoVar.bt((dozn) obj);
            GridLayoutManager gridLayoutManager = dpaoVar.b;
            if (gridLayoutManager == null) {
                fdbq.c("stickerPacksListLayoutManager");
                gridLayoutManager = null;
            }
            gridLayoutManager.ab(0, 0);
        }
    }

    @Override // defpackage.eeuz
    public final void b(eeve eeveVar) {
        Object obj = eeveVar.a;
        obj.getClass();
        this.a.bt((dozn) obj);
    }

    @Override // defpackage.eeuz
    public final void c() {
    }
}

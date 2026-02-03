package defpackage;

import com.google.android.libraries.compose.ui.views.recycler.reactive.ReactiveGridLayoutManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnxw implements eeva {
    final /* synthetic */ dnyn a;

    public dnxw(dnyn dnynVar) {
        this.a = dnynVar;
    }

    @Override // defpackage.eeuz
    public final void a(eeve eeveVar) {
        eeveVar.getClass();
        Object obj = eeveVar.a;
        obj.getClass();
        dnyn dnynVar = this.a;
        dnynVar.q((dnxu) obj);
        ReactiveGridLayoutManager reactiveGridLayoutManager = dnynVar.ao;
        if (reactiveGridLayoutManager == null) {
            fdbq.c("stickerListLayoutManager");
            reactiveGridLayoutManager = null;
        }
        reactiveGridLayoutManager.ab(0, 0);
    }

    @Override // defpackage.eeuz
    public final void b(eeve eeveVar) {
        Object obj = eeveVar.a;
        obj.getClass();
        this.a.q((dnxu) obj);
    }

    @Override // defpackage.eeuz
    public final void c() {
    }
}

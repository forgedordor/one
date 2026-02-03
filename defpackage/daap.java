package defpackage;

import android.view.LayoutInflater;
import com.google.android.apps.messaging.ui.search.homeview.ZeroStateContentGridLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daap {
    public final ZeroStateContentGridLayout a;
    public final fcsu b;
    public final fcsu c;
    public final LayoutInflater d;
    public dacp e;
    private final fctc f;

    public daap(ZeroStateContentGridLayout zeroStateContentGridLayout, fcsu fcsuVar, fcsu fcsuVar2) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.a = zeroStateContentGridLayout;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(zeroStateContentGridLayout.getContext());
        layoutInflaterFrom.getClass();
        this.d = layoutInflaterFrom;
        this.f = fctd.a(new fdae() { // from class: daao
            @Override // defpackage.fdae
            public final Object invoke() {
                return Integer.valueOf(true != ((asgw) this.a.c.b()).a() ? 4 : 2);
            }
        });
    }

    public final int a() {
        return ((Number) this.f.a()).intValue();
    }
}

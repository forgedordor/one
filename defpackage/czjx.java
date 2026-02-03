package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czjx extends wg {
    final /* synthetic */ czjy a;

    public czjx(czjy czjyVar) {
        this.a = czjyVar;
    }

    @Override // defpackage.wg
    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (i != 0) {
            czjy czjyVar = this.a;
            View view = czjyVar.s;
            if (view.getParent() != null) {
                float fAbs = Math.abs((((RecyclerView) view.getParent()).getWidth() / 2) - (view.getX() + (view.getWidth() / 2)));
                int iE = kzb.e(czjyVar.u, czjyVar.v, cqch.a(1.0f - (fAbs / (view.getWidth() * 0.75f))));
                if (iE != czjyVar.w) {
                    czjyVar.w = iE;
                    czjyVar.t.setTextColor(iE);
                }
                czjyVar.D(cqch.a((1.0f - (fAbs / (view.getWidth() * 0.75f))) * 3.0f));
                float width = (view.getWidth() / 2) * 0.2f;
                czjyVar.C(kzb.e(czjyVar.x, czjyVar.y, cqch.a((fAbs - width) / ((view.getWidth() / 2) - (width + width)))));
            }
        }
    }
}

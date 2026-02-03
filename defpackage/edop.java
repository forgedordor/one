package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.progressindicator.LinearProgressIndicator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edop extends edor {
    public lxo a;
    public eduu b;
    public dswb c;
    public edet d;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        View viewInflate = layoutInflater.inflate(true != fbgv.i() ? R.layout.photo_picker_infinite_scroll_layout : R.layout.photo_picker_infinite_scroll_layout_art_style, viewGroup, false);
        if (fbgv.i()) {
            RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.photo_picker_recycler_grid);
            int dimensionPixelSize = B().getDimensionPixelSize(R.dimen.photo_picker_cluster_horizontal_padding);
            recyclerView.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        }
        this.c.b.a(89733).b(viewInflate);
        ley.r(viewInflate, Y(R.string.op3_picker_browse_face_groups_title));
        len.k(viewInflate, new ldn() { // from class: edoo
            @Override // defpackage.ldn
            public final lgt ez(View view, lgt lgtVar) {
                kzc kzcVarF = lgtVar.f(519);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                marginLayoutParams.leftMargin = kzcVarF.b;
                marginLayoutParams.bottomMargin = kzcVarF.e;
                marginLayoutParams.rightMargin = kzcVarF.d;
                marginLayoutParams.topMargin = kzcVarF.c;
                view.setLayoutParams(marginLayoutParams);
                return lgt.a;
            }
        });
        return viewInflate;
    }

    @Override // defpackage.ea
    public final void ae(Bundle bundle) {
        super.ae(bundle);
        MaterialToolbar materialToolbar = (MaterialToolbar) this.Q.findViewById(R.id.photo_picker_infinite_scroll_toolbar);
        materialToolbar.w(R.string.op3_picker_browse_face_groups_title);
        this.b.k(this);
        materialToolbar.t(new View.OnClickListener() { // from class: edon
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.b.l();
            }
        });
        edot edotVar = (edot) this.a.a(edot.class);
        RecyclerView recyclerView = (RecyclerView) this.Q.findViewById(R.id.photo_picker_recycler_grid);
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) this.Q.findViewById(R.id.photo_picker_loading_view);
        edet edetVar = this.d;
        fcsu fcsuVar = edetVar.a;
        lvj lvjVarQ = Q();
        edek edekVar = (edek) fcsuVar.b();
        eduu eduuVar = (eduu) edetVar.b.b();
        eduuVar.getClass();
        edgv edgvVar = (edgv) edetVar.c.b();
        edgvVar.getClass();
        edgp edgpVar = (edgp) edetVar.d.b();
        edgpVar.getClass();
        edgt edgtVar = (edgt) edetVar.e.b();
        recyclerView.getClass();
        linearProgressIndicator.getClass();
        edotVar.getClass();
        new edes(edekVar, eduuVar, edgvVar, edgpVar, edgtVar, lvjVarQ, recyclerView, linearProgressIndicator, edotVar);
    }

    @Override // defpackage.edor, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        if (this.e) {
            return;
        }
        eygl.a(this);
    }
}

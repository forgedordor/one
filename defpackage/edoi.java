package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edoi extends edok {
    public lxo a;
    public eduu b;
    public dswb c;
    public edfm d;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(true != fbgv.i() ? R.layout.photo_picker_infinite_scroll_layout : R.layout.photo_picker_infinite_scroll_layout_art_style, viewGroup, false);
        this.c.b.a(89734).b(viewInflate);
        ley.r(viewInflate, Y(R.string.op3_choose_photo));
        len.k(viewInflate, new ldn() { // from class: edog
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
        materialToolbar.w(R.string.op3_choose_photo);
        this.b.k(this);
        materialToolbar.t(new View.OnClickListener() { // from class: edoh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.b.l();
            }
        });
        etub etubVar = (etub) ProtoParsers.f(this.m, "clusterKey", etub.a, evrr.a());
        final edom edomVar = (edom) this.a.a(edom.class);
        String str = etubVar.c;
        if (!edomVar.c.g()) {
            edomVar.c = ejwi.j(str);
            edomVar.a.p(edomVar.b.a(str).e, new lvz() { // from class: edol
                @Override // defpackage.lvz
                public final void a(Object obj) {
                    edomVar.a.j((edlw) obj);
                }
            });
        }
        this.d.a(Q(), (RecyclerView) this.Q.findViewById(R.id.photo_picker_recycler_grid), (LinearProgressIndicator) this.Q.findViewById(R.id.photo_picker_loading_view), edomVar, ejwi.j(etubVar), 8);
    }

    @Override // defpackage.edok, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        if (this.e) {
            return;
        }
        eygl.a(this);
    }
}

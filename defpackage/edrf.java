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

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edrf extends edrc {
    public lxo b;
    public eduu c;
    public dswb d;
    public edfm e;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(true != fbgv.i() ? R.layout.photo_picker_infinite_scroll_layout : R.layout.photo_picker_infinite_scroll_layout_art_style, viewGroup, false);
        this.d.b.a(89749).b(viewInflate);
        ley.r(viewInflate, Y(R.string.op3_choose_photo));
        len.k(viewInflate, new ldn() { // from class: edrd
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
        this.c.k(this);
        materialToolbar.t(new View.OnClickListener() { // from class: edre
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.c.l();
            }
        });
        edri edriVar = (edri) this.b.a(edri.class);
        this.e.a(Q(), (RecyclerView) this.Q.findViewById(R.id.photo_picker_recycler_grid), (LinearProgressIndicator) this.Q.findViewById(R.id.photo_picker_loading_view), edriVar, ejud.a, 10);
    }

    @Override // defpackage.edrc, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        if (this.a) {
            return;
        }
        eygl.a(this);
    }
}

package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czck extends vo {
    public final czct a;
    public int d;
    private final boolean e;
    private final czcp f;
    private final czcm g;

    public czck(czcp czcpVar, Context context, czcm czcmVar) throws Resources.NotFoundException {
        boolean zBooleanValue = ((Boolean) ccze.d.e()).booleanValue();
        this.e = zBooleanValue;
        this.d = -1;
        this.f = czcpVar;
        this.g = czcmVar;
        czcq czcqVar = null;
        if (zBooleanValue) {
            String string = context.getResources().getString(R.string.c2o_gif_browser_recents_button_text);
            eehg.d(context, R.attr.colorOnSurfaceInverse, "GifBrowserCategoryAdapter");
            eehg.d(context, R.attr.colorOnSurface, "GifBrowserCategoryAdapter");
            czcqVar = new czcq(string, null);
        }
        this.a = new czct(context, czcqVar);
    }

    @Override // defpackage.vo
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.vo
    public final wv e(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.compose2o_gif_browser_category_item_view_m2, viewGroup, false);
        cvjo cvjoVar = (cvjo) this.f.a.b();
        cvjoVar.getClass();
        viewInflate.getClass();
        return new czco(cvjoVar, viewInflate, this.g);
    }

    @Override // defpackage.vo
    public final void g(wv wvVar, int i) {
        czct czctVar = this.a;
        if (i >= czctVar.a()) {
            return;
        }
        final czco czcoVar = (czco) wvVar;
        final czcq czcqVarB = czctVar.b(i);
        TextView textView = czcoVar.t;
        textView.setText(czcqVarB.a);
        View view = czcoVar.a;
        view.setOnClickListener(czcoVar.s.a(new View.OnClickListener() { // from class: czcn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                czch czchVar = (czch) czcoVar.u;
                czchVar.d(czcqVarB.b);
                ((ajhd) czchVar.c.b()).ag(3, czchVar.u, czchVar.j.l());
            }
        }));
        boolean z = i == this.d;
        textView.setSelected(z);
        view.setSelected(z);
    }

    public final int l() {
        int i = this.d;
        if (i == -1) {
            return 1;
        }
        int i2 = i + 11;
        if (!this.e) {
            i2 = i + 12;
        }
        return ellr.a(i2);
    }
}

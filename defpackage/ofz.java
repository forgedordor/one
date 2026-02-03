package defpackage;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ofz extends vo {
    final /* synthetic */ ogh a;
    private final String[] d;
    private final String[] e = new String[2];
    private final Drawable[] f;

    public ofz(ogh oghVar, String[] strArr, Drawable[] drawableArr) {
        this.a = oghVar;
        this.d = strArr;
        this.f = drawableArr;
    }

    public final boolean F(int i) {
        ogh oghVar = this.a;
        mcg mcgVar = oghVar.F;
        if (mcgVar == null) {
            return false;
        }
        if (i == 0) {
            return mcgVar.m(13);
        }
        if (i != 1) {
            return true;
        }
        return mcgVar.m(30) && oghVar.F.m(29);
    }

    @Override // defpackage.vo
    public final int a() {
        return 2;
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ wv e(ViewGroup viewGroup, int i) {
        ogh oghVar = this.a;
        return new ofy(oghVar, LayoutInflater.from(oghVar.getContext()).inflate(R.layout.exo_styled_settings_list_item, viewGroup, false));
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void g(wv wvVar, int i) {
        ofy ofyVar = (ofy) wvVar;
        if (F(i)) {
            ofyVar.a.setLayoutParams(new wc(-1, -2));
        } else {
            ofyVar.a.setLayoutParams(new wc(0, 0));
        }
        ofyVar.s.setText(this.d[i]);
        String str = this.e[i];
        if (str == null) {
            ofyVar.t.setVisibility(8);
        } else {
            ofyVar.t.setText(str);
        }
        Drawable drawable = this.f[i];
        if (drawable == null) {
            ofyVar.u.setVisibility(8);
        } else {
            ofyVar.u.setImageDrawable(drawable);
        }
    }

    @Override // defpackage.vo
    public final long gH(int i) {
        return i;
    }

    public final void l(int i, String str) {
        this.e[i] = str;
    }
}

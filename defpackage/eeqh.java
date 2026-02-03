package defpackage;

import android.content.res.ColorStateList;
import com.google.android.material.search.SearchBar;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeqh extends eecw {
    final /* synthetic */ SearchBar a;

    public eeqh(SearchBar searchBar) {
        this.a = searchBar;
    }

    @Override // defpackage.eecw
    public final void a(float f) {
        SearchBar searchBar = this.a;
        ColorStateList colorStateList = searchBar.G;
        if (colorStateList != null) {
            searchBar.K.P(ColorStateList.valueOf(eehg.f(searchBar.F, colorStateList.getDefaultColor(), f)));
        }
    }
}

package defpackage;

import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.messaging.R;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dotc {
    public final View a;
    public final boolean b;
    public final ConstraintLayout c;
    public final ConstraintLayout d;
    public final AppCompatImageView e;
    public final AppCompatImageView f;
    public final ViewGroup g;
    public final EditText h;
    public final ComposeView i;
    public final TabLayout j;
    public final View k;
    public final View l;
    public final FrameLayout m;
    public final RecyclerView n;

    public dotc(View view, boolean z) {
        this.a = view;
        this.b = z;
        View viewFindViewById = view.findViewById(R.id.proxy_screen_container);
        viewFindViewById.getClass();
        this.c = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.proxy_screen_header);
        viewFindViewById2.getClass();
        this.d = (ConstraintLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.proxy_screen_search_icon);
        viewFindViewById3.getClass();
        this.e = (AppCompatImageView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.proxy_screen_clear_icon);
        viewFindViewById4.getClass();
        this.f = (AppCompatImageView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.proxy_screen_search_bar_wrapper);
        viewFindViewById5.getClass();
        this.g = (ViewGroup) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.proxy_screen_search_bar);
        viewFindViewById6.getClass();
        this.h = (EditText) viewFindViewById6;
        this.i = z ? null : (ComposeView) view.findViewById(R.id.proxy_screen_button);
        View viewFindViewById7 = view.findViewById(R.id.proxy_screen_tabs);
        viewFindViewById7.getClass();
        this.j = (TabLayout) viewFindViewById7;
        this.k = z ? null : view.findViewById(R.id.proxy_screen_tabs_bottom_border);
        this.l = z ? view.findViewById(R.id.proxy_screen_scroll_indicator) : null;
        View viewFindViewById8 = view.findViewById(R.id.proxy_screen_screens_container);
        viewFindViewById8.getClass();
        this.m = (FrameLayout) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.search_rows_recycler_view);
        viewFindViewById9.getClass();
        this.n = (RecyclerView) viewFindViewById9;
    }
}

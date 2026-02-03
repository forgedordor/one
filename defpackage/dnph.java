package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.google.android.apps.messaging.R;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnph {
    public final RecyclerView a;
    public final View b;
    public final TabLayout c;
    public final ImageButton d;
    public final View e;

    public dnph(ViewGroup viewGroup) {
        View viewFindViewById = viewGroup.findViewById(R.id.emoji_gallery_container);
        viewFindViewById.getClass();
        View viewFindViewById2 = viewGroup.findViewById(R.id.emoji_gallery_recycler_view);
        viewFindViewById2.getClass();
        this.a = (RecyclerView) viewFindViewById2;
        View viewFindViewById3 = viewGroup.findViewById(R.id.recycler_view_bottom_border_view);
        viewFindViewById3.getClass();
        this.b = viewFindViewById3;
        View viewFindViewById4 = viewGroup.findViewById(R.id.emoji_categories_tab_layout);
        viewFindViewById4.getClass();
        this.c = (TabLayout) viewFindViewById4;
        View viewFindViewById5 = viewGroup.findViewById(R.id.emoji_bar_backspace);
        viewFindViewById5.getClass();
        this.d = (ImageButton) viewFindViewById5;
        View viewFindViewById6 = viewGroup.findViewById(R.id.emoji_bar_backspace_background);
        viewFindViewById6.getClass();
        this.e = viewFindViewById6;
    }
}

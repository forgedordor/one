package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.inputmethod.emoji.picker.EmojiPickerBodyRecyclerView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnsf {
    public final EmojiPickerBodyRecyclerView a;
    public final View b;
    public final RecyclerView c;
    public final ImageButton d;

    public dnsf(ViewGroup viewGroup) {
        View viewFindViewById = viewGroup.findViewById(R.id.emoji_gallery_container);
        viewFindViewById.getClass();
        View viewFindViewById2 = viewGroup.findViewById(R.id.emoji_gallery_recycler_view);
        viewFindViewById2.getClass();
        this.a = (EmojiPickerBodyRecyclerView) viewFindViewById2;
        View viewFindViewById3 = viewGroup.findViewById(R.id.recycler_view_bottom_border_view);
        viewFindViewById3.getClass();
        this.b = viewFindViewById3;
        View viewFindViewById4 = viewGroup.findViewById(R.id.emoji_categories_list);
        viewFindViewById4.getClass();
        this.c = (RecyclerView) viewFindViewById4;
        View viewFindViewById5 = viewGroup.findViewById(R.id.emoji_bar_backspace);
        viewFindViewById5.getClass();
        this.d = (ImageButton) viewFindViewById5;
    }
}

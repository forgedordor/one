package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class doxi {
    public final ViewGroup a;
    public final RecyclerView b;

    public doxi(ViewGroup viewGroup) {
        this.a = viewGroup;
        View viewFindViewById = viewGroup.findViewById(R.id.shortcuts_screen_recycler_view);
        viewFindViewById.getClass();
        this.b = (RecyclerView) viewFindViewById;
    }
}

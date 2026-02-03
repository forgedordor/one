package defpackage;

import android.view.TouchDelegate;
import android.view.View;
import com.google.android.apps.messaging.conversation.badges.BadgesRecyclerView;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ufa {
    public final BadgesRecyclerView a;
    public final Map b;
    public final eigp c;
    public final ues d;
    public ArrayList e;
    public uez f;
    public boolean g = false;
    private final cssf h;

    public ufa(BadgesRecyclerView badgesRecyclerView, Map map, eigp eigpVar, ues uesVar, cssf cssfVar) {
        this.a = badgesRecyclerView;
        this.b = map;
        this.c = eigpVar;
        this.d = uesVar;
        this.h = cssfVar;
    }

    public final void a() {
        BadgesRecyclerView badgesRecyclerView = this.a;
        View view = (View) badgesRecyclerView.getParent();
        if (view == null) {
            return;
        }
        dhzw dhzwVar = (dhzw) view.getTouchDelegate();
        int i = 0;
        if (dhzwVar != null) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                dhzwVar.a.remove((View) this.e.get(i2));
            }
        }
        this.e.clear();
        int childCount = badgesRecyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            this.e.add(badgesRecyclerView.getChildAt(i3));
        }
        while (i < childCount) {
            View view2 = (View) this.e.get(i);
            View view3 = i > 0 ? (View) this.e.get(i - 1) : null;
            i++;
            View view4 = i < childCount ? (View) this.e.get(i) : null;
            TouchDelegate touchDelegate = this.h.e() ? new TouchDelegate(ueo.a(badgesRecyclerView, view2, view4, view3), view2) : new TouchDelegate(ueo.a(badgesRecyclerView, view2, view3, view4), view2);
            int i4 = dhzw.c;
            view2.getClass();
            TouchDelegate touchDelegate2 = view.getTouchDelegate();
            dhzw dhzwVar2 = touchDelegate2 instanceof dhzw ? (dhzw) touchDelegate2 : new dhzw(view, touchDelegate2);
            ejwl.l(true);
            dhzwVar2.a.put(view2, touchDelegate);
            if (touchDelegate == dhzwVar2.b) {
                dhzwVar2.b = null;
            }
            if (touchDelegate2 != dhzwVar2) {
                view.setTouchDelegate(dhzwVar2);
            }
        }
    }
}

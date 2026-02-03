package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.view.menu.ListMenuItemView;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uu extends tm {
    final int c;
    final int d;
    public ut e;
    private MenuItem f;

    public uu(Context context, boolean z) {
        super(context, z);
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        this.c = layoutDirection == 1 ? 21 : 22;
        this.d = layoutDirection == 1 ? 22 : 21;
    }

    @Override // defpackage.tm, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        nz nzVar;
        int headersCount;
        ut utVar;
        ut utVar2;
        int iPointToPosition;
        int i;
        if (this.e != null) {
            ListAdapter adapter = getAdapter();
            int i2 = 0;
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                nzVar = (nz) headerViewListAdapter.getWrappedAdapter();
            } else {
                nzVar = (nz) adapter;
                headersCount = 0;
            }
            of item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= nzVar.getCount()) ? null : nzVar.getItem(i);
            MenuItem menuItem = this.f;
            if (menuItem != item) {
                oc ocVar = nzVar.a;
                if (menuItem != null && (utVar2 = ((uv) this.e).b) != null) {
                    ((nu) utVar2).a.a.removeCallbacksAndMessages(ocVar);
                }
                this.f = item;
                if (item != null && (utVar = ((uv) this.e).b) != null) {
                    nu nuVar = (nu) utVar;
                    nw nwVar = nuVar.a;
                    Handler handler = nwVar.a;
                    handler.removeCallbacksAndMessages(null);
                    List list = nwVar.b;
                    int size = list.size();
                    while (true) {
                        if (i2 >= size) {
                            i2 = -1;
                            break;
                        }
                        if (ocVar == ((nv) list.get(i2)).b) {
                            break;
                        }
                        i2++;
                    }
                    if (i2 != -1) {
                        int i3 = i2 + 1;
                        handler.postAtTime(new nt(nuVar, i3 < list.size() ? (nv) list.get(i3) : null, item, ocVar), ocVar, SystemClock.uptimeMillis() + 200);
                    }
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.c) {
            if (listMenuItemView.isEnabled() && listMenuItemView.a.hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.d) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (nz) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (nz) adapter).a.i(false);
        return true;
    }
}

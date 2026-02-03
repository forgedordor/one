package defpackage;

import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oj implements MenuItem.OnMenuItemClickListener {
    final /* synthetic */ ok a;
    private final MenuItem.OnMenuItemClickListener b;

    public oj(ok okVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.a = okVar;
        this.b = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.b.onMenuItemClick(this.a.a(menuItem));
    }
}

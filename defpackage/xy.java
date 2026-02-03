package defpackage;

import android.content.Intent;
import android.support.v7.widget.ShareActionProvider;
import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xy implements MenuItem.OnMenuItemClickListener {
    final /* synthetic */ ShareActionProvider a;

    public xy(ShareActionProvider shareActionProvider) {
        this.a = shareActionProvider;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        ShareActionProvider shareActionProvider = this.a;
        Intent intentB = qc.e(shareActionProvider.mContext, shareActionProvider.mShareHistoryFileName).b(menuItem.getItemId());
        if (intentB == null) {
            return true;
        }
        String action = intentB.getAction();
        if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
            shareActionProvider.updateIntent(intentB);
        }
        shareActionProvider.mContext.startActivity(intentB);
        return true;
    }
}

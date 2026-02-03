package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class lco {
    private static final String TAG = "ActionProvider(support)";
    private final Context mContext;
    private lcm mSubUiVisibilityListener;
    private lcn mVisibilityListener;

    public lco(Context context) {
        this.mContext = context;
    }

    public Context getContext() {
        return this.mContext;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isVisible() {
        return true;
    }

    public abstract View onCreateActionView();

    public View onCreateActionView(MenuItem menuItem) {
        return onCreateActionView();
    }

    public boolean onPerformDefaultAction() {
        return false;
    }

    public boolean overridesItemVisibility() {
        return false;
    }

    public void refreshVisibility() {
        if (this.mVisibilityListener == null || !overridesItemVisibility()) {
            return;
        }
        lcn lcnVar = this.mVisibilityListener;
        isVisible();
        lcnVar.a();
    }

    public void reset() {
        this.mVisibilityListener = null;
        this.mSubUiVisibilityListener = null;
    }

    public void setSubUiVisibilityListener(lcm lcmVar) {
        this.mSubUiVisibilityListener = lcmVar;
    }

    public void setVisibilityListener(lcn lcnVar) {
        if (this.mVisibilityListener != null && lcnVar != null) {
            Log.w(TAG, "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.mVisibilityListener = lcnVar;
    }

    public void subUiVisibilityChanged(boolean z) {
        lcm lcmVar = this.mSubUiVisibilityListener;
        if (lcmVar != null) {
            lcmVar.k(z);
        }
    }

    public void onPrepareSubMenu(SubMenu subMenu) {
    }
}

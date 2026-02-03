package defpackage;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class og extends lco implements ActionProvider.VisibilityListener {
    public static final /* synthetic */ int c = 0;
    public final ActionProvider a;
    final /* synthetic */ ok b;
    private lcn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public og(ok okVar, Context context, ActionProvider actionProvider) {
        super(context);
        this.b = okVar;
        this.a = actionProvider;
    }

    @Override // defpackage.lco
    public final boolean hasSubMenu() {
        return this.a.hasSubMenu();
    }

    @Override // defpackage.lco
    public final boolean isVisible() {
        return this.a.isVisible();
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        lcn lcnVar = this.d;
        if (lcnVar != null) {
            lcnVar.a();
        }
    }

    @Override // defpackage.lco
    public final View onCreateActionView() {
        return this.a.onCreateActionView();
    }

    @Override // defpackage.lco
    public final boolean onPerformDefaultAction() {
        return this.a.onPerformDefaultAction();
    }

    @Override // defpackage.lco
    public final void onPrepareSubMenu(SubMenu subMenu) {
        this.a.onPrepareSubMenu(this.b.b(subMenu));
    }

    @Override // defpackage.lco
    public final boolean overridesItemVisibility() {
        return this.a.overridesItemVisibility();
    }

    @Override // defpackage.lco
    public final void refreshVisibility() {
        this.a.refreshVisibility();
    }

    @Override // defpackage.lco
    public final void setVisibilityListener(lcn lcnVar) {
        this.d = lcnVar;
        this.a.setVisibilityListener(lcnVar != null ? this : null);
    }

    @Override // defpackage.lco
    public final View onCreateActionView(MenuItem menuItem) {
        return this.a.onCreateActionView(menuItem);
    }
}

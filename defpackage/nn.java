package defpackage;

import android.support.v7.view.menu.ActionMenuItemView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nn extends tu {
    final /* synthetic */ ActionMenuItemView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.a = actionMenuItemView;
    }

    @Override // defpackage.tu
    public final ot a() {
        pj pjVar;
        no noVar = this.a.c;
        if (noVar == null || (pjVar = ((pk) noVar).a.k) == null) {
            return null;
        }
        return pjVar.a();
    }

    @Override // defpackage.tu
    protected final boolean b() {
        ot otVarA;
        ActionMenuItemView actionMenuItemView = this.a;
        ob obVar = actionMenuItemView.b;
        return obVar != null && obVar.b(actionMenuItemView.a) && (otVarA = a()) != null && otVarA.x();
    }
}

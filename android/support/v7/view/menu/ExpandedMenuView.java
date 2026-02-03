package android.support.v7.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.ob;
import defpackage.oc;
import defpackage.of;
import defpackage.or;
import defpackage.yx;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements AdapterView.OnItemClickListener, ob, or {
    private static final int[] a = {R.attr.background, R.attr.divider};
    private oc b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // defpackage.or
    public final void a(oc ocVar) {
        this.b = ocVar;
    }

    @Override // defpackage.ob
    public final boolean b(of ofVar) {
        throw null;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.b.z((of) getAdapter().getItem(i), 0);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        yx yxVarL = yx.l(context, attributeSet, a, i, 0);
        if (yxVarL.q(0)) {
            setBackgroundDrawable(yxVarL.h(0));
        }
        if (yxVarL.q(1)) {
            setDivider(yxVarL.h(1));
        }
        yxVarL.o();
    }
}

package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eewp implements AdapterView.OnItemClickListener {
    final /* synthetic */ eewr a;

    public eewp(eewr eewrVar) {
        this.a = eewrVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        View view2;
        if (i < 0) {
            us usVar = this.a.a;
            item = !usVar.x() ? null : usVar.e.getSelectedItem();
        } else {
            item = this.a.getAdapter().getItem(i);
        }
        eewr eewrVar = this.a;
        eewrVar.setText(eewrVar.convertSelectionToString(item), false);
        AdapterView.OnItemClickListener onItemClickListener = eewrVar.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i < 0) {
                us usVar2 = eewrVar.a;
                View selectedView = usVar2.x() ? usVar2.e.getSelectedView() : null;
                i = usVar2.o();
                j = !usVar2.x() ? Long.MIN_VALUE : usVar2.e.getSelectedItemId();
                view2 = selectedView;
            } else {
                view2 = view;
            }
            onItemClickListener.onItemClick(eewrVar.a.e, view2, i, j);
        }
        eewrVar.a.m();
    }
}

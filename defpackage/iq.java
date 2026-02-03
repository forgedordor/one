package defpackage;

import android.support.v7.app.AlertController;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iq implements AdapterView.OnItemClickListener {
    final /* synthetic */ AlertController.RecycleListView a;
    final /* synthetic */ AlertController b;
    final /* synthetic */ ir c;

    public iq(ir irVar, AlertController.RecycleListView recycleListView, AlertController alertController) {
        this.c = irVar;
        this.a = recycleListView;
        this.b = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ir irVar = this.c;
        boolean[] zArr = irVar.v;
        if (zArr != null) {
            zArr[i] = this.a.isItemChecked(i);
        }
        irVar.z.onClick(this.b.b, i, this.a.isItemChecked(i));
    }
}

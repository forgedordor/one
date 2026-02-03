package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rn implements AdapterView.OnItemClickListener {
    final /* synthetic */ rq a;

    public rn(rq rqVar) {
        this.a = rqVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        rq rqVar = this.a;
        ru ruVar = rqVar.d;
        ruVar.setSelection(i);
        if (ruVar.getOnItemClickListener() != null) {
            ruVar.performItemClick(view, i, rqVar.b.getItemId(i));
        }
        rqVar.m();
    }
}

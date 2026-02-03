package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class um implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ us a;

    public um(us usVar) {
        this.a = usVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        tm tmVar;
        if (i == -1 || (tmVar = this.a.e) == null) {
            return;
        }
        tmVar.a = false;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}

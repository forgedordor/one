package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxwg implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ cxwj a;

    public cxwg(cxwj cxwjVar) {
        this.a = cxwjVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, final int i, long j) {
        eijx.f(new Runnable() { // from class: cxwf
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                if (i2 > 0) {
                    cxwg cxwgVar = this.a;
                    aumj aumjVarB = aumj.b(i2 - 1);
                    aumjVarB.getClass();
                    cxwgVar.a.c.S(aumjVarB);
                }
            }
        }, this.a.d);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}

package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxwe implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ Spinner a;
    final /* synthetic */ cxwj b;

    public cxwe(cxwj cxwjVar, Spinner spinner) {
        this.a = spinner;
        this.b = cxwjVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, final int i, long j) {
        final Spinner spinner = this.a;
        eijx.f(new Runnable() { // from class: cxwd
            @Override // java.lang.Runnable
            public final void run() {
                if (i > 0) {
                    Spinner spinner2 = spinner;
                    cxwe cxweVar = this.a;
                    String string = spinner2.getSelectedItem().toString();
                    string.getClass();
                    cxweVar.b.i.a.ab((autt) Enum.valueOf(autt.class, string));
                }
            }
        }, this.b.d);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}

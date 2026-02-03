package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxwc implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ cpyb a;
    final /* synthetic */ cxwj b;

    public cxwc(cxwj cxwjVar, cpyb cpybVar) {
        this.a = cpybVar;
        this.b = cxwjVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, final int i, long j) {
        final cpyb cpybVar = this.a;
        eijx.f(new Runnable() { // from class: cxwb
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                if (i2 > 0) {
                    cpyb cpybVar2 = cpybVar;
                    cxwc cxwcVar = this.a;
                    auml aumlVarB = auml.b(i2 - 1);
                    aumlVarB.getClass();
                    if (cpybVar2.equals(cpyb.MULTI_DEVICE)) {
                        cxwcVar.b.c.ad(aumlVarB);
                    } else if (cpybVar2.equals(cpyb.BACKUP_AND_RESTORE)) {
                        cxwcVar.b.c.Q(aumlVarB);
                    }
                }
            }
        }, this.b.d);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}

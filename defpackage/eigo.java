package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eigo implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ AdapterView.OnItemSelectedListener a;
    final /* synthetic */ String c;
    final /* synthetic */ int d;
    final /* synthetic */ eigp f;
    final /* synthetic */ String b = "com/google/android/apps/messaging/ui/debug/cloudstore/DebugCmsUtils";
    final /* synthetic */ String e = "Enable spinner item selected";

    public eigo(eigp eigpVar, AdapterView.OnItemSelectedListener onItemSelectedListener, String str, int i) {
        this.a = onItemSelectedListener;
        this.c = str;
        this.d = i;
        this.f = eigpVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        eidc.s();
        try {
            if (eidc.v()) {
                this.a.onItemSelected(adapterView, view, i, j);
            } else {
                eieh eiehVarC = this.f.c(this.e, this.b, this.c, this.d);
                try {
                    this.a.onItemSelected(adapterView, view, i, j);
                    eiehVarC.close();
                } finally {
                }
            }
        } finally {
            eidc.q();
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        eidc.s();
        try {
            if (eidc.v()) {
                this.a.onNothingSelected(adapterView);
            } else {
                eieh eiehVarC = this.f.c(this.e, this.b, this.c, this.d);
                try {
                    this.a.onNothingSelected(adapterView);
                    eiehVarC.close();
                } finally {
                }
            }
        } finally {
            eidc.q();
        }
    }
}

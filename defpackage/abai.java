package defpackage;

import com.google.android.apps.messaging.diagnostics.ui.DiagnosticsScenarioView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class abai {
    public final abaf a;
    public final String b;
    public ekgb c;
    public boolean d;
    public int e = 1;
    public abcg f;

    public abai(abag abagVar, String str) {
        this.a = new abaf(abagVar, str);
        this.b = str;
        int i = ekgb.d;
        this.c = ekoe.a;
        this.d = true;
    }

    public abstract abaj a();

    public final void b(int i) {
        int i2 = ekgb.d;
        c(i, ekoe.a);
    }

    public final void c(int i, ekgb ekgbVar) {
        this.e = i;
        this.c = ekgbVar;
        abcg abcgVar = this.f;
        if (abcgVar != null) {
            final DiagnosticsScenarioView diagnosticsScenarioView = abcgVar.a;
            abcgVar.b.runOnUiThread(new Runnable() { // from class: abcj
                @Override // java.lang.Runnable
                public final void run() {
                    diagnosticsScenarioView.a();
                }
            });
        }
    }
}

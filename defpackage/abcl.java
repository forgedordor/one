package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.diagnostics.ui.DiagnosticsScenarioView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abcl extends vo {
    private final Context a;
    private final List d;

    public abcl(List list, Context context) {
        this.a = context;
        this.d = list;
    }

    @Override // defpackage.vo
    public final int a() {
        List list = this.d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // defpackage.vo
    public final wv e(ViewGroup viewGroup, int i) {
        return new abck(LayoutInflater.from(this.a).inflate(R.layout.diagnostics_scenario_view, viewGroup, false));
    }

    @Override // defpackage.vo
    public final void g(wv wvVar, int i) {
        View view = wvVar.a;
        cqaz.k(view instanceof DiagnosticsScenarioView);
        DiagnosticsScenarioView diagnosticsScenarioView = (DiagnosticsScenarioView) view;
        abai abaiVar = (abai) this.d.get(i);
        diagnosticsScenarioView.d = abaiVar;
        diagnosticsScenarioView.a.setText(abaiVar.b);
        diagnosticsScenarioView.b.setChecked(abaiVar.d);
        diagnosticsScenarioView.a();
        Activity activityF = dakl.f(diagnosticsScenarioView.c);
        if (activityF != null) {
            abaiVar.f = new abcg(diagnosticsScenarioView, activityF);
        }
    }
}

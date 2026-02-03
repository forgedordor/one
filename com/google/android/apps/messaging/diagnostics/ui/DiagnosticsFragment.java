package com.google.android.apps.messaging.diagnostics.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.diagnostics.DiagnosticsService;
import com.google.android.apps.messaging.diagnostics.ui.DiagnosticsFragment;
import defpackage.aayz;
import defpackage.aaza;
import defpackage.abcl;
import defpackage.abco;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DiagnosticsFragment extends abco implements aayz {
    public aaza a;
    public Button b;
    public Button c;
    private abcl d;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.diagnostics_fragment, viewGroup, false);
        Button button = (Button) viewInflate.findViewById(R.id.diagnostics_start_button);
        this.c = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: abcd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DiagnosticsFragment diagnosticsFragment = this.a;
                aaza aazaVar = diagnosticsFragment.a;
                if (aazaVar.g) {
                    aaza.a.q("Diagnostic scenarios are still running");
                    return;
                }
                List<abai> list = aazaVar.c;
                if (list != null) {
                    for (abai abaiVar : list) {
                        abaiVar.b(1);
                        int i = ekgb.d;
                        abaiVar.c = ekoe.a;
                    }
                }
                Context context = aazaVar.b;
                if (context.bindService(new Intent(context, (Class<?>) DiagnosticsService.class), aazaVar.f, 1)) {
                    aazaVar.g = true;
                }
                aazaVar.h = diagnosticsFragment;
            }
        });
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.diagnostics_recycler_view);
        recyclerView.aK();
        z();
        recyclerView.ao(new LinearLayoutManager());
        recyclerView.al(this.d);
        Button button2 = (Button) viewInflate.findViewById(R.id.diagnostics_share_log_button);
        this.b = button2;
        button2.setVisibility(true != this.a.e.d() ? 8 : 0);
        this.b.setOnClickListener(new View.OnClickListener() { // from class: abce
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DiagnosticsFragment diagnosticsFragment = this.a;
                Uri uriA = diagnosticsFragment.a.e.a();
                if (uriA != null) {
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.STREAM", uriA);
                    intent.putExtra("android.intent.extra.SUBJECT", "AM Diagnostics Report");
                    intent.putExtra("extra_subject_mandatory", true);
                    diagnosticsFragment.aQ(Intent.createChooser(intent, "Share ".concat(String.valueOf(uriA.getLastPathSegment()))));
                }
            }
        });
        return viewInflate;
    }

    @Override // defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        this.d = new abcl(this.a.a(), z());
    }
}

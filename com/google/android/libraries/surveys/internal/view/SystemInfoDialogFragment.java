package com.google.android.libraries.surveys.internal.view;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import defpackage.dn;
import defpackage.ecrr;
import defpackage.ecrw;
import defpackage.ecwg;
import defpackage.ecwi;
import defpackage.iv;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class SystemInfoDialogFragment extends dn {
    @Override // defpackage.dn
    public final Dialog gK(Bundle bundle) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(G(), R.style.SurveyTheme);
        View viewInflate = ((LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater")).inflate(R.layout.survey_system_info_dialog, (ViewGroup) null);
        viewInflate.getContext().setTheme(R.style.SurveyAlertDialogCustomViewTheme);
        final iv ivVarCreate = ecrr.a(contextThemeWrapper).setView(viewInflate).create();
        viewInflate.findViewById(R.id.survey_system_info_dialog_ok_button).setOnClickListener(new View.OnClickListener() { // from class: ecwf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ivVarCreate.cancel();
            }
        });
        Bundle bundle2 = this.m;
        String string = bundle2.getString("EXTRA_ACCOUNT_NAME");
        Bundle bundle3 = bundle2.getBundle("EXTRA_PSD_BUNDLE");
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.survey_system_info_dialog_list_items);
        recyclerView.ao(new LinearLayoutManager());
        ecwi ecwiVar = new ecwi();
        recyclerView.al(ecwiVar);
        recyclerView.y(new ecwg(this, viewInflate));
        ecwiVar.l(ecrw.b(contextThemeWrapper, string, bundle3));
        return ivVarCreate;
    }
}

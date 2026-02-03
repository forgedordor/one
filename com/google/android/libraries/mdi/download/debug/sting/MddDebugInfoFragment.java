package com.google.android.libraries.mdi.download.debug.sting;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.dtsl;
import defpackage.dtws;
import defpackage.dtxf;
import defpackage.dtxg;
import defpackage.dtxh;
import defpackage.dtxi;
import defpackage.dtyr;
import defpackage.ejtj;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class MddDebugInfoFragment extends dtyr {
    public dtws a;
    public dtsl b;
    private dtxg c;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        dtxh dtxhVar = this.c.b;
        View viewInflate = layoutInflater.inflate(R.layout.mdd_debug_info_fragment, viewGroup, false);
        ((TextView) viewInflate.findViewById(R.id.debug_info)).setText(String.valueOf(((dtxi) dtxhVar).a.k()).concat("\n==== END MDD DEBUG INFO ====\n\n"));
        return viewInflate;
    }

    @Override // defpackage.ea
    public final void ah(Menu menu, MenuInflater menuInflater) {
        dtxh dtxhVar = this.c.b;
        menuInflater.inflate(R.menu.debug_info_fragment_options_menu, menu);
        final dtxf dtxfVar = (dtxf) ((dtxi) dtxhVar).b;
        menu.findItem(R.id.dump_info_option).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: dtxd
            public final /* synthetic */ String b = "MDD.DEBUG.LOG_INFO_ACTION";

            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                dtxf dtxfVar2 = dtxfVar;
                dtxfVar2.d.c(ejtj.a(dtxfVar2.c.e()), dtxfVar2.e, this.b);
                return true;
            }
        });
    }

    @Override // defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        av(true);
        dtxf dtxfVar = new dtxf(this, this.a);
        dtxg dtxgVar = new dtxg(new dtxi(this.b, dtxfVar), dtxfVar);
        this.c = dtxgVar;
        dtxf dtxfVar2 = (dtxf) dtxgVar.a;
        dtxfVar2.d = ejtj.b(dtxfVar2.b);
        dtxfVar2.d.d(R.id.debug_info_fragment_action_callback, dtxfVar2.e);
    }
}

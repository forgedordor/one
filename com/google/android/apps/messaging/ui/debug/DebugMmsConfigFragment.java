package com.google.android.apps.messaging.ui.debug;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.debug.DebugMmsConfigFragment;
import defpackage.cmtg;
import defpackage.cmtp;
import defpackage.cmum;
import defpackage.cqjy;
import defpackage.cqjz;
import defpackage.crny;
import defpackage.crof;
import defpackage.cxbd;
import defpackage.cxbe;
import defpackage.cxbf;
import defpackage.cxsw;
import defpackage.eg;
import defpackage.fcsu;
import defpackage.iv;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DebugMmsConfigFragment extends cxsw {
    public iv a;
    public cxbf ag;
    public cqjy ah;
    private ListView ai;
    private View aj;
    public int[] b;
    public int c;
    public cxbe d;
    public crny e;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.mms_config_debug_fragment, viewGroup, false);
        this.aj = viewInflate;
        this.ai = (ListView) viewInflate.findViewById(android.R.id.list);
        Spinner spinner = (Spinner) this.aj.findViewById(R.id.sim_selector);
        List listM = this.e.m();
        Integer[] numArr = new Integer[listM.size()];
        for (int i = 0; i < listM.size(); i++) {
            numArr[i] = Integer.valueOf(((crof) listM.get(i)).a());
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(G(), android.R.layout.simple_spinner_item, numArr);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        spinner.setOnItemSelectedListener(new cxbd(this, numArr));
        ((TextView) this.aj.findViewById(R.id.sim_title)).setOnClickListener(new View.OnClickListener() { // from class: cxbc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final DebugMmsConfigFragment debugMmsConfigFragment = this.a;
                iu iuVar = new iu(debugMmsConfigFragment.G());
                View viewInflate2 = debugMmsConfigFragment.G().getLayoutInflater().inflate(R.layout.mms_config_debug_mcc_mnc_dialog, (ViewGroup) null);
                final TextView textView = (TextView) viewInflate2.findViewById(R.id.mcc_entry);
                final TextView textView2 = (TextView) viewInflate2.findViewById(R.id.mnc_entry);
                iuVar.setView(viewInflate2);
                iuVar.setPositiveButton(R.string.menu_save_apn, new DialogInterface.OnClickListener() { // from class: cxaz
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) throws NumberFormatException {
                        DebugMmsConfigFragment debugMmsConfigFragment2 = debugMmsConfigFragment;
                        TextView textView3 = textView;
                        TextView textView4 = textView2;
                        try {
                            int i3 = Integer.parseInt(textView3.getText().toString());
                            int i4 = Integer.parseInt(textView4.getText().toString());
                            cqjy cqjyVar = debugMmsConfigFragment2.ah;
                            int i5 = debugMmsConfigFragment2.c;
                            Integer[] numArr2 = {Integer.valueOf(i3), Integer.valueOf(i4)};
                            cqjz cqjzVar = (cqjz) cqjyVar.e.b();
                            if (cqjzVar.b == null) {
                                cqjzVar.b = new SparseArray();
                            }
                            cqjzVar.b.put(i5, numArr2);
                            debugMmsConfigFragment2.d.a();
                            debugMmsConfigFragment2.b(false);
                        } catch (NumberFormatException e) {
                            Log.w("Bugle", "MCC or MNC passed in was not able to be parsed to an integer: ", e);
                        }
                        debugMmsConfigFragment2.a.dismiss();
                    }
                });
                iuVar.setNegativeButton(R.string.share_cancel, new DialogInterface.OnClickListener() { // from class: cxba
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        debugMmsConfigFragment.a.cancel();
                    }
                });
                iuVar.d(R.string.menu_restore_default_apn, new DialogInterface.OnClickListener() { // from class: cxbb
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        DebugMmsConfigFragment debugMmsConfigFragment2 = debugMmsConfigFragment;
                        fcsu fcsuVar = debugMmsConfigFragment2.ah.e;
                        int i3 = debugMmsConfigFragment2.c;
                        cqjz cqjzVar = (cqjz) fcsuVar.b();
                        if (cqjzVar.b != null) {
                            cqjzVar.b.remove(i3);
                            if (cqjzVar.b.size() == 0) {
                                cqjzVar.b = null;
                            }
                        }
                        debugMmsConfigFragment2.d.a();
                        debugMmsConfigFragment2.a();
                        debugMmsConfigFragment2.a.dismiss();
                    }
                });
                iuVar.e(R.string.debug_mms_config_mcc_mnc_title);
                debugMmsConfigFragment.a = iuVar.create();
                textView.setText(String.valueOf(debugMmsConfigFragment.b[0]));
                textView2.setText(String.valueOf(debugMmsConfigFragment.b[1]));
                debugMmsConfigFragment.a.show();
            }
        });
        return this.aj;
    }

    public final void a() {
        b(true);
    }

    public final void b(boolean z) {
        cxbf cxbfVar = this.ag;
        fcsu fcsuVar = cxbfVar.a;
        eg egVarG = G();
        int i = this.c;
        cmum cmumVar = (cmum) fcsuVar.b();
        cmumVar.getClass();
        cmtg cmtgVar = (cmtg) cxbfVar.b.b();
        cmtgVar.getClass();
        cmtp cmtpVar = (cmtp) cxbfVar.c.b();
        cmtpVar.getClass();
        egVarG.getClass();
        cxbe cxbeVar = new cxbe(cmumVar, cmtgVar, cmtpVar, egVarG, i, z);
        this.d = cxbeVar;
        this.ai.setAdapter((ListAdapter) cxbeVar);
        this.b = ((cqjz) this.ah.e.b()).a(this.c);
        TextView textView = (TextView) this.aj.findViewById(R.id.sim_title);
        int[] iArr = this.b;
        textView.setText("(" + iArr[0] + "/" + iArr[1] + ") " + G().getString(R.string.debug_sub_id_spinner_text));
    }
}

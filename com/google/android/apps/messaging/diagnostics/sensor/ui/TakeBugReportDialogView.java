package com.google.android.apps.messaging.diagnostics.sensor.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.diagnostics.sensor.ui.TakeBugReportDialogView;
import defpackage.aazs;
import defpackage.aazt;
import defpackage.abbi;
import defpackage.abbj;
import defpackage.abbl;
import defpackage.einf;
import defpackage.einm;
import defpackage.rf;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class TakeBugReportDialogView extends abbl {
    public EditText a;
    public RadioGroup b;
    public aazs c;
    public Button d;
    public einm e;
    public aazt f;
    private List g;
    private Button h;

    public TakeBugReportDialogView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void c(View view, int i) {
        einf.g(new abbj(new abbi(i, this.c, this.a.getText().toString())), view);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (EditText) findViewById(R.id.take_bug_report_comment);
        this.b = (RadioGroup) findViewById(R.id.take_bug_report_categories_view);
        this.d = (Button) findViewById(R.id.take_bug_report_view_report_button);
        this.h = (Button) findViewById(R.id.take_bug_report_view_cancel_button);
        this.e.a(this.d, new View.OnClickListener() { // from class: abbx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.c(view, 1);
            }
        });
        this.e.a(this.h, new View.OnClickListener() { // from class: abby
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.c(view, 2);
            }
        });
        List<aazs> list = this.f.a;
        this.g = list;
        for (final aazs aazsVar : list) {
            rf rfVar = new rf(getContext());
            rfVar.setText(aazsVar.a);
            rfVar.setId(aazsVar.c);
            rfVar.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: abbw
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    if (z) {
                        aazs aazsVar2 = aazsVar;
                        TakeBugReportDialogView takeBugReportDialogView = this.a;
                        takeBugReportDialogView.c = aazsVar2;
                        for (int i = 0; i < takeBugReportDialogView.b.getChildCount(); i++) {
                            rf rfVar2 = (rf) takeBugReportDialogView.b.getChildAt(i);
                            if (aazsVar2.c != rfVar2.getId()) {
                                rfVar2.setVisibility(8);
                            }
                        }
                        takeBugReportDialogView.d.setEnabled(true);
                        takeBugReportDialogView.a.requestFocus();
                    }
                }
            });
            this.b.addView(rfVar);
        }
    }
}

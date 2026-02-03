package defpackage;

import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.ProblematicMessageDataView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acnh {
    public final TextView a;
    public final TextView b;
    public final CheckBox c;
    public final fcsu d;
    public acng e;
    public acjo f;

    public acnh(ProblematicMessageDataView problematicMessageDataView, fcsu fcsuVar) {
        this.d = fcsuVar;
        this.a = (TextView) problematicMessageDataView.findViewById(R.id.message_content);
        this.b = (TextView) problematicMessageDataView.findViewById(R.id.message_timestamp);
        CheckBox checkBox = (CheckBox) problematicMessageDataView.findViewById(R.id.advanced_feedback_data_checkbox);
        this.c = checkBox;
        problematicMessageDataView.setOnClickListener(new View.OnClickListener() { // from class: acne
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                acnh acnhVar = this.a;
                acnhVar.c.toggle();
                acng acngVar = acnhVar.e;
                if (acngVar != null) {
                    ((acna) acngVar).a();
                }
            }
        });
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: acnf
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                acng acngVar = this.a.e;
                if (acngVar != null) {
                    ((acna) acngVar).a();
                }
            }
        });
    }

    public final boolean a() {
        return this.c.isChecked();
    }
}

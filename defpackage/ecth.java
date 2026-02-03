package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecth extends LinearLayout {
    public ectg a;

    public ecth(Context context) {
        super(context);
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.survey_question_open_text_item, (ViewGroup) this, true);
    }

    public final void a(expo expoVar) {
        EditText editText = (EditText) findViewById(R.id.survey_open_text);
        ecry.a(editText, (TextView) findViewById(R.id.survey_open_text_personal_info));
        editText.setSingleLine(false);
        if (!expoVar.b.isEmpty()) {
            editText.setHint(expoVar.b);
        }
        if (!ecse.j(getContext())) {
            editText.requestFocus();
        }
        editText.addTextChangedListener(new ectf(this));
    }
}

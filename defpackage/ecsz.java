package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecsz extends LinearLayout {
    public boolean[] a;
    public String b;
    public ecsy c;

    public ecsz(Context context) {
        super(context);
        setOrientation(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(expm expmVar, boolean[] zArr) {
        if (zArr == null) {
            exnl exnlVar = expmVar.c;
            if (exnlVar == null) {
                exnlVar = exnl.a;
            }
            this.a = new boolean[exnlVar.b.size()];
        } else {
            this.a = zArr;
        }
        exnl exnlVar2 = expmVar.c;
        if (exnlVar2 == null) {
            exnlVar2 = exnl.a;
        }
        evtg evtgVar = exnlVar2.b;
        for (final int i = 0; i < evtgVar.size(); i++) {
            int iA = exnh.a(((exnj) evtgVar.get(i)).c);
            if (iA != 0 && iA == 4) {
                LayoutInflater.from(getContext()).inflate(R.layout.survey_question_multiple_select_other_option, (ViewGroup) this, true);
                LinearLayout linearLayout = (LinearLayout) getChildAt(i);
                final CheckBox checkBox = (CheckBox) linearLayout.findViewById(R.id.survey_multiple_select_checkbox);
                checkBox.setContentDescription(getResources().getString(R.string.survey_other_option_hint));
                checkBox.setChecked(this.a[i]);
                checkBox.setOnCheckedChangeListener(new ecsw(this, i));
                checkBox.setTag("OtherPleaseSpecify");
                final EditText editText = (EditText) linearLayout.findViewById(R.id.survey_other_option);
                ecry.a(editText, (TextView) linearLayout.findViewById(R.id.tv_survey_other_option_pii_info));
                final View viewFindViewById = linearLayout.findViewById(R.id.survey_other_option_background);
                viewFindViewById.setOnTouchListener(new View.OnTouchListener() { // from class: ecst
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() != 1) {
                            return false;
                        }
                        if (motionEvent.getX() >= 0.0f) {
                            CheckBox checkBox2 = checkBox;
                            if (motionEvent.getX() < checkBox2.getWidth() && motionEvent.getY() >= 0.0f) {
                                if (motionEvent.getY() < viewFindViewById.getHeight()) {
                                    checkBox2.performClick();
                                    return false;
                                }
                            }
                        }
                        EditText editText2 = editText;
                        editText2.requestFocus();
                        ecse.i(editText2);
                        return false;
                    }
                });
                editText.addTextChangedListener(new ecsv(this, i, checkBox));
                editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: ecsu
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z) {
                        ecsz ecszVar = this.a;
                        EditText editText2 = editText;
                        if (!z) {
                            editText2.setHintTextColor(ecszVar.getContext().getColor(R.color.survey_hint_text_unfocused_color));
                            return;
                        }
                        CheckBox checkBox2 = checkBox;
                        ecszVar.a[i] = true;
                        checkBox2.setChecked(true);
                        editText2.setHintTextColor(ecszVar.getContext().getColor(R.color.survey_hint_text_color));
                        ecszVar.c.a(new ecsx(ecszVar.b, ecszVar.a));
                    }
                });
                ecsj ecsjVar = ecrz.c;
                if (fbks.a.get().a(getContext())) {
                    editText.setFocusable(false);
                    editText.postDelayed(new Runnable() { // from class: ecss
                        @Override // java.lang.Runnable
                        public final void run() {
                            EditText editText2 = editText;
                            editText2.setFocusable(true);
                            editText2.setFocusableInTouchMode(true);
                        }
                    }, 500L);
                }
            } else {
                boolean z = this.a[i];
                int iA2 = exnh.a(((exnj) evtgVar.get(i)).c);
                if (iA2 == 0) {
                    iA2 = 1;
                }
                String str = iA2 == 5 ? "NoneOfTheAbove" : null;
                String str2 = ((exnj) evtgVar.get(i)).e;
                LayoutInflater.from(getContext()).inflate(R.layout.survey_question_multiple_select_item, (ViewGroup) this, true);
                FrameLayout frameLayout = (FrameLayout) getChildAt(i);
                final CheckBox checkBox2 = (CheckBox) frameLayout.findViewById(R.id.survey_multiple_select_checkbox);
                checkBox2.setText(str2);
                checkBox2.setContentDescription(str2);
                checkBox2.setChecked(z);
                checkBox2.setOnCheckedChangeListener(new ecsw(this, i));
                frameLayout.setOnClickListener(new View.OnClickListener() { // from class: ecsr
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        checkBox2.performClick();
                    }
                });
                if (str != null) {
                    checkBox2.setTag(str);
                }
            }
        }
    }
}

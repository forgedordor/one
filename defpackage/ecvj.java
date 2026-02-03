package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecvj extends LinearLayout {
    public static final /* synthetic */ int b = 0;
    private static final ekgp c = ekgp.p(0, Integer.valueOf(R.drawable.quantum_ic_sentiment_very_satisfied_grey600_36), 1, Integer.valueOf(R.drawable.quantum_ic_sentiment_satisfied_grey600_36), 2, Integer.valueOf(R.drawable.quantum_ic_sentiment_neutral_grey600_36), 3, Integer.valueOf(R.drawable.quantum_ic_sentiment_dissatisfied_grey600_36), 4, Integer.valueOf(R.drawable.quantum_ic_sentiment_very_dissatisfied_grey600_36));
    public ecvh a;

    public ecvj(Context context) {
        super(context);
        setOrientation(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(exqz exqzVar) {
        int iA;
        exnl exnlVar = exqzVar.c;
        if (exnlVar == null) {
            exnlVar = exnl.a;
        }
        final View[] viewArr = new View[exnlVar.b.size()];
        exnl exnlVar2 = exqzVar.c;
        if (exnlVar2 == null) {
            exnlVar2 = exnl.a;
        }
        final evtg evtgVar = exnlVar2.b;
        int i = exqzVar.d;
        int iA2 = exqy.a(i);
        final int i2 = 0;
        boolean z = ((iA2 != 0 && iA2 == 4) || ((iA = exqy.a(i)) != 0 && iA == 5)) && evtgVar.size() == 5;
        while (i2 < evtgVar.size()) {
            int i3 = i2 + 1;
            int iA3 = exnh.a(((exnj) evtgVar.get(i2)).c);
            if (iA3 != 0 && iA3 == 4) {
                LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(getContext()).inflate(R.layout.survey_question_single_select_other_entry, (ViewGroup) this, true);
                final EditText editText = (EditText) linearLayout.findViewById(R.id.survey_other_option);
                ecry.a(editText, (TextView) linearLayout.findViewById(R.id.survey_other_option_personal_info));
                linearLayout.findViewById(R.id.survey_other_option_background).setOnClickListener(new View.OnClickListener() { // from class: ecvd
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i4 = ecvj.b;
                        EditText editText2 = editText;
                        editText2.requestFocus();
                        ecse.i(editText2);
                        view.scrollTo(0, view.getBottom());
                    }
                });
                editText.addTextChangedListener(new ecvg(this, evtgVar, i2));
                editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: ecve
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z2) {
                        ecvj ecvjVar = this.a;
                        EditText editText2 = editText;
                        if (!z2) {
                            editText2.setHintTextColor(ecvjVar.getContext().getColor(R.color.survey_hint_text_unfocused_color));
                            return;
                        }
                        int i4 = i2;
                        List list = evtgVar;
                        editText2.setHintTextColor(ecvjVar.getContext().getColor(R.color.survey_hint_text_color));
                        ecvjVar.a.a(new ecvi(4, "", ((exnj) list.get(i4)).d));
                    }
                });
                viewArr[i2] = editText;
            } else {
                LayoutInflater.from(getContext()).inflate(R.layout.survey_question_single_select_item, (ViewGroup) this, true);
                View childAt = getChildAt(getChildCount() - 1);
                viewArr[i2] = childAt;
                TextView textView = (TextView) childAt.findViewById(R.id.survey_multiple_choice_text);
                textView.setText(((exnj) evtgVar.get(i2)).e);
                textView.setContentDescription(((exnj) evtgVar.get(i2)).e);
                ImageView imageView = (ImageView) viewArr[i2].findViewById(R.id.survey_multiple_choice_icon);
                if (z) {
                    int iA4 = exqy.a(exqzVar.d);
                    imageView.setImageDrawable(ecrw.a(ku.a(getContext(), ((Integer) c.get(Integer.valueOf((iA4 != 0 && iA4 == 5) ? ((ekoj) c).d - i3 : i2))).intValue()), getContext(), getContext().getColor(R.color.survey_grey_icon_color)));
                } else {
                    imageView.setVisibility(8);
                }
                viewArr[i2].setOnClickListener(new View.OnClickListener() { // from class: ecvc
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i4 = 0;
                        while (true) {
                            View[] viewArr2 = viewArr;
                            if (i4 >= viewArr2.length) {
                                final int i5 = i2;
                                final List list = evtgVar;
                                final ecvj ecvjVar = this.a;
                                view.postOnAnimationDelayed(new Runnable() { // from class: ecvf
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        List list2 = list;
                                        int i6 = i5;
                                        ecvjVar.a.a(new ecvi(3, ((exnj) list2.get(i6)).e, ((exnj) list2.get(i6)).d));
                                        long j = ecse.a;
                                    }
                                }, 200L);
                                return;
                            }
                            View view2 = viewArr2[i4];
                            view2.setOnClickListener(null);
                            view2.setClickable(false);
                            i4++;
                        }
                    }
                });
            }
            i2 = i3;
        }
    }
}

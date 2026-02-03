package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.Snackbar;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecud {
    public static ekgp a;
    public final ecuc b;
    public ecqp c;
    public Context d;
    public Activity e;
    public ecsx f;
    public expq g;
    public ecqr h;
    public exqw i;
    public ecvi j;
    public ecsn k;
    public boolean l;
    public String m;
    public String n;
    private View p;
    private ViewGroup q;
    private int s;
    private Integer t;
    private ecpo u;
    private String v;
    private boolean r = false;
    private boolean w = false;
    private boolean x = true;
    private boolean y = true;
    public int o = 0;

    public ecud(ecuc ecucVar) {
        this.b = ecucVar;
    }

    private final void m(final View.OnClickListener onClickListener, final String str) {
        ((MaterialButton) this.q.findViewById(R.id.survey_next)).setOnClickListener(new View.OnClickListener() { // from class: ectu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ecsc ecscVar = new ecsc();
                onClickListener.onClick(view);
                ecsb.e(ecscVar, this.a.d, str);
            }
        });
    }

    private final void n() {
        ((LayoutInflater) this.d.getSystemService("layout_inflater")).inflate(R.layout.survey_controls, this.q);
        if (ecse.m(this.g)) {
            f(false);
            MaterialButton materialButton = (MaterialButton) this.q.findViewById(R.id.survey_next);
            if (materialButton != null && this.g.g.size() == 1 && !this.w) {
                materialButton.setText(R.string.survey_submit);
            }
            ecrq.e(this.q.findViewById(R.id.survey_controls_container), this.q.findViewById(R.id.survey_next), R.dimen.survey_button_accessibility_padding, 0);
        } else {
            this.q.findViewById(R.id.survey_next).setVisibility(8);
        }
        this.q.findViewById(R.id.survey_controls_divider).setVisibility(8);
        this.q.findViewById(R.id.survey_controls_legal_text).setVisibility(8);
    }

    private final void o(Context context, String str, exqw exqwVar, boolean z) {
        ecqp ecqpVar = this.c;
        ecqpVar.g = 3;
        new ecqv(context, str, exqwVar).a(ecqpVar, z);
    }

    private final boolean p() {
        Activity activity;
        if (this.r) {
            return false;
        }
        ecsj ecsjVar = ecrz.c;
        return (ecrz.b(fblw.a.get().b(ecrz.b)) && (activity = this.b.getActivity()) != null && activity.isChangingConfigurations()) ? false : true;
    }

    private static final void q(View view, String str) {
        TextView textView = (TextView) view.findViewById(R.id.survey_prompt_title_text);
        Spanned spannedFromHtml = Html.fromHtml(str, 0);
        textView.setText(spannedFromHtml);
        textView.announceForAccessibility(spannedFromHtml.toString());
    }

    public final ecqk a() {
        exqw exqwVar = this.i;
        if (exqwVar == null || this.m == null) {
            long j = ecse.a;
            return null;
        }
        ecqh ecqhVar = new ecqh();
        ecqhVar.b(exqwVar.b);
        ecqhVar.d(this.m);
        ecqhVar.c(ecqu.POPUP);
        return ecqhVar.a();
    }

    public final void b(exqd exqdVar) {
        if (!ecrz.a()) {
            this.o = 1;
            return;
        }
        exqb exqbVar = exqdVar.k;
        if (exqbVar == null) {
            exqbVar = exqb.a;
        }
        if ((exqbVar.b & 1) == 0) {
            this.o = 1;
            return;
        }
        exqb exqbVar2 = exqdVar.k;
        if (exqbVar2 == null) {
            exqbVar2 = exqb.a;
        }
        exno exnoVar = exqbVar2.d;
        if (exnoVar == null) {
            exnoVar = exno.a;
        }
        int iA = exnn.a(exnoVar.b);
        if (iA == 0) {
            iA = 1;
        }
        if (iA - 2 != 3) {
            this.o = 1;
        } else {
            this.o = this.g.g.size();
        }
    }

    public final void c() {
        ecpo ecpoVar;
        ecpo ecpoVar2;
        this.h.a();
        ecsj ecsjVar = ecrz.c;
        if (!ecrz.c(fblk.b(ecrz.b)) || (((ecpoVar = this.u) != (ecpoVar2 = ecpo.TOAST) && ecpoVar != ecpo.SILENT) || (this.g.g.size() != 1 && !ecuw.b(this.l, this.g, this.c) && this.o != this.g.g.size()))) {
            h();
            return;
        }
        ecpo ecpoVar3 = this.u;
        if (ecpoVar3 == ecpoVar2) {
            View view = this.p;
            exoc exocVar = this.g.d;
            if (exocVar == null) {
                exocVar = exoc.b;
            }
            Snackbar.q(view, exocVar.c, -1).i();
        } else if (ecpoVar3 == ecpo.SILENT) {
            Log.v("SurveyPromptDialogDel", "Silent SurveyCompletionStyle, client apps will display their own completion dialog if need");
        }
        Context context = this.d;
        String str = this.m;
        exqw exqwVar = this.i;
        boolean zK = ecse.k(this.g);
        ecqp ecqpVar = this.c;
        ecqpVar.g = 5;
        new ecqv(context, str, exqwVar).a(ecqpVar, zK);
        o(this.d, this.m, this.i, ecse.k(this.g));
        this.b.dismissAllowingStateLoss();
    }

    public final void d() {
        if (ecrz.b == null) {
            return;
        }
        if (!ecrz.d()) {
            if (p()) {
                ecql.a.b();
            }
        } else {
            ecqk ecqkVarA = a();
            if (!p() || ecqkVarA == null) {
                return;
            }
            ecql.a.c(ecqkVarA);
        }
    }

    public final void e(View view) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.d.getSystemService("accessibility");
        View viewFindViewById = view.findViewById(R.id.survey_prompt_title_text);
        ecsj ecsjVar = ecrz.c;
        if (!ecrz.b(fbkm.a.get().a(ecrz.b)) || !accessibilityManager.isTouchExplorationEnabled() || viewFindViewById == null || viewFindViewById.isAccessibilityFocused()) {
            return;
        }
        viewFindViewById.performAccessibilityAction(64, null);
    }

    public final void f(boolean z) {
        MaterialButton materialButton = (MaterialButton) this.q.findViewById(R.id.survey_next);
        if (materialButton == null || materialButton.isEnabled() == z) {
            return;
        }
        materialButton.setEnabled(z);
    }

    public final void g(exqd exqdVar) {
        String str;
        ecvi ecviVar = this.j;
        exon exonVar = (exon) exoz.a.createBuilder();
        if (this.h.c() && (str = ecviVar.a) != null) {
            exov exovVar = (exov) exow.a.createBuilder();
            int i = ecviVar.b;
            exovVar.copyOnWrite();
            ((exow) exovVar.instance).c = i;
            int i2 = ecviVar.c;
            exovVar.copyOnWrite();
            ((exow) exovVar.instance).b = exou.a(i2);
            exovVar.copyOnWrite();
            ((exow) exovVar.instance).d = str;
            exow exowVar = (exow) exovVar.build();
            exox exoxVar = (exox) exoy.a.createBuilder();
            exoxVar.copyOnWrite();
            exoy exoyVar = (exoy) exoxVar.instance;
            exowVar.getClass();
            exoyVar.c = exowVar;
            exoyVar.b |= 1;
            exoy exoyVar2 = (exoy) exoxVar.build();
            exonVar.copyOnWrite();
            exoz exozVar = (exoz) exonVar.instance;
            exoyVar2.getClass();
            exozVar.c = exoyVar2;
            exozVar.b = 2;
            int i3 = exqdVar.e;
            exonVar.copyOnWrite();
            ((exoz) exonVar.instance).d = i3;
        }
        exoz exozVar2 = (exoz) exonVar.build();
        if (exozVar2 != null) {
            this.c.a = exozVar2;
        }
        b(exqdVar);
        ecvi ecviVar2 = this.j;
        ecsj ecsjVar = ecrz.c;
        if (ecrz.c(fbkj.b(ecrz.b))) {
            exnj exnjVar = exnj.a;
            exnl exnlVar = (exqdVar.c == 4 ? (exqz) exqdVar.d : exqz.a).c;
            if (exnlVar == null) {
                exnlVar = exnl.a;
            }
            Iterator<E> it = exnlVar.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                exnj exnjVar2 = (exnj) it.next();
                if (exnjVar2.d == ecviVar2.b) {
                    exnjVar = exnjVar2;
                    break;
                }
            }
            if ((exnjVar.b & 1) != 0) {
                exno exnoVar = exnjVar.g;
                if (exnoVar == null) {
                    exnoVar = exno.a;
                }
                int iA = exnn.a(exnoVar.b);
                if (iA == 0) {
                    iA = 1;
                }
                int i4 = iA - 2;
                if (i4 == 2) {
                    exno exnoVar2 = exnjVar.g;
                    if (exnoVar2 == null) {
                        exnoVar2 = exno.a;
                    }
                    String str2 = exnoVar2.c;
                    this.o = a.containsKey(str2) ? ((Integer) a.get(str2)).intValue() : 0;
                } else if (i4 != 3) {
                    this.o = 1;
                } else {
                    this.o = this.g.g.size();
                }
            }
        } else {
            this.o = 1;
        }
        c();
    }

    public final void h() {
        expq expqVar;
        ecuc ecucVar = this.b;
        Activity activity = ecucVar.getActivity();
        String str = this.m;
        expq expqVar2 = this.g;
        exqw exqwVar = this.i;
        ecqp ecqpVar = this.c;
        int i = this.s;
        Integer numValueOf = Integer.valueOf(i);
        boolean z = this.l;
        Integer num = this.t;
        ecpo ecpoVar = this.u;
        String str2 = this.v;
        int i2 = this.o;
        boolean z2 = this.w;
        boolean z3 = this.x;
        boolean z4 = this.y;
        HashMap map = new HashMap();
        Iterator it = expqVar2.g.iterator();
        while (true) {
            expqVar = expqVar2;
            if (!it.hasNext()) {
                break;
            }
            exqd exqdVar = (exqd) it.next();
            Iterator it2 = it;
            if ((exqdVar.b & 1) != 0) {
                exqb exqbVar = exqdVar.k;
                if (exqbVar == null) {
                    exqbVar = exqb.a;
                }
                if (!map.containsKey(exqbVar.c)) {
                    exqb exqbVar2 = exqdVar.k;
                    if (exqbVar2 == null) {
                        exqbVar2 = exqb.a;
                    }
                    map.put(exqbVar2.c, Integer.valueOf(exqdVar.e - 1));
                }
            }
            it = it2;
            expqVar2 = expqVar;
        }
        ecvq.a = ekgp.j(map);
        Intent intent = new Intent(activity, (Class<?>) ecvq.class);
        intent.setClassName(activity, str2);
        intent.putExtra("TriggerId", str);
        intent.putExtra("SurveyPayload", expqVar.toByteArray());
        intent.putExtra("SurveySession", exqwVar.toByteArray());
        intent.putExtra("Answer", ecqpVar);
        intent.putExtra("IsFullWidth", false);
        intent.putExtra("IgnoreFirstQuestion", z);
        if (num != null) {
            intent.putExtra("LogoResId", num);
        }
        intent.putExtra("IsSubmitting", false);
        intent.putExtra("SurveyCompletionStyle", ecpoVar);
        intent.putExtra("StartingQuestionIndex", i2);
        intent.putExtra("keepNextButtonForLastQuestion", z2);
        intent.putExtra("isCarDisplayFullyReachable", z3);
        intent.putExtra("isCarDisplayRightOfUser", z4);
        long j = ecse.a;
        numValueOf.getClass();
        activity.startActivityForResult(intent, i);
        this.r = true;
        o(this.d, this.m, this.i, ecse.k(this.g));
        ecucVar.dismissAllowingStateLoss();
    }

    public final void i(Context context, String str, exqw exqwVar, boolean z) {
        ecqp ecqpVar = this.c;
        ecqpVar.g = 4;
        new ecqv(context, str, exqwVar).a(ecqpVar, z);
    }

    public final void j(Context context, String str, exqw exqwVar, boolean z) {
        ecqp ecqpVar = this.c;
        ecqpVar.g = 6;
        new ecqv(context, str, exqwVar).a(ecqpVar, z);
    }

    public final void k() {
        if (ecrz.b == null) {
            this.b.dismissAllowingStateLoss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View l(android.view.ViewGroup r25) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ecud.l(android.view.ViewGroup):android.view.View");
    }
}

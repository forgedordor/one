package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.appsettings.RcsMultiSimStatusCheckboxView;
import com.google.android.apps.messaging.ui.appsettings.RcsSimStatusView;
import com.google.android.material.button.MaterialButton;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuxa {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/ui/appsettings/RcsSimStatusViewPeer");
    private boolean C;
    private final fcsu D;
    private final fcsu E;
    private final fcsu F;
    private final fcsu G;
    private final fcsu H;
    private final fcsu I;
    private final fcsu J;
    public final Context b;
    public dggn c;
    public final RcsMultiSimStatusCheckboxView d;
    public final TextView e;
    public final MaterialButton f;
    public String g;
    public int i;
    public dajw k;
    public final ImageView l;
    public TextView m;
    public boolean n;
    public boolean o;
    public boolean p;
    public final fcsu q;
    public final fcsu r;
    public final fcsu s;
    public final fcsu t;
    public final fcsu u;
    public final fcsu v;
    private final TextView x;
    private final TextView y;
    private dgid z;
    private int A = 8;
    private boolean B = true;
    public Optional h = Optional.empty();
    public int w = 1;
    public boolean j = false;

    public cuxa(RcsSimStatusView rcsSimStatusView, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13) {
        this.b = rcsSimStatusView.getContext();
        this.t = fcsuVar;
        this.q = fcsuVar2;
        this.r = fcsuVar4;
        this.D = fcsuVar5;
        this.s = fcsuVar3;
        this.E = fcsuVar6;
        this.u = fcsuVar7;
        this.F = fcsuVar8;
        this.G = fcsuVar9;
        this.v = fcsuVar10;
        this.H = fcsuVar11;
        this.J = fcsuVar12;
        this.I = fcsuVar13;
        this.e = (TextView) rcsSimStatusView.findViewById(R.id.rcs_sim_status_title);
        this.x = (TextView) rcsSimStatusView.findViewById(R.id.rcs_sim_status_status_text);
        this.y = (TextView) rcsSimStatusView.findViewById(R.id.rcs_sim_status_summary);
        this.d = (RcsMultiSimStatusCheckboxView) rcsSimStatusView.findViewById(R.id.rcs_multi_sim_checkbox);
        this.l = (ImageView) rcsSimStatusView.findViewById(R.id.tos_tooltip_info_view);
        this.f = (MaterialButton) rcsSimStatusView.findViewById(R.id.verify_number_button);
        h(this.A);
        g(this.B);
    }

    private final SpannableStringBuilder f() {
        Context context = this.b;
        String string = context.getString(R.string.rcs_status_setting_up_desc_fi_multi_sync_link_text);
        return dajs.e(context, context.getString(R.string.rcs_status_setting_up_desc_fi_multi_sync, string), string, new View.OnClickListener() { // from class: cuwu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cuxa cuxaVar = this.a;
                ((aijh) cuxaVar.s.b()).t(cuxaVar.b, "https://support.google.com/messages?p=".concat(String.valueOf((String) dfpi.t().a.ar.a())));
                ((ckkx) cuxaVar.v.b()).c(dggo.a(cuxaVar.c).a, 3);
            }
        });
    }

    private final void g(boolean z) {
        boolean z2 = false;
        if (!dfog.G() && z) {
            z2 = true;
        }
        this.f.setEnabled(z2);
    }

    private final void h(int i) {
        if (true == dfog.G()) {
            i = 8;
        }
        this.f.setVisibility(i);
    }

    private final void i(int i, int i2) {
        Context context = this.b;
        String string = context.getString(i2);
        String string2 = context.getString(R.string.rcs_status_label);
        SpannableString spannableString = new SpannableString(String.valueOf(string2).concat(String.valueOf(string)));
        spannableString.setSpan(new ForegroundColorSpan(context.getColor(R.color.settings_rcs_status_label)), 0, string2.length(), 33);
        spannableString.setSpan(new ForegroundColorSpan(context.getColor(i)), string2.length(), string2.length() + string.length(), 33);
        TextView textView = this.x;
        textView.setText(spannableString);
        if (((apwv) this.E.b()).a() || ((arwz) this.I.b()).a()) {
            textView.setContentDescription(context.getString(R.string.rcs_status_multi_sim_text_context_description, Integer.valueOf(this.i), string));
        }
    }

    private final boolean j() {
        if (!this.h.isEmpty() && ((cjtu) this.h.get()).d.size() != 0) {
            cjtr cjtrVar = ((cjtt) ekis.j(((cjtu) this.h.get()).d)).d;
            if (cjtrVar == null) {
                cjtrVar = cjtr.a;
            }
            cjtq cjtqVarB = cjtq.b(cjtrVar.e);
            if (cjtqVarB == null) {
                cjtqVarB = cjtq.UNRECOGNIZED;
            }
            if (cjtqVarB == cjtq.OTP_FORCE_VERIFICATION_THROTTLED && (cjtrVar.b & 2) != 0) {
                evvp evvpVarC = evxc.c(((cogw) this.q.b()).f().toEpochMilli());
                evvp evvpVar = cjtrVar.d;
                if (evvpVar == null) {
                    evvpVar = evvp.a;
                }
                if (evxb.a(evvpVarC, evvpVar) < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean k() {
        if (!((dflm) this.G.b()).a() || !this.p) {
            return false;
        }
        b(f());
        if (!dfpi.S()) {
            return true;
        }
        ((ckkx) this.v.b()).c(dggo.a(this.c).a, 2);
        return true;
    }

    final RcsMultiSimStatusCheckboxView a() {
        RcsMultiSimStatusCheckboxView rcsMultiSimStatusCheckboxView = this.d;
        if (rcsMultiSimStatusCheckboxView != null) {
            return rcsMultiSimStatusCheckboxView;
        }
        return null;
    }

    final void b(SpannableStringBuilder spannableStringBuilder) {
        TextView textView = this.y;
        if (textView != null) {
            d(0);
            textView.setText(spannableStringBuilder);
            eebt.b(textView);
        }
    }

    final void c(String str) {
        TextView textView = this.y;
        if (textView != null) {
            d(0);
            textView.setText(str);
        }
    }

    final void d(int i) {
        this.y.setVisibility(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        if (r0 == false) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0217  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void e(int r11, defpackage.dgid r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuxa.e(int, dgid, boolean):void");
    }
}

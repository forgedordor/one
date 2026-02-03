package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acyf implements adaq {
    private final Context a;
    private final cogw b;
    private TextView c;
    private ImageView d;
    private cpdw e;
    private cpdw f;

    public acyf(Context context, cogw cogwVar) {
        this.a = context;
        this.b = cogwVar;
    }

    private static long f(acyx acyxVar) {
        String strAl = acyxVar.al("earliest_reminder_trigger_time");
        if (TextUtils.isEmpty(strAl)) {
            return 0L;
        }
        return Long.parseLong(strAl);
    }

    private final void g(adao adaoVar) {
        if (!czwc.b()) {
            this.e.g(8);
            this.f.g(8);
            return;
        }
        if ((!crbf.g() || !adaoVar.W()) && ((!tet.a() || !adaoVar.U()) && TextUtils.isEmpty(adaoVar.I()))) {
            this.e.g(8);
        }
        if (TextUtils.isEmpty(adaoVar.I())) {
            this.f.g(8);
        }
    }

    private final void h(adan adanVar, acyx acyxVar, Long l, boolean z) {
        if (!czwc.a() || f(acyxVar) == 0 || l == null) {
            adanVar.j(false);
            adanVar.i(false);
            return;
        }
        boolean z2 = l.longValue() < this.b.f().toEpochMilli();
        Resources resources = this.a.getResources();
        if (!z) {
            boolean zB = czwc.b();
            int i = R.drawable.quantum_ic_alarm_black_24;
            if (!zB && z2) {
                i = R.drawable.quantum_ic_alarm_on_black_24;
            }
            ((adaj) adanVar).p = Integer.valueOf(i);
        }
        adaj adajVar = (adaj) adanVar;
        adajVar.m = l;
        adanVar.j(true);
        adanVar.i(!z);
        adajVar.n = resources.getText(z2 ? true != czwc.b() ? R.string.missed_reminder : R.string.active_reminder : R.string.upcoming_reminder).toString();
        int i2 = R.attr.colorOnSurfaceVariant;
        adajVar.o = Integer.valueOf(true != z2 ? R.attr.colorOnSurfaceVariant : R.attr.colorPrimaryBrandNonIcon);
        if (true == z2) {
            i2 = R.attr.colorPrimaryBrandIcon;
        }
        adajVar.q = Integer.valueOf(i2);
    }

    @Override // defpackage.adaq
    public final adao a(adao adaoVar) {
        adan adanVarM = adaoVar.m();
        h(adanVarM, adaoVar.k(), adaoVar.C(), adaoVar.T());
        return adanVarM.a();
    }

    @Override // defpackage.adaq
    public final void b(adao adaoVar, boolean z) {
        Long lC = adaoVar.C();
        if (lC == null || lC.longValue() == 0) {
            g(adaoVar);
            return;
        }
        adao adaoVarA = a(adaoVar);
        adak adakVar = (adak) adaoVarA;
        if (!adakVar.v) {
            g(adaoVarA);
            return;
        }
        this.e.g(0);
        TextView textView = (TextView) this.e.b();
        this.c = textView;
        if (textView != null) {
            String str = adakVar.x;
            str.getClass();
            textView.setText(str);
            TextView textView2 = this.c;
            Integer num = adakVar.y;
            num.getClass();
            textView2.setTextColor(eehg.b(textView2, num.intValue()));
        }
        boolean z2 = this.c != null && adakVar.w;
        this.f.g(true != z2 ? 8 : 0);
        if (z2) {
            ImageView imageView = (ImageView) this.f.b();
            this.d = imageView;
            if (imageView != null) {
                Integer num2 = adakVar.z;
                num2.getClass();
                imageView.setImageResource(num2.intValue());
                ImageView imageView2 = this.d;
                Integer num3 = adakVar.A;
                num3.getClass();
                imageView2.setColorFilter(eehg.b(imageView2, num3.intValue()));
            }
        }
    }

    @Override // defpackage.adaq
    public final void c(View view) {
        this.e = new cpdw(view, R.id.additional_text, R.id.additional_text, R.layout.additional_text_view);
        this.f = new cpdw(view, R.id.additional_info_icon, R.id.additional_info_icon, R.layout.additional_info_icon);
    }

    @Override // defpackage.adaq
    public final void d(adan adanVar, acyx acyxVar) {
        h(adanVar, acyxVar, Long.valueOf(f(acyxVar)), acyxVar.am());
    }

    @Override // defpackage.adaq
    public final boolean e(adao adaoVar, adao adaoVar2) {
        Long lC = adaoVar2.C();
        boolean z = (lC == null || lC.equals(adaoVar.C())) ? false : true;
        return czwc.b() ? (!z && adaoVar.Y() == adaoVar2.Y() && adaoVar.X() == adaoVar2.X()) ? false : true : z;
    }
}

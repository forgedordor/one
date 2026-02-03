package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aihp implements adaq {
    private final Context a;
    private int b;
    private TextView c;
    private ImageView d;
    private cpdw e;
    private cpdw f;

    public aihp(Context context) {
        this.a = context;
    }

    @Override // defpackage.adaq
    public final void b(adao adaoVar, boolean z) {
        if (adaoVar.Y()) {
            return;
        }
        if (TextUtils.isEmpty(adaoVar.I())) {
            if ((!crbf.g() || !adaoVar.W()) && (!tet.a() || !adaoVar.U())) {
                this.e.g(8);
            }
            this.f.g(8);
            return;
        }
        this.e.g(0);
        TextView textView = (TextView) this.e.b();
        this.c = textView;
        if (textView != null) {
            String strI = adaoVar.I();
            strI.getClass();
            textView.setText(strI);
            TextView textView2 = this.c;
            Integer numW = adaoVar.w();
            numW.getClass();
            numW.intValue();
            textView2.setTextColor(eehg.b(textView2, R.attr.colorOnSurfaceVariant));
        }
        boolean z2 = (adaoVar.T() || this.c == null) ? false : true;
        this.f.g(true == z2 ? 0 : 8);
        if (z2) {
            Context context = this.a;
            Integer numU = adaoVar.u();
            numU.getClass();
            numU.intValue();
            Drawable drawable = context.getDrawable(R.drawable.gs_schedule_send_vd_theme_24);
            drawable.getClass();
            drawable.setAutoMirrored(true);
            ImageView imageView = (ImageView) this.f.b();
            this.d = imageView;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
                ImageView imageView2 = this.d;
                Integer numV = adaoVar.v();
                numV.getClass();
                numV.intValue();
                imageView2.setColorFilter(eehg.b(imageView2, R.attr.colorOnSurfaceVariant));
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
        String strAl = acyxVar.al("scheduled_messages_count");
        this.b = strAl == null ? 0 : Integer.parseInt(strAl);
        if (!((Boolean) clpp.a.e()).booleanValue() || this.b <= 0) {
            return;
        }
        adaj adajVar = (adaj) adanVar;
        adajVar.w = this.a.getResources().getQuantityString(R.plurals.scheduled_message, this.b);
        adajVar.x = Integer.valueOf(R.drawable.gs_schedule_send_vd_theme_24);
        Integer numValueOf = Integer.valueOf(R.attr.colorOnSurfaceVariant);
        adajVar.y = numValueOf;
        adajVar.z = numValueOf;
    }

    @Override // defpackage.adaq
    public final boolean e(adao adaoVar, adao adaoVar2) {
        return (adaoVar.T() == adaoVar2.T() && TextUtils.equals(adaoVar.I(), adaoVar2.I())) ? false : true;
    }

    @Override // defpackage.adaq
    public final adao a(adao adaoVar) {
        return adaoVar;
    }
}

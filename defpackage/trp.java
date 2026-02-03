package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class trp implements ehay {
    final /* synthetic */ trq a;

    public trp(trq trqVar) {
        this.a = trqVar;
    }

    private final void c() {
        final trq trqVar = this.a;
        trm trmVar = trqVar.a;
        MaterialButton materialButton = (MaterialButton) trmVar.N().findViewById(R.id.fi_settings_redirect_button);
        TextView textView = (TextView) trmVar.N().findViewById(R.id.fi_settings_redirect_title);
        TextView textView2 = (TextView) trmVar.N().findViewById(R.id.fi_settings_redirect_summary);
        Context contextZ = trmVar.z();
        if (contextZ == null) {
            throw new IllegalStateException("Required value was null.");
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(contextZ.getString(R.string.fi_settings_redirect_summary_home, cpef.a(contextZ)));
        String strA = cpef.a(contextZ);
        strA.getClass();
        URLSpan uRLSpan = new URLSpan() { // from class: com.google.android.apps.messaging.shared.datamodel.etouffee.util.LinkTextUtil$constructWithStyledUrlLink$urlSpan$1
            @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
            public final void onClick(View view) {
                view.getClass();
                super.onClick(view);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                textPaint.getClass();
            }
        };
        int iV = fdgn.V(spannableStringBuilder.toString(), strA);
        int length = strA.length() + iV;
        spannableStringBuilder.setSpan(new ForegroundColorSpan(cpds.a(contextZ, android.R.attr.textColorLink)), iV, length, 17);
        spannableStringBuilder.setSpan(new TypefaceSpan("sans-serif"), iV, length, 17);
        spannableStringBuilder.setSpan(uRLSpan, iV, length, 17);
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: tro
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                trq trqVar2 = trqVar;
                Context contextZ2 = trqVar2.a.z();
                if (contextZ2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                Intent intentE = ((avmp) trqVar2.f.b()).e(contextZ2);
                intentE.addFlags(VCardConfig.FLAG_APPEND_TYPE_PARAM);
                kxg kxgVar = new kxg(contextZ2);
                kxgVar.d(intentE);
                kxgVar.b();
            }
        });
        materialButton.setText(R.string.fi_settings_redirect_button_home);
        textView.setText(R.string.fi_settings_redirect_title_home);
        textView2.setText(spannableStringBuilder);
    }

    @Override // defpackage.ehay
    public final void a(Throwable th) {
        this.a.g.s("Failed to load data from FiRedirectPageDataService", th);
        c();
    }

    @Override // defpackage.ehay
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        tqk tqkVar = (tqk) obj;
        if (tqkVar == tqk.i || tqkVar == tqk.h) {
            c();
        }
    }
}

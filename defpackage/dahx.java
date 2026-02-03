package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dahx implements adaq {
    private final Context a;
    private final acxz b;
    private final fcsu c;
    private final fcsu d;
    private String e;
    private String f;

    public dahx(Context context, acxz acxzVar, fcsu fcsuVar, fcsu fcsuVar2) {
        context.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.a = context;
        this.b = acxzVar;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = "";
        this.f = "";
    }

    @Override // defpackage.adaq
    public final void b(adao adaoVar, boolean z) {
        adaoVar.getClass();
        CharSequence charSequenceQ = adaoVar.q();
        this.e = charSequenceQ != null ? charSequenceQ.toString() : "";
        String strJ = adaoVar.J();
        this.f = strJ != null ? strJ : "";
        this.b.b(adaoVar, z);
    }

    @Override // defpackage.adaq
    public final void c(View view) {
        dahv dahvVar = new dahv(this);
        acxz acxzVar = this.b;
        acxzVar.b = dahvVar;
        acxzVar.c(view);
        acxzVar.a.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: dahw
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                view2.getClass();
                TextView textView = (TextView) view2;
                textView.setText(this.a.f(textView));
            }
        });
    }

    @Override // defpackage.adaq
    public final void d(adan adanVar, acyx acyxVar) {
        this.b.d(adanVar, acyxVar);
    }

    @Override // defpackage.adaq
    public final boolean e(adao adaoVar, adao adaoVar2) {
        adaoVar.getClass();
        adaoVar2.getClass();
        return (fdbq.f(adaoVar2.k().K(), adaoVar.k().K()) && fdbq.f(adaoVar2.J(), adaoVar.J()) && fdbq.f(adaoVar2.g(), adaoVar.g())) ? false : true;
    }

    public final CharSequence f(TextView textView) throws Resources.NotFoundException {
        if (this.f.length() > 0) {
            return ((axjx) this.c.b()).c(null, this.e, this.f, textView);
        }
        if (textView.getMeasuredWidth() == 0 || this.e.length() == 0 || textView.getPaint().measureText(this.e) <= textView.getMeasuredWidth()) {
            return this.e;
        }
        Resources resources = this.a.getResources();
        resources.getClass();
        cssf cssfVar = (cssf) this.d.b();
        String str = this.e;
        TextPaint paint = textView.getPaint();
        int measuredWidth = textView.getMeasuredWidth();
        resources.getString(R.string.and_n_more);
        String strF = cssfVar.f(str, paint, measuredWidth, R.plurals.and_n_more_plural);
        strF.getClass();
        return strF;
    }

    @Override // defpackage.adaq
    public final /* synthetic */ adao a(adao adaoVar) {
        return adaoVar;
    }
}

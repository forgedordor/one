package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acyk implements adaq {
    public daia a;
    private final Context b;
    private TextView c;
    private cpdw d;
    private final eygg e;
    private final fcsu f;

    public acyk(Context context, eygg eyggVar, fcsu fcsuVar) {
        this.b = context;
        this.e = eyggVar;
        this.f = fcsuVar;
    }

    @Override // defpackage.adaq
    public final void b(adao adaoVar, boolean z) {
        CharSequence charSequenceN;
        daia daiaVar = this.a;
        if (daiaVar != null) {
            daib daibVar = daiaVar.a;
            charSequenceN = daibVar.e.length() == 0 ? daibVar.b : ((axjx) daibVar.a.b()).c(daibVar.c, daibVar.d, daibVar.e, null);
        } else {
            charSequenceN = adaoVar.N();
        }
        this.d.g(adaoVar.c());
        if (adaoVar.c() == 0) {
            TextView textView = (TextView) this.d.b();
            this.c = textView;
            textView.setText(charSequenceN);
            TextView textView2 = this.c;
            textView2.setTextColor(eehg.b(textView2, true != adaoVar.ab() ? R.attr.colorOnSurface : R.attr.colorOnSurfaceVariant));
            this.c.setTypeface(adaoVar.i());
        }
    }

    @Override // defpackage.adaq
    public final void c(View view) {
        this.d = new cpdw(view, R.id.conversation_subject, R.id.conversation_subject, R.layout.conversation_subject_view);
    }

    @Override // defpackage.adaq
    public final void d(adan adanVar, acyx acyxVar) {
        Context context = this.b;
        Resources resources = context.getResources();
        int iG = acyxVar.g();
        String strI = acyxVar.ai() ? acyxVar.I() : ((cmvy) this.e.b()).c(resources, acyxVar.W());
        boolean z = iG == 130;
        if (!z && TextUtils.isEmpty(strI)) {
            adanVar.n(8);
            return;
        }
        boolean zC = acxp.c(acyxVar);
        adanVar.n(0);
        adaj adajVar = (adaj) adanVar;
        adajVar.g = resources.getString(true != z ? R.string.subject_with_label : R.string.subject_with_urgent_label, ejwk.b(strI));
        adajVar.k = zC ? cpdu.e(context) : cpdu.d(context);
        CharSequence charSequenceConcat = z ? TextUtils.concat(resources.getString(R.string.urgent_snippet), " ") : resources.getString(R.string.subject_label);
        adajVar.h = strI;
        adajVar.i = charSequenceConcat.toString();
    }

    @Override // defpackage.adaq
    public final boolean e(adao adaoVar, adao adaoVar2) {
        if (!TextUtils.equals(adaoVar2.N(), adaoVar.N()) || !Objects.equals(adaoVar2.i(), adaoVar.i())) {
            return true;
        }
        return false;
    }

    @Override // defpackage.adaq
    public final /* synthetic */ adao a(adao adaoVar) {
        return adaoVar;
    }
}

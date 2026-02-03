package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acyo implements adaq {
    private final Context a;
    private final cogw b;
    private final Resources c;
    private final cqjk d;
    private final fcsu e;
    private TextView f;
    private final arpr g;

    public acyo(Context context, cogw cogwVar, cqjk cqjkVar, fcsu fcsuVar, arpr arprVar) {
        this.a = context;
        this.b = cogwVar;
        this.c = context.getResources();
        this.d = cqjkVar;
        this.e = fcsuVar;
        this.g = arprVar;
    }

    private final void f(adan adanVar, acyx acyxVar) {
        fcsu fcsuVar = this.e;
        boolean z = !acyxVar.ad() && acyxVar.ah();
        adaj adajVar = (adaj) adanVar;
        adajVar.b = cpdu.e(this.a);
        akbl akblVarT = acyxVar.t();
        akbl akblVar = akbl.c;
        int i = R.attr.colorOnSurfaceVariant;
        if (akblVarT != akblVar && !z) {
            i = R.attr.colorOnSurface;
        }
        adajVar.t = Integer.valueOf(i);
        boolean zC = acxp.c(acyxVar);
        if (acyxVar.ai()) {
            adajVar.a = this.c.getString(R.string.draft_indicator_with_space);
            adajVar.c = Integer.valueOf(true != zC ? 3 : 2);
        } else {
            adajVar.a = this.d.a(acyxVar.o()).toString();
            adajVar.c = Integer.valueOf((acyxVar.t() == akblVar || zC) ? 0 : 1);
        }
    }

    @Override // defpackage.adaq
    public final adao a(adao adaoVar) {
        if (Math.abs(this.b.f().toEpochMilli() - adaoVar.k().o()) > 3600000) {
            return adaoVar;
        }
        adan adanVarM = adaoVar.m();
        f(adanVarM, adaoVar.k());
        return adanVarM.a();
    }

    @Override // defpackage.adaq
    public final void b(adao adaoVar, boolean z) {
        if (adaoVar.Q() == null) {
            this.f.setVisibility(8);
            return;
        }
        this.f.setVisibility(0);
        this.f.setText(adaoVar.Q());
        TextView textView = this.f;
        Typeface typefaceJ = adaoVar.j();
        Integer numA = adaoVar.A();
        numA.getClass();
        textView.setTypeface(typefaceJ, numA.intValue());
        TextView textView2 = this.f;
        Integer numZ = adaoVar.z();
        numZ.getClass();
        textView2.setTextColor(eehg.b(textView2, numZ.intValue()));
        acxr.a(this.f, adaoVar, this.g.a());
    }

    @Override // defpackage.adaq
    public final void c(View view) {
        this.f = (TextView) view.findViewById(R.id.conversation_timestamp);
    }

    @Override // defpackage.adaq
    public final void d(adan adanVar, acyx acyxVar) {
        f(adanVar, acyxVar);
    }

    @Override // defpackage.adaq
    public final boolean e(adao adaoVar, adao adaoVar2) {
        boolean zEquals = TextUtils.equals(adaoVar2.Q(), adaoVar.Q());
        adaoVar2.ah();
        adaoVar.ah();
        boolean zEquals2 = Objects.equals(null, null);
        boolean zAb = adaoVar.ab();
        boolean zAb2 = adaoVar2.ab();
        return (zEquals && zEquals2 && zAb == zAb2 && !(this.g.a() && adaoVar.b() != adaoVar2.b())) ? false : true;
    }
}

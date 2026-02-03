package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acxz implements adaq {
    public TextView a;
    public dahv b;
    private final Context c;
    private final fcsu d;
    private final fcsu e;
    private final arpr f;

    public acxz(Context context, fcsu fcsuVar, fcsu fcsuVar2, arpr arprVar) {
        this.c = context;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = arprVar;
    }

    private final String f(acyx acyxVar) {
        if (((aptm) this.e.b()).a()) {
            if (g(acyxVar) && bvdi.b(acyxVar.a())) {
                return this.c.getString(R.string.unapproved_rcs_group);
            }
        } else if (acyxVar.t() == akbl.c && bvdi.b(acyxVar.a())) {
            return this.c.getString(R.string.unapproved_rcs_group);
        }
        String strK = acyxVar.K();
        if (strK == null) {
            return null;
        }
        return cssf.a(strK);
    }

    private static boolean g(acyx acyxVar) {
        return acyxVar.t() == akbl.c && cdmm.d(acyxVar.s().a);
    }

    @Override // defpackage.adaq
    public final void b(adao adaoVar, boolean z) {
        CharSequence charSequenceQ = adaoVar.q();
        dahv dahvVar = this.b;
        if (dahvVar != null) {
            charSequenceQ = dahvVar.a.f(this.a);
        }
        this.a.setText(charSequenceQ);
        this.a.setTypeface(adaoVar.g());
        acxr.a(this.a, adaoVar, this.f.a());
        this.a.setEllipsize(TextUtils.TruncateAt.END);
    }

    @Override // defpackage.adaq
    public final void c(View view) {
        this.a = (TextView) view.findViewById(R.id.conversation_name);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    @Override // defpackage.adaq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.adan r6, defpackage.acyx r7) {
        /*
            r5 = this;
            boolean r0 = defpackage.acxp.c(r7)
            fcsu r1 = r5.d
            java.lang.Object r1 = r1.b()
            apux r1 = (defpackage.apux) r1
            fcsu r1 = r5.e
            java.lang.Object r1 = r1.b()
            aptm r1 = (defpackage.aptm) r1
            boolean r1 = r1.a()
            if (r1 == 0) goto L27
            boolean r1 = g(r7)
            if (r1 == 0) goto L36
            android.content.Context r0 = r5.c
            android.graphics.Typeface r0 = defpackage.cpdu.d(r0)
            goto L45
        L27:
            akbl r1 = r7.t()
            akbl r2 = defpackage.akbl.c
            if (r1 != r2) goto L36
            android.content.Context r0 = r5.c
            android.graphics.Typeface r0 = defpackage.cpdu.d(r0)
            goto L45
        L36:
            if (r0 == 0) goto L3f
            android.content.Context r0 = r5.c
            android.graphics.Typeface r0 = defpackage.cpdu.e(r0)
            goto L45
        L3f:
            android.content.Context r0 = r5.c
            android.graphics.Typeface r0 = defpackage.cpdu.d(r0)
        L45:
            adaj r6 = (defpackage.adaj) r6
            r6.j = r0
            boolean r0 = r7.an()
            if (r0 == 0) goto Lbc
            java.lang.String r0 = r5.f(r7)
            java.lang.String r7 = r7.N()
            r7.getClass()
            java.lang.String r7 = defpackage.chsk.a(r7)
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 != 0) goto Lb9
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L6b
            goto Lb9
        L6b:
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = " "
            r3.append(r2)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r1.<init>(r7)
            android.content.Context r7 = r5.c
            android.text.style.ForegroundColorSpan r2 = new android.text.style.ForegroundColorSpan
            r3 = 2130969262(0x7f0402ae, float:1.75472E38)
            java.lang.String r4 = "NameViewPart"
            int r7 = defpackage.eehg.d(r7, r3, r4)
            r2.<init>(r7)
            int r7 = r0.length()
            int r3 = r1.length()
            r4 = 33
            r1.setSpan(r2, r7, r3, r4)
            android.text.style.RelativeSizeSpan r7 = new android.text.style.RelativeSizeSpan
            r2 = 1061997773(0x3f4ccccd, float:0.8)
            r7.<init>(r2)
            int r0 = r0.length()
            int r2 = r1.length()
            r1.setSpan(r7, r0, r2, r4)
            r0 = r1
        Lb9:
            r6.A = r0
            return
        Lbc:
            java.lang.String r7 = r5.f(r7)
            r6.A = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acxz.d(adan, acyx):void");
    }

    @Override // defpackage.adaq
    public final boolean e(adao adaoVar, adao adaoVar2) {
        if (TextUtils.equals(adaoVar2.k().K(), adaoVar.k().K()) && Objects.equals(adaoVar2.g(), adaoVar.g()) && TextUtils.equals(adaoVar2.k().N(), adaoVar.k().N()) && TextUtils.equals(adaoVar2.k().L(), adaoVar.k().L())) {
            return (this.f.a() && adaoVar.b() != adaoVar2.b()) || !TextUtils.equals(adaoVar2.k().M(), adaoVar.k().M());
        }
        return true;
    }

    @Override // defpackage.adaq
    public final /* synthetic */ adao a(adao adaoVar) {
        return adaoVar;
    }
}

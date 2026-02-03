package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acyh implements adaq {
    public TextView a;
    private final bajh b;
    private final Context c;
    private final cssf d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private final fcsu j;
    private final fcsu k;
    private final fcsu l;
    private final fcsu m;
    private final fcsu n;
    private boolean o = false;
    private final arpr p;

    public acyh(Context context, bajh bajhVar, cssf cssfVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, arpr arprVar) {
        this.c = context;
        this.b = bajhVar;
        this.d = cssfVar;
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.h = fcsuVar4;
        this.i = fcsuVar5;
        this.j = fcsuVar6;
        this.k = fcsuVar7;
        this.m = fcsuVar8;
        this.n = fcsuVar9;
        this.l = fcsuVar10;
        this.p = arprVar;
    }

    private static void f(adan adanVar, String str, String str2, String str3) {
        adaj adajVar = (adaj) adanVar;
        adajVar.f = str;
        adajVar.E = str2;
        adajVar.D = str3;
    }

    private static void g(TextView textView, boolean z, int i, int i2) {
        if (true != z) {
            i = i2;
        }
        textView.setTextColor(eehg.b(textView, i));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0100  */
    @Override // defpackage.adaq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.adao r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acyh.b(adao, boolean):void");
    }

    @Override // defpackage.adaq
    public final void c(View view) {
        this.a = (TextView) view.findViewById(R.id.conversation_snippet);
    }

    @Override // defpackage.adaq
    public final void d(adan adanVar, acyx acyxVar) throws Resources.NotFoundException {
        String string;
        boolean z;
        boolean z2;
        Context context = this.c;
        Resources resources = context.getResources();
        String strH = acyxVar.ai() ? acyxVar.H() : acyxVar.i() == 210 ? resources.getString(R.string.conversation_list_snippet_link) : (((arvu) this.m.b()).a() && byed.d(acyxVar.i())) ? resources.getString(R.string.conversation_list_snippet_deleted_message) : acyxVar.V();
        String strG = acyxVar.ai() ? acyxVar.G() : acyxVar.R();
        boolean zC = acxp.c(acyxVar);
        fcsu fcsuVar = this.m;
        adanVar.o((!((arvu) fcsuVar.b()).a() ? acyxVar.ai() : acyxVar.ai() || byed.d(acyxVar.i())) ? 0 : 2);
        adaj adajVar = (adaj) adanVar;
        adajVar.e = zC ? 1 : ((asgt) this.l.b()).a() ? 2 : 3;
        adajVar.L |= 2;
        adajVar.u = acyxVar.ai() && this.d.e();
        adajVar.L |= 2048;
        adajVar.l = zC ? cpdu.e(context) : cpdu.d(context);
        int i = acyxVar.i();
        boolean zA = acxp.a(acyxVar);
        String strA = this.b.a(acyxVar.S(), acyxVar.T(), acyxVar.F());
        boolean zB = bvdi.b(acyxVar.a());
        boolean zG = byed.g(i);
        boolean z3 = ((arvu) fcsuVar.b()).a() && byed.d(i);
        if (acyxVar.t().equals(akbl.c)) {
            String string2 = resources.getString(R.string.ask_parent_for_approval_snippet);
            f(adanVar, string2, string2, "");
            adanVar.o(2);
            adajVar.l = cpdu.e(context);
            return;
        }
        if (!TextUtils.isEmpty(strH)) {
            String strA2 = cssf.a(strH);
            if (((bvur) this.f.b()).k() && MessageData.ck(i)) {
                String string3 = resources.getString(((bwfx) this.e.b()).a());
                f(adanVar, string3, string3, "");
                return;
            }
            if (!zA) {
                z2 = false;
            } else if (!zB || strA == null) {
                z2 = true;
            } else {
                if (!zG) {
                    f(adanVar, resources.getString(R.string.snippet, strA, strA2), strA2, resources.getString(R.string.conversation_list_item_view_sent_from_other_prefix, strA));
                    return;
                }
                z2 = true;
            }
            if ((i == 0 || z2 || z3) && !acyxVar.ai()) {
                f(adanVar, strA2, strA2, "");
                return;
            } else {
                f(adanVar, resources.getString(R.string.snippet_from_you, strA2), strA2, resources.getString(R.string.conversation_list_item_view_sent_from_you_prefix));
                return;
            }
        }
        if (acyxVar.h() == 4) {
            String string4 = resources.getString(R.string.lighter_empty_snippet_v3, acyxVar.K());
            f(adanVar, string4, string4, "");
            return;
        }
        if (strG == null) {
            if (TextUtils.isEmpty(strH)) {
                adanVar.o(2);
                String string5 = bajh.e(acyxVar.i()) ? context.getString(R.string.mms_pending_download_default_snippet) : context.getString(R.string.no_message_preview_default_snippet);
                f(adanVar, string5, string5, "");
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(acyxVar.X()) || acyxVar.u() != aonp.VMT_STATUS_COMPLETE) {
            if (acyxVar.E() != null) {
                strG = acyxVar.E();
            }
            if (acyxVar.ai()) {
                strG = acyxVar.G();
            }
            string = resources.getString(csru.a(strG));
        } else {
            string = acyxVar.X();
            string.getClass();
            ((ains) this.g.b()).c("Bugle.Vmt.TranscriptSnippet.Show.Count");
        }
        if (!zA) {
            z = false;
        } else {
            if (zB && strA != null && !zG) {
                f(adanVar, resources.getString(R.string.snippet, strA, string), string, resources.getString(R.string.conversation_list_item_view_sent_from_other_prefix, strA));
                return;
            }
            z = true;
        }
        if ((i == 0 || z) && !acyxVar.ai()) {
            f(adanVar, string, string, "");
        } else {
            f(adanVar, resources.getString(R.string.snippet_from_you, string), string, resources.getString(R.string.conversation_list_item_view_sent_from_you_prefix));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    @Override // defpackage.adaq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(defpackage.adao r5, defpackage.adao r6) {
        /*
            r4 = this;
            java.lang.String r0 = r6.K()
            java.lang.String r1 = r5.K()
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            r1 = 1
            if (r0 == 0) goto Lf8
            android.graphics.Typeface r0 = r6.h()
            android.graphics.Typeface r2 = r5.h()
            boolean r0 = j$.util.Objects.equals(r0, r2)
            if (r0 == 0) goto Lf8
            int r0 = r6.d()
            int r2 = r5.d()
            if (r0 != r2) goto Lf8
            ekhx r0 = r6.o()
            ekhx r2 = r5.o()
            boolean r0 = j$.util.Objects.equals(r0, r2)
            if (r0 == 0) goto Lf8
            arpr r0 = r4.p
            boolean r0 = r0.a()
            if (r0 == 0) goto L47
            int r0 = r5.b()
            int r2 = r6.b()
            if (r0 != r2) goto Lf8
        L47:
            fcsu r0 = r4.j
            java.lang.Object r0 = r0.b()
            apux r0 = (defpackage.apux) r0
            java.lang.String r0 = r6.F()
            java.lang.String r2 = r5.F()
            boolean r0 = j$.util.Objects.equals(r0, r2)
            if (r0 == 0) goto Lf8
            fcsu r0 = r4.k
            java.lang.Object r0 = r0.b()
            apwp r0 = (defpackage.apwp) r0
            boolean r0 = r0.a()
            if (r0 == 0) goto L8c
            java.lang.Boolean r0 = r6.p()
            java.lang.Boolean r2 = r5.p()
            boolean r0 = j$.util.Objects.equals(r0, r2)
            if (r0 == 0) goto Lf8
            java.lang.Boolean r0 = r6.p()
            if (r0 == 0) goto L8c
            java.lang.Boolean r0 = r6.p()
            r0.getClass()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lf8
        L8c:
            boolean r0 = defpackage.crxi.a()
            r2 = 0
            if (r0 == 0) goto La2
            fcsu r0 = r4.i
            java.lang.Object r0 = r0.b()
            cmdp r0 = (defpackage.cmdp) r0
            boolean r0 = r0.a()
            if (r0 == 0) goto Lf7
            goto Lb1
        La2:
            java.lang.Boolean r0 = defpackage.cmde.a()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lf7
            boolean r0 = defpackage.craf.i
            if (r0 != 0) goto Lb1
            goto Lf7
        Lb1:
            bbew r5 = r5.n()
            r0 = 2
            if (r5 == 0) goto Ld2
            j$.util.Optional r3 = r5.b()
            boolean r3 = r3.isPresent()
            if (r3 == 0) goto Ld2
            j$.util.Optional r5 = r5.b()
            java.lang.Object r5 = r5.get()
            ezds r5 = (defpackage.ezds) r5
            int r5 = r5.c
            if (r5 != r0) goto Ld2
            r5 = r1
            goto Ld3
        Ld2:
            r5 = r2
        Ld3:
            bbew r6 = r6.n()
            if (r6 == 0) goto Lf3
            j$.util.Optional r3 = r6.b()
            boolean r3 = r3.isPresent()
            if (r3 == 0) goto Lf3
            j$.util.Optional r6 = r6.b()
            java.lang.Object r6 = r6.get()
            ezds r6 = (defpackage.ezds) r6
            int r6 = r6.c
            if (r6 != r0) goto Lf3
            r6 = r1
            goto Lf4
        Lf3:
            r6 = r2
        Lf4:
            if (r5 == r6) goto Lf7
            goto Lf8
        Lf7:
            return r2
        Lf8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acyh.e(adao, adao):boolean");
    }

    @Override // defpackage.adaq
    public final /* synthetic */ adao a(adao adaoVar) {
        return adaoVar;
    }
}

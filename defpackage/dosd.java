package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.TextAppearanceSpan;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dosd extends dora {
    public dorh ag;
    public fdap ah;
    public dose aj;
    public String ak;
    public String al;
    public boolean am;
    public addy ao;
    public adgp ap;
    public fdae ai = new fdae() { // from class: dori
        @Override // defpackage.fdae
        public final Object invoke() {
            return fctx.a;
        }
    };
    public dorb an = dorb.MEDIA_TYPE_UNKNOWN;

    private final dosh aW() {
        return aZ().c().isChecked() ? dosh.a : dosh.b;
    }

    private final CharSequence bd(fdap fdapVar) {
        dosi dosiVar = new dosi();
        fdapVar.invoke(dosiVar);
        CharSequence[] charSequenceArr = new CharSequence[2];
        String strValueOf = String.valueOf(dosiVar.a);
        eg egVarFg = fg();
        SpannableString spannableStringA = dosf.a(strValueOf.concat("\n"));
        spannableStringA.setSpan(new TextAppearanceSpan(egVarFg, R.style.TextAppearance_GoogleMaterial_Subhead1), 0, spannableStringA.length(), 33);
        charSequenceArr[0] = spannableStringA;
        CharSequence charSequence = dosiVar.b;
        charSequenceArr[1] = charSequence != null ? dosf.a(charSequence) : null;
        CharSequence charSequenceConcat = TextUtils.concat(charSequenceArr);
        charSequenceConcat.getClass();
        return charSequenceConcat;
    }

    @Override // defpackage.ecdv, defpackage.ea
    public View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        super.M(layoutInflater, viewGroup, bundle);
        View viewInflate = layoutInflater.inflate(R.layout.gallery_google_photos_send_type_select_tray, viewGroup, false);
        viewInflate.getClass();
        return viewInflate;
    }

    public final dorh aZ() {
        dorh dorhVar = this.ag;
        if (dorhVar != null) {
            return dorhVar;
        }
        fdbq.c("binding");
        return null;
    }

    @Override // defpackage.ecdv, defpackage.ea
    public void ap(View view, Bundle bundle) throws Resources.NotFoundException {
        int i;
        int i2;
        view.getClass();
        super.ap(view, bundle);
        this.ak = B().getString(R.string.gallery_google_photos_option_tray_type_photos_link_learn_more_link);
        this.ag = new dorh(view);
        RadioButton radioButtonC = aZ().c();
        radioButtonC.setChecked(true);
        radioButtonC.setLinksClickable(true);
        radioButtonC.setMovementMethod(LinkMovementMethod.getInstance());
        final String string = radioButtonC.getResources().getString(R.string.gallery_google_photos_option_tray_type_photos_link_title);
        string.getClass();
        final String string2 = radioButtonC.getResources().getString(R.string.gallery_google_photos_option_tray_type_photos_link_body);
        string2.getClass();
        final String string3 = radioButtonC.getResources().getString(R.string.gallery_google_photos_option_tray_type_photos_link_learn_more);
        string3.getClass();
        radioButtonC.setText(bd(new fdap() { // from class: dorm
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                dosi dosiVar = (dosi) obj;
                dosiVar.getClass();
                dosiVar.a = string;
                CharSequence charSequenceB = dosf.b(string2, " ");
                charSequenceB.getClass();
                String str = this.ak;
                if (str == null) {
                    fdbq.c("learnMoreUrl");
                    str = null;
                }
                String str2 = string3;
                str.getClass();
                SpannableString spannableStringA = dosf.a(str2);
                spannableStringA.setSpan(new URLSpan(str), 0, spannableStringA.length(), 33);
                dosiVar.b = dosf.b(charSequenceB, spannableStringA);
                return fctx.a;
            }
        }));
        RadioButton radioButton = (RadioButton) aZ().b.a();
        Resources resources = radioButton.getResources();
        int iOrdinal = this.an.ordinal();
        if (iOrdinal == 0) {
            i = R.string.gallery_google_photos_option_tray_type_attachment_title_unknown;
        } else if (iOrdinal == 1) {
            i = R.string.gallery_google_photos_option_tray_type_attachment_title_video;
        } else {
            if (iOrdinal != 2) {
                throw new fctg();
            }
            i = R.string.gallery_google_photos_option_tray_type_attachment_title_image;
        }
        final String string4 = resources.getString(i);
        string4.getClass();
        Resources resources2 = radioButton.getResources();
        int iOrdinal2 = this.an.ordinal();
        if (iOrdinal2 == 0) {
            i2 = R.string.gallery_google_photos_option_tray_type_attachment_body_unknown;
        } else if (iOrdinal2 == 1) {
            i2 = R.string.gallery_google_photos_option_tray_type_attachment_body_video;
        } else {
            if (iOrdinal2 != 2) {
                throw new fctg();
            }
            i2 = R.string.gallery_google_photos_option_tray_type_attachment_body_image;
        }
        final String string5 = resources2.getString(i2);
        string5.getClass();
        radioButton.setText(bd(new fdap() { // from class: dorq
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                dosi dosiVar = (dosi) obj;
                dosiVar.getClass();
                dosiVar.a = string4;
                dosiVar.b = string5;
                return fctx.a;
            }
        }));
        if (!this.am) {
            hh();
        } else {
            be();
            fdil.d(lvk.a(this), null, null, new doru(this, null), 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0081, code lost:
    
        if (defpackage.fctx.a == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008e, code lost:
    
        if (r10.a(r11, r0) != r1) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object bc(defpackage.fdat r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.dort
            if (r0 == 0) goto L13
            r0 = r11
            dort r0 = (defpackage.dort) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dort r0 = new dort
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            java.lang.String r3 = "accountSignIn"
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L45
            if (r2 == r6) goto L39
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            goto L35
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            defpackage.fctl.b(r11)
            goto L91
        L39:
            dosh r10 = r0.e
            java.lang.Object r2 = r0.a
            defpackage.fctl.b(r11)
            r8 = r11
            r11 = r10
            r10 = r2
            r2 = r8
            goto L64
        L45:
            defpackage.fctl.b(r11)
            dosh r11 = r9.aW()
            dosh r2 = defpackage.dosh.a
            if (r11 != r2) goto L84
            addy r2 = r9.ao
            if (r2 != 0) goto L58
            defpackage.fdbq.c(r3)
            r2 = r7
        L58:
            r0.a = r10
            r0.e = r11
            r0.d = r6
            java.lang.Object r2 = r2.a(r0)
            if (r2 == r1) goto L90
        L64:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L84
            addy r10 = r9.ao
            if (r10 != 0) goto L74
            defpackage.fdbq.c(r3)
            r10 = r7
        L74:
            r0.a = r7
            r0.e = r7
            r0.d = r5
            abxm r10 = r10.a
            r10.a()
            fctx r10 = defpackage.fctx.a
            if (r10 != r1) goto L91
            goto L90
        L84:
            r0.a = r7
            r0.e = r7
            r0.d = r4
            java.lang.Object r10 = r10.a(r11, r0)
            if (r10 != r1) goto L91
        L90:
            return r1
        L91:
            fctx r10 = defpackage.fctx.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dosd.bc(fdat, fcxy):java.lang.Object");
    }

    public final void be() {
        fdil.d(lvk.a(this), null, null, new dorv(this, null), 3);
    }

    public final boolean bj() {
        return aW() == dosh.a;
    }

    public final adgp bk() {
        adgp adgpVar = this.ap;
        if (adgpVar != null) {
            return adgpVar;
        }
        fdbq.c("logger");
        return null;
    }

    @Override // defpackage.eefb, defpackage.kc, defpackage.dn
    public final Dialog gK(Bundle bundle) {
        Dialog dialogGK = super.gK(bundle);
        final eefa eefaVar = (eefa) dialogGK;
        eefaVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: dorj
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                eefa eefaVar2 = eefaVar;
                eefaVar2.a().D(eefaVar2.a().t());
            }
        });
        return dialogGK;
    }

    @Override // defpackage.dn, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        this.ai.invoke();
    }
}

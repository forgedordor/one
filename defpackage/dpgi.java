package defpackage;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.EditText;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpgi {
    public static final ShapeDrawable a(jyq jyqVar, kio kioVar, int i) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setColor(ijg.b(jyqVar.f()));
        shapeDrawable.setIntrinsicHeight(i);
        shapeDrawable.setIntrinsicWidth(Integer.valueOf(kioVar.ep(2.0f)).intValue());
        shapeDrawable.setBounds(0, 0, shapeDrawable.getIntrinsicWidth(), i);
        return shapeDrawable;
    }

    public static final void b(dpfy dpfyVar, final Void[] voidArr, final CharSequence charSequence, final ics icsVar, final jyq jyqVar, final fae faeVar, final fad fadVar, final float f, final float f2, final float f3, final Integer num, final Integer num2, final boolean z, final boolean z2, final dpgj dpgjVar, boolean z3, final boolean z4, hml hmlVar, final int i, final int i2) {
        int i3;
        boolean z5;
        int i4;
        int i5;
        int i6;
        boolean z6;
        ShapeDrawable shapeDrawable;
        int i7;
        hml hmlVar2;
        Object obj;
        boolean z7;
        boolean z8;
        hmw hmwVar;
        hml hmlVar3;
        final boolean z9;
        final dpfy dpfyVar2 = dpfyVar;
        int i8 = i & 6;
        hml hmlVarC = hmlVar.c(398758919);
        if (i8 == 0) {
            i3 = (true != hmlVarC.D(dpfyVar2) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 384) == 0) {
            i3 |= true != hmlVarC.F(charSequence) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != hmlVarC.D(jyqVar) ? 8192 : 16384;
        }
        if ((i & 196608) == 0) {
            i3 |= true != hmlVarC.D(faeVar) ? 65536 : 131072;
        }
        if ((i & 1572864) == 0) {
            i3 |= true != hmlVarC.D(fadVar) ? 524288 : 1048576;
        }
        if ((i & 12582912) == 0) {
            i3 |= true != hmlVarC.A(f) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((i & 100663296) == 0) {
            z5 = true;
            i3 |= true != hmlVarC.A(f2) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        } else {
            z5 = true;
        }
        if ((i & 805306368) == 0) {
            i3 |= z5 != hmlVarC.A(f3) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if ((i2 & 6) == 0) {
            i4 = i3;
            i5 = (true != hmlVarC.D(num) ? 2 : 4) | i2;
        } else {
            i4 = i3;
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= true != hmlVarC.D(num2) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i5 |= true == hmlVarC.E(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i6 = i5 | (true == hmlVarC.E(z2) ? 2048 : 1024);
        } else {
            i6 = i5;
        }
        if ((i2 & 24576) == 0) {
            i6 |= true != hmlVarC.D(dpgjVar) ? 8192 : 16384;
        }
        if ((i2 & 196608) == 0) {
            z6 = true;
            i6 |= true != hmlVarC.D(null) ? 65536 : 131072;
        } else {
            z6 = true;
        }
        if ((i2 & 1572864) == 0) {
            i6 |= z6 != hmlVarC.A(0.0f) ? 524288 : 1048576;
        }
        if ((i2 & 12582912) == 0) {
            i6 |= z6 != hmlVarC.E(z3) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((i2 & 100663296) == 0) {
            i6 |= z6 != hmlVarC.E(z4) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        int i9 = i6;
        hmlVarC.u(955235518, 0);
        int i10 = i4 | (true != hmlVarC.B(0) ? 0 : 32);
        hmw hmwVar2 = (hmw) hmlVarC;
        hmwVar2.ab();
        if ((i10 & 112) == 0) {
            i10 |= 16;
        }
        int i11 = i10;
        if ((i10 & 306783363) == 306783362 && (38347923 & i9) == 38347922 && hmlVarC.I()) {
            hmlVarC.s();
            z9 = z3;
            hmlVar3 = hmlVarC;
        } else {
            int i12 = i11 & 57344;
            final kio kioVar = (kio) hmlVarC.e(jmh.e);
            final kbi kbiVar = (kbi) hmlVarC.e(jmh.g);
            final kji kjiVar = (kji) hmlVarC.e(jmh.j);
            hmlVarC.v(1849434622);
            Object objS = hmwVar2.S();
            Object obj2 = hmk.a;
            if (objS == obj2) {
                objS = new jfw();
                hmwVar2.af(objS);
            }
            final jfw jfwVar = (jfw) objS;
            hmwVar2.ab();
            hmlVarC.v(955280629);
            if (z4) {
                hmlVarC.v(1849434622);
                Object objS2 = hmwVar2.S();
                if (objS2 == obj2) {
                    dpfq dpfqVar = (dpfq) jfwVar.a;
                    objS2 = a(jyqVar, kioVar, dpfqVar != null ? dpfqVar.getHeight() : 0);
                    hmwVar2.af(objS2);
                }
                shapeDrawable = (ShapeDrawable) objS2;
                hmwVar2.ab();
            } else {
                shapeDrawable = null;
            }
            hmwVar2.ab();
            hmlVarC.v(955285331);
            if (z4) {
                ije ijeVar = new ije(jyqVar.f());
                hmlVarC.v(-1746271574);
                boolean zF = hmlVarC.F(shapeDrawable) | (i12 == 16384) | hmlVarC.F(jfwVar);
                Object objS3 = hmwVar2.S();
                if (zF || objS3 == obj2) {
                    objS3 = new dpgf(shapeDrawable, jyqVar, jfwVar, null);
                    hmwVar2.af(objS3);
                }
                hmwVar2.ab();
                hob.g(ijeVar, (fdat) objS3, hmlVarC);
            }
            hmwVar2.ab();
            hmlVarC.v(-1746271574);
            boolean zF2 = hmlVarC.F(kbiVar);
            boolean z10 = (i9 & 7168) == 2048;
            boolean zF3 = zF2 | z10 | hmlVarC.F(charSequence);
            Object objS4 = hmwVar2.S();
            if (zF3 || objS4 == obj2) {
                objS4 = new fdap() { // from class: dpfz
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        Context context = (Context) obj3;
                        context.getClass();
                        dpfq dpfqVar2 = new dpfq(context, kbiVar);
                        dpfqVar2.p = z2;
                        dpfqVar2.setText(charSequence);
                        dpfqVar2.setSelection(dpfqVar2.length());
                        dpfqVar2.setId(R.id.compose_message_text);
                        dpfqVar2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        dpfqVar2.setGravity(16);
                        dpfqVar2.requestFocus();
                        return dpfqVar2;
                    }
                };
                hmwVar2.af(objS4);
            }
            fdap fdapVar = (fdap) objS4;
            hmwVar2.ab();
            ics icsVarF = egq.f(icsVar, f2, f3);
            hmlVarC.v(-1633490746);
            boolean z11 = (458752 & i9) == 131072;
            boolean zF4 = hmlVarC.F(jfwVar) | z11;
            boolean z12 = z11;
            Object objS5 = hmwVar2.S();
            if (zF4 || objS5 == obj2) {
                objS5 = new fdap() { // from class: dpga
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        dpfq dpfqVar2;
                        igx igxVar = (igx) obj3;
                        igxVar.getClass();
                        if (igxVar.b() && fdbq.f(null, true) && (dpfqVar2 = (dpfq) jfwVar.a) != null) {
                            dpfqVar2.performClick();
                            dpfqVar2.performAccessibilityAction(16, Bundle.EMPTY);
                        }
                        return fctx.a;
                    }
                };
                hmwVar2.af(objS5);
            }
            hmwVar2.ab();
            ics icsVarA = ifo.a(icsVarF, (fdap) objS5);
            icsVarA.getClass();
            jfwVar.getClass();
            ics icsVarA2 = dme.a(jsh.c(icsVarA, true, new fdap() { // from class: dpem
                @Override // defpackage.fdap
                public final Object invoke(Object obj3) {
                    long jA;
                    jto jtoVar = (jto) obj3;
                    jtoVar.getClass();
                    jtk.v(jtoVar, new juo((String) charSequence));
                    final jfw jfwVar2 = jfwVar;
                    jtoVar.e(jsa.j, new jrn(null, new fdap() { // from class: dpei
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj4) {
                            juo juoVar = (juo) obj4;
                            juoVar.getClass();
                            EditText editText = (EditText) jfwVar2.a;
                            if (editText != null) {
                                editText.setText(juoVar.b);
                            }
                            return true;
                        }
                    }));
                    jtoVar.e(jsa.v, new jrn(null, new fdae() { // from class: dpej
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            EditText editText = (EditText) jfwVar2.a;
                            boolean z13 = false;
                            if (editText != null && editText.requestFocus()) {
                                z13 = true;
                            }
                            return Boolean.valueOf(z13);
                        }
                    }));
                    jtoVar.e(jsa.n, new jrn(null, new fdap() { // from class: dpek
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj4) {
                            boolean z13;
                            juo juoVar = (juo) obj4;
                            juoVar.getClass();
                            EditText editText = (EditText) jfwVar2.a;
                            if (editText != null) {
                                int selectionStart = editText.getSelectionStart();
                                editText.getText().replace(selectionStart, editText.getSelectionEnd(), juoVar);
                                editText.setSelection(fddu.g(selectionStart + juoVar.a(), editText.length()));
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            return Boolean.valueOf(z13);
                        }
                    }));
                    EditText editText = (EditText) jfwVar2.a;
                    if (editText != null) {
                        jA = jyp.a(editText.getSelectionStart(), editText.getSelectionEnd());
                        long j = jyo.a;
                    } else {
                        jA = jyp.a(0, 0);
                        long j2 = jyo.a;
                    }
                    jtk.w(jtoVar, jA);
                    jtoVar.e(jsa.i, new jrn(null, new fdau() { // from class: dpel
                        @Override // defpackage.fdau
                        public final Object a(Object obj4, Object obj5, Object obj6) {
                            int iIntValue = ((Integer) obj4).intValue();
                            int iIntValue2 = ((Integer) obj5).intValue();
                            ((Boolean) obj6).booleanValue();
                            EditText editText2 = (EditText) jfwVar2.a;
                            boolean z13 = false;
                            if (editText2 != null && editText2.isEnabled() && iIntValue >= 0 && iIntValue2 <= editText2.length()) {
                                editText2.setSelection(iIntValue, iIntValue2);
                                z13 = true;
                            }
                            return Boolean.valueOf(z13);
                        }
                    }));
                    return fctx.a;
                }
            }), true, null);
            hmlVarC.v(-1746271574);
            boolean zF5 = hmlVarC.F(jfwVar) | hmlVarC.D(kioVar);
            boolean z13 = (i9 & 3670016) == 1048576;
            Object objS6 = hmwVar2.S();
            if ((zF5 | z13) || objS6 == obj2) {
                objS6 = new fdap() { // from class: dpgb
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        kjg kjgVar = (kjg) obj3;
                        dpfq dpfqVar2 = (dpfq) jfwVar.a;
                        if (dpfqVar2 != null) {
                            dpfqVar2.setImportantForAccessibility(((int) (kjgVar.a & 4294967295L)) == kioVar.ep(0.0f) ? 2 : 1);
                        }
                        return fctx.a;
                    }
                };
                hmwVar2.af(objS6);
            }
            hmwVar2.ab();
            ics icsVarA3 = iye.a(icsVarA2, (fdap) objS6);
            hmlVarC.v(-1224400529);
            boolean zF6 = hmlVarC.F(jfwVar) | hmlVarC.D(kioVar);
            boolean z14 = i12 == 16384;
            boolean zB = ((i11 & 3670016) == 1048576) | zF6 | z14 | ((i11 & 458752) == 131072) | hmlVarC.B(kjiVar.ordinal());
            boolean z15 = (i11 & 29360128) == 8388608;
            boolean z16 = (i11 & 234881024) == 67108864;
            boolean z17 = (i11 & 1879048192) == 536870912;
            boolean z18 = (i9 & 112) == 32;
            boolean z19 = (i9 & 896) == 256;
            boolean zF7 = ((234881024 & i9) == 67108864) | zB | z15 | z16 | z17 | z18 | z19 | z10 | ((57344 & i9) == 16384) | z12 | hmlVarC.F(shapeDrawable);
            boolean z20 = (i11 & 14) == 4;
            boolean z21 = (i9 & 14) == 4;
            Object objS7 = hmwVar2.S();
            if (((zF7 | z20) || z21) || objS7 == obj2) {
                i7 = i9;
                hmlVar2 = hmlVarC;
                obj = obj2;
                final ShapeDrawable shapeDrawable2 = shapeDrawable;
                z7 = false;
                z8 = true;
                dpfyVar2 = dpfyVar;
                fdap fdapVar2 = new fdap() { // from class: dpgc
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        dpfq dpfqVar2 = (dpfq) obj3;
                        dpfqVar2.getClass();
                        jfwVar.a = dpfqVar2;
                        kio kioVar2 = kioVar;
                        kioVar2.getClass();
                        dpfqVar2.e = kioVar2;
                        fdeh[] fdehVarArr = dpfq.a;
                        fdeh fdehVar = fdehVarArr[0];
                        fdcz fdczVar = dpfqVar2.f;
                        jyq jyqVar2 = jyqVar;
                        fdczVar.d(fdehVar, jyqVar2);
                        dpfqVar2.h.d(fdehVarArr[2], faeVar);
                        dpfqVar2.i.d(fdehVarArr[3], fadVar);
                        dpfqVar2.g.d(fdehVarArr[1], kjiVar);
                        dpfqVar2.j.d(fdehVarArr[4], new kir(f));
                        dpfqVar2.k.d(fdehVarArr[5], new kir(f2));
                        dpfqVar2.l.d(fdehVarArr[6], new kir(f3));
                        dpfqVar2.n.d(fdehVarArr[7], num2);
                        dpfqVar2.o = z;
                        dpfqVar2.p = z2;
                        dpfqVar2.q.d(fdehVarArr[8], dpgjVar);
                        dpfqVar2.r.d(fdehVarArr[9], null);
                        if (Build.VERSION.SDK_INT >= 29) {
                            ShapeDrawable shapeDrawableA = shapeDrawable2;
                            boolean z22 = z4;
                            if (dpfqVar2.getWidth() <= 0 || dpfqVar2.getHeight() <= 0) {
                                dpfqVar2.getViewTreeObserver().addOnGlobalLayoutListener(new dpgg(dpfqVar2, dpfqVar2, z22, shapeDrawableA, jyqVar2, kioVar2));
                            } else {
                                dpfqVar2.getWidth();
                                int height = dpfqVar2.getHeight();
                                if (z22) {
                                    shapeDrawableA.getClass();
                                } else {
                                    shapeDrawableA = dpgi.a(jyqVar2, kioVar2, height);
                                }
                                dpfqVar2.setTextCursorDrawable(shapeDrawableA);
                            }
                        }
                        dpfy dpfyVar3 = dpfyVar2;
                        dniu dniuVarE = dpfqVar2.e();
                        dniuVarE.getClass();
                        dpfyVar3.a(new dpfw(dpfqVar2, dniuVarE));
                        dpfqVar2.setMaxLines(dpfqVar2.e().b(false).length() != 0 ? num.intValue() : 1);
                        dpfqVar2.setEllipsize(TextUtils.TruncateAt.END);
                        return fctx.a;
                    }
                };
                jfwVar = jfwVar;
                hmwVar = hmwVar2;
                hmwVar.af(fdapVar2);
                objS7 = fdapVar2;
            } else {
                dpfyVar2 = dpfyVar;
                i7 = i9;
                hmlVar2 = hmlVarC;
                obj = obj2;
                z7 = false;
                z8 = true;
                hmwVar = hmwVar2;
            }
            hmwVar.ab();
            hmlVar3 = hmlVar2;
            kli.b(fdapVar, icsVarA3, (fdap) objS7, hmlVar3, 0, 0);
            fctx fctxVar = fctx.a;
            hmlVar3.v(-1746271574);
            boolean zF8 = z20 | hmlVar3.F(jfwVar);
            boolean z22 = (i7 & 29360128) == 8388608 ? z8 : z7;
            Object objS8 = hmwVar.S();
            if ((zF8 || z22) || objS8 == obj) {
                z9 = z3;
                objS8 = new fdap() { // from class: dpgd
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        ((hny) obj3).getClass();
                        return new dpgh(dpfyVar2, jfwVar, z9);
                    }
                };
                hmwVar.af(objS8);
            } else {
                z9 = z3;
            }
            hmwVar.ab();
            hob.c(fctxVar, (fdap) objS8, hmlVar3);
        }
        hpx hpxVarL = hmlVar3.L();
        if (hpxVarL != null) {
            final boolean z23 = z9;
            final dpfy dpfyVar3 = dpfyVar2;
            hpxVarL.d = new fdat() { // from class: dpge
                @Override // defpackage.fdat
                public final Object a(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    dpfy dpfyVar4 = dpfyVar3;
                    Void[] voidArr2 = voidArr;
                    CharSequence charSequence2 = charSequence;
                    ics icsVar2 = icsVar;
                    jyq jyqVar2 = jyqVar;
                    fae faeVar2 = faeVar;
                    fad fadVar2 = fadVar;
                    float f4 = f;
                    float f5 = f2;
                    float f6 = f3;
                    Integer num3 = num;
                    Integer num4 = num2;
                    boolean z24 = z;
                    boolean z25 = z2;
                    dpgj dpgjVar2 = dpgjVar;
                    boolean z26 = z23;
                    int i13 = i;
                    dpgi.b(dpfyVar4, voidArr2, charSequence2, icsVar2, jyqVar2, faeVar2, fadVar2, f4, f5, f6, num3, num4, z24, z25, dpgjVar2, z26, z4, (hml) obj3, hpy.a(i13 | 1), hpy.a(i2));
                    return fctx.a;
                }
            };
        }
    }
}

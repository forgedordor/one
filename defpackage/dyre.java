package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.chip.Chip;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyre {
    private final TextView a;
    private ejwi b = ejud.a;
    private Iterable c;

    public dyre(TextView textView) {
        int i = ekgb.d;
        this.c = ekoe.a;
        this.a = textView;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void c(final float r5) {
        /*
            r4 = this;
            java.lang.Iterable r0 = r4.c
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 0
            if (r1 == 0) goto L1c
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L11
            goto L2a
        L11:
            boolean r1 = r0 instanceof java.util.List
            if (r1 == 0) goto L1c
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r2 = defpackage.ekis.k(r0)
            goto L2a
        L1c:
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r2 = defpackage.ekjc.f(r0)
        L2a:
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            java.lang.String r2 = (java.lang.String) r2
            if (r0 <= 0) goto L5b
            java.lang.Iterable r0 = r4.c
            int r0 = defpackage.ekis.b(r0)
            r1 = 1
            if (r0 > r1) goto L3b
            goto L5b
        L3b:
            android.widget.TextView r0 = r4.a
            android.text.TextPaint r0 = r0.getPaint()
            java.lang.Iterable r1 = r4.c
            dyrd r3 = new dyrd
            r3.<init>()
            ejwi r5 = defpackage.ekis.c(r1, r3)
            ejwi r0 = defpackage.ejwi.i(r2)
            ejwi r5 = r5.a(r0)
            java.lang.Object r5 = r5.f()
            r2 = r5
            java.lang.String r2 = (java.lang.String) r2
        L5b:
            if (r2 == 0) goto L6b
            android.widget.TextView r5 = r4.a
            java.lang.CharSequence r5 = r5.getText()
            boolean r5 = r2.contentEquals(r5)
            if (r5 != 0) goto L6a
            goto L6b
        L6a:
            return
        L6b:
            android.widget.TextView r5 = r4.a
            r5.setText(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dyre.c(float):void");
    }

    public final void a(ekgb ekgbVar) {
        this.c = ekis.d(ekgbVar, new ejwm() { // from class: dyrc
            @Override // defpackage.ejwm
            public final boolean a(Object obj) {
                return !TextUtils.isEmpty((String) obj);
            }
        });
        if (this.b.g()) {
            c(((Float) this.b.c()).floatValue());
        }
    }

    public final void b(int i) {
        TextView textView = this.a;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
        View view = (View) textView.getParent();
        float paddingLeft = view.getPaddingLeft() + view.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + textView.getPaddingLeft() + textView.getPaddingRight();
        if (textView instanceof Chip) {
            eegx eegxVar = ((Chip) textView).e;
            paddingLeft += (eegxVar != null ? eegxVar.j : 0.0f) + (eegxVar != null ? eegxVar.k : 0.0f);
        }
        float f = i - paddingLeft;
        if (this.b.g() && f == ((Float) this.b.c()).floatValue()) {
            return;
        }
        this.b = ejwi.j(Float.valueOf(f));
        c(f);
    }
}

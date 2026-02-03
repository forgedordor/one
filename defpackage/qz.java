package defpackage;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qz {
    public final lrj a;
    private final TextView b;

    public qz(TextView textView) {
        this.b = textView;
        this.a = new lrj(textView);
    }

    public final void a(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.b.getContext().obtainStyledAttributes(attributeSet, kt.j, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            lrh lrhVar = this.a.a;
            boolean zA = lri.a();
            lrg lrgVar = ((lri) lrhVar).a;
            lrgVar.b = z;
            if (zA) {
                return;
            }
            lrgVar.b();
            TextView textView = lrgVar.a;
            textView.setFilters(lrgVar.c(textView.getFilters()));
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(boolean z) {
        if (lri.a()) {
            return;
        }
        lrj lrjVar = this.a;
        if (z) {
            ((lri) lrjVar.a).a.b();
        }
    }

    public final InputFilter[] c(InputFilter[] inputFilterArr) {
        return lri.a() ? inputFilterArr : ((lri) this.a.a).a.c(inputFilterArr);
    }
}

package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lpe {
    public final lpc a;
    private final TextView b;

    public lpe(TextView textView) {
        this.b = textView;
        this.a = new lpc(textView);
    }

    public final void a() {
        TextView textView = this.b;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (transformationMethod == null || (transformationMethod instanceof PasswordTransformationMethod)) {
            return;
        }
        if (!(transformationMethod instanceof lpi)) {
            transformationMethod = new lpi(transformationMethod);
        }
        textView.setTransformationMethod(transformationMethod);
    }
}

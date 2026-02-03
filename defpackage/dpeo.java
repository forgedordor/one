package defpackage;

import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpeo {
    public static final dpen a(fctc fctcVar) {
        return (dpen) fctcVar.a();
    }

    public static final void b(TextView textView, Integer num) {
        if (num != null) {
            textView.setInputType(num.intValue() | textView.getInputType());
        }
    }
}

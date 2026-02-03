package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rw extends kyw {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ WeakReference c;
    final /* synthetic */ sb d;

    public rw(sb sbVar, int i, int i2, WeakReference weakReference) {
        this.d = sbVar;
        this.a = i;
        this.b = i2;
        this.c = weakReference;
    }

    @Override // defpackage.kyw
    public final void b(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.a) != -1) {
            typeface = Typeface.create(typeface, i, (this.b & 2) != 0);
        }
        sb sbVar = this.d;
        WeakReference weakReference = this.c;
        if (sbVar.c) {
            sbVar.b = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new rx(textView, typeface, sbVar.a));
                } else {
                    sb.f(textView, typeface, sbVar.a);
                }
            }
        }
    }

    @Override // defpackage.kyw
    public final void a(int i) {
    }
}

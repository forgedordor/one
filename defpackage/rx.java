package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rx implements Runnable {
    final /* synthetic */ TextView a;
    final /* synthetic */ Typeface b;
    final /* synthetic */ int c;

    public rx(TextView textView, Typeface typeface, int i) {
        this.a = textView;
        this.b = typeface;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sb.f(this.a, this.b, this.c);
    }
}

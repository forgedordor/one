package defpackage;

import android.text.Spanned;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eulm implements Runnable {
    public final WeakReference a;
    public final euln b;
    public final Spanned c;
    private final euka d;

    public eulm(TextView textView, euln eulnVar, euka eukaVar, Spanned spanned) {
        this.a = new WeakReference(textView);
        this.b = eulnVar;
        this.d = eukaVar;
        this.c = spanned;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eult.b.execute(new eull(this, this.b.a.b.a(this.d)));
    }
}

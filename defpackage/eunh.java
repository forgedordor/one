package defpackage;

import android.text.Spannable;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eunh implements Runnable {
    final /* synthetic */ TextView a;
    final /* synthetic */ String b;
    final /* synthetic */ eund c;
    final /* synthetic */ CharSequence d;
    final /* synthetic */ eunk e;
    final /* synthetic */ int f;
    final /* synthetic */ int g;

    public eunh(TextView textView, String str, eund eundVar, CharSequence charSequence, eunk eunkVar, int i, int i2) {
        this.a = textView;
        this.b = str;
        this.c = eundVar;
        this.d = charSequence;
        this.e = eunkVar;
        this.f = i;
        this.g = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextView textView = this.a;
        if (eunn.f(textView, true) && this.b.equals(textView.getText().toString()) && this.c.i()) {
            ((Spannable) this.d).setSpan(this.e, this.f, this.g, 0);
        }
    }
}

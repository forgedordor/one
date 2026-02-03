package defpackage;

import android.os.Build;
import android.view.ViewTreeObserver;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efud implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ TextView a;
    final /* synthetic */ efue b;

    public efud(efue efueVar, TextView textView) {
        this.a = textView;
        this.b = efueVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        TextView textView = this.a;
        textView.getViewTreeObserver().removeOnPreDrawListener(this);
        int lineCount = textView.getLineCount();
        efue efueVar = this.b;
        if (lineCount <= efueVar.e) {
            return true;
        }
        textView.setTextSize(0, efueVar.c);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setLineHeight(Math.round(efueVar.d + efueVar.c));
        }
        textView.invalidate();
        return false;
    }
}

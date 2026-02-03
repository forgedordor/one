package defpackage;

import android.util.Log;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eull implements Runnable {
    final /* synthetic */ eukb a;
    final /* synthetic */ eulm b;

    public eull(eulm eulmVar, eukb eukbVar) {
        this.a = eukbVar;
        this.b = eulmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eulm eulmVar = this.b;
        TextView textView = (TextView) eulmVar.a.get();
        if (textView == null) {
            return;
        }
        if (textView.getText() != eulmVar.c) {
            Log.d("TextLinks", "Text has changed from the classified text. Ignoring.");
        } else {
            eulmVar.b.b(textView, this.a);
        }
    }
}

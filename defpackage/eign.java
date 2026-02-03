package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eign implements View.OnLongClickListener {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;
    final /* synthetic */ String d;
    final /* synthetic */ View.OnLongClickListener e;
    final /* synthetic */ eigp f;

    public eign(eigp eigpVar, String str, String str2, int i, String str3, View.OnLongClickListener onLongClickListener) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = onLongClickListener;
        this.f = eigpVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        eieh eiehVarC = this.f.c(this.d, this.a, this.b, this.c);
        try {
            boolean zOnLongClick = this.e.onLongClick(view);
            eiehVarC.close();
            return zOnLongClick;
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClickUseDefaultHapticFeedback(View view) {
        return this.e.onLongClickUseDefaultHapticFeedback(view);
    }
}

package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class eigd implements TextView.OnEditorActionListener {
    public final /* synthetic */ eigp a;
    public final /* synthetic */ TextView.OnEditorActionListener b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;

    public /* synthetic */ eigd(eigp eigpVar, TextView.OnEditorActionListener onEditorActionListener, String str, String str2, int i, String str3) {
        this.a = eigpVar;
        this.b = onEditorActionListener;
        this.c = str;
        this.d = str2;
        this.e = i;
        this.f = str3;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        TextView.OnEditorActionListener onEditorActionListener = this.b;
        if (eidc.v()) {
            return onEditorActionListener.onEditorAction(textView, i, keyEvent);
        }
        String str = this.f;
        int i2 = this.e;
        String str2 = this.d;
        eieh eiehVarC = this.a.c(str, this.c, str2, i2);
        try {
            boolean zOnEditorAction = onEditorActionListener.onEditorAction(textView, i, keyEvent);
            eiehVarC.close();
            return zOnEditorAction;
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}

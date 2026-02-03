package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eigk extends ClickableSpan {
    final /* synthetic */ String a = "com/google/android/apps/messaging/ui/rcs/ProvisioningHelper";
    final /* synthetic */ String b;
    final /* synthetic */ int c;
    final /* synthetic */ String d;
    final /* synthetic */ ClickableSpan e;
    final /* synthetic */ eigp f;

    public eigk(eigp eigpVar, String str, int i, String str2, ClickableSpan clickableSpan) {
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = clickableSpan;
        this.f = eigpVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        eieh eiehVarC = this.f.c(this.d, this.a, this.b, this.c);
        try {
            this.e.onClick(view);
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        this.e.updateDrawState(textPaint);
    }
}

package defpackage;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyoo extends URLSpan {
    final /* synthetic */ cyor a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyoo(cyor cyorVar, String str) {
        super(str);
        this.a = cyorVar;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.a.c("Bugle.Ditto.Pairing.TermsOfService.Seen");
        super.onClick(view);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
    }
}

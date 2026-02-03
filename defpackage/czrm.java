package defpackage;

import android.content.ActivityNotFoundException;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czrm extends ClickableSpan {
    final /* synthetic */ czrn a;

    public czrm(czrn czrnVar) {
        this.a = czrnVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        view.getClass();
        czrn czrnVar = this.a;
        ((cjya) czrnVar.d.b()).d(emfc.RCS_PROVISIONING_PROMPT_LEARN_MORE_CLICKED);
        try {
            ((achu) czrnVar.c.b()).g(czrnVar.b.G());
        } catch (ActivityNotFoundException e) {
            eksl ekslVar = (eksl) czrn.a.j();
            ekslVar.X(cqnc.S, "RcsDefaultOnBottomSheetFragmentPeer");
            ((eksl) ekslVar.g(e)).q("RCS Learn More Activity was not found.");
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.getClass();
        textPaint.setUnderlineText(false);
        textPaint.setColor(textPaint.linkColor);
    }
}

package defpackage;

import android.content.ActivityNotFoundException;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acvl extends ClickableSpan {
    final /* synthetic */ acvm a;

    public acvl(acvm acvmVar) {
        this.a = acvmVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        view.getClass();
        try {
            acvm acvmVar = this.a;
            ((achu) acvmVar.c.b()).g(acvmVar.b.G());
        } catch (ActivityNotFoundException e) {
            eksl ekslVar = (eksl) acvm.a.j();
            ekslVar.X(cqnc.S, "GroupUpgradeBottomSheetFragmentPeer");
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

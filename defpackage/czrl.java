package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.apps.messaging.ui.appsettings.RcsSettingsActivity;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czrl extends ClickableSpan {
    final /* synthetic */ czrn a;
    final /* synthetic */ Context b;

    public czrl(czrn czrnVar, Context context) {
        this.a = czrnVar;
        this.b = context;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) throws IOException {
        view.getClass();
        ((cjya) this.a.d.b()).d(emfc.RCS_PROVISIONING_LEGAL_FYI_BOTTOMSHEET_LEARN_MORE_CLICKED);
        Context context = this.b;
        Intent intent = new Intent(context, (Class<?>) RcsSettingsActivity.class);
        try {
            eiid.o(context, intent);
        } catch (ActivityNotFoundException e) {
            eksl ekslVar = (eksl) czrn.a.j();
            ekslVar.X(cqnc.S, "RcsDefaultOnBottomSheetFragmentPeer");
            ((eksl) ekslVar.g(e)).t("Activity was not found for intent, %s", intent);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.getClass();
        textPaint.setUnderlineText(false);
        textPaint.setColor(textPaint.linkColor);
    }
}

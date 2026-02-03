package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czqo extends ClickableSpan {
    final /* synthetic */ czqr a;

    public czqo(czqr czqrVar) {
        this.a = czqrVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) throws IOException {
        String str;
        czqr czqrVar = this.a;
        int i = czqrVar.p - 1;
        if (i == 0) {
            str = "Bugle.FastTrack.ConversationList.Prompt.Privacy.Clicked";
        } else if (i == 1) {
            str = "Bugle.FastTrack.Settings.Dialog.Privacy.Clicked";
        } else {
            if (i != 2) {
                if (i == 3) {
                    throw new IllegalStateException("There is no 'Privacy Policy' UMA metric for the PhoneNumberInput UI.");
                }
                throw new IllegalStateException("There is no 'Privacy Policy' UMA metric for the Legal FYI UI.");
            }
            str = "Bugle.Welcome.PrivacyPolicy.Clicked";
        }
        czqrVar.e.c(str);
        ((cjya) czqrVar.h.b()).e(emfc.RCS_PROVISIONING_PROMPT_PRIVACY_AND_POLICY_CLICKED, czqrVar.g);
        Context context = view.getContext();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(czqrVar.i.a()));
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        try {
            eiid.o(context, intent);
        } catch (ActivityNotFoundException unused) {
            czqr.c.r("Actvity was not found for intent, ".concat(intent.toString()));
        }
    }
}

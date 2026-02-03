package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;
import java.io.IOException;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czqq extends ClickableSpan {
    final /* synthetic */ czqr a;

    public czqq(czqr czqrVar) {
        this.a = czqrVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) throws IOException {
        czqr czqrVar = this.a;
        czqrVar.h();
        Context context = view.getContext();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "https://www.gstatic.com/policies/termssummary/rcs.pdf?hl=%1$s", craf.c(czqrVar.i.c).getLanguage())));
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        try {
            eiid.o(context, intent);
        } catch (ActivityNotFoundException unused) {
            czqr.c.r("Actvity was not found for intent, ".concat(intent.toString()));
        }
    }
}

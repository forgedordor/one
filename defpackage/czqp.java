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
public final class czqp extends ClickableSpan {
    final /* synthetic */ czqr a;

    public czqp(czqr czqrVar) {
        this.a = czqrVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) throws IOException {
        czqr czqrVar = this.a;
        czqrVar.h();
        Context context = view.getContext();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(String.format((String) czqr.a.e(), craf.c(czqrVar.d).getLanguage())));
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        try {
            eiid.o(context, intent);
        } catch (ActivityNotFoundException unused) {
            czqr.c.r("Actvity was not found for intent, ".concat(intent.toString()));
        }
    }
}

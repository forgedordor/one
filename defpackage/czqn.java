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
final class czqn extends ClickableSpan {
    final /* synthetic */ czqr a;

    public czqn(czqr czqrVar) {
        this.a = czqrVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) throws IOException {
        this.a.h();
        Context context = view.getContext();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(czqr.b(craf.c(context))));
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        try {
            eiid.o(context, intent);
        } catch (ActivityNotFoundException unused) {
            czqr.c.r("Actvity was not found for intent, ".concat(intent.toString()));
        }
    }
}

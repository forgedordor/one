package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ecwl extends ClickableSpan {
    final /* synthetic */ String a;
    final /* synthetic */ ecwm b;

    public ecwl(ecwm ecwmVar, String str) {
        this.a = str;
        this.b = ecwmVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.b.aQ(new Intent("android.intent.action.VIEW", Uri.parse(this.a)));
    }
}

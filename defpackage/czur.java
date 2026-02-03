package defpackage;

import android.content.Context;
import android.text.style.ClickableSpan;
import android.view.View;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czur extends ClickableSpan {
    final /* synthetic */ Context a;
    final /* synthetic */ czus b;

    public czur(czus czusVar, Context context) {
        this.a = context;
        this.b = czusVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) throws IOException {
        aijh aijhVar = (aijh) this.b.e.b();
        Context context = this.a;
        eiid.o(context, aijhVar.n(context));
    }
}

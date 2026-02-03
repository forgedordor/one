package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kge extends ClickableSpan {
    private final juy a;

    public kge(juy juyVar) {
        this.a = juyVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.b();
    }
}

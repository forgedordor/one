package defpackage;

import android.widget.TextView;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvun {
    private final eygg a;

    public cvun(eygg eyggVar) {
        this.a = eyggVar;
    }

    public final void a(TextView textView, int i) {
        if (textView != null) {
            eygg eyggVar = this.a;
            if (((Optional) eyggVar.b()).isEmpty()) {
                return;
            }
            textView.setTextSize(0, textView.getContext().getResources().getDimension(i) * ((cvul) ((Optional) eyggVar.b()).get()).g());
        }
    }
}

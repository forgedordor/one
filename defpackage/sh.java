package defpackage;

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class sh extends sg {
    @Override // defpackage.sg, defpackage.si
    public final void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // defpackage.si
    public final boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}

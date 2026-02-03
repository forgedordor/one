package defpackage;

import android.content.Context;
import android.text.style.ForegroundColorSpan;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpzn {
    public final fctc a;
    private final fctc b;

    public dpzn(final Context context) {
        context.getClass();
        this.b = fctd.a(new fdae() { // from class: dpzl
            @Override // defpackage.fdae
            public final Object invoke() {
                return Integer.valueOf(context.getColor(R.color.compose_contrasting_text_highlight));
            }
        });
        this.a = fctd.a(new fdae() { // from class: dpzm
            @Override // defpackage.fdae
            public final Object invoke() {
                return Integer.valueOf(context.getColor(R.color.compose_contrasting_text_non_highlight));
            }
        });
    }

    public final ForegroundColorSpan a() {
        return new ForegroundColorSpan(((Number) this.b.a()).intValue());
    }
}

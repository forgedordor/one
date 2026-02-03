package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahsw extends aak {
    private final Context c;
    private final eidm d;
    private final Drawable e;
    private final float f;
    private boolean g;
    private boolean h;

    public ahsw(Context context, eidm eidmVar) throws Resources.NotFoundException {
        super(0, 48);
        this.c = context;
        this.d = eidmVar;
        Drawable drawable = context.getResources().getDrawable(R.drawable.swipe_reply_button, context.getTheme());
        drawable.getClass();
        this.e = drawable;
        this.f = context.getResources().getDimension(R.dimen.reply_swipe_animation_threshold);
    }

    private final float r(float f) {
        if (f == 0.0f) {
            return 1.0f;
        }
        return Math.max(0.0f, 1.0f - (this.c.getResources().getFraction(R.fraction.reply_swipe_hide_separator_fraction, 1, 1) * Math.min(Math.abs(f / this.f), 1.0f)));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a3  */
    @Override // defpackage.aag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(android.graphics.Canvas r10, android.support.v7.widget.RecyclerView r11, defpackage.wv r12, float r13, float r14, int r15, boolean r16) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahsw.h(android.graphics.Canvas, android.support.v7.widget.RecyclerView, wv, float, float, int, boolean):void");
    }

    @Override // defpackage.aag
    public final boolean l() {
        return false;
    }

    @Override // defpackage.aag
    public final boolean m(RecyclerView recyclerView, wv wvVar, wv wvVar2) {
        recyclerView.getClass();
        return false;
    }

    @Override // defpackage.aak
    public final int q(RecyclerView recyclerView, wv wvVar) {
        recyclerView.getClass();
        View view = wvVar.a;
        if (!(view instanceof ConversationMessageView)) {
            return 0;
        }
        return 0;
    }

    @Override // defpackage.aag
    public final void i(wv wvVar, int i) {
    }
}

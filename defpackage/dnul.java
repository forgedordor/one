package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.libraries.compose.emoji.ui.views.SingleEmojiView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dnul<T> extends dnuk<T> implements eyhy {
    private eyhq j;
    private boolean k;

    public dnul(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        i();
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.eyhy
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final eyhq ba() {
        if (this.j == null) {
            this.j = new eyhq(this, false);
        }
        return this.j;
    }

    protected final void i() {
        if (this.k) {
            return;
        }
        this.k = true;
        ((dnuo) bb()).U((SingleEmojiView) this);
    }

    public dnul(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        i();
    }
}

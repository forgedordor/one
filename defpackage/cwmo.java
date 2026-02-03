package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import androidx.emoji.widget.EmojiAppCompatTextView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class cwmo extends EmojiAppCompatTextView implements eyhy {
    private ehol a;
    private boolean b;

    public cwmo(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    @Override // defpackage.eyhy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ehol ba() {
        if (this.a == null) {
            this.a = new ehol(this);
        }
        return this.a;
    }

    protected final void b() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((cwkh) bb()).ah();
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    public cwmo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    public cwmo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        b();
    }
}

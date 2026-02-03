package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.libraries.user.profile.photopicker.art.view.ArtImageGridView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eddg extends LinearLayout implements eyhy, eyhr {
    private eyhq a;
    public boolean h;

    eddg(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        f();
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.eyhy
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final eyhq ba() {
        if (this.a == null) {
            this.a = new eyhq(this, true);
        }
        return this.a;
    }

    @Override // defpackage.eyhr
    public final boolean e() {
        return this.h;
    }

    protected final void f() {
        eyhx eyhxVarA = ba().a();
        if (eyhxVarA instanceof eyhx) {
            if ((!(eyhxVarA instanceof eyhr) || ((eyhr) eyhxVarA).e()) && !this.h) {
                this.h = true;
                ((edcz) bb()).aB((ArtImageGridView) this);
            }
        }
    }

    public eddg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        f();
    }

    eddg(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        f();
    }

    eddg(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        f();
    }
}

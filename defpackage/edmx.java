package defpackage;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import com.google.android.libraries.user.profile.photopicker.common.view.error.FullscreenErrorView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class edmx extends ConstraintLayout implements eyhy, eyhr {
    private eyhq d;
    public boolean h;

    edmx(Context context) {
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

    @Override // defpackage.eyhr
    public final boolean e() {
        return this.h;
    }

    @Override // defpackage.eyhy
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final eyhq ba() {
        if (this.d == null) {
            this.d = new eyhq(this, false);
        }
        return this.d;
    }

    protected final void i() {
        eyhx eyhxVarA = ba().a();
        if (eyhxVarA instanceof eyhx) {
            if ((!(eyhxVarA instanceof eyhr) || ((eyhr) eyhxVarA).e()) && !this.h) {
                this.h = true;
                ((edmw) bb()).H((FullscreenErrorView) this);
            }
        }
    }

    public edmx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        i();
    }

    edmx(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        i();
    }
}

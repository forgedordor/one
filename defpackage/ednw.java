package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.libraries.user.profile.photopicker.edit.EditablePhotoView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ednw extends View implements eyhy, eyhr {
    private eyhq a;
    public boolean v;

    public ednw(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        h();
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.eyhr
    public final boolean e() {
        return this.v;
    }

    @Override // defpackage.eyhy
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final eyhq ba() {
        if (this.a == null) {
            this.a = new eyhq(this, false);
        }
        return this.a;
    }

    protected final void h() {
        eyhx eyhxVarA = ba().a();
        if (eyhxVarA instanceof eyhx) {
            if ((!(eyhxVarA instanceof eyhr) || ((eyhr) eyhxVarA).e()) && !this.v) {
                this.v = true;
                ((edns) bb()).D((EditablePhotoView) this);
            }
        }
    }

    public ednw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        h();
    }

    public ednw(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        h();
    }

    ednw(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        h();
    }
}

package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.libraries.user.profile.photopicker.art.edit.EditableArtView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class edap extends View implements eyhy, eyhr {
    private eyhq a;
    public boolean z;

    public edap(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        u();
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.eyhr
    public final boolean e() {
        return this.z;
    }

    @Override // defpackage.eyhy
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final eyhq ba() {
        if (this.a == null) {
            this.a = new eyhq(this, false);
        }
        return this.a;
    }

    protected final void u() {
        eyhx eyhxVarA = ba().a();
        if (eyhxVarA instanceof eyhx) {
            if ((!(eyhxVarA instanceof eyhr) || ((eyhr) eyhxVarA).e()) && !this.z) {
                this.z = true;
                ((edal) bb()).C((EditableArtView) this);
            }
        }
    }

    public edap(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        u();
    }

    public edap(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        u();
    }

    edap(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        u();
    }
}

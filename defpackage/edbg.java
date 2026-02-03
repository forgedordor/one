package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.libraries.user.profile.photopicker.art.home.view.SuggestedCollectionsSectionView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class edbg extends LinearLayout implements eyhy, eyhr {
    public boolean a;
    private eyhq b;

    edbg(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    @Override // defpackage.eyhy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final eyhq ba() {
        if (this.b == null) {
            this.b = new eyhq(this, true);
        }
        return this.b;
    }

    protected final void b() {
        eyhx eyhxVarA = ba().a();
        if (eyhxVarA instanceof eyhx) {
            if ((!(eyhxVarA instanceof eyhr) || ((eyhr) eyhxVarA).e()) && !this.a) {
                this.a = true;
                ((edbk) bb()).aG((SuggestedCollectionsSectionView) this);
            }
        }
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.eyhr
    public final boolean e() {
        return this.a;
    }

    public edbg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    edbg(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    edbg(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        b();
    }
}

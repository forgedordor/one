package defpackage;

import android.support.v7.widget.ShareActionProvider;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xx implements qa {
    final /* synthetic */ ShareActionProvider a;

    public xx(ShareActionProvider shareActionProvider) {
        this.a = shareActionProvider;
    }

    @Override // defpackage.qa
    public final void a() {
        xw xwVar = this.a.mOnShareTargetSelectedListener;
        if (xwVar != null) {
            xwVar.a();
        }
    }
}

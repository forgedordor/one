package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acxa extends pbx {
    private final RecyclerView a;
    private final acwj b;

    public acxa(RecyclerView recyclerView, acwj acwjVar) {
        this.a = recyclerView;
        this.b = acwjVar;
    }

    @Override // defpackage.pbx
    public final pbw a(MotionEvent motionEvent) {
        RecyclerView recyclerView = this.a;
        View viewM = recyclerView.m(motionEvent.getX(), motionEvent.getY());
        if (viewM == null) {
            return null;
        }
        wv wvVarJ = recyclerView.j(viewM);
        if (!(wvVarJ instanceof acwi)) {
            return null;
        }
        adao adaoVarI = this.b.I(wvVarJ.ft());
        if (adaoVarI == null) {
            return null;
        }
        return new acwz(wvVarJ.gl(), adaoVarI.k().w().a());
    }
}

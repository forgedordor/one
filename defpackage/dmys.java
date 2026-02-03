package defpackage;

import android.content.Context;
import android.util.Size;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmys {
    public final Context a;
    public final dqav b;
    public final dmyg c;
    public final dmyw d;
    public dmyq f;
    private final fctc g = fctd.a(new fdae() { // from class: dmyk
        @Override // defpackage.fdae
        public final Object invoke() {
            return new dmyr(this.a);
        }
    });
    private final fctc h = fctd.a(new fdae() { // from class: dmyl
        @Override // defpackage.fdae
        public final Object invoke() {
            return new dqai(this.a.a.getResources().getDimensionPixelSize(R.dimen.standard_view_padding));
        }
    });
    public final fctc e = fctd.a(new fdae() { // from class: dmym
        @Override // defpackage.fdae
        public final Object invoke() {
            return Integer.valueOf(this.a.a.getResources().getDimensionPixelSize(R.dimen.camera_gallery_reactive_grid_threshold));
        }
    });

    public dmys(Context context, dqav dqavVar, dmyg dmygVar, dmyw dmywVar) {
        this.a = context;
        this.b = dqavVar;
        this.c = dmygVar;
        this.d = dmywVar;
    }

    public final Size a(int i) {
        dmyn dmynVarB = b();
        if (true != dmynVarB.b()) {
            dmynVarB = null;
        }
        if (dmynVarB != null) {
            return dmynVarB.a(i);
        }
        return null;
    }

    public final dmyn b() {
        return (dmyn) this.g.a();
    }

    public final dqai c() {
        return (dqai) this.h.a();
    }
}

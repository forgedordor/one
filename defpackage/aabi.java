package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class aabi extends fdbo implements fdae {
    public aabi(Object obj) {
        super(0, obj, aabj.class, "computeMaxHeight", "computeMaxHeight()I", 0);
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        return Integer.valueOf((int) (Resources.getSystem().getDisplayMetrics().heightPixels * 0.75f));
    }
}

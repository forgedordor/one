package defpackage;

import android.view.ViewParent;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class lfi extends fdbo implements fdap {
    public static final lfi a = new lfi();

    public lfi() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((ViewParent) obj).getParent();
    }
}

package defpackage;

import android.graphics.PointF;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class docf extends fdbo implements fdau {
    public docf(Object obj) {
        super(3, obj, docj.class, "onMediaLongClicked", "onMediaLongClicked(Lcom/google/android/libraries/compose/gifsticker/data/GifStickerMedia;Landroid/view/View;Landroid/graphics/PointF;)Z", 0);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        doav doavVar = (doav) obj;
        View view = (View) obj2;
        doavVar.getClass();
        view.getClass();
        return Boolean.valueOf(((docj) this.g).bj(doavVar, view, (PointF) obj3));
    }
}

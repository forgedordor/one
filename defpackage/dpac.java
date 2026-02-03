package defpackage;

import android.graphics.PointF;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dpac extends fdbo implements fdau {
    public dpac(Object obj) {
        super(3, obj, dpao.class, "onMediaLongClicked", "onMediaLongClicked(Lcom/google/android/libraries/compose/gifsticker/data/GifStickerMedia;Landroid/view/View;Landroid/graphics/PointF;)Z", 0);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        View view = (View) obj2;
        view.getClass();
        return Boolean.valueOf(((dpao) this.g).bj((doyt) obj, view, (PointF) obj3));
    }
}

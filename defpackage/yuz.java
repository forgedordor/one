package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yuz implements djse {
    final /* synthetic */ yvq a;
    final /* synthetic */ ytz b;

    public yuz(yvq yvqVar, ytz ytzVar) {
        this.a = yvqVar;
        this.b = ytzVar;
    }

    @Override // defpackage.djse
    public final void a(Uri uri, int i, int i2) {
        this.a.l.a(uri, i, i2);
    }

    @Override // defpackage.djse
    public final void b(rhs rhsVar, Object obj) {
        fduf fdufVar;
        yvq yvqVar = this.a;
        yvqVar.l.b(rhsVar, obj);
        if ((obj instanceof Uri) && (fdufVar = (fduf) yvqVar.v.get(obj)) != null) {
            fdufVar.f(true);
        }
        yvqVar.m.a(rhsVar, obj, 1);
        yvqVar.o.b(rhsVar, obj);
    }

    @Override // defpackage.djse
    public final void c(Uri uri) {
        this.a.o.c(uri);
    }

    @Override // defpackage.djse
    public final void d(Drawable drawable, Object obj) {
        yvq yvqVar = this.a;
        yvqVar.l.d(drawable, obj);
        yvqVar.o.d(drawable, obj);
        if (yvqVar.n.a()) {
            ytz ytzVar = this.b;
            if (ytzVar.b) {
                return;
            }
            ajlt ajltVar = ytzVar.a;
            if (ajltVar.a() == ajls.b && (obj instanceof Uri)) {
                Uri uri = (Uri) obj;
                if (fdbq.f(uri, ytzVar.c)) {
                    yvqVar.g.L(ajltVar, 7);
                } else {
                    if (fdbq.f(uri, ytzVar.g.e())) {
                        yvqVar.g.L(ajltVar, 8);
                        return;
                    }
                    ekrw ekrwVarJ = yvq.a.j();
                    ekrwVarJ.X(eksq.a, "BugleImage");
                    ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/image/ImageBubbleUiAdapter$compositeRequestListener$1", "onResourceReady", 752, "ImageBubbleUiAdapter.kt")).t("Unexpected model URI: %s", obj);
                }
            }
        }
    }
}

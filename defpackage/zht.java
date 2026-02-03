package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zht implements djse {
    final /* synthetic */ zih a;
    final /* synthetic */ zgp b;
    final /* synthetic */ Uri c;
    final /* synthetic */ Uri d;

    public zht(zih zihVar, zgp zgpVar, Uri uri, Uri uri2) {
        this.a = zihVar;
        this.b = zgpVar;
        this.c = uri;
        this.d = uri2;
    }

    @Override // defpackage.djse
    public final void b(rhs rhsVar, Object obj) {
        this.a.j.a(rhsVar, obj, 2);
    }

    @Override // defpackage.djse
    public final void d(Drawable drawable, Object obj) {
        zih zihVar = this.a;
        if (zihVar.l.a()) {
            zgp zgpVar = this.b;
            if (zgpVar.b) {
                return;
            }
            ajlt ajltVar = zgpVar.a;
            if (ykm.s(ajltVar) && (obj instanceof Uri)) {
                Uri uri = (Uri) obj;
                if (fdbq.f(uri, this.c)) {
                    zihVar.t.L(ajltVar, 7);
                } else if (fdbq.f(uri, this.d)) {
                    zihVar.t.L(ajltVar, 8);
                } else {
                    ((ekrd) zih.a.j().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/video2/VideoBubbleUiAdapter$createUiDataFlow$defaultUiData$1", "onResourceReady", 238, "VideoBubbleUiAdapter.kt")).t("Unexpected model URI: %s", obj);
                }
            }
        }
    }

    @Override // defpackage.djse
    public final /* synthetic */ void c(Uri uri) {
    }

    @Override // defpackage.djse
    public final /* synthetic */ void a(Uri uri, int i, int i2) {
    }
}

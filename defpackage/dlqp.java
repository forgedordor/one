package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlqp implements djse {
    final /* synthetic */ dlqu a;
    final /* synthetic */ hox b;

    public dlqp(dlqu dlquVar, hox hoxVar) {
        this.a = dlquVar;
        this.b = hoxVar;
    }

    @Override // defpackage.djse
    public final void b(rhs rhsVar, Object obj) {
        this.b.b(true);
        djse djseVar = this.a.e;
        if (djseVar != null) {
            djseVar.b(rhsVar, obj);
        }
    }

    @Override // defpackage.djse
    public final void d(Drawable drawable, Object obj) {
        djse djseVar = this.a.e;
        if (djseVar != null) {
            djseVar.d(drawable, obj);
        }
    }

    @Override // defpackage.djse
    public final /* synthetic */ void c(Uri uri) {
    }

    @Override // defpackage.djse
    public final /* synthetic */ void a(Uri uri, int i, int i2) {
    }
}

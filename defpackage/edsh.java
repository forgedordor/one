package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edsh extends rtp {
    final /* synthetic */ TextView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edsh(int i, int i2, TextView textView) {
        super(i, i2);
        this.a = textView;
    }

    @Override // defpackage.rua
    public final /* bridge */ /* synthetic */ void b(Object obj, ruk rukVar) {
        lip.g(this.a, (Drawable) obj);
    }

    @Override // defpackage.rua
    public final void e(Drawable drawable) {
        lip.g(this.a, null);
    }

    @Override // defpackage.rtp, defpackage.rua
    public final void f(Drawable drawable) {
        if (drawable != null) {
            lip.g(this.a, drawable);
        }
    }
}

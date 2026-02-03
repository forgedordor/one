package defpackage;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyse extends rts {
    public cyse(Toolbar toolbar) {
        super(toolbar);
    }

    @Override // defpackage.rua
    public final void a(Drawable drawable) {
        ((Toolbar) this.a).h().findItem(R.id.avatar).setIcon(drawable);
    }

    @Override // defpackage.rua
    public final /* bridge */ /* synthetic */ void b(Object obj, ruk rukVar) {
        ((Toolbar) this.a).h().findItem(R.id.avatar).setIcon((Drawable) obj);
    }

    @Override // defpackage.rts
    protected final void c() {
    }
}

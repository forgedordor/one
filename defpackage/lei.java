package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lei extends lek {
    public lei(Class cls) {
        super(R.id.tag_accessibility_heading, cls);
    }

    @Override // defpackage.lek
    public final /* bridge */ /* synthetic */ Object a(View view) {
        return Boolean.valueOf(ler.f(view));
    }

    @Override // defpackage.lek
    public final /* bridge */ /* synthetic */ void b(View view, Object obj) {
        ler.c(view, ((Boolean) obj).booleanValue());
    }

    @Override // defpackage.lek
    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        return !f((Boolean) obj, (Boolean) obj2);
    }
}

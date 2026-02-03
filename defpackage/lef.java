package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lef extends lek {
    public lef(Class cls) {
        super(R.id.tag_screen_reader_focusable, cls);
    }

    @Override // defpackage.lek
    public final /* bridge */ /* synthetic */ Object a(View view) {
        return Boolean.valueOf(ler.g(view));
    }

    @Override // defpackage.lek
    public final /* bridge */ /* synthetic */ void b(View view, Object obj) {
        ler.e(view, ((Boolean) obj).booleanValue());
    }

    @Override // defpackage.lek
    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        return !f((Boolean) obj, (Boolean) obj2);
    }
}

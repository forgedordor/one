package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class leg extends lek {
    public leg(Class cls) {
        super(R.id.tag_accessibility_pane_title, cls, 8, 28);
    }

    @Override // defpackage.lek
    public final /* synthetic */ Object a(View view) {
        return ler.a(view);
    }

    @Override // defpackage.lek
    public final /* synthetic */ void b(View view, Object obj) {
        ler.d(view, (CharSequence) obj);
    }

    @Override // defpackage.lek
    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
    }
}

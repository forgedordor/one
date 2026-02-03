package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class leh extends lek {
    public leh(Class cls) {
        super(R.id.tag_state_description, cls, 64, 30);
    }

    @Override // defpackage.lek
    public final /* synthetic */ Object a(View view) {
        return let.c(view);
    }

    @Override // defpackage.lek
    public final /* synthetic */ void b(View view, Object obj) {
        let.d(view, (CharSequence) obj);
    }

    @Override // defpackage.lek
    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
    }
}

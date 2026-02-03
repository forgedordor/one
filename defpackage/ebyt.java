package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebyt implements eora {
    final /* synthetic */ View a;
    final /* synthetic */ ebyv b;

    public ebyt(ebyv ebyvVar, View view) {
        this.a = view;
        this.b = ebyvVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ebyv ebyvVar = this.b;
        ebyvVar.i.setClickable(true);
        ebyvVar.b();
        View view = this.a;
        Context context = view.getContext();
        ebve.d(view, ebyvVar.p ? context.getString(R.string.announcement_sticker_added_to_favorites) : context.getString(R.string.announcement_sticker_removed_from_favorites));
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        ebyv ebyvVar = this.b;
        ebyvVar.p = !ebyvVar.p;
        ebyvVar.i.setClickable(true);
    }
}

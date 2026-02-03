package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebwb implements eora {
    final /* synthetic */ String a;
    final /* synthetic */ View b;
    final /* synthetic */ ebwc c;

    public ebwb(ebwc ebwcVar, String str, View view) {
        this.a = str;
        this.b = view;
        this.c = ebwcVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ebwc ebwcVar = this.c;
        ebwcVar.C();
        ebwcVar.y.i.remove(this.a);
        ebwcVar.v.setClickable(true);
        View view = this.b;
        Context context = view.getContext();
        ebve.d(view, ebwcVar.x ? context.getString(R.string.announcement_sticker_added_to_favorites) : context.getString(R.string.announcement_sticker_removed_from_favorites));
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        ebwc ebwcVar = this.c;
        boolean z = ebwcVar.x;
        ebwcVar.x = !z;
        if (!z) {
            ebwcVar.y.f.remove(this.a);
        }
        ebwcVar.y.i.remove(this.a);
        ebwcVar.v.setClickable(true);
    }
}

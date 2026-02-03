package defpackage;

import android.graphics.drawable.Drawable;
import com.google.android.apps.messaging.ui.search.presenter.SearchFilterDataItem;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czzq extends rty {
    final /* synthetic */ czzr a;
    final /* synthetic */ SearchFilterDataItem b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czzq(int i, int i2, czzr czzrVar, SearchFilterDataItem searchFilterDataItem) {
        super(i, i2);
        this.a = czzrVar;
        this.b = searchFilterDataItem;
    }

    @Override // defpackage.rua
    public final /* bridge */ /* synthetic */ void b(Object obj, ruk rukVar) {
        czzr czzrVar = this.a;
        Drawable drawable = (Drawable) obj;
        if (czzrVar.a != this.b) {
            return;
        }
        czzrVar.b.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }
}

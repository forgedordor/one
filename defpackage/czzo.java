package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czzo extends rty {
    final /* synthetic */ eegx a;
    final /* synthetic */ czzp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czzo(czzp czzpVar, int i, int i2, eegx eegxVar) {
        super(i, i2);
        this.a = eegxVar;
        this.b = czzpVar;
    }

    @Override // defpackage.rua
    public final /* bridge */ /* synthetic */ void b(Object obj, ruk rukVar) {
        eegx eegxVar = this.a;
        eegxVar.l((Drawable) obj);
        eegxVar.setBounds(0, 0, eegxVar.getIntrinsicWidth(), eegxVar.getIntrinsicHeight());
        View view = this.b.a;
        if (view != null) {
            view.requestLayout();
        }
    }
}

package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egfz implements rfg {
    final /* synthetic */ egga a;

    public egfz(egga eggaVar) {
        this.a = eggaVar;
    }

    @Override // defpackage.rfg
    public final Class a() {
        return Bitmap.class;
    }

    @Override // defpackage.rfg
    public final reb eX() {
        return reb.LOCAL;
    }

    @Override // defpackage.rfg
    public final void g(rbh rbhVar, rff rffVar) {
        rffVar.c(BitmapFactory.decodeResource(this.a.a.getResources(), R.drawable.account_switcher_blue));
    }

    @Override // defpackage.rfg
    public final void d() {
    }

    @Override // defpackage.rfg
    public final void e() {
    }
}

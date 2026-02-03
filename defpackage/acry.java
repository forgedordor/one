package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.material.snackbar.Snackbar;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acry implements eind {
    final /* synthetic */ acrt a;

    public acry(acrt acrtVar) {
        this.a = acrtVar;
    }

    @Override // defpackage.eind
    public final /* bridge */ /* synthetic */ eine a(einb einbVar) {
        String strB;
        View.OnClickListener onClickListener;
        final ctey cteyVar = (ctey) einbVar;
        cteyVar.a();
        if (TextUtils.isEmpty(cteyVar.b())) {
            strB = null;
            onClickListener = null;
        } else {
            strB = cteyVar.b();
            onClickListener = new View.OnClickListener() { // from class: acpp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    cteyVar.a().run();
                }
            };
        }
        acrt acrtVar = this.a;
        Snackbar snackbarQ = Snackbar.q(acrt.f(acrtVar.b), cteyVar.c(), 0);
        snackbarQ.s(strB, onClickListener);
        snackbarQ.m(acrtVar.ad.g());
        snackbarQ.i();
        return eine.a;
    }
}

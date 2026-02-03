package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acvy implements adaq {
    private final Context a;
    private final cwve b;
    private View c;

    public acvy(Context context, cwve cwveVar) {
        this.a = context;
        this.b = cwveVar;
    }

    @Override // defpackage.adaq
    public final void b(adao adaoVar, boolean z) {
        String strE = adaoVar.E();
        if (adaoVar.F() != null) {
            strE = strE + " " + adaoVar.F();
        }
        this.c.setContentDescription(strE);
    }

    @Override // defpackage.adaq
    public final void c(View view) {
        this.c = view;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c6  */
    @Override // defpackage.adaq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.adan r35, defpackage.acyx r36) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acvy.d(adan, acyx):void");
    }

    @Override // defpackage.adaq
    public final boolean e(adao adaoVar, adao adaoVar2) {
        return !TextUtils.equals(adaoVar.E(), adaoVar2.E());
    }

    @Override // defpackage.adaq
    public final /* synthetic */ adao a(adao adaoVar) {
        return adaoVar;
    }
}

package defpackage;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acyj implements adaq {
    cpdw a;
    private final Context b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final arpr g;

    public acyj(Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, arpr arprVar) {
        this.b = context;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.f = fcsuVar4;
        this.g = arprVar;
    }

    @Override // defpackage.adaq
    public final void b(adao adaoVar, boolean z) {
        ViewGroup.LayoutParams layoutParams;
        adaoVar.ai();
        boolean z2 = this.g.a() && adaoVar.b() == 0;
        if (adaoVar.F() != null) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) this.a.b();
            if (appCompatImageView != null) {
                this.a.g(0);
                appCompatImageView.setImageDrawable(this.b.getDrawable(R.drawable.message_status_error));
            }
            if (z2) {
                appCompatImageView.setAlpha(0.5f);
                return;
            } else {
                appCompatImageView.setAlpha(1.0f);
                return;
            }
        }
        if (adaoVar.x() == null) {
            this.a.g(8);
            return;
        }
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) this.a.b();
        if (appCompatImageView2 != null) {
            if (((apql) this.d.b()).a() && (layoutParams = appCompatImageView2.getLayoutParams()) != null) {
                layoutParams.width = -2;
                layoutParams.height = -2;
            }
            this.a.g(0);
            Context context = this.b;
            Integer numX = adaoVar.x();
            numX.getClass();
            appCompatImageView2.setImageDrawable(context.getDrawable(numX.intValue()));
            if (z2) {
                appCompatImageView2.setAlpha(0.5f);
            } else {
                appCompatImageView2.setAlpha(1.0f);
            }
        }
    }

    @Override // defpackage.adaq
    public final void c(View view) {
        new cpdw(view, R.id.conversation_status, R.id.conversation_status);
        this.a = new cpdw(view, R.id.conversation_status_icon, R.id.conversation_status_icon);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0112  */
    @Override // defpackage.adaq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.adan r13, defpackage.acyx r14) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acyj.d(adan, acyx):void");
    }

    @Override // defpackage.adaq
    public final boolean e(adao adaoVar, adao adaoVar2) {
        akbl akblVarT = adaoVar.k().t();
        akbl akblVarT2 = adaoVar2.k().t();
        boolean zAi = adaoVar.k().ai();
        boolean zAi2 = adaoVar2.k().ai();
        boolean z = this.g.a() && adaoVar.b() != adaoVar2.b();
        adaoVar2.ai();
        adaoVar.ai();
        return (TextUtils.equals(null, null) && Objects.equals(adaoVar.x(), adaoVar2.x()) && akblVarT == akblVarT2 && zAi == zAi2 && Objects.equals(adaoVar2.F(), adaoVar.F()) && !z) ? false : true;
    }

    @Override // defpackage.adaq
    public final /* synthetic */ adao a(adao adaoVar) {
        return adaoVar;
    }
}

package defpackage;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class affm implements lun {
    public final dpbq a;
    private final eg b;
    private final ea c;
    private final uiy d;

    public affm(eg egVar, ea eaVar, uiy uiyVar, dpbq dpbqVar) {
        this.b = egVar;
        this.c = eaVar;
        this.d = uiyVar;
        this.a = dpbqVar;
        eaVar.P().c(new eijk(this));
        egVar.findViewById(R.id.content).setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: affl
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                view.getClass();
                windowInsets.getClass();
                view.setPadding(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                return windowInsets;
            }
        });
    }

    @Override // defpackage.lun
    public final void f(lvj lvjVar) {
        Bundle extras;
        Intent intent = this.b.getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            this.a.i(extras);
        }
        this.a.f();
        uiy uiyVar = this.d;
        if (Build.VERSION.SDK_INT > 29) {
            uiyVar.a.getWindow().setDecorFitsSystemWindows(true);
        }
        uiyVar.b(uiyVar.b);
    }

    @Override // defpackage.lun
    public final void gG(lvj lvjVar) {
        Bundle extras;
        Intent intent = this.b.getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            this.a.h(extras);
        }
        this.a.e();
        uiy uiyVar = this.d;
        Activity activity = uiyVar.a;
        if (uiy.a(activity) == 48) {
            return;
        }
        if (Build.VERSION.SDK_INT > 29) {
            activity.getWindow().setDecorFitsSystemWindows(false);
        }
        uiyVar.b(48);
    }

    @Override // defpackage.lun
    public final /* synthetic */ void c(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void d(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void fh(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void gF(lvj lvjVar) {
    }
}

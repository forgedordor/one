package defpackage;

import android.os.Build;
import android.view.View;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class efg extends lfs implements Runnable, View.OnAttachStateChangeListener, ldn {
    private final ehg a;
    private boolean d;
    private boolean e;
    private lgt f;

    public efg(ehg ehgVar) {
        super(!ehgVar.h ? 1 : 0);
        this.a = ehgVar;
    }

    @Override // defpackage.lfs
    public final lfr b(lgb lgbVar, lfr lfrVar) {
        this.d = false;
        return lfrVar;
    }

    @Override // defpackage.lfs
    public final lgt c(lgt lgtVar, List list) {
        ehg ehgVar = this.a;
        ehg.c(ehgVar, lgtVar);
        return ehgVar.h ? lgt.a : lgtVar;
    }

    @Override // defpackage.lfs
    public final void d(lgb lgbVar) {
        this.d = false;
        this.e = false;
        lgt lgtVar = this.f;
        if (lgbVar.c() > 0 && lgtVar != null) {
            ehg ehgVar = this.a;
            ehgVar.a(lgtVar);
            ehgVar.b(lgtVar);
            ehg.c(ehgVar, lgtVar);
        }
        this.f = null;
    }

    @Override // defpackage.lfs
    public final void e() {
        this.d = true;
        this.e = true;
    }

    @Override // defpackage.ldn
    public final lgt ez(View view, lgt lgtVar) {
        this.f = lgtVar;
        ehg ehgVar = this.a;
        ehgVar.b(lgtVar);
        if (this.d) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.e) {
            ehgVar.a(lgtVar);
            ehg.c(ehgVar, lgtVar);
        }
        return ehgVar.h ? lgt.a : lgtVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d) {
            this.d = false;
            this.e = false;
            lgt lgtVar = this.f;
            if (lgtVar != null) {
                ehg ehgVar = this.a;
                ehgVar.a(lgtVar);
                ehg.c(ehgVar, lgtVar);
                this.f = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}

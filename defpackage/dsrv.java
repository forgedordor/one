package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsrv {
    public dsrt a;
    public dsru b;
    private final ViewTreeObserver.OnPreDrawListener c;
    private final View d;
    private WeakReference e;
    private dsrr f;
    private dsrr g;
    private boolean h;

    public dsrv(View view) {
        view.getClass();
        this.d = view;
        this.f = new dsrr();
        this.g = new dsrr();
        this.c = new dsrs(this);
        this.h = false;
    }

    private final View c() {
        WeakReference weakReference = this.e;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsrv.a():void");
    }

    public final void b(View view) {
        if (view == c()) {
            a();
            return;
        }
        this.e = new WeakReference(view);
        dsrt dsrtVar = this.a;
        if (dsrtVar != null && view == null) {
            ((dsrm) dsrtVar).a();
        }
        ViewTreeObserver viewTreeObserver = this.d.getViewTreeObserver();
        if (view != null && !this.h) {
            viewTreeObserver.addOnPreDrawListener(this.c);
            this.h = true;
        }
        if (view == null && this.h) {
            viewTreeObserver.removeOnPreDrawListener(this.c);
            this.h = false;
        }
        if (view != null) {
            a();
            return;
        }
        if (this.g.b()) {
            this.g.a();
            dsru dsruVar = this.b;
            if (dsruVar != null) {
                dsruVar.b(this.g);
            }
        }
    }
}

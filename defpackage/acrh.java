package defpackage;

import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acrh implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ eiik a;
    final /* synthetic */ ViewTreeObserver.OnPreDrawListener b;
    final /* synthetic */ acrt c;

    public acrh(acrt acrtVar, eiik eiikVar, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        this.a = eiikVar;
        this.b = onPreDrawListener;
        this.c = acrtVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        try {
            eifp eifpVarA = this.a.a();
            try {
                boolean zOnPreDraw = this.b.onPreDraw();
                eifpVarA.close();
                return zOnPreDraw;
            } finally {
            }
        } finally {
            acrt acrtVar = this.c;
            if (acrtVar.aL) {
                acrt.b(acrtVar.b).getViewTreeObserver().removeOnPreDrawListener(this);
                acrtVar.aI = new ViewTreeObserver.OnPreDrawListener() { // from class: acrg
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public final boolean onPreDraw() {
                        return true;
                    }
                };
            }
        }
    }
}

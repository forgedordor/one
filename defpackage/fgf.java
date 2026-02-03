package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgf implements jnv {
    public final View a;
    public faj d;
    public fmx e;
    public jou f;
    public Rect k;
    public final ffx l;
    public final fft m;
    public fdap b = new fdap() { // from class: fgb
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            return fctx.a;
        }
    };
    public fdap c = new fdap() { // from class: fgc
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            return fctx.a;
        }
    };
    public kew g = new kew("", jyo.a, 4);
    public kdy h = kdy.a;
    public final List i = new ArrayList();
    public final fctc j = fctd.b(3, new fdae() { // from class: fgd
        @Override // defpackage.fdae
        public final Object invoke() {
            return new BaseInputConnection(this.a.a, false);
        }
    });

    public fgf(View view, fdap fdapVar, fft fftVar) {
        this.a = view;
        this.m = fftVar;
        this.l = new ffx(fdapVar, fftVar);
    }
}

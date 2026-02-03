package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kap extends kyw {
    final /* synthetic */ fdis a;
    final /* synthetic */ kcn b;

    public kap(fdis fdisVar, kcn kcnVar) {
        this.a = fdisVar;
        this.b = kcnVar;
    }

    @Override // defpackage.kyw
    public final void a(int i) {
        this.a.h(new IllegalStateException("Unable to load font " + this.b + " (reason=" + i + ')'));
    }

    @Override // defpackage.kyw
    public final void b(Typeface typeface) {
        this.a.w(typeface);
    }
}

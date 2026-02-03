package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeqa extends kyw {
    final /* synthetic */ eeqd a;
    final /* synthetic */ eeqc b;

    public eeqa(eeqc eeqcVar, eeqd eeqdVar) {
        this.a = eeqdVar;
        this.b = eeqcVar;
    }

    @Override // defpackage.kyw
    public final void a(int i) {
        this.b.o = true;
        this.a.a(i);
    }

    @Override // defpackage.kyw
    public final void b(Typeface typeface) {
        eeqc eeqcVar = this.b;
        eeqcVar.m = Typeface.create(typeface, eeqcVar.d);
        eeqcVar.o = true;
        this.a.b(eeqcVar.m, false);
    }
}

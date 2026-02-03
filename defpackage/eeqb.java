package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeqb extends eeqd {
    final /* synthetic */ Context a;
    final /* synthetic */ TextPaint b;
    final /* synthetic */ eeqd c;
    final /* synthetic */ eeqc d;

    public eeqb(eeqc eeqcVar, Context context, TextPaint textPaint, eeqd eeqdVar) {
        this.a = context;
        this.b = textPaint;
        this.c = eeqdVar;
        this.d = eeqcVar;
    }

    @Override // defpackage.eeqd
    public final void a(int i) {
        this.c.a(i);
    }

    @Override // defpackage.eeqd
    public final void b(Typeface typeface, boolean z) {
        this.d.e(this.a, this.b, typeface);
        this.c.b(typeface, z);
    }
}

package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eepw extends eeqd {
    private final Typeface a;
    private final eepv b;
    private boolean c;

    public eepw(eepv eepvVar, Typeface typeface) {
        this.a = typeface;
        this.b = eepvVar;
    }

    private final void d(Typeface typeface) {
        if (this.c) {
            return;
        }
        this.b.a(typeface);
    }

    @Override // defpackage.eeqd
    public final void a(int i) {
        d(this.a);
    }

    @Override // defpackage.eeqd
    public final void b(Typeface typeface, boolean z) {
        d(typeface);
    }

    public final void c() {
        this.c = true;
    }
}

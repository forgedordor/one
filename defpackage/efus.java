package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efus {
    public int a;
    private boolean b;

    public efus() {
        this.a = R.style.SudThemeGlif_DayNight;
        this.b = true;
    }

    public final efut a() {
        return new efut(this.a, this.b);
    }

    public final void b() {
        this.b = true;
    }

    public efus(efut efutVar) {
        this.a = R.style.SudThemeGlif_DayNight;
        this.b = true;
        this.a = efutVar.b;
        String str = efutVar.c;
        this.b = efutVar.d;
    }
}

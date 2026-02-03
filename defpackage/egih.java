package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egih {
    public final ehvg a;
    public final eosc b;

    public egih(ehvg ehvgVar, eosc eoscVar) {
        this.a = ehvgVar;
        this.b = eoscVar;
    }

    public final Uri a() {
        ehvg ehvgVar = this.a;
        ehvgVar.a().getParentFile().mkdirs();
        return ehvgVar.b.c(ehvgVar.a, ehvgVar.c);
    }
}

package defpackage;

import android.util.Size;
import com.google.research.xeno.effect.InputFrameSource;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exlx implements bcv {
    public static final String a = "exlx";
    public final euxq b;
    public final euwf c;
    public final exkx d;
    public euwg e;
    public exlw f;
    public int g = -1;
    public int h = -1;

    public exlx(Object obj, exkx exkxVar) {
        euxq euxqVar = new euxq(obj);
        this.b = euxqVar;
        euwf euwfVar = new euwf(euxqVar.c);
        this.c = euwfVar;
        euwfVar.a(exkxVar);
        this.d = exkxVar;
    }

    @Override // defpackage.bcv
    public final void a(bdp bdpVar) {
        throw null;
    }

    @Override // defpackage.bcv
    public final void b(bcu bcuVar) {
        throw null;
    }

    public final synchronized void c(InputFrameSource inputFrameSource) {
        if (this.g <= 0 || this.h <= 0) {
            return;
        }
        exkx exkxVar = this.d;
        exkxVar.d();
        exkxVar.c(inputFrameSource, new Size(this.h, this.g), null, null);
    }
}

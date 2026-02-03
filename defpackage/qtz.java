package defpackage;

import android.graphics.Path;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qtz implements qto {
    public final Path.FillType a;
    public final String b;
    public final qsy c;
    public final qtb d;
    public final boolean e;
    private final boolean f;

    public qtz(String str, boolean z, Path.FillType fillType, qsy qsyVar, qtb qtbVar, boolean z2) {
        this.b = str;
        this.f = z;
        this.a = fillType;
        this.c = qsyVar;
        this.d = qtbVar;
        this.e = z2;
    }

    @Override // defpackage.qto
    public final qoy a(qof qofVar, qnm qnmVar, quh quhVar) {
        return new qpc(qofVar, quhVar, this);
    }

    public final String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f + "}";
    }
}

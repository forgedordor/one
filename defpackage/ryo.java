package defpackage;

import android.graphics.Path;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ryo extends ryp {
    final /* synthetic */ ryv a;
    private final Path e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ryo(ryv ryvVar, Path path, float f) {
        super(ryvVar, f, 0.0f);
        this.a = ryvVar;
        this.e = path;
    }

    @Override // defpackage.ryp, defpackage.ryt
    public final void a(String str) {
        ryv ryvVar = this.a;
        if (ryvVar.i()) {
            ryr ryrVar = ryvVar.d;
            if (ryrVar.b) {
                ryvVar.a.drawTextOnPath(str, this.e, this.b, this.c, ryrVar.d);
            }
            ryr ryrVar2 = ryvVar.d;
            if (ryrVar2.c) {
                ryvVar.a.drawTextOnPath(str, this.e, this.b, this.c, ryrVar2.e);
            }
        }
        this.b += ryvVar.d.d.measureText(str);
    }
}

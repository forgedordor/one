package defpackage;

import android.graphics.Canvas;
import android.widget.EdgeEffect;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dmq extends jbi implements jbp {
    private final dkh a;
    private final dmc b;
    private final egc c;

    public dmq(jbf jbfVar, dkh dkhVar, dmc dmcVar, egc egcVar) {
        this.a = dkhVar;
        this.b = dmcVar;
        this.c = egcVar;
        N(jbfVar);
    }

    private static final boolean a(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // defpackage.jbp
    public final void r(imw imwVar) {
        boolean zA;
        char c;
        boolean z;
        dkh dkhVar = this.a;
        dkhVar.f(imwVar.b());
        if (ihz.g(imwVar.b())) {
            imwVar.p();
            return;
        }
        imwVar.p();
        dkhVar.b.a();
        Canvas canvasA = iid.a(imwVar.t().b());
        dmc dmcVar = this.b;
        if (dmcVar.l()) {
            EdgeEffect edgeEffectC = dmcVar.c();
            float f = -Float.intBitsToFloat((int) (imwVar.b() & 4294967295L));
            zA = a(270.0f, (Float.floatToRawIntBits(imwVar.en(this.c.b(imwVar.q()))) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), edgeEffectC, canvasA);
        } else {
            zA = false;
        }
        if (dmcVar.r()) {
            c = ' ';
            zA = a(0.0f, (((long) Float.floatToRawIntBits(imwVar.en(((egd) this.c).a))) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), dmcVar.g(), canvasA) || zA;
        } else {
            c = ' ';
        }
        if (dmcVar.o()) {
            zA = a(90.0f, (((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits((-((float) fdcu.b(Float.intBitsToFloat((int) (imwVar.b() >> c))))) + imwVar.en(this.c.c(imwVar.q())))) & 4294967295L), dmcVar.e(), canvasA) || zA;
        }
        if (dmcVar.i()) {
            EdgeEffect edgeEffectA = dmcVar.a();
            z = a(180.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (imwVar.b() >> c)))) << c) | (4294967295L & ((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (imwVar.b() & 4294967295L))) + imwVar.en(((egd) this.c).b)))), edgeEffectA, canvasA) || zA;
        } else {
            z = zA;
        }
        if (z) {
            dkhVar.e();
        }
    }

    @Override // defpackage.jbp
    public final /* synthetic */ void t() {
    }
}

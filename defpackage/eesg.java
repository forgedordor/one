package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eesg extends eerv {
    final float a = -1.0f;

    @Override // defpackage.eerv
    public final void a(eest eestVar, float f, float f2) {
        float f3 = f2 * f;
        eestVar.f(f3, 180.0f, 90.0f);
        float f4 = f3 + f3;
        eesp eespVar = new eesp(0.0f, 0.0f, f4, f4);
        eespVar.e = 180.0f;
        eespVar.f = 90.0f;
        eestVar.f.add(eespVar);
        eestVar.b(new eesn(eespVar), 180.0f, 270.0f);
        float f5 = f4 + 0.0f;
        float f6 = f5 / 2.0f;
        float f7 = f5 * 0.5f;
        eestVar.b = (((float) Math.cos(Math.toRadians(270.0d))) * f6) + f7;
        eestVar.c = f7 + (f6 * ((float) Math.sin(Math.toRadians(270.0d))));
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qwb implements qwi {
    public static final qwb a = new qwb();

    private qwb() {
    }

    @Override // defpackage.qwi
    public final /* bridge */ /* synthetic */ Object a(qwn qwnVar, float f) {
        boolean z = qwnVar.q() == 1;
        if (z) {
            qwnVar.h();
        }
        float fA = (float) qwnVar.a();
        float fA2 = (float) qwnVar.a();
        while (qwnVar.o()) {
            qwnVar.n();
        }
        if (z) {
            qwnVar.j();
        }
        return new qxd((fA / 100.0f) * f, (fA2 / 100.0f) * f);
    }
}

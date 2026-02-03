package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jdr extends fdbr implements fdae {
    final /* synthetic */ jdv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdr(jdv jdvVar) {
        super(0);
        this.a = jdvVar;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        jdv jdvVar = this.a;
        jdvVar.f.h = 0;
        hum humVarQ = jdvVar.o().q();
        Object[] objArr = humVarQ.a;
        int i = humVarQ.b;
        for (int i2 = 0; i2 < i; i2++) {
            jdv jdvVarV = ((jcr) objArr[i2]).v();
            jdvVarV.h = jdvVarV.i;
            jdvVarV.i = Alert.DURATION_SHOW_INDEFINITELY;
            jdvVarV.t = false;
            if (jdvVarV.G == 2) {
                jdvVarV.G = 3;
            }
        }
        jdvVar.j(jdp.a);
        jdvVar.i().K().o();
        jcr jcrVarO = jdvVar.o();
        hum humVarQ2 = jcrVarO.q();
        Object[] objArr2 = humVarQ2.a;
        int i3 = humVarQ2.b;
        for (int i4 = 0; i4 < i3; i4++) {
            jcr jcrVar = (jcr) objArr2[i4];
            if (jcrVar.v().h != jcrVar.n()) {
                jcrVarO.X();
                jcrVarO.O();
                if (jcrVar.n() == Integer.MAX_VALUE) {
                    if (jcrVar.w.c) {
                        jdm jdmVarU = jcrVar.u();
                        jdmVarU.getClass();
                        jdmVarU.r(false);
                    }
                    jcrVar.v().t();
                }
            }
        }
        jdvVar.j(jdq.a);
        return fctx.a;
    }
}

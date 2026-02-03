package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jdi extends fdbr implements fdae {
    final /* synthetic */ jdm a;
    final /* synthetic */ jdf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdi(jdm jdmVar, jdf jdfVar) {
        super(0);
        this.a = jdmVar;
        this.b = jdfVar;
    }

    @Override // defpackage.fdae
    public final /* synthetic */ Object invoke() {
        jdm jdmVar = this.a;
        jdmVar.f.g = 0;
        hum humVarQ = jdmVar.o().q();
        Object[] objArr = humVarQ.a;
        int i = humVarQ.b;
        for (int i2 = 0; i2 < i; i2++) {
            jdm jdmVar2 = ((jcr) objArr[i2]).w.p;
            jdmVar2.getClass();
            jdmVar2.h = jdmVar2.i;
            jdmVar2.i = Alert.DURATION_SHOW_INDEFINITELY;
            if (jdmVar2.w == 2) {
                jdmVar2.w = 3;
            }
        }
        jdmVar.j(jdg.a);
        jdf jdfVar = ((jbx) jdmVar.i()).g;
        if (jdfVar != null) {
            boolean z = jdfVar.l;
            List listE = jdmVar.o().E();
            int size = listE.size();
            for (int i3 = 0; i3 < size; i3++) {
                jdf jdfVarC = ((jcr) listE.get(i3)).x().C();
                if (jdfVarC != null) {
                    jdfVarC.l = z;
                }
            }
        }
        this.b.K().o();
        if (((jbx) jdmVar.i()).g != null) {
            List listE2 = jdmVar.o().E();
            int size2 = listE2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                jdf jdfVarC2 = ((jcr) listE2.get(i4)).x().C();
                if (jdfVarC2 != null) {
                    jdfVarC2.l = false;
                }
            }
        }
        hum humVarQ2 = jdmVar.o().q();
        Object[] objArr2 = humVarQ2.a;
        int i5 = humVarQ2.b;
        for (int i6 = 0; i6 < i5; i6++) {
            jdm jdmVar3 = ((jcr) objArr2[i6]).w.p;
            jdmVar3.getClass();
            int i7 = jdmVar3.h;
            int i8 = jdmVar3.i;
            if (i7 != i8 && i8 == Integer.MAX_VALUE) {
                jdmVar3.r(true);
            }
        }
        jdmVar.j(jdh.a);
        return fctx.a;
    }
}

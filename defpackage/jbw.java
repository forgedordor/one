package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jbw extends jdf {
    public jbw(jbx jbxVar) {
        super(jbxVar);
    }

    @Override // defpackage.jdf, defpackage.ivt
    public final int a(int i) {
        jbz jbzVarR = L().r();
        ixm ixmVarA = jbzVarR.a();
        jcr jcrVar = jbzVarR.a;
        return ixmVarA.a(jcrVar.x(), jcrVar.C(), i);
    }

    @Override // defpackage.jdf, defpackage.ivt
    public final int b(int i) {
        jbz jbzVarR = L().r();
        ixm ixmVarA = jbzVarR.a();
        jcr jcrVar = jbzVarR.a;
        return ixmVarA.b(jcrVar.x(), jcrVar.C(), i);
    }

    @Override // defpackage.jdf, defpackage.ivt
    public final int c(int i) {
        jbz jbzVarR = L().r();
        ixm ixmVarA = jbzVarR.a();
        jcr jcrVar = jbzVarR.a;
        return ixmVarA.c(jcrVar.x(), jcrVar.C(), i);
    }

    @Override // defpackage.jdf, defpackage.ivt
    public final int d(int i) {
        jbz jbzVarR = L().r();
        ixm ixmVarA = jbzVarR.a();
        jcr jcrVar = jbzVarR.a;
        return ixmVarA.d(jcrVar.x(), jcrVar.C(), i);
    }

    @Override // defpackage.ixk
    public final iyl e(long j) {
        z(j);
        hum humVarQ = L().q();
        Object[] objArr = humVarQ.a;
        int i = humVarQ.b;
        for (int i2 = 0; i2 < i; i2++) {
            jdm jdmVarU = ((jcr) objArr[i2]).u();
            jdmVarU.getClass();
            jdmVarU.w = 3;
        }
        super.D(L().q.e(this, L().C(), j));
        return this;
    }

    @Override // defpackage.jde
    public final int s(itz itzVar) {
        jdm jdmVar = (jdm) B();
        if (!jdmVar.j) {
            if (jdmVar.E() == 2) {
                jaj jajVar = jdmVar.p;
                jajVar.f = true;
                if (jajVar.b) {
                    jdmVar.f.e();
                }
            } else {
                jdmVar.p.g = true;
            }
        }
        jdf jdfVar = ((jbx) jdmVar.i()).g;
        if (jdfVar != null) {
            jdfVar.l = true;
        }
        jdmVar.k();
        jdf jdfVar2 = ((jbx) jdmVar.i()).g;
        if (jdfVar2 != null) {
            jdfVar2.l = false;
        }
        Integer num = (Integer) jdmVar.p.h.get(itzVar);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.q.c(itzVar, iIntValue);
        return iIntValue;
    }

    @Override // defpackage.jdf
    protected final void t() {
        jdm jdmVarU = L().u();
        jdmVarU.getClass();
        jdmVarU.t();
    }
}

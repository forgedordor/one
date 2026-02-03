package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ksm extends kta {
    ArrayList a;
    private int b;

    public ksm(krz krzVar, int i) {
        krz krzVar2;
        super(krzVar);
        this.a = new ArrayList();
        this.g = i;
        krz krzVar3 = this.d;
        krz krzVarN = krzVar3.n(i);
        while (true) {
            krz krzVar4 = krzVarN;
            krzVar2 = krzVar3;
            krzVar3 = krzVar4;
            if (krzVar3 == null) {
                break;
            } else {
                krzVarN = krzVar3.n(this.g);
            }
        }
        this.d = krzVar2;
        this.a.add(krzVar2.o(this.g));
        krz krzVarM = krzVar2.m(this.g);
        while (krzVarM != null) {
            this.a.add(krzVarM.o(this.g));
            krzVarM = krzVarM.m(this.g);
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            kta ktaVar = (kta) arrayList.get(i2);
            int i3 = this.g;
            if (i3 == 0) {
                ktaVar.d.m = this;
            } else if (i3 == 1) {
                ktaVar.d.n = this;
            }
        }
        if (this.g == 0 && ((ksa) this.d.ae).e && this.a.size() > 1) {
            this.d = ((kta) this.a.get(r6.size() - 1)).d;
        }
        this.b = this.g == 0 ? this.d.at : this.d.au;
    }

    private final krz g() {
        for (int i = 0; i < this.a.size(); i++) {
            krz krzVar = ((kta) this.a.get(i)).d;
            if (krzVar.ar != 8) {
                return krzVar;
            }
        }
        return null;
    }

    private final krz n() {
        krz krzVar;
        int size = this.a.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
            krzVar = ((kta) this.a.get(size)).d;
        } while (krzVar.ar == 8);
        return krzVar;
    }

    @Override // defpackage.kta
    public final long a() {
        int size = this.a.size();
        long jA = 0;
        for (int i = 0; i < size; i++) {
            jA = jA + r4.i.e + ((kta) this.a.get(i)).a() + r4.j.e;
        }
        return jA;
    }

    @Override // defpackage.kta
    public final void b() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((kta) arrayList.get(i)).b();
        }
        int size2 = this.a.size();
        if (size2 <= 0) {
            return;
        }
        krz krzVar = ((kta) this.a.get(0)).d;
        krz krzVar2 = ((kta) this.a.get(size2 - 1)).d;
        if (this.g == 0) {
            kry kryVar = krzVar.T;
            kry kryVar2 = krzVar2.V;
            ksp kspVarL = l(kryVar, 0);
            int iB = kryVar.b();
            krz krzVarG = g();
            if (krzVarG != null) {
                iB = krzVarG.T.b();
            }
            if (kspVarL != null) {
                j(this.i, kspVarL, iB);
            }
            ksp kspVarL2 = l(kryVar2, 0);
            int iB2 = kryVar2.b();
            krz krzVarN = n();
            if (krzVarN != null) {
                iB2 = krzVarN.V.b();
            }
            if (kspVarL2 != null) {
                j(this.j, kspVarL2, -iB2);
            }
        } else {
            kry kryVar3 = krzVar.U;
            kry kryVar4 = krzVar2.W;
            ksp kspVarL3 = l(kryVar3, 1);
            int iB3 = kryVar3.b();
            krz krzVarG2 = g();
            if (krzVarG2 != null) {
                iB3 = krzVarG2.U.b();
            }
            if (kspVarL3 != null) {
                j(this.i, kspVarL3, iB3);
            }
            ksp kspVarL4 = l(kryVar4, 1);
            int iB4 = kryVar4.b();
            krz krzVarN2 = n();
            if (krzVarN2 != null) {
                iB4 = krzVarN2.W.b();
            }
            if (kspVarL4 != null) {
                j(this.j, kspVarL4, -iB4);
            }
        }
        this.i.a = this;
        this.j.a = this;
    }

    @Override // defpackage.kta
    public final void c() {
        for (int i = 0; i < this.a.size(); i++) {
            ((kta) this.a.get(i)).c();
        }
    }

    @Override // defpackage.kta
    public final void d() {
        this.e = null;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((kta) arrayList.get(i)).d();
        }
    }

    @Override // defpackage.kta
    public final boolean e() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (!((kta) this.a.get(i)).e()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0197  */
    @Override // defpackage.kta, defpackage.ksn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 1001
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ksm.f():void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.g == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            kta ktaVar = (kta) arrayList.get(i);
            sb.append("<");
            sb.append(ktaVar);
            sb.append("> ");
        }
        return sb.toString();
    }
}

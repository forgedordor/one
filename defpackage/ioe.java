package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ioe extends ipk {
    public fdap e;
    public float g;
    public float h;
    public float i;
    public float l;
    public float m;
    private float[] o;
    private ikd q;
    private final List p = new ArrayList();
    public boolean a = true;
    public long b = ije.h;
    public List c = ipr.a;
    public boolean d = true;
    private final fdap r = new iod(this);
    public String f = "";
    public float j = 1.0f;
    public float k = 1.0f;
    public boolean n = true;

    private final void g() {
        this.a = false;
        this.b = ije.h;
    }

    private final void h(iiy iiyVar) {
        if (this.a && iiyVar != null) {
            if (iiyVar instanceof ikt) {
                i(((ikt) iiyVar).a);
            } else {
                g();
            }
        }
    }

    private final void i(long j) {
        if (this.a && j != 16) {
            long j2 = this.b;
            if (j2 == 16) {
                this.b = j;
                return;
            }
            List list = ipr.a;
            if (ije.d(j2) == ije.d(j) && ije.c(j2) == ije.c(j) && ije.b(j2) == ije.b(j)) {
                return;
            }
            g();
        }
    }

    private final boolean j() {
        return !this.c.isEmpty();
    }

    @Override // defpackage.ipk
    public final fdap a() {
        return this.e;
    }

    @Override // defpackage.ipk
    public final void b(imz imzVar) {
        if (this.n) {
            float[] fArrF = this.o;
            if (fArrF == null) {
                fArrF = iju.f();
                this.o = fArrF;
            } else {
                iju.c(fArrF);
            }
            iju.h(fArrF, this.l + this.h, this.m + this.i);
            iju.d(fArrF, this.g);
            iju.g(fArrF, this.j, this.k);
            iju.h(fArrF, -this.h, -this.i);
            this.n = false;
        }
        if (this.d) {
            if (j()) {
                ikd iikVar = this.q;
                if (iikVar == null) {
                    iikVar = new iik((byte[]) null);
                    this.q = iikVar;
                }
                ipj.a(this.c, iikVar);
            }
            this.d = false;
        }
        imt imtVarT = imzVar.t();
        long jA = imtVarT.a();
        imtVarT.b().l();
        try {
            imv imvVar = imtVarT.c;
            float[] fArr = this.o;
            if (fArr != null) {
                imvVar.a.b().b(new iju(fArr).a);
            }
            ikd ikdVar = this.q;
            if (j() && ikdVar != null) {
                imvVar.g(ikdVar);
            }
            List list = this.p;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((ipk) list.get(i)).b(imzVar);
            }
        } finally {
            imtVarT.b().j();
            imtVarT.h(jA);
        }
    }

    public final void c(int i, ipk ipkVar) {
        List list = this.p;
        if (i < list.size()) {
            list.set(i, ipkVar);
        } else {
            list.add(ipkVar);
        }
        d(ipkVar);
        ipkVar.e(this.r);
        f();
    }

    public final void d(ipk ipkVar) {
        if (ipkVar instanceof iol) {
            iol iolVar = (iol) ipkVar;
            h(iolVar.a);
            h(iolVar.f);
        } else if (ipkVar instanceof ioe) {
            ioe ioeVar = (ioe) ipkVar;
            if (ioeVar.a && this.a) {
                i(ioeVar.b);
            } else {
                g();
            }
        }
    }

    @Override // defpackage.ipk
    public final void e(fdap fdapVar) {
        this.e = fdapVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.f);
        List list = this.p;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ipk ipkVar = (ipk) list.get(i);
            sb.append("\t");
            sb.append(ipkVar.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}

package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecqd {
    final /* synthetic */ ecqf a;

    public ecqd(ecqf ecqfVar) {
        this.a = ecqfVar;
    }

    public final void a(ecqk ecqkVar) {
        ecqf ecqfVar = this.a;
        if (ecqfVar.c.a(((ecqi) ecqkVar).a) != null) {
            ecqfVar.e.a();
        }
    }

    public final void b() {
        ecqf.b();
        long epochMilli = Instant.now().toEpochMilli();
        ecqf ecqfVar = this.a;
        ecqfVar.k = epochMilli;
        ecpp ecppVar = ecqfVar.d;
        if (ecppVar != null) {
            ecppVar.a(ecqfVar.e.a());
        }
    }

    public final void c(ecqk ecqkVar) {
        ecqi ecqiVar = (ecqi) ecqkVar;
        ecqu ecquVar = ecqiVar.b;
        ecqu ecquVar2 = ecqu.EMBEDDED;
        if (!ecquVar.equals(ecquVar2)) {
            ecqf.b();
        }
        ecqf ecqfVar = this.a;
        String str = ecqiVar.a;
        ecqg ecqgVar = ecqfVar.c;
        ecpp ecppVarA = ecqgVar.a(str);
        ecqt ecqtVarB = ecqgVar.b(str);
        if (ecquVar != ecquVar2) {
            ecqfVar.k = Instant.now().toEpochMilli();
        }
        if (ecppVarA != null && ecqtVarB != null) {
            ecppVarA.a(ecqtVarB.a());
        }
        ecqgVar.f.remove(str);
    }

    public final void d() {
        ecqf.c();
        ecqf ecqfVar = this.a;
        ecpp ecppVar = ecqfVar.d;
        if (ecppVar != null) {
            ecppVar.b(ecqfVar.e.a());
        }
    }

    public final void e(ecqk ecqkVar) {
        ecqi ecqiVar = (ecqi) ecqkVar;
        if (!ecqiVar.b.equals(ecqu.EMBEDDED)) {
            ecqf.c();
        }
        ecqf ecqfVar = this.a;
        String str = ecqiVar.a;
        ecqg ecqgVar = ecqfVar.c;
        ecpp ecppVarA = ecqgVar.a(str);
        ecqt ecqtVarB = ecqgVar.b(str);
        if (ecppVarA == null || ecqtVarB == null) {
            return;
        }
        ecppVarA.b(ecqtVarB.a());
    }

    public final void f(ecqk ecqkVar) {
        ecqf ecqfVar = this.a;
        if (ecqfVar.c.a(((ecqi) ecqkVar).a) != null) {
            ecqfVar.e.a();
        }
    }

    public final void g(ecqk ecqkVar) {
        ecqf ecqfVar = this.a;
        if (ecqfVar.c.a(((ecqi) ecqkVar).a) != null) {
            ecqfVar.e.a();
        }
    }

    public final void h(ecqk ecqkVar) {
        ecqf ecqfVar = this.a;
        if (ecqfVar.c.a(((ecqi) ecqkVar).a) != null) {
            ecqfVar.e.a();
        }
    }

    public final void i(ecqk ecqkVar) {
        String str = ((ecqi) ecqkVar).a;
        ecqf ecqfVar = this.a;
        if (ecqfVar.c.a(str) != null) {
            ecqfVar.e.a();
        }
    }
}

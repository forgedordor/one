package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class euyv extends euzg {
    public final String a;
    public final euzl b;
    public final List c;
    public final List d;
    private final String e;
    private final String f;

    public euyv(String str, String str2, String str3, euzl euzlVar, List list, List list2) {
        this.e = str;
        this.f = str2;
        this.a = str3;
        this.b = euzlVar;
        this.c = list;
        this.d = list2;
    }

    @Override // defpackage.euzg
    public final euzl a() {
        return this.b;
    }

    @Override // defpackage.euzg
    public final String b() {
        return this.a;
    }

    @Override // defpackage.euzg
    public final String c() {
        return this.e;
    }

    @Override // defpackage.euzg
    public final String d() {
        return this.f;
    }

    @Override // defpackage.euzg
    public final List e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof euzg) {
            euzg euzgVar = (euzg) obj;
            if (this.e.equals(euzgVar.c()) && this.f.equals(euzgVar.d()) && this.a.equals(euzgVar.b()) && this.b.equals(euzgVar.a()) && this.c.equals(euzgVar.e()) && this.d.equals(euzgVar.f())) {
                euzgVar.g();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.euzg
    public final List f() {
        return this.d;
    }

    public final int hashCode() {
        return ((((((((((((this.e.hashCode() ^ 1000003) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 1237;
    }

    public final String toString() {
        List list = this.d;
        List list2 = this.c;
        return "TaskInfo{taskName=" + this.e + ", taskRunningModeName=" + this.f + ", taskGraphName=" + this.a + ", taskOptions=" + this.b.toString() + ", inputStreams=" + list2.toString() + ", outputStreams=" + list.toString() + ", enableFlowLimiting=false}";
    }

    @Override // defpackage.euzg
    public final void g() {
    }
}

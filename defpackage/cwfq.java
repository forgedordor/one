package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwfq {
    public final String a;
    public final List b;
    public final cwfb c;
    public final fdae d;
    public final cwhe e;
    public final cwfp f;

    public cwfq(String str, List list, cwfb cwfbVar, fdae fdaeVar, cwhe cwheVar, cwfp cwfpVar) {
        cwheVar.getClass();
        this.a = str;
        this.b = list;
        this.c = cwfbVar;
        this.d = fdaeVar;
        this.e = cwheVar;
        this.f = cwfpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwfq)) {
            return false;
        }
        cwfq cwfqVar = (cwfq) obj;
        return fdbq.f(this.a, cwfqVar.a) && fdbq.f(this.b, cwfqVar.b) && fdbq.f(this.c, cwfqVar.c) && fdbq.f(this.d, cwfqVar.d) && this.e == cwfqVar.e && fdbq.f(this.f, cwfqVar.f);
    }

    public final int hashCode() {
        String str = this.a;
        return ((((((((((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "PhotoSelectorUiData(title=" + this.a + ", photos=" + this.b + ", primaryButtonUiData=" + this.c + ", onDismiss=" + this.d + ", visibilityState=" + this.e + ", flags=" + this.f + ")";
    }
}

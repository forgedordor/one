package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wen {
    public final djdm a = null;
    public final dpdy b;

    public wen(dpdy dpdyVar) {
        this.b = dpdyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wen)) {
            return false;
        }
        wen wenVar = (wen) obj;
        djdm djdmVar = wenVar.a;
        return fdbq.f(null, null) && fdbq.f(this.b, wenVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "InputsData(inputsUiData=null, hugoUiData=" + this.b + ")";
    }
}

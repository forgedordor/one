package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzog extends dznt {
    private final String a = "";

    @Override // defpackage.dznt
    public final String d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dznt) {
            dznt dzntVar = (dznt) obj;
            dzntVar.e();
            if (this.a.equals(dzntVar.d())) {
                dzntVar.f();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ (-722379962)) * 1000003;
    }

    public final String toString() {
        return "ApplicationExitConfigurations{enablement=DEFAULT, reportingProcessShortName=" + this.a + ", metricExtensionProvider=null}";
    }

    @Override // defpackage.dznt
    public final void e() {
    }

    @Override // defpackage.dznt
    public final void f() {
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dodm implements dpxp {
    public final fduf a;
    public final boolean b;

    public dodm() {
        this((fduf) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dodm)) {
            return false;
        }
        dodm dodmVar = (dodm) obj;
        return fdbq.f(this.a, dodmVar.a) && this.b == dodmVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "MagicComposeConfiguration(uiState=" + this.a + ", useParentTheme=" + this.b + ")";
    }

    public dodm(fduf fdufVar, boolean z) {
        fdufVar.getClass();
        this.a = fdufVar;
        this.b = z;
    }

    public /* synthetic */ dodm(fduf fdufVar, int i) {
        this((i & 1) != 0 ? fdvf.a(new dofj(null)) : fdufVar, false);
    }
}

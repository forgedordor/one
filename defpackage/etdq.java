package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class etdq extends etea {
    public final etdn a;
    public final boolean b;

    public etdq(etdn etdnVar, boolean z) {
        this.a = etdnVar;
        this.b = z;
    }

    @Override // defpackage.etea
    public final etdn a() {
        return this.a;
    }

    @Override // defpackage.etea
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof etea) {
            etea eteaVar = (etea) obj;
            etdn etdnVar = this.a;
            if (etdnVar != null ? etdnVar.equals(eteaVar.a()) : eteaVar.a() == null) {
                if (this.b == eteaVar.b()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        etdn etdnVar = this.a;
        return (((etdnVar == null ? 0 : etdnVar.hashCode()) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "ParsingOptions{defaultRegion=" + String.valueOf(this.a) + ", keepRawInput=" + this.b + "}";
    }
}

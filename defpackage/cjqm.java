package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjqm extends cjxh {
    private final String a;
    private final ewpa b;

    public cjqm(String str, ewpa ewpaVar) {
        if (str == null) {
            throw new NullPointerException("Null simId");
        }
        this.a = str;
        if (ewpaVar == null) {
            throw new NullPointerException("Null msisdnSource");
        }
        this.b = ewpaVar;
    }

    @Override // defpackage.cjxh
    public final ewpa a() {
        return this.b;
    }

    @Override // defpackage.cjxh
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cjxh) {
            cjxh cjxhVar = (cjxh) obj;
            if (this.a.equals(cjxhVar.b()) && this.b.equals(cjxhVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}

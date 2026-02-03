package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpyp extends cpys {
    private final String a;
    private final int b;

    public cpyp(String str, int i) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.cpys
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cpys
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cpys) {
            cpys cpysVar = (cpys) obj;
            if (this.a.equals(cpysVar.a()) && this.b == cpysVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        int i = this.b;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "CMS_ENCRYPTION_KEY" : "BACKUP_KEY" : "MESSAGE" : "CONVERSATION" : "PARTICIPANT";
        return "CmsBuilderDependency{id=" + this.a + ", dependencyType=" + str + "}";
    }
}

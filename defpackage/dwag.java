package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwag extends dwbf {
    public final int a;
    public final String b;
    public final List c;
    public final dwpk d;
    public final dwpx e;

    public dwag(int i, String str, List list, dwpk dwpkVar, dwpx dwpxVar) {
        this.a = i;
        this.b = str;
        this.c = list;
        this.d = dwpkVar;
        this.e = dwpxVar;
    }

    @Override // defpackage.dwbf
    public final int a() {
        return this.a;
    }

    @Override // defpackage.dwbf
    public final dwpk b() {
        return this.d;
    }

    @Override // defpackage.dwbf
    public final dwpx c() {
        return this.e;
    }

    @Override // defpackage.dwbf
    public final String d() {
        return this.b;
    }

    @Override // defpackage.dwbf
    public final List e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwbf) {
            dwbf dwbfVar = (dwbf) obj;
            if (this.a == dwbfVar.a() && this.b.equals(dwbfVar.d()) && this.c.equals(dwbfVar.e()) && this.d.equals(dwbfVar.b()) && this.e.equals(dwbfVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        dwpx dwpxVar = this.e;
        dwpk dwpkVar = this.d;
        return "Receipt{receiptType=" + this.a + ", receiptId=" + this.b + ", messageIds=" + this.c.toString() + ", recipient=" + dwpkVar.toString() + ", conversationId=" + dwpxVar.toString() + "}";
    }
}

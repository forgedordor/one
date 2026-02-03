package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaox extends aapo {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final ekgp e;
    public final ekgp f;
    public final ekgb g;

    public aaox(int i, int i2, int i3, int i4, ekgp ekgpVar, ekgp ekgpVar2, ekgb ekgbVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        if (ekgpVar == null) {
            throw new NullPointerException("Null oneOnOneMatchedConversationResultSet");
        }
        this.e = ekgpVar;
        if (ekgpVar2 == null) {
            throw new NullPointerException("Null shortCodeMatchedConversationResultSet");
        }
        this.f = ekgpVar2;
        if (ekgbVar == null) {
            throw new NullPointerException("Null xmsGroupConversationResultSet");
        }
        this.g = ekgbVar;
    }

    @Override // defpackage.aapo
    public final int a() {
        return this.b;
    }

    @Override // defpackage.aapo
    public final int b() {
        return this.c;
    }

    @Override // defpackage.aapo
    public final int c() {
        return this.a;
    }

    @Override // defpackage.aapo
    public final int d() {
        return this.d;
    }

    @Override // defpackage.aapo
    public final ekgb e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aapo) {
            aapo aapoVar = (aapo) obj;
            if (this.a == aapoVar.c() && this.b == aapoVar.a() && this.c == aapoVar.b() && this.d == aapoVar.d() && this.e.equals(aapoVar.f()) && this.f.equals(aapoVar.g()) && ekjz.h(this.g, aapoVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aapo
    public final ekgp f() {
        return this.e;
    }

    @Override // defpackage.aapo
    public final ekgp g() {
        return this.f;
    }

    public final int hashCode() {
        return ((((((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        ekgb ekgbVar = this.g;
        ekgp ekgpVar = this.f;
        return "MixedUpConversationInfo{totalCount=" + this.a + ", oneOnOneMixedUpConversationsCount=" + this.b + ", shortCodeMixedUpConversationsCount=" + this.c + ", xmsGroupMixedUpConversationsCount=" + this.d + ", oneOnOneMatchedConversationResultSet=" + this.e.toString() + ", shortCodeMatchedConversationResultSet=" + ekgpVar.toString() + ", xmsGroupConversationResultSet=" + ekgbVar.toString() + "}";
    }
}

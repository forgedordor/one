package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aiik extends aiir {
    private final String a;
    private final int b;
    private final Supplier c;

    public aiik(String str, int i, Supplier supplier) {
        this.a = str;
        this.b = i;
        this.c = supplier;
    }

    @Override // defpackage.aiir
    public final int a() {
        return this.b;
    }

    @Override // defpackage.aiir
    public final String b() {
        return this.a;
    }

    @Override // defpackage.aiir
    public final Supplier c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aiir) {
            aiir aiirVar = (aiir) obj;
            if (this.a.equals(aiirVar.b()) && this.b == aiirVar.a() && this.c.equals(aiirVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "SettingsSearchEntry{className=" + this.a + ", xmlResId=" + this.b + ", enabled=" + this.c.toString() + "}";
    }
}

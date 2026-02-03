package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bxtu extends bxug {
    private final String a;
    private final Optional b;

    public bxtu(String str, Optional optional) {
        this.a = str;
        this.b = optional;
    }

    @Override // defpackage.bxug
    public final Optional a() {
        return this.b;
    }

    @Override // defpackage.bxug
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bxug) {
            bxug bxugVar = (bxug) obj;
            String str = this.a;
            if (str != null ? str.equals(bxugVar.b()) : bxugVar.b() == null) {
                if (this.b.equals(bxugVar.a())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "ContactData{lookupKey=" + this.a + ", messagingIdentity=" + this.b.toString() + "}";
    }
}

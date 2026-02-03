package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyjv extends dyju {
    public final String a;
    public final dyhk b;
    public final dyhk c;
    public final String d;

    public dyjv(String str, dyhk dyhkVar, dyhk dyhkVar2, String str2) {
        this.a = str;
        this.b = dyhkVar;
        this.c = dyhkVar2;
        this.d = str2;
    }

    @Override // defpackage.dyju
    public final dyhk a() {
        return this.c;
    }

    @Override // defpackage.dyju
    public final dyhk b() {
        return this.b;
    }

    @Override // defpackage.dyju
    public final String c() {
        return this.d;
    }

    @Override // defpackage.dyju
    public final String d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyju) {
            dyju dyjuVar = (dyju) obj;
            if (this.a.equals(dyjuVar.d()) && this.b.equals(dyjuVar.b()) && this.c.equals(dyjuVar.a()) && this.d.equals(dyjuVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        dyhk dyhkVar = this.c;
        return "AccountMessagesResources{recommendedActions=" + this.a + ", yellowAlertIcon=" + this.b.toString() + ", shieldIcon=" + dyhkVar.toString() + ", appPackageName=" + this.d + "}";
    }
}

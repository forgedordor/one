package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehvk extends ehvo {
    public final String a;
    public final ekgb b;
    public final evuh c;
    public final ehvh d;
    public final Optional e;

    public ehvk(String str, ekgb ekgbVar, evuh evuhVar, ehvh ehvhVar, Optional optional) {
        this.a = str;
        this.b = ekgbVar;
        this.c = evuhVar;
        this.d = ehvhVar;
        this.e = optional;
    }

    @Override // defpackage.ehvo
    public final ehvh a() {
        return this.d;
    }

    @Override // defpackage.ehvo
    public final ekgb b() {
        return this.b;
    }

    @Override // defpackage.ehvo
    public final evuh c() {
        return this.c;
    }

    @Override // defpackage.ehvo
    public final Optional d() {
        return this.e;
    }

    @Override // defpackage.ehvo
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ehvo) {
            ehvo ehvoVar = (ehvo) obj;
            if (this.a.equals(ehvoVar.e()) && ekjz.h(this.b, ehvoVar.b()) && this.c.equals(ehvoVar.c()) && this.d.equals(ehvoVar.a()) && this.e.equals(ehvoVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        Optional optional = this.e;
        ehvh ehvhVar = this.d;
        evuh evuhVar = this.c;
        return "DataStoreConfig{name=" + this.a + ", migrations=" + String.valueOf(this.b) + ", schema=" + evuhVar.toString() + ", storage=" + ehvhVar.toString() + ", corruptionHandler=" + String.valueOf(optional) + "}";
    }
}

package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvks {
    public final ezol a;
    public final String b;
    public final Optional c;
    public final ezol d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bvks(ezol ezolVar, String str, Optional optional) {
        this(ezolVar, str, optional, null);
        ezolVar.getClass();
        str.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bvks)) {
            return false;
        }
        bvks bvksVar = (bvks) obj;
        return fdbq.f(this.a, bvksVar.a) && fdbq.f(this.b, bvksVar.b) && fdbq.f(this.c, bvksVar.c) && fdbq.f(this.d, bvksVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "DittoIdContainer(tachyonId=" + this.a + ", desktopId=" + this.b + ", destinationRegistrationId=" + this.c + ", desktopIdAsTachyonId=" + this.d + ")";
    }

    public /* synthetic */ bvks(ezol ezolVar, String str, Optional optional, byte[] bArr) {
        ezok ezokVar = (ezok) ezolVar.toBuilder();
        ezokVar.copyOnWrite();
        ((ezol) ezokVar.instance).c = str;
        ezol ezolVar2 = (ezol) ezokVar.build();
        ezolVar2.getClass();
        this.a = ezolVar;
        this.b = str;
        this.c = optional;
        this.d = ezolVar2;
    }
}

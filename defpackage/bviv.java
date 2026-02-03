package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bviv extends bvix {
    public final String a;
    public final bvks b;
    private final ezol c;
    private final long d;
    private final bvdm e;
    private final boolean f;

    public bviv(ezol ezolVar, String str, long j, bvdm bvdmVar, boolean z, bvks bvksVar) {
        this.c = ezolVar;
        this.a = str;
        this.d = j;
        this.e = bvdmVar;
        this.f = z;
        this.b = bvksVar;
    }

    @Override // defpackage.bvix
    public final long a() {
        return this.d;
    }

    @Override // defpackage.bvix
    public final bvdm b() {
        return this.e;
    }

    @Override // defpackage.bvix
    public final bvks c() {
        return this.b;
    }

    @Override // defpackage.bvix
    @Deprecated
    public final ezol d() {
        return this.c;
    }

    @Override // defpackage.bvix
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bvix) {
            bvix bvixVar = (bvix) obj;
            if (this.c.equals(bvixVar.d()) && this.a.equals(bvixVar.e()) && this.d == bvixVar.a() && this.e.equals(bvixVar.b()) && this.f == bvixVar.f() && this.b.equals(bvixVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bvix
    public final boolean f() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = ((this.c.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
        long j = this.d;
        return (((((((iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        bvks bvksVar = this.b;
        bvdm bvdmVar = this.e;
        return "DesktopInformation{desktopId=" + this.c.toString() + ", requestId=" + this.a + ", lastConnectionTimeMillis=" + this.d + ", desktopType=" + bvdmVar.toString() + ", isPersistent=" + this.f + ", dittoIdContainer=" + bvksVar.toString() + "}";
    }
}

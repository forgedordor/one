package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ecof implements ecoc {
    long a = 0;

    @Override // defpackage.ecoc
    public final esxc a() {
        esxb esxbVar = (esxb) esxc.a.createBuilder();
        long j = this.a;
        esxbVar.copyOnWrite();
        esxc esxcVar = (esxc) esxbVar.instance;
        esxcVar.b = 1;
        esxcVar.c = Long.valueOf(j);
        return (esxc) esxbVar.build();
    }

    @Override // defpackage.ecoc
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a += ((Long) obj).longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ecof) && this.a == ((ecof) obj).a;
    }

    public final int hashCode() {
        return Long.valueOf(this.a).hashCode();
    }

    public final String toString() {
        return Long.toString(this.a);
    }
}

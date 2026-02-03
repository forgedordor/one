package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zzk implements divg {
    public final fdae a;
    public final String b;
    public final List c;
    public final fdae d;
    public final fdae e;
    private final boolean f;

    public zzk(fdae fdaeVar, String str, List list, fdae fdaeVar2, fdae fdaeVar3) {
        str.getClass();
        this.a = fdaeVar;
        this.f = false;
        this.b = str;
        this.c = list;
        this.d = fdaeVar2;
        this.e = fdaeVar3;
    }

    @Override // defpackage.divg
    public final /* bridge */ /* synthetic */ divg a(fdae fdaeVar) {
        return new zzk(fdaeVar, this.b, this.c, this.d, this.e);
    }

    @Override // defpackage.divg
    public final fdae b() {
        return this.a;
    }

    @Override // defpackage.divg
    public final boolean c() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzk)) {
            return false;
        }
        zzk zzkVar = (zzk) obj;
        if (!fdbq.f(this.a, zzkVar.a)) {
            return false;
        }
        boolean z = zzkVar.f;
        return fdbq.f(this.b, zzkVar.b) && fdbq.f(this.c, zzkVar.c) && fdbq.f(this.d, zzkVar.d) && fdbq.f(this.e, zzkVar.e);
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + 1237) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "PremiumSmsOptionsUiData(onDismiss=" + this.a + ", includeScrim=false, body=" + this.b + ", bodyAnnotations=" + this.c + ", onSettingsClick=" + this.d + ", onResendClick=" + this.e + ")";
    }
}

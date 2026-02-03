package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zzh implements divg {
    public final fdae a;
    public final fdae b;
    public final fdae c;
    public final fdae d;
    public final fdae e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final boolean k;
    public final boolean l;
    private final fdae m;
    private final boolean n = true;

    public zzh(fdae fdaeVar, fdae fdaeVar2, fdae fdaeVar3, fdae fdaeVar4, fdae fdaeVar5, fdae fdaeVar6, boolean z, boolean z2, boolean z3, boolean z4, String str, boolean z5, boolean z6) {
        this.m = fdaeVar;
        this.a = fdaeVar2;
        this.b = fdaeVar3;
        this.c = fdaeVar4;
        this.d = fdaeVar5;
        this.e = fdaeVar6;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = str;
        this.k = z5;
        this.l = z6;
    }

    @Override // defpackage.divg
    public final /* bridge */ /* synthetic */ divg a(fdae fdaeVar) {
        return new zzh(fdaeVar, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
    }

    @Override // defpackage.divg
    public final fdae b() {
        return this.m;
    }

    @Override // defpackage.divg
    public final boolean c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzhVar = (zzh) obj;
        if (!fdbq.f(this.m, zzhVar.m)) {
            return false;
        }
        boolean z = zzhVar.n;
        return fdbq.f(this.a, zzhVar.a) && fdbq.f(this.b, zzhVar.b) && fdbq.f(this.c, zzhVar.c) && fdbq.f(this.d, zzhVar.d) && fdbq.f(this.e, zzhVar.e) && this.f == zzhVar.f && this.g == zzhVar.g && this.h == zzhVar.h && this.i == zzhVar.i && fdbq.f(this.j, zzhVar.j) && this.k == zzhVar.k && this.l == zzhVar.l;
    }

    public final int hashCode() {
        int iHashCode = this.m.hashCode() * 31;
        fdae fdaeVar = this.a;
        int iA = (((iHashCode + zzg.a(true)) * 31) + (fdaeVar == null ? 0 : fdaeVar.hashCode())) * 31;
        fdae fdaeVar2 = this.b;
        int iHashCode2 = (iA + (fdaeVar2 == null ? 0 : fdaeVar2.hashCode())) * 31;
        fdae fdaeVar3 = this.c;
        int iHashCode3 = (iHashCode2 + (fdaeVar3 == null ? 0 : fdaeVar3.hashCode())) * 31;
        fdae fdaeVar4 = this.d;
        int iHashCode4 = (iHashCode3 + (fdaeVar4 == null ? 0 : fdaeVar4.hashCode())) * 31;
        fdae fdaeVar5 = this.e;
        int iHashCode5 = (((((((((iHashCode4 + (fdaeVar5 == null ? 0 : fdaeVar5.hashCode())) * 31) + zzg.a(this.f)) * 31) + zzg.a(this.g)) * 31) + zzg.a(this.h)) * 31) + zzg.a(this.i)) * 31;
        String str = this.j;
        return ((((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31) + zzg.a(this.k)) * 31) + zzg.a(this.l);
    }

    public final String toString() {
        return "MessageActionsUiData(onDismiss=" + this.m + ", includeScrim=true, onOpenSettings=" + this.a + ", onResend=" + this.b + ", onResendAsFallback=" + this.c + ", onDelete=" + this.d + ", onCall=" + this.e + ", isRcs=" + this.f + ", isEncrypted=" + this.g + ", isSending=" + this.h + ", isSent=" + this.i + ", recipientDisplayName=" + this.j + ", hasSendingConnection=" + this.k + ", hasDataConnection=" + this.l + ")";
    }
}

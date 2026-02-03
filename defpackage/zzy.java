package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zzy implements divg {
    public final fdae a;
    public final fdae b;
    public final String c;
    public final aaab d;
    private final boolean e;

    public zzy(fdae fdaeVar, fdae fdaeVar2, String str, aaab aaabVar) {
        aaabVar.getClass();
        this.a = fdaeVar;
        this.e = true;
        this.b = fdaeVar2;
        this.c = str;
        this.d = aaabVar;
    }

    @Override // defpackage.divg
    public final divg a(fdae fdaeVar) {
        return new zzy(fdaeVar, this.b, this.c, this.d);
    }

    @Override // defpackage.divg
    public final fdae b() {
        return this.a;
    }

    @Override // defpackage.divg
    public final boolean c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzy)) {
            return false;
        }
        zzy zzyVar = (zzy) obj;
        if (!fdbq.f(this.a, zzyVar.a)) {
            return false;
        }
        boolean z = zzyVar.e;
        return fdbq.f(this.b, zzyVar.b) && fdbq.f(this.c, zzyVar.c) && this.d == zzyVar.d;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + 1231) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "ComposeConfirmationUiData(onDismiss=" + this.a + ", includeScrim=true, onStartSetup=" + this.b + ", phoneNumber=" + this.c + ", composeType=" + this.d + ")";
    }

    public /* synthetic */ zzy(fdae fdaeVar, String str, aaab aaabVar) {
        this(new fdae() { // from class: zzx
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        }, fdaeVar, str, aaabVar);
    }
}

package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cggw extends cgkp {
    private final Optional a;
    private final CharSequence b;
    private final long c;
    private final Optional d;
    private final Optional e;

    public cggw(Optional optional, CharSequence charSequence, long j, Optional optional2, Optional optional3) {
        this.a = optional;
        this.b = charSequence;
        this.c = j;
        this.d = optional2;
        this.e = optional3;
    }

    @Override // defpackage.cgkp
    public final long a() {
        return this.c;
    }

    @Override // defpackage.cgkp
    public final Optional b() {
        return this.d;
    }

    @Override // defpackage.cgkp
    public final Optional c() {
        return this.e;
    }

    @Override // defpackage.cgkp
    public final Optional d() {
        return this.a;
    }

    @Override // defpackage.cgkp
    public final CharSequence e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cgkp) {
            cgkp cgkpVar = (cgkp) obj;
            if (this.a.equals(cgkpVar.d()) && this.b.equals(cgkpVar.e()) && this.c == cgkpVar.a() && this.d.equals(cgkpVar.b()) && this.e.equals(cgkpVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        long j = this.c;
        return (((((iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        Optional optional = this.e;
        Optional optional2 = this.d;
        CharSequence charSequence = this.b;
        return "NotificationMessage{personInfo=" + String.valueOf(this.a) + ", messageText=" + charSequence.toString() + ", messageTimestamp=" + this.c + ", attachmentType=" + String.valueOf(optional2) + ", attachmentUri=" + String.valueOf(optional) + "}";
    }
}

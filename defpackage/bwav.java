package defpackage;

import com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bwav extends bwkk {
    public final eyfx a;
    public final basd b;
    public final String c;
    public final ekib d;
    public final boolean e;
    public final boolean f;
    public final elss g;
    public final NativeMessageEncryptorV2 h;

    public bwav(eyfx eyfxVar, basd basdVar, String str, ekib ekibVar, boolean z, boolean z2, elss elssVar, NativeMessageEncryptorV2 nativeMessageEncryptorV2) {
        this.a = eyfxVar;
        this.b = basdVar;
        this.c = str;
        this.d = ekibVar;
        this.e = z;
        this.f = z2;
        this.g = elssVar;
        this.h = nativeMessageEncryptorV2;
    }

    @Override // defpackage.bwkk
    public final basd a() {
        return this.b;
    }

    @Override // defpackage.bwkk
    public final ekib b() {
        return this.d;
    }

    @Override // defpackage.bwkk
    public final elss c() {
        return this.g;
    }

    @Override // defpackage.bwkk
    public final NativeMessageEncryptorV2 d() {
        return this.h;
    }

    @Override // defpackage.bwkk
    public final eyfx e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bwkk) {
            bwkk bwkkVar = (bwkk) obj;
            if (this.a.equals(bwkkVar.e()) && this.b.equals(bwkkVar.a()) && this.c.equals(bwkkVar.f()) && this.d.equals(bwkkVar.b()) && this.e == bwkkVar.h() && this.f == bwkkVar.g() && this.g.equals(bwkkVar.c()) && this.h.equals(bwkkVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bwkk
    public final String f() {
        return this.c;
    }

    @Override // defpackage.bwkk
    public final boolean g() {
        return this.f;
    }

    @Override // defpackage.bwkk
    public final boolean h() {
        return this.e;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true == this.f ? 1231 : 1237)) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        NativeMessageEncryptorV2 nativeMessageEncryptorV2 = this.h;
        elss elssVar = this.g;
        ekib ekibVar = this.d;
        basd basdVar = this.b;
        return "MessageEncryptParams{secretMessage=" + this.a.toString() + ", rcsMessageId=" + basdVar.toString() + ", localRegistrationId=" + this.c + ", normalizedDestinationWithRegistrations=" + ekibVar.toString() + ", isReceipt=" + this.e + ", forceOtk=" + this.f + ", messageType=" + elssVar.toString() + ", messageEncryptor=" + nativeMessageEncryptorV2.toString() + "}";
    }
}

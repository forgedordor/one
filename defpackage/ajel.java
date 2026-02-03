package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ajel extends ajfg {
    public final MessageCoreData a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final Optional f;
    public final int g;
    public final Optional h;
    public final Optional i;
    public final Optional j;
    public final int k;

    public ajel(MessageCoreData messageCoreData, int i, int i2, int i3, int i4, Optional optional, int i5, int i6, Optional optional2, Optional optional3, Optional optional4) {
        this.a = messageCoreData;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = optional;
        this.k = i5;
        this.g = i6;
        this.h = optional2;
        this.i = optional3;
        this.j = optional4;
    }

    @Override // defpackage.ajfg
    public final int a() {
        return this.e;
    }

    @Override // defpackage.ajfg
    public final int b() {
        return this.d;
    }

    @Override // defpackage.ajfg
    public final int c() {
        return this.g;
    }

    @Override // defpackage.ajfg
    public final int d() {
        return this.c;
    }

    @Override // defpackage.ajfg
    public final int e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajfg) {
            ajfg ajfgVar = (ajfg) obj;
            if (this.a.equals(ajfgVar.f()) && this.b == ajfgVar.e() && this.c == ajfgVar.d() && this.d == ajfgVar.b() && this.e == ajfgVar.a() && this.f.equals(ajfgVar.i()) && this.k == ajfgVar.k() && this.g == ajfgVar.c() && this.h.equals(ajfgVar.g()) && this.i.equals(ajfgVar.h()) && this.j.equals(ajfgVar.j())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ajfg
    public final MessageCoreData f() {
        return this.a;
    }

    @Override // defpackage.ajfg
    public final Optional g() {
        return this.h;
    }

    @Override // defpackage.ajfg
    public final Optional h() {
        return this.i;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode();
        int i = this.k;
        elow.c(i);
        return (((((((((iHashCode * 1000003) ^ i) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode();
    }

    @Override // defpackage.ajfg
    public final Optional i() {
        return this.f;
    }

    @Override // defpackage.ajfg
    public final Optional j() {
        return this.j;
    }

    @Override // defpackage.ajfg
    public final int k() {
        return this.k;
    }

    public final String toString() {
        Optional optional = this.j;
        Optional optional2 = this.i;
        Optional optional3 = this.h;
        int i = this.k;
        Optional optional4 = this.f;
        return "MessageFailureParameters{messageSnapshot=" + this.a.toString() + ", subId=" + this.b + ", resultCode=" + this.c + ", httpStatusCode=" + this.d + ", errorCode=" + this.e + ", rcsDiagnostics=" + String.valueOf(optional4) + ", mmsApi=" + elow.b(i) + ", lastConnectionFailureCauseCode=" + this.g + ", formatType=" + String.valueOf(optional3) + ", outgoingFailureReason=" + String.valueOf(optional2) + ", satelliteMessageSubType=" + String.valueOf(optional) + "}";
    }
}

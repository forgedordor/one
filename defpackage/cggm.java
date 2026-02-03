package defpackage;

import android.os.Bundle;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cggm extends cgis {
    private final cgit a;
    private final Bundle b;
    private final boolean c;
    private final CharSequence d;
    private final boolean e;
    private final boolean f;
    private final Optional g;
    private final Optional h;
    private final Optional i;
    private final Optional j;
    private final Optional k;
    private final Optional l;

    public cggm(cgit cgitVar, Bundle bundle, boolean z, CharSequence charSequence, boolean z2, boolean z3, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6) {
        this.a = cgitVar;
        this.b = bundle;
        this.c = z;
        this.d = charSequence;
        this.e = z2;
        this.f = z3;
        this.g = optional;
        this.h = optional2;
        this.i = optional3;
        this.j = optional4;
        this.k = optional5;
        this.l = optional6;
    }

    @Override // defpackage.cgis
    public final Bundle a() {
        return this.b;
    }

    @Override // defpackage.cgis
    public final cgit b() {
        return this.a;
    }

    @Override // defpackage.cgis
    public final Optional c() {
        return this.h;
    }

    @Override // defpackage.cgis
    public final Optional d() {
        return this.j;
    }

    @Override // defpackage.cgis
    public final Optional e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cgis) {
            cgis cgisVar = (cgis) obj;
            if (this.a.equals(cgisVar.b()) && this.b.equals(cgisVar.a()) && this.c == cgisVar.l() && this.d.equals(cgisVar.i()) && this.e == cgisVar.k() && this.f == cgisVar.j() && this.g.equals(cgisVar.f()) && this.h.equals(cgisVar.c()) && this.i.equals(cgisVar.e()) && this.j.equals(cgisVar.d()) && this.k.equals(cgisVar.h()) && this.l.equals(cgisVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cgis
    public final Optional f() {
        return this.g;
    }

    @Override // defpackage.cgis
    public final Optional g() {
        return this.l;
    }

    @Override // defpackage.cgis
    public final Optional h() {
        return this.k;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true == this.f ? 1231 : 1237)) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode();
    }

    @Override // defpackage.cgis
    public final CharSequence i() {
        return this.d;
    }

    @Override // defpackage.cgis
    public final boolean j() {
        return this.f;
    }

    @Override // defpackage.cgis
    public final boolean k() {
        return this.e;
    }

    @Override // defpackage.cgis
    public final boolean l() {
        return this.c;
    }

    public final String toString() {
        Optional optional = this.l;
        Optional optional2 = this.k;
        Optional optional3 = this.j;
        Optional optional4 = this.i;
        Optional optional5 = this.h;
        Optional optional6 = this.g;
        CharSequence charSequence = this.d;
        Bundle bundle = this.b;
        return "NotificationActionInfo{actionType=" + this.a.toString() + ", callbackBundle=" + bundle.toString() + ", shouldAddParentStack=" + this.c + ", title=" + charSequence.toString() + ", openActivityOnWear=" + this.e + ", isMainActivityWearAction=" + this.f + ", intentToRun=" + String.valueOf(optional6) + ", activityIntent=" + String.valueOf(optional5) + ", icon=" + String.valueOf(optional4) + ", allowGeneratedReplies=" + String.valueOf(optional3) + ", semanticAction=" + String.valueOf(optional2) + ", remoteInputs=" + String.valueOf(optional) + "}";
    }
}

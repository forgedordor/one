package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ailk extends ailo {
    public final ellg a;
    public final aioj b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final int f;
    private final aimo g;

    public ailk(ellg ellgVar, aioj aiojVar, int i, Optional optional, aimo aimoVar, Optional optional2, Optional optional3) {
        this.a = ellgVar;
        this.b = aiojVar;
        this.f = i;
        this.c = optional;
        this.g = aimoVar;
        this.d = optional2;
        this.e = optional3;
    }

    @Override // defpackage.ailo
    public final aimo a() {
        return this.g;
    }

    @Override // defpackage.ailo
    public final aioj b() {
        return this.b;
    }

    @Override // defpackage.ailo
    public final ellg c() {
        return this.a;
    }

    @Override // defpackage.ailo
    public final Optional d() {
        return this.e;
    }

    @Override // defpackage.ailo
    public final Optional e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ailo) {
            ailo ailoVar = (ailo) obj;
            if (this.a.equals(ailoVar.c()) && this.b.equals(ailoVar.b()) && this.f == ailoVar.g() && this.c.equals(ailoVar.f()) && this.g.equals(ailoVar.a()) && this.d.equals(ailoVar.e()) && this.e.equals(ailoVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ailo
    public final Optional f() {
        return this.c;
    }

    @Override // defpackage.ailo
    public final int g() {
        return this.f;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        int i = this.f;
        Optional optional = this.e;
        Optional optional2 = this.d;
        aimo aimoVar = this.g;
        Optional optional3 = this.c;
        aioj aiojVar = this.b;
        return "BugleClearcutLoggerChain{event=" + this.a.toString() + ", logSpec=" + aiojVar.toString() + ", logPurpose=" + Integer.toString(i - 1) + ", stacktrace=" + String.valueOf(optional3) + ", logger=" + aimoVar.toString() + ", overrideTimestamp=" + String.valueOf(optional2) + ", eventCode=" + String.valueOf(optional) + "}";
    }
}

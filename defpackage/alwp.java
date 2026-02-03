package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alwp extends ameh {
    private final aoer a;
    private final ajlq b;
    private final ajmw c;
    private final Instant d;

    public alwp(aoer aoerVar, ajlq ajlqVar, ajmw ajmwVar, Instant instant) {
        if (aoerVar == null) {
            throw new NullPointerException("Null sendingSelfIdentity");
        }
        this.a = aoerVar;
        if (ajlqVar == null) {
            throw new NullPointerException("Null deliveryStatus");
        }
        this.b = ajlqVar;
        this.c = ajmwVar;
        if (instant == null) {
            throw new NullPointerException("Null timestamp");
        }
        this.d = instant;
    }

    @Override // defpackage.ameh, defpackage.ajmr
    public final ajlq a() {
        return this.b;
    }

    @Override // defpackage.ameh, defpackage.ajmr
    public final ajmw b() {
        return this.c;
    }

    @Override // defpackage.ajmq
    public final aoer c() {
        return this.a;
    }

    @Override // defpackage.ameh
    public final Instant e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ameh) {
            ameh amehVar = (ameh) obj;
            if (this.a.equals(amehVar.c()) && this.b.equals(amehVar.a()) && this.c.equals(amehVar.b()) && this.d.equals(amehVar.e())) {
                amehVar.f();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
    }

    public final String toString() {
        Instant instant = this.d;
        ajmw ajmwVar = this.c;
        ajlq ajlqVar = this.b;
        return "DefaultOutgoingMessageProvenance{sendingSelfIdentity=" + this.a.toString() + ", deliveryStatus=" + ajlqVar.toString() + ", readReport=" + ajmwVar.toString() + ", timestamp=" + instant.toString() + ", messageDetails=null}";
    }

    @Override // defpackage.ameh
    public final void f() {
    }
}

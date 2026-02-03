package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfzw extends dfzy {
    public final Optional a;
    public final String b;
    public final ewfe c;
    public final ebmr d;
    public final int e;
    public final String f;
    public final Optional g;
    public final ekhx h;

    public dfzw(Optional optional, String str, ewfe ewfeVar, ebmr ebmrVar, int i, String str2, Optional optional2, ekhx ekhxVar) {
        this.a = optional;
        this.b = str;
        this.c = ewfeVar;
        this.d = ebmrVar;
        this.e = i;
        this.f = str2;
        this.g = optional2;
        this.h = ekhxVar;
    }

    @Override // defpackage.dfzy
    public final int a() {
        return this.e;
    }

    @Override // defpackage.dfzy
    public final ebmr b() {
        return this.d;
    }

    @Override // defpackage.dfzy
    public final ekhx c() {
        return this.h;
    }

    @Override // defpackage.dfzy
    public final ewfe d() {
        return this.c;
    }

    @Override // defpackage.dfzy
    public final Optional e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dfzy) {
            dfzy dfzyVar = (dfzy) obj;
            if (this.a.equals(dfzyVar.f()) && this.b.equals(dfzyVar.h()) && this.c.equals(dfzyVar.d()) && this.d.equals(dfzyVar.b()) && this.e == dfzyVar.a() && this.f.equals(dfzyVar.g()) && this.g.equals(dfzyVar.e()) && this.h.equals(dfzyVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dfzy
    public final Optional f() {
        return this.a;
    }

    @Override // defpackage.dfzy
    public final String g() {
        return this.f;
    }

    @Override // defpackage.dfzy
    public final String h() {
        return this.b;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        ekhx ekhxVar = this.h;
        Optional optional = this.g;
        ebmr ebmrVar = this.d;
        ewfe ewfeVar = this.c;
        return "RegistrationContext{publicGruu=" + String.valueOf(this.a) + ", username=" + this.b + ", localIpAddress=" + ewfeVar.toString() + ", proxyProtocol=" + ebmrVar.toString() + ", listeningPort=" + this.e + ", instance=" + this.f + ", accessNetworkInfoHeader=" + String.valueOf(optional) + ", registeredFeatureTags=" + ekhxVar.toString() + "}";
    }
}

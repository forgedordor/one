package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cggr extends cgkc {
    private final ekgb a;
    private final Optional b;

    public cggr(ekgb ekgbVar, Optional optional) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null notificationBuilderInfos");
        }
        this.a = ekgbVar;
        this.b = optional;
    }

    @Override // defpackage.cgkc
    public final ekgb a() {
        return this.a;
    }

    @Override // defpackage.cgkc
    public final Optional b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cgkc) {
            cgkc cgkcVar = (cgkc) obj;
            if (ekjz.h(this.a, cgkcVar.a()) && this.b.equals(cgkcVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Optional optional = this.b;
        return "NotificationCreationPackage{notificationBuilderInfos=" + this.a.toString() + ", summaryBuilderInfo=" + optional.toString() + "}";
    }
}

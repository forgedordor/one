package defpackage;

import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhdz {
    public String b;
    public dhmn d;
    public dhng e;
    public List f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public String a = ebmh.a();
    public long c = System.currentTimeMillis();

    public dhdz(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.g = fcsuVar;
        this.h = fcsuVar2;
        this.i = fcsuVar3;
    }

    public final dhmn a() {
        if (this.d == null) {
            this.d = (dhmn) this.i.b();
        }
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dhdz)) {
            return false;
        }
        dhdz dhdzVar = (dhdz) obj;
        return Objects.equals(this.b, dhdzVar.b) && Objects.equals(this.d, dhdzVar.a());
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = str != null ? str.hashCode() : 0;
        dhmn dhmnVar = this.d;
        return (iHashCode * 31) + (dhmnVar != null ? dhmnVar.hashCode() : 0);
    }
}

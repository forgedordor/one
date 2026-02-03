package defpackage;

import android.content.Context;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djml implements djmy {
    public final Context a;
    public final Instant b;
    public final boolean c;
    public final fdap d;
    public final fdap e;
    public final fdap f;
    public final dktq g;
    public final dktq h;
    public final fdae i;

    public djml(Context context, Instant instant, boolean z, fdap fdapVar, fdap fdapVar2, fdap fdapVar3, dktq dktqVar, dktq dktqVar2, fdae fdaeVar) {
        this.a = context;
        this.b = instant;
        this.c = z;
        this.d = fdapVar;
        this.e = fdapVar2;
        this.f = fdapVar3;
        this.g = dktqVar;
        this.h = dktqVar2;
        this.i = fdaeVar;
    }

    @Override // defpackage.djmy
    public final /* synthetic */ djmy a(boolean z, fdae fdaeVar) {
        return djmg.a(this, z, fdaeVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djml)) {
            return false;
        }
        djml djmlVar = (djml) obj;
        return fdbq.f(this.a, djmlVar.a) && fdbq.f(this.b, djmlVar.b) && this.c == djmlVar.c && fdbq.f(this.d, djmlVar.d) && fdbq.f(this.e, djmlVar.e) && fdbq.f(this.f, djmlVar.f) && fdbq.f(this.g, djmlVar.g) && fdbq.f(this.h, djmlVar.h) && fdbq.f(this.i, djmlVar.i);
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + (true != this.c ? 1237 : 1231)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
        dktq dktqVar = this.g;
        int iHashCode2 = ((iHashCode * 31) + (dktqVar == null ? 0 : dktqVar.hashCode())) * 31;
        dktq dktqVar2 = this.h;
        return ((iHashCode2 + (dktqVar2 != null ? dktqVar2.hashCode() : 0)) * 31) + this.i.hashCode();
    }

    public final String toString() {
        return "DateTimePicker(context=" + this.a + ", initialDateTime=" + this.b + ", display24HourToggle=" + this.c + ", isSelectableYear=" + this.d + ", isSelectableDate=" + this.e + ", onDateTimeSelected=" + this.f + ", confirmButton=" + this.g + ", dismissButton=" + this.h + ", onDismissRequest=" + this.i + ")";
    }
}

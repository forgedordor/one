package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yki implements yis {
    public final dkkr a;
    public final dkgq b;
    public final ajlt c;
    public final ykf d;
    public final ykh e;
    public final String f;
    private final boolean g;
    private final boolean h;
    private final MessageId i;

    public yki(dkkr dkkrVar, dkgq dkgqVar, ajlt ajltVar, ykf ykfVar, boolean z, ykh ykhVar, boolean z2) {
        dkgqVar.getClass();
        ajltVar.getClass();
        this.a = dkkrVar;
        this.b = dkgqVar;
        this.c = ajltVar;
        this.d = ykfVar;
        this.g = z;
        this.e = ykhVar;
        this.h = z2;
        String strA = ajltVar.b().a();
        strA.getClass();
        this.f = strA;
        this.i = ajltVar.b();
        ykm.a(ajltVar);
    }

    public static /* synthetic */ yki c(yki ykiVar, dkkr dkkrVar, dkgq dkgqVar, int i) {
        if ((i & 1) != 0) {
            dkkrVar = ykiVar.a;
        }
        dkkr dkkrVar2 = dkkrVar;
        ajlt ajltVar = ykiVar.c;
        ykf ykfVar = ykiVar.d;
        boolean z = ykiVar.g;
        ykh ykhVar = ykiVar.e;
        boolean z2 = ykiVar.h;
        dkkrVar2.getClass();
        return new yki(dkkrVar2, dkgqVar, ajltVar, ykfVar, z, ykhVar, z2);
    }

    @Override // defpackage.yis
    public final MessageId a() {
        return this.i;
    }

    @Override // defpackage.dkfe
    public final String b() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yki)) {
            return false;
        }
        yki ykiVar = (yki) obj;
        return fdbq.f(this.a, ykiVar.a) && fdbq.f(this.b, ykiVar.b) && fdbq.f(this.c, ykiVar.c) && fdbq.f(this.d, ykiVar.d) && this.g == ykiVar.g && fdbq.f(this.e, ykiVar.e) && this.h == ykiVar.h;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        ykf ykfVar = this.d;
        return (((((((iHashCode * 31) + (ykfVar == null ? 0 : ykfVar.hashCode())) * 31) + ykg.a(this.g)) * 31) + this.e.hashCode()) * 31) + ykg.a(this.h);
    }

    public final String toString() {
        return "BugleMessageBubbleUiData(containerUiData=" + this.a + ", contentUiData=" + this.b + ", message=" + this.c + ", animateParameters=" + this.d + ", shouldShowTimestampHint=" + this.g + ", flags=" + this.e + ", enableSwipeToShowTimestamps=" + this.h + ")";
    }

    public /* synthetic */ yki(dkkr dkkrVar, dkgq dkgqVar, ajlt ajltVar, boolean z, boolean z2) {
        this(dkkrVar, dkgqVar, ajltVar, null, z, new ykh(null), z2);
    }
}

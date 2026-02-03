package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dogo extends dogp<dojm, dogo> {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;

    public dogo() {
        this(null);
    }

    @Override // defpackage.dogp
    public final /* bridge */ /* synthetic */ boolean a(dogj dogjVar) {
        fdbq.f((dojm) dogjVar, dojf.a);
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dogo)) {
            return false;
        }
        dogo dogoVar = (dogo) obj;
        boolean z = dogoVar.a;
        boolean z2 = dogoVar.b;
        boolean z3 = dogoVar.c;
        boolean z4 = dogoVar.d;
        return true;
    }

    public final int hashCode() {
        return (((((dogn.a(true) * 31) + dogn.a(true)) * 31) + dogn.a(true)) * 31) + dogn.a(false);
    }

    public final String toString() {
        return "Video(supportsVP8=true, supportsVP9=true, supportsHEVC=true, supportsAV1=false)";
    }

    public /* synthetic */ dogo(byte[] bArr) {
        this.a = true;
        this.b = true;
        this.c = true;
        this.d = false;
    }
}

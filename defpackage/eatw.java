package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eatw extends eauw {
    public Integer a;
    public Integer b;
    public easz c;
    public deem d;

    @Override // defpackage.eauw
    public final easz a() {
        easz easzVar = this.c;
        if (easzVar != null) {
            return easzVar;
        }
        throw new IllegalStateException("Property \"photoMetadata\" has not been set");
    }

    @Override // defpackage.eauw
    public final eaux b() {
        easz easzVar = this.c;
        if (easzVar != null) {
            return new eatx(this.a, this.b, easzVar, this.d);
        }
        throw new IllegalStateException("Missing required properties: photoMetadata");
    }

    @Override // defpackage.eauw
    public final Integer c() {
        return this.b;
    }

    @Override // defpackage.eauw
    public final Integer d() {
        return this.a;
    }

    @Override // defpackage.eauw
    public final void e(Integer num) {
        this.b = num;
    }

    @Override // defpackage.eauw
    public final void f(Integer num) {
        this.a = num;
    }
}

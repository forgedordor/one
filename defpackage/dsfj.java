package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsfj extends dsgm {
    public ekhv a;
    public ekhv b;
    public ekhv c;
    private ekhx d;
    private ekhx e;
    private ekhx f;
    private ekhv g;
    private ekhx h;

    @Override // defpackage.dsgm
    public final dsgn a() {
        ekhv ekhvVar = this.a;
        if (ekhvVar != null) {
            this.d = ekhvVar.g();
        } else if (this.d == null) {
            this.d = ekon.a;
        }
        ekhv ekhvVar2 = this.b;
        if (ekhvVar2 != null) {
            this.e = ekhvVar2.g();
        } else if (this.e == null) {
            this.e = ekon.a;
        }
        ekhv ekhvVar3 = this.c;
        if (ekhvVar3 != null) {
            this.f = ekhvVar3.g();
        } else if (this.f == null) {
            this.f = ekon.a;
        }
        ekhv ekhvVar4 = this.g;
        if (ekhvVar4 != null) {
            this.h = ekhvVar4.g();
        } else if (this.h == null) {
            this.h = ekon.a;
        }
        return new dsfk(this.d, this.e, this.f, this.h);
    }

    @Override // defpackage.dsgm
    public final ekhv b() {
        if (this.g == null) {
            this.g = new ekhv();
        }
        return this.g;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddmk extends ddmn {
    public ejwi a;
    public ejwi b;
    public ejwi c;
    public ejwi d;
    private ejwi e;

    public ddmk() {
        ejud ejudVar = ejud.a;
        this.e = ejudVar;
        this.a = ejudVar;
        this.b = ejudVar;
        this.c = ejudVar;
        this.d = ejudVar;
    }

    @Override // defpackage.ddmn
    public final ddmn a(int i) {
        this.e = ejwi.j(Integer.valueOf(i));
        return this;
    }

    @Override // defpackage.ddmn
    public final ddmo b() {
        return new ddml(this.e, this.a, this.b, this.c, this.d);
    }
}

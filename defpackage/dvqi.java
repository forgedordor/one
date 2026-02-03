package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvqi extends dvqv {
    public ejwi a;
    public ejwi b;
    public ejwi c;
    public int d;

    public dvqi() {
        ejud ejudVar = ejud.a;
        this.a = ejudVar;
        this.b = ejudVar;
        this.c = ejudVar;
    }

    @Override // defpackage.dvqv
    public final dvqw a() {
        int i = this.d;
        if (i != 0) {
            return new dvqj(i, this.a, this.b, this.c);
        }
        throw new IllegalStateException("Missing required properties: status");
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwid extends dwij {
    private ejwi a;
    private ejwi b;
    private ejwi c;

    public dwid() {
        ejud ejudVar = ejud.a;
        this.a = ejudVar;
        this.b = ejudVar;
        this.c = ejudVar;
    }

    @Override // defpackage.dwij
    public final dwik a() {
        return new dwie(this.a, this.b, this.c);
    }

    @Override // defpackage.dwij
    public final void b(int i) {
        this.b = ejwi.j(Integer.valueOf(i));
    }

    @Override // defpackage.dwij
    public final void c(int i) {
        this.c = ejwi.j(Integer.valueOf(i));
    }

    @Override // defpackage.dwij
    public final void d(int i) {
        this.a = ejwi.j(Integer.valueOf(i));
    }
}

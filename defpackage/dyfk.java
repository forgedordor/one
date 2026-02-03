package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dyfk {
    private final lvy a;
    final lvy b;
    final lvy c;
    final lvy d;
    final lvy e;
    public final lvy f;
    final int g;
    public dyqd h;
    public ejwi i;
    private View.OnClickListener j;

    dyfk() {
        this(105607);
    }

    public void b(lvj lvjVar, lvz lvzVar) {
        this.a.f(lvjVar, lvzVar);
    }

    public void c(lvj lvjVar) {
        this.a.l(lvjVar);
    }

    public final void g() {
        dyqs dyqsVar = new dyqs(this.j);
        dyqsVar.d = new Runnable() { // from class: dyfg
            @Override // java.lang.Runnable
            public final void run() {
                this.a.h.b().run();
            }
        };
        dyqsVar.e = new Runnable() { // from class: dyfh
            @Override // java.lang.Runnable
            public final void run() {
                this.a.h.a().run();
            }
        };
        dyqsVar.b = this.i;
        dyqj.a(this.b, ejwi.j(new dyqq(dyqsVar)));
        dyqj.a(this.c, ejwi.j(this.j));
    }

    public final void m(View.OnClickListener onClickListener) {
        this.j = onClickListener;
        g();
    }

    public final void n(boolean z) {
        dyqj.a(this.a, Boolean.valueOf(z));
    }

    public dyfk(int i) {
        this.a = new lvy(true);
        ejud ejudVar = ejud.a;
        this.b = new lvy(ejudVar);
        this.c = new lvy(ejudVar);
        this.d = new lvy(ejudVar);
        this.e = new lvy(false);
        this.f = new lvy(ejudVar);
        this.j = new View.OnClickListener() { // from class: dyfi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        };
        this.h = new dyfj();
        this.i = ejudVar;
        this.g = i;
    }

    protected void d() {
    }

    protected void a(lvj lvjVar) {
    }
}

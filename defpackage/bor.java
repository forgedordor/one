package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bor extends lvx {
    public final akv a;
    private final Object h;
    private lvv i;

    public bor(Object obj, akv akvVar) {
        this.h = obj;
        this.a = akvVar;
    }

    public static final void c(final bor borVar, lvv lvvVar) {
        final fdap fdapVar = new fdap() { // from class: boo
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                bor borVar2 = this.a;
                borVar2.m(borVar2.a.a(obj));
                return fctx.a;
            }
        };
        super.p(lvvVar, new lvz() { // from class: bop
            @Override // defpackage.lvz
            public final void a(Object obj) {
                fdapVar.invoke(obj);
            }
        });
    }

    @Override // defpackage.lvv
    public final Object a() {
        lvv lvvVar = this.i;
        return lvvVar == null ? this.h : this.a.a(lvvVar.a());
    }

    public final void b(final lvv lvvVar) {
        lvvVar.getClass();
        lvv lvvVar2 = this.i;
        if (lvvVar2 != null) {
            super.q(lvvVar2);
        }
        this.i = lvvVar;
        box.c(new Runnable() { // from class: boq
            @Override // java.lang.Runnable
            public final void run() {
                bor.c(this.a, lvvVar);
            }
        });
    }
}

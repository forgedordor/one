package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elgx {
    public final elms a;

    public elgx(elms elmsVar) {
        this.a = elmsVar;
    }

    public final void a(int i) {
        elms elmsVar = this.a;
        elmsVar.copyOnWrite();
        elmv elmvVar = (elmv) elmsVar.instance;
        elmv elmvVar2 = elmv.a;
        elmvVar.d = i - 1;
        elmvVar.b |= 2;
    }

    public final void b(int i) {
        elms elmsVar = this.a;
        elmsVar.copyOnWrite();
        elmv elmvVar = (elmv) elmsVar.instance;
        elmv elmvVar2 = elmv.a;
        elmvVar.c = i - 1;
        elmvVar.b |= 1;
    }
}

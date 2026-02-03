package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dfh implements hsf {
    public Object a;
    public Object b;
    public ddz c;
    public dgw d;
    public boolean e;
    public boolean f;
    public long g;
    final /* synthetic */ dfm h;
    public final dib i;
    private final hox j;

    public dfh(dfm dfmVar, Object obj, Object obj2, dib dibVar, ddz ddzVar) {
        this.h = dfmVar;
        this.a = obj;
        this.b = obj2;
        this.i = dibVar;
        this.j = new hpl(obj, hsi.a);
        this.c = ddzVar;
        this.d = new dgw(this.c, dibVar, this.a, this.b);
    }

    @Override // defpackage.hsf
    public final Object a() {
        return this.j.a();
    }

    public final void b(Object obj) {
        this.j.b(obj);
    }
}

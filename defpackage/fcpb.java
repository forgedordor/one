package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcpb extends fbzf {
    public static final ffez a = new ffez();
    public final fbrk b;
    public final String c;
    public final fcmm d;
    public final String e;
    public final fcpa f;
    public final boolean g;
    private final fcoz h;
    private final fbmw i;

    public fcpb(fbrk fbrkVar, fbrg fbrgVar, fcoo fcooVar, fcpj fcpjVar, fcpx fcpxVar, Object obj, int i, int i2, String str, String str2, fcmm fcmmVar, fcmu fcmuVar, fbnc fbncVar) {
        super(new fcps(), fcmmVar, fcmuVar, fbrgVar, fbncVar);
        this.h = new fcoz(this);
        this.g = false;
        this.d = fcmmVar;
        this.b = fbrkVar;
        this.e = str;
        this.c = str2;
        this.i = fcpjVar.r;
        this.f = new fcpa(this, i, fcmmVar, obj, fcooVar, fcpxVar, fcpjVar, i2);
    }

    @Override // defpackage.fcan
    public final fbmw a() {
        return this.i;
    }

    @Override // defpackage.fbzf
    protected final /* synthetic */ fbzc p() {
        return this.h;
    }

    @Override // defpackage.fbzf
    protected final /* synthetic */ fbze q() {
        return this.f;
    }

    @Override // defpackage.fbzf, defpackage.fbzj
    protected final /* synthetic */ fbzi r() {
        return this.f;
    }

    public final fbrj s() {
        return this.b.a;
    }
}

package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdpf extends fdvt {
    private final fdou d;
    private final fdhw e;

    public fdpf(fdou fdouVar, fcyh fcyhVar, int i, int i2) {
        super(fcyhVar, i, i2);
        this.d = fdouVar;
        this.e = new fdhw(false, fdia.a);
    }

    private final void g() {
        if (fdhw.a.getAndSet(this.e, 1) == 1) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
    }

    @Override // defpackage.fdvt, defpackage.fdpl
    public final Object a(fdpm fdpmVar, fcxy fcxyVar) throws Throwable {
        if (this.b == -3) {
            g();
            Object objA = fdpw.a(fdpmVar, this.d, true, fcxyVar);
            if (objA == fcyl.a) {
                return objA;
            }
        } else {
            Object objH = fdvt.h(this, fdpmVar, fcxyVar);
            if (objH == fcyl.a) {
                return objH;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fdvt
    protected final Object b(fdos fdosVar, fcxy fcxyVar) throws Throwable {
        Object objA = fdpw.a(new fdxf(fdosVar), this.d, true, fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    @Override // defpackage.fdvt
    protected final fdvt c(fcyh fcyhVar, int i, int i2) {
        return new fdpf(this.d, fcyhVar, i, i2);
    }

    @Override // defpackage.fdvt
    protected final String d() {
        fdou fdouVar = this.d;
        Objects.toString(fdouVar);
        return "channel=".concat(fdouVar.toString());
    }

    @Override // defpackage.fdvt
    public final fdou e(fdjx fdjxVar) {
        g();
        return this.b == -3 ? this.d : super.e(fdjxVar);
    }

    @Override // defpackage.fdvt
    public final fdpl f() {
        return new fdpf(this.d);
    }

    public /* synthetic */ fdpf(fdou fdouVar) {
        this(fdouVar, fcyi.a, -3, 1);
    }
}

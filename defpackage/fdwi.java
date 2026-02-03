package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdwi extends fdvt {
    private final Iterable d;

    public fdwi(Iterable iterable, fcyh fcyhVar, int i, int i2) {
        super(fcyhVar, i, i2);
        this.d = iterable;
    }

    @Override // defpackage.fdvt
    protected final Object b(fdos fdosVar, fcxy fcxyVar) {
        fdxf fdxfVar = new fdxf(fdosVar);
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            fdil.d(fdosVar, null, null, new fdwh((fdpl) it.next(), fdxfVar, null), 3);
        }
        return fctx.a;
    }

    @Override // defpackage.fdvt
    protected final fdvt c(fcyh fcyhVar, int i, int i2) {
        return new fdwi(this.d, fcyhVar, i, i2);
    }

    @Override // defpackage.fdvt
    public final fdou e(fdjx fdjxVar) {
        return fdor.a(fdjxVar, this.a, this.b, new fdvs(this, null));
    }

    public /* synthetic */ fdwi(Iterable iterable) {
        this(iterable, fcyi.a, -2, 1);
    }
}

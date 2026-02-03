package defpackage;

/* compiled from: PG */
@fcsv
/* loaded from: classes.dex */
public abstract class pdn extends pfn {
    public pdn(pex pexVar) {
        super(pexVar);
    }

    public final void a(Object obj) {
        pkl pklVarD = d();
        try {
            b(pklVarD, obj);
            pklVarD.a.executeInsert();
        } finally {
            f(pklVarD);
        }
    }

    protected abstract void b(pkl pklVar, Object obj);
}

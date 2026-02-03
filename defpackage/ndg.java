package defpackage;

import android.net.Uri;
import java.io.EOFException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ndg implements nff {
    public nnr a;
    public nns b;
    private final nnw c;

    public ndg(nnw nnwVar) {
        this.c = nnwVar;
    }

    @Override // defpackage.nff
    public final long a() {
        nns nnsVar = this.b;
        if (nnsVar != null) {
            return ((nni) nnsVar).b;
        }
        return -1L;
    }

    @Override // defpackage.nff
    public final void b(mah mahVar, Uri uri, Map map, long j, long j2, nnu nnuVar) throws ngp {
        nni nniVar = new nni(mahVar, j, j2);
        this.b = nniVar;
        if (this.a != null) {
            return;
        }
        nnr[] nnrVarArrA = this.c.a(uri, map);
        int length = nnrVarArrA.length;
        ekfw ekfwVarD = ekgb.d(length);
        if (length == 1) {
            this.a = nnrVarArrA[0];
        } else {
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                nnr nnrVar = nnrVarArrA[i];
                try {
                } catch (EOFException unused) {
                    if (this.a != null || nniVar.b == j) {
                    }
                } catch (Throwable th) {
                    mee.c(this.a != null || nniVar.b == j);
                    nniVar.k();
                    throw th;
                }
                if (nnrVar.f(nniVar)) {
                    this.a = nnrVar;
                    mee.c(nnrVar != null || nniVar.b == j);
                    nniVar.k();
                } else {
                    ekfwVarD.j(nnrVar.x());
                    boolean z = this.a != null || nniVar.b == j;
                    mee.c(z);
                    nniVar.k();
                    i++;
                }
            }
            if (this.a == null) {
                throw new ngp("None of the available extractors (" + new ejwc(", ").b(ekjz.g(ekgb.p(nnrVarArrA), new ejvr() { // from class: ndf
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        nnr nnrVar2 = (nnr) obj;
                        nnrVar2.g();
                        return nnrVar2.getClass().getSimpleName();
                    }
                })) + ") could read the stream.", ekfwVarD.g());
            }
        }
        this.a.c(nnuVar);
    }
}

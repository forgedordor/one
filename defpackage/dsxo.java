package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsxo extends dsvn {
    public final dstz a;
    private final dsuh b;

    public dsxo(dsuh dsuhVar, dstz dstzVar) {
        this.b = dsuhVar;
        this.a = dstzVar;
    }

    @Override // defpackage.dsvn
    public final void a(final dsvm dsvmVar) {
        this.b.c(new dsug() { // from class: dsxn
            @Override // defpackage.dsug
            public final List a() {
                dsvm dsvmVar2 = dsvmVar;
                dsvq dsvqVar = dsvmVar2.a;
                return ekgb.r(new dsxz(dstw.a(), ekgb.r(dsvqVar), dsvmVar2.b, this.a.a.a(), true));
            }
        });
    }
}

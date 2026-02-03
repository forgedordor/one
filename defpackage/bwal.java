package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwal implements ehwh {
    public final bvwz a;
    private final fdjx b;
    private final aqvc c;

    public bwal(fdjx fdjxVar, bvwz bvwzVar, aqvc aqvcVar) {
        fdjxVar.getClass();
        aqvcVar.getClass();
        this.b = fdjxVar;
        this.a = bvwzVar;
        this.c = aqvcVar;
    }

    @Override // defpackage.ehwh
    public final ListenableFuture a() {
        if (this.c.a()) {
            return auvw.c(this.b, fcyi.a, fdjz.a, new bwak(this, null));
        }
        eiju eijuVarE = eijx.e(null);
        eijuVarE.getClass();
        return eijuVarE;
    }
}

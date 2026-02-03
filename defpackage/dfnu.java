package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfnu extends dfoc {
    public final ConcurrentMap a;
    public final boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dfnu() {
        super("cslib_phenotype__");
        dfnt dfntVar = dfnv.a;
        this.a = new ConcurrentHashMap();
        dfnt dfntVar2 = dfnt.OFF;
        this.b = dfntVar.c;
    }

    @Override // defpackage.dfoc
    protected final ekgb b() {
        return ekgb.n(this.a.values());
    }
}

package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eld extends elq {
    final /* synthetic */ elu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eld(elu eluVar, int i, int i2, elc elcVar, ely elyVar) {
        super(eluVar, i, i2, elcVar, elyVar);
        this.a = eluVar;
    }

    @Override // defpackage.elq
    public final elp a(int i, eln[] elnVarArr, List list, int i2) {
        return new elp(i, elnVarArr, this.a, list, i2);
    }
}

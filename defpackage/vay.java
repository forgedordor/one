package defpackage;

import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vay implements ixm {
    final /* synthetic */ hox a;
    final /* synthetic */ kpv b;
    final /* synthetic */ kpo c;
    final /* synthetic */ hox d;

    public vay(hox hoxVar, kpv kpvVar, kpo kpoVar, hox hoxVar2) {
        this.a = hoxVar;
        this.b = kpvVar;
        this.c = kpoVar;
        this.d = hoxVar2;
    }

    @Override // defpackage.ixm
    public final /* synthetic */ int a(ivu ivuVar, List list, int i) {
        return ixl.a(this, ivuVar, list, i);
    }

    @Override // defpackage.ixm
    public final /* synthetic */ int b(ivu ivuVar, List list, int i) {
        return ixl.b(this, ivuVar, list, i);
    }

    @Override // defpackage.ixm
    public final /* synthetic */ int c(ivu ivuVar, List list, int i) {
        return ixl.c(this, ivuVar, list, i);
    }

    @Override // defpackage.ixm
    public final /* synthetic */ int d(ivu ivuVar, List list, int i) {
        return ixl.d(this, ivuVar, list, i);
    }

    @Override // defpackage.ixm
    public final ixn e(ixp ixpVar, List list, long j) throws Throwable {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.a.a();
        kji kjiVarQ = ixpVar.q();
        kpo kpoVar = this.c;
        kpv kpvVar = this.b;
        long jD = kpvVar.d(j, kjiVarQ, kpoVar, list, linkedHashMap);
        this.d.a();
        return ixpVar.ej(kjg.b(jD), kjg.a(jD), fcvp.a, new vax(kpvVar, list, linkedHashMap));
    }
}

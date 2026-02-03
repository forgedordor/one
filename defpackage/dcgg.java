package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcgg extends dcge {
    public final dcil b;

    public dcgg(dcil dcilVar, defr defrVar) {
        super(3, defrVar);
        this.b = dcilVar;
    }

    @Override // defpackage.dcgd
    public final boolean a(dchl dchlVar) {
        return this.b.a.c;
    }

    @Override // defpackage.dcgd
    public final Feature[] b(dchl dchlVar) {
        return this.b.a.b;
    }

    @Override // defpackage.dcge
    public final void c(dchl dchlVar) {
        dcil dcilVar = this.b;
        dcik dcikVar = dcilVar.a;
        dcikVar.b(dchlVar.b, this.a);
        dchz dchzVarA = dcikVar.a();
        if (dchzVarA != null) {
            dchlVar.d.put(dchzVarA, dcilVar);
        }
    }

    @Override // defpackage.dcge, defpackage.dcgj
    public final /* bridge */ /* synthetic */ void g(dchb dchbVar, boolean z) {
    }
}

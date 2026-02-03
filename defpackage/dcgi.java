package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcgi extends dcge {
    public final dchz b;

    public dcgi(dchz dchzVar, defr defrVar) {
        super(4, defrVar);
        this.b = dchzVar;
    }

    @Override // defpackage.dcgd
    public final boolean a(dchl dchlVar) {
        dcil dcilVar = (dcil) dchlVar.d.get(this.b);
        return dcilVar != null && dcilVar.a.c;
    }

    @Override // defpackage.dcgd
    public final Feature[] b(dchl dchlVar) {
        dcil dcilVar = (dcil) dchlVar.d.get(this.b);
        if (dcilVar == null) {
            return null;
        }
        return dcilVar.a.b;
    }

    @Override // defpackage.dcge
    public final void c(dchl dchlVar) {
        dcil dcilVar = (dcil) dchlVar.d.remove(this.b);
        if (dcilVar == null) {
            this.a.d(false);
            return;
        }
        ((dcio) dcilVar.b).a.b.a(dchlVar.b, this.a);
        dcilVar.a.a.a();
    }

    @Override // defpackage.dcge, defpackage.dcgj
    public final /* bridge */ /* synthetic */ void g(dchb dchbVar, boolean z) {
    }
}

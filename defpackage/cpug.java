package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpug implements cpub {
    public static final cqce a = cqce.g("BugleCms", "CmsParticipantFactoryImpl");
    public final eqnl b;
    private final cpqp d;
    private final fcsu f;
    public boolean c = false;
    private final Supplier e = new cpue(this);

    public cpug(eqnl eqnlVar, cpqp cpqpVar, fcsu fcsuVar) {
        this.b = eqnlVar;
        this.d = cpqpVar;
        this.f = fcsuVar;
    }

    private final eply d(epkh epkhVar) {
        try {
            return (eply) this.d.a(epkhVar, eply.a);
        } catch (cpql e) {
            cqbd cqbdVarE = a.e();
            cqbdVarE.I("Participant MetaData decryption succeeded. Original exception is logged below.");
            cqbdVarE.A("cms_id", this.b.c);
            cqbdVarE.s(e);
            this.c = true;
            return (eply) e.a;
        }
    }

    @Override // defpackage.cpub
    public final bpts a() {
        eply eplyVarD = d(((cpue) this.e).get());
        String[] strArr = bput.a;
        bptv bptvVar = new bptv();
        bptvVar.b(eplyVarD.p);
        return bptvVar.a();
    }

    @Override // defpackage.cpub
    public final ParticipantsTable.BindData b() {
        epkh epkhVar = ((cpue) this.e).get();
        String[] strArr = ParticipantsTable.a;
        brvq brvqVar = new brvq();
        eply eplyVarD = d(epkhVar);
        if (TextUtils.isEmpty(eplyVarD.c)) {
            fcsu fcsuVar = this.f;
            alrj alrjVar = (alrj) fcsuVar.b();
            eqnq eqnqVar = this.b.d;
            if (eqnqVar == null) {
                eqnqVar = eqnq.a;
            }
            eqmw eqmwVar = eqnqVar.c;
            if (eqmwVar == null) {
                eqmwVar = eqmw.a;
            }
            alqm alqmVarK = ((alrj) fcsuVar.b()).k(alrjVar.c(eqmwVar.b, new ejxr() { // from class: cpud
                @Override // defpackage.ejxr
                public final Object get() {
                    return Optional.empty();
                }
            }));
            cczv cczvVar = alvx.a;
            brvqVar.I(alqmVarK.m(((Boolean) new alvn().get()).booleanValue()));
        } else {
            brvqVar.I(eplyVarD.c);
        }
        String str = eplyVarD.d;
        if (!TextUtils.isEmpty(str)) {
            brvqVar.R(str);
        }
        String str2 = eplyVarD.e;
        if (!TextUtils.isEmpty(str2)) {
            brvqVar.q(str2);
        }
        String str3 = eplyVarD.f;
        if (!TextUtils.isEmpty(str3)) {
            brvqVar.t(str3);
        }
        String str4 = eplyVarD.g;
        if (!TextUtils.isEmpty(str4)) {
            brvqVar.u(str4);
        }
        brvqVar.T(true != eplyVarD.j ? -2 : -1);
        brvqVar.e(eplyVarD.l);
        int i = eplyVarD.m;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 4 : 3 : 2;
        if (i2 == 0) {
            i2 = 1;
        }
        brvqVar.J(i2 + (-2) != 2 ? 0 : 1);
        brvqVar.f(this.b.c);
        brvqVar.y(eplyVarD.n);
        brvqVar.z(eplyVarD.o);
        brvqVar.L(eplyVarD.h);
        brvqVar.M(eplyVarD.i.I());
        brvqVar.g(cpyi.RESTORED_FROM_CMS);
        return brvqVar.a();
    }

    @Override // defpackage.cpub
    public final boolean c() {
        return this.c;
    }
}

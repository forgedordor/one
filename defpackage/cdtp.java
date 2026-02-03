package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdtp implements eora {
    final /* synthetic */ cdtq a;

    public cdtp(cdtq cdtqVar) {
        this.a = cdtqVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        cqce cqceVar = cdtq.a;
        cqceVar.p("Scheduled MDD periodic tasks.");
        final cdtq cdtqVar = this.a;
        try {
            dtoc dtocVar = (dtoc) evsn.parseFrom(dtoc.a, (byte[]) crbf.U.e());
            cqbd cqbdVarA = cqceVar.a();
            cqbdVarA.I("Found MDD download config with");
            cqbdVarA.G(dtocVar.b.size());
            cqbdVarA.I("files.");
            cqbdVarA.r();
            for (final dtns dtnsVar : dtocVar.b) {
                dtsl dtslVar = (dtsl) cdtqVar.b.b();
                dtmj dtmjVar = new dtmj();
                dtmjVar.c(dtnsVar);
                eiju eijuVarG = eiju.g(dtslVar.a(dtmjVar.a()));
                ejvr ejvrVar = new ejvr() { // from class: cdtl
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                        dtns dtnsVar2 = dtnsVar;
                        if (!zBooleanValue) {
                            cqbd cqbdVarE = cdtq.a.e();
                            cqbdVarE.I("Problem adding group");
                            cqbdVarE.A("group name", dtnsVar2.c);
                            cqbdVarE.r();
                            return null;
                        }
                        cqbd cqbdVarA2 = cdtq.a.a();
                        cqbdVarA2.I("Successfully added group:");
                        cqbdVarA2.A("group", dtnsVar2.c);
                        cqbdVarA2.y(BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION, dtnsVar2.e);
                        cqbdVarA2.r();
                        return null;
                    }
                };
                eosc eoscVar = cdtqVar.d;
                auvh.h(eijuVarG.h(ejvrVar, eoscVar).e(IOException.class, new ejvr() { // from class: cdtm
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        cqbd cqbdVarE = cdtq.a.e();
                        cqbdVarE.I("IOException adding group");
                        cqbdVarE.A("group", dtnsVar.c);
                        cqbdVarE.s((IOException) obj2);
                        return null;
                    }
                }, eoscVar).f(Throwable.class, new eooz() { // from class: cdtn
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        cqbd cqbdVarB = cdtq.a.b();
                        cqbdVarB.I("Error adding group");
                        cqbdVarB.A("group name", dtnsVar.c);
                        cqbdVarB.r();
                        return ((cden) cdtqVar.e.b()).b((Throwable) obj2);
                    }
                }, eoscVar));
            }
            ((cdur) cdtqVar.c.b()).c(4, 2, "", 0L);
        } catch (evtj unused) {
            cdtq.a.r("Could not parse MDD download config. Data downloads will not happen for groups specified through mdd_download_config flag.");
            ((cdur) cdtqVar.c.b()).b(4, 3);
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        cqbd cqbdVarB = cdtq.a.b();
        cqbdVarB.I("Failed to schedule MDD periodic tasks");
        cqbdVarB.s(th);
    }
}

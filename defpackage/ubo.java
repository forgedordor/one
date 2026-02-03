package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ubo {
    public static final cqce a = cqce.g("BugleCms", "ParticipantSync");
    public final cpmc b;
    public final byxd c;
    public final eosc d;
    public final eosc e;

    public ubo(cpmc cpmcVar, byxd byxdVar, eosc eoscVar, eosc eoscVar2) {
        this.b = cpmcVar;
        this.c = byxdVar;
        this.d = eoscVar;
        this.e = eoscVar2;
    }

    public final eiju a(final String str, final String str2) {
        return (eiju) ParticipantsTable.j(str, new Function() { // from class: ubm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cqbd cqbdVarD = ubo.a.d();
                cqbdVarD.A(bzmz.t.a, str2);
                cqbdVarD.A(bzmz.v.a, "Participant already in DB");
                cqbdVarD.A(bzmz.w.a, str);
                cqbdVarD.I("Participant Sync");
                cqbdVarD.r();
                return eijx.e(null);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Supplier() { // from class: ubn
            @Override // java.util.function.Supplier
            public final Object get() {
                final ubo uboVar = this.a;
                cpmc cpmcVar = uboVar.b;
                final String str3 = str;
                eiju eijuVarI = cpmcVar.t(str3).i(new eooz() { // from class: ubj
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        return uboVar.c.f((eqnl) obj, false);
                    }
                }, uboVar.e);
                final String str4 = str2;
                return eijuVarI.h(new ejvr() { // from class: ubk
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        cqbd cqbdVarC = ubo.a.c();
                        cqbdVarC.A(bzmz.t.a, str4);
                        cqbdVarC.A(bzmz.v.a, "Created participant in DB");
                        cqbdVarC.A(bzmz.w.a, str3);
                        cqbdVarC.I("Participant Sync");
                        cqbdVarC.r();
                        return null;
                    }
                }, uboVar.d).f(Throwable.class, new eooz() { // from class: ubl
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        Throwable th = (Throwable) obj;
                        boolean zEquals = Status.c(th).getCode().equals(Status.Code.NOT_FOUND);
                        String str5 = str3;
                        String str6 = str4;
                        if (zEquals) {
                            cqbd cqbdVarE = ubo.a.e();
                            cqbdVarE.A(bzmz.t.a, str6);
                            cqbdVarE.A(bzmz.v.a, "Ignore: Participant not found in CMS");
                            cqbdVarE.A(bzmz.w.a, str5);
                            cqbdVarE.I("Participant Sync");
                            cqbdVarE.r();
                            return eijx.e(null);
                        }
                        cqbd cqbdVarE2 = ubo.a.e();
                        cqbdVarE2.A(bzmz.t.a, str6);
                        cqbdVarE2.A(bzmz.v.a, "Exception while processing event");
                        cqbdVarE2.A(bzmz.w.a, str5);
                        cqbdVarE2.I("Participant Sync");
                        cqbdVarE2.s(th);
                        return eijx.d(th);
                    }
                }, eoqg.a);
            }
        });
    }
}

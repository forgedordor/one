package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axkf {
    public static final cqce a = cqce.g("Bugle", "VerifiedSmsEntityManager");
    private final cpbn b;
    private final fcsu c;

    public axkf(cpbn cpbnVar, fcsu fcsuVar) {
        this.b = cpbnVar;
        this.c = fcsuVar;
    }

    public static final bvdz b(String str) {
        cqbd cqbdVarA = a.a();
        cqbdVarA.I("requesting participant verified sms status");
        cqbdVarA.f(str);
        cqbdVarA.r();
        Function function = new Function() { // from class: axkd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ParticipantsTable.BindData) obj).D();
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        ParticipantsTable.BindData bindDataB = ParticipantsTable.b(str);
        return (bvdz) (bindDataB != null ? function.apply(bindDataB) : bvdz.VERIFICATION_NA);
    }

    public final void a(final String str) {
        cqce cqceVar = a;
        cqbd cqbdVarC = cqceVar.c();
        cqbdVarC.I("marking participant as unverified");
        cqbdVarC.f(str);
        cqbdVarC.r();
        bsbs bsbsVarF = ParticipantsTable.f();
        bsbsVarF.ap("updateParticipantForUnverifiedSms");
        bsbsVarF.U(new Function() { // from class: axke
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsbx bsbxVar = (bsbx) obj;
                bsbxVar.k(str);
                return bsbxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        cpbn cpbnVar = this.b;
        bvdz bvdzVar = bvdz.VERIFICATION_UNVERIFIED;
        bsbsVarF.M(cpbnVar.k(bvdzVar));
        bsbsVarF.u();
        bsbsVarF.w();
        int iIntValue = ParticipantsTable.i().intValue();
        int iIntValue2 = ParticipantsTable.i().intValue();
        if (iIntValue2 < 31030) {
            dqru.x("latest_verification_status", iIntValue2);
        }
        if (iIntValue >= 31030) {
            if (bvdzVar == null) {
                bsbsVarF.a.putNull("latest_verification_status");
            } else {
                bsbsVarF.a.put("latest_verification_status", Integer.valueOf(bvdzVar.ordinal()));
            }
        }
        if (bsbsVarF.b().e() > 0) {
            cqbd cqbdVarC2 = cqceVar.c();
            cqbdVarC2.I("participant was updated. Refreshing conversations");
            cqbdVarC2.r();
            ((bakt) this.c.b()).R(str);
        }
    }
}

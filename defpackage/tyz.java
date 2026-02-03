package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tyz implements cfoy {
    public static final cqce a = cqce.f("BugleCms", tyz.class);
    public final cgbn b;
    public final ceff c;
    public final cpmi d;
    public final Context e;
    public final eosc f;
    public final efwo g;
    private final aurx h;

    public tyz(ceff ceffVar, cgbn cgbnVar, cpmi cpmiVar, aurx aurxVar, efwo efwoVar, Context context, eosc eoscVar) {
        this.c = ceffVar;
        this.b = cgbnVar;
        this.d = cpmiVar;
        this.h = aurxVar;
        this.g = efwoVar;
        this.e = context;
        this.f = eoscVar;
    }

    @Override // defpackage.cfoy
    public final eiju a(ezjj ezjjVar) {
        try {
            eznm eznmVar = (eznm) evsn.parseFrom(eznm.a, ezjjVar.e, evrr.a());
            final String str = ezjjVar.c;
            final ezol ezolVar = ezjjVar.i;
            if (ezolVar == null) {
                ezolVar = ezol.a;
            }
            if (eznmVar.b != 108) {
                cqbd cqbdVarC = a.c();
                cqbdVarC.I("Ignoring Userdata Message without ChangeAccountInfoPush.");
                cqbdVarC.A("messageId", str);
                cqbdVarC.r();
                return eijx.e(true);
            }
            ezuq ezuqVar = (ezuq) eznmVar.c;
            cqce cqceVar = a;
            cqbd cqbdVarC2 = cqceVar.c();
            cqbdVarC2.I("Handling ChangeAccountInfoPush.");
            cqbdVarC2.A("messageId", str);
            cqbdVarC2.r();
            if ((ezuqVar.b & 1) == 0) {
                cqbd cqbdVarD = cqceVar.d();
                cqbdVarD.I("Ignoring ChangeAccountInfoPush without reachable Ids.");
                cqbdVarD.A("messageId", str);
                cqbdVarD.r();
                return eijx.e(true);
            }
            ezwa ezwaVar = ezuqVar.c;
            if (ezwaVar == null) {
                ezwaVar = ezwa.a;
            }
            int i = ezwaVar.c;
            char c = i != 0 ? i != 1 ? i != 2 ? i != 3 ? (char) 0 : (char) 5 : (char) 4 : (char) 3 : (char) 2;
            if (c == 0 || c != 4) {
                cqbd cqbdVarC3 = cqceVar.c();
                cqbdVarC3.I("Ignoring ChangeAccountInfoPush as the reachableIds change reason is not dasher disabled.");
                cqbdVarC3.A("messageId", str);
                cqbdVarC3.r();
                return eijx.e(true);
            }
            ezwa ezwaVar2 = ezuqVar.c;
            if (ezwaVar2 == null) {
                ezwaVar2 = ezwa.a;
            }
            if (!Collection.EL.stream(ezwaVar2.b).anyMatch(new Predicate() { // from class: tyv
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo538negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    ezol ezolVar2 = (ezol) obj;
                    ezol ezolVar3 = ezolVar;
                    if (ezolVar2 == null || ezolVar3 == null) {
                        return Objects.equals(ezolVar2, ezolVar3);
                    }
                    int i2 = ezolVar2.b;
                    felm felmVarB = felm.b(i2);
                    if (felmVarB == null) {
                        felmVarB = felm.UNRECOGNIZED;
                    }
                    felm felmVarB2 = felm.b(ezolVar3.b);
                    if (felmVarB2 == null) {
                        felmVarB2 = felm.UNRECOGNIZED;
                    }
                    if (felmVarB != felmVarB2) {
                        return false;
                    }
                    felm felmVar = felm.EMAIL;
                    felm felmVarB3 = felm.b(i2);
                    if (felmVarB3 == null) {
                        felmVarB3 = felm.UNRECOGNIZED;
                    }
                    if (felmVar != felmVarB3) {
                        return ejuf.e(ezolVar2.c, ezolVar3.c);
                    }
                    String str2 = ezolVar2.c;
                    String str3 = ezolVar3.c;
                    int i3 = cqbk.a;
                    if (str2 == null || str3 == null) {
                        return Objects.equals(str2, str3);
                    }
                    Context context = this.a.e;
                    return cqbk.a(context, str2).equals(cqbk.a(context, str3));
                }
            })) {
                return this.h.k().i(new eooz() { // from class: tyy
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        boolean z = ((aumq) obj).e;
                        final String str2 = str;
                        if (z) {
                            final ezol ezolVar2 = ezolVar;
                            final tyz tyzVar = this.a;
                            return tyzVar.d.d(tyzVar.g, 1, 1).i(new eooz() { // from class: tyw
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj2) {
                                    tyz tyzVar2 = tyzVar;
                                    tyzVar2.b.q(ezolVar2.c);
                                    cqbd cqbdVarC4 = tyz.a.c();
                                    cqbdVarC4.I("Clear gaia registration as dasher account is disabled.");
                                    cqbdVarC4.A("messageId", str2);
                                    cqbdVarC4.r();
                                    return tyzVar2.c.v();
                                }
                            }, tyzVar.f).h(new ejvr() { // from class: tyx
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj2) {
                                    return true;
                                }
                            }, eoqg.a);
                        }
                        cqbd cqbdVarC4 = tyz.a.c();
                        cqbdVarC4.I("The CMS feature is already disabled.");
                        cqbdVarC4.A("messageId", str2);
                        cqbdVarC4.r();
                        return eijx.e(true);
                    }
                }, this.f);
            }
            cqbd cqbdVarC4 = cqceVar.c();
            cqbdVarC4.I("Ignoring ChangeAccountInfoPush as receiver id is still reachable");
            cqbdVarC4.M("receiverId", ezolVar.c);
            cqbdVarC4.A("messageId", str);
            cqbdVarC4.r();
            return eijx.e(true);
        } catch (evtj unused) {
            cqbd cqbdVarE = a.e();
            cqbdVarE.I("Invalid Userdata message.");
            cqbdVarE.A("messageId", ezjjVar.c);
            cqbdVarE.r();
            return eijx.e(true);
        }
    }
}

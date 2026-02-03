package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class asqd implements dggy {
    public static final cqce a = cqce.g("Bugle", "BusinessRcsConfigurationListener");
    private final csuc b;
    private final cqej c;
    private final aspp d;
    private final cmlb e;

    public asqd(csuc csucVar, cqej cqejVar, aspp asppVar, cmlb cmlbVar) {
        this.b = csucVar;
        this.c = cqejVar;
        this.d = asppVar;
        this.e = cmlbVar;
    }

    @Override // defpackage.dggy
    public final void gg(String str, Optional optional) {
        if (optional.isEmpty()) {
            a.p("config update received, but no configuration");
            return;
        }
        dgiq dgiqVar = (dgiq) optional.get();
        final dggp dggpVar = new dggp(str);
        String strB = this.c.b(dgiqVar);
        String str2 = (String) this.e.j(dggpVar).map(new Function() { // from class: asqa
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((cmmh) obj).f;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElseGet(new Supplier() { // from class: asqb
            @Override // java.util.function.Supplier
            public final Object get() {
                ((ekrd) asqd.a.k().h("com/google/android/apps/messaging/shared/business/rcs/BusinessRcsConfigurationListener", "storeVerifiedSmsToken", 85, "BusinessRcsConfigurationListener.java")).t("Could not get IMSI for simId: %s. Returning empty string.", cqcv.b(dggpVar.a));
                return "";
            }
        });
        String strB2 = dgiqVar.B();
        cqce cqceVar = a;
        cqbd cqbdVarC = cqceVar.c();
        cqbdVarC.I("Attempting to add vsmsToken");
        cqbdVarC.B("token available", !TextUtils.isEmpty(strB2));
        cqbdVarC.B("imsi available", !TextUtils.isEmpty(str2));
        cqbdVarC.B("msisdn available", !TextUtils.isEmpty(strB));
        cqbdVarC.r();
        if (TextUtils.isEmpty(strB2) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(strB)) {
            cqceVar.p("Skipping storage of Verified SMS token");
        } else {
            eiju eijuVarA = this.b.a(str2, strB, strB2);
            ejvr ejvrVar = new ejvr() { // from class: asqc
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    asqd.a.s("Could not save Verified SMS token", (Throwable) obj);
                    return false;
                }
            };
            eoqg eoqgVar = eoqg.a;
            eijuVarA.e(Throwable.class, ejvrVar, eoqgVar).k(auvh.b(), eoqgVar);
        }
        if (((Boolean) aspu.b.e()).booleanValue()) {
            String str3 = ((dgiq) optional.get()).i().chatbotDirectoryUrl;
            cqbd cqbdVarC2 = cqceVar.c();
            cqbdVarC2.I("Attempting to add Chatbot Directory Url");
            cqbdVarC2.B("url available", !TextUtils.isEmpty(str3));
            cqbdVarC2.r();
            cqbd cqbdVarC3 = cqceVar.c();
            cqbdVarC3.I("Received ChatbotDirectoryUrl");
            cqbdVarC3.A("url", str3);
            cqbdVarC3.r();
            this.d.b(str3).k(auvh.b(), eoqg.a);
        }
    }
}

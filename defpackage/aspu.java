package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.net.Uri;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aspu {
    public static final cqce a = cqce.g("Bugle", "ChatbotDirectoryHelper");
    public static final cczv b = cdag.h(cdag.b, "enable_chatbot_directory", false);
    public static final cczv c = cdag.e(cdag.b, "chatbot_directory_toolbar_color", 0);
    private final aspp d;
    private final eosc e;
    private final aspz f;
    private final fcsu g;
    private final crmx h;

    static {
        cdag.e(cdag.b, "chatbot_directory_new_pill_show_duration_hours", 240);
    }

    public aspu(aspp asppVar, eosc eoscVar, aspz aspzVar, fcsu fcsuVar, crmx crmxVar) {
        this.d = asppVar;
        this.e = eoscVar;
        this.f = aspzVar;
        this.g = fcsuVar;
        this.h = crmxVar;
    }

    public final eiju a() {
        cqbd cqbdVarC = a.c();
        cczv cczvVar = b;
        cqbdVarC.A("enable_chatbot_directory", cczvVar.e());
        fcsu fcsuVar = this.g;
        cqbdVarC.A("availability_state", ((chzn) fcsuVar.b()).a());
        cqbdVarC.r();
        return (((Boolean) cczvVar.e()).booleanValue() && ((chzn) fcsuVar.b()).a() == enwr.AVAILABLE) ? this.d.a().h(new ejvr() { // from class: asps
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Optional optional = (Optional) obj;
                cqce cqceVar = aspu.a;
                if (optional.isEmpty()) {
                    return false;
                }
                cqbd cqbdVarC2 = aspu.a.c();
                cqbdVarC2.A("chatbot_directory_url", optional.get());
                cqbdVarC2.r();
                return true;
            }
        }, this.e) : eijx.e(false);
    }

    public final void b(Context context, String str) {
        ejwl.m(!str.isEmpty(), "Chatbot directory URL is not set.");
        final Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        this.h.h().ifPresent(new Consumer() { // from class: aspt
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                cqce cqceVar = aspu.a;
                builderBuildUpon.appendQueryParameter("ho", (String) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        builderBuildUpon.appendQueryParameter("client_vendor", "Goog");
        aky akyVar = new aky();
        akyVar.e();
        akyVar.d(2);
        cczv cczvVar = c;
        if (((Integer) cczvVar.e()).intValue() != 0) {
            akw akwVar = new akw();
            akwVar.b(((Integer) cczvVar.e()).intValue());
            akyVar.c(akwVar.a());
        }
        try {
            akyVar.a().a(context, builderBuildUpon.build());
        } catch (ActivityNotFoundException e) {
            a.s("Couldn't find activity to launch custom tabs", e);
            this.f.d.c("Bugle.Rbm.ChatbotDirectory.OpenDirectoryFailure");
        }
        eiju eijuVarJ = this.d.a.j(new ejvr() { // from class: aspl
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                aspq aspqVar;
                aspj aspjVar = (aspj) obj;
                if ((aspjVar.b & 1) != 0) {
                    aspr asprVar = aspjVar.c;
                    if (asprVar == null) {
                        asprVar = aspr.a;
                    }
                    aspqVar = (aspq) asprVar.toBuilder();
                    aspqVar.copyOnWrite();
                    ((aspr) aspqVar.instance).d = true;
                } else {
                    aspqVar = (aspq) aspr.a.createBuilder();
                    aspqVar.copyOnWrite();
                    ((aspr) aspqVar.instance).d = true;
                }
                aspi aspiVar = (aspi) aspjVar.toBuilder();
                aspiVar.copyOnWrite();
                aspj aspjVar2 = (aspj) aspiVar.instance;
                aspr asprVar2 = (aspr) aspqVar.build();
                asprVar2.getClass();
                aspjVar2.c = asprVar2;
                aspjVar2.b |= 1;
                return (aspj) aspiVar.build();
            }
        });
        ejvr ejvrVar = new ejvr() { // from class: aspm
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return null;
            }
        };
        eoqg eoqgVar = eoqg.a;
        eijuVarJ.h(ejvrVar, eoqgVar).k(auvh.b(), eoqgVar);
    }
}

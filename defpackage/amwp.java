package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amwp implements amwq {
    public static final /* synthetic */ int a = 0;
    private static final eksp b = eksp.c("BugleMapi");
    private final bahv c;

    public amwp(bahv bahvVar) {
        bahvVar.getClass();
        this.c = bahvVar;
    }

    public static final bahx c(amsv amsvVar, elha elhaVar) {
        bvdq bvdqVar;
        Uri uriE = amsvVar.e();
        final bahx bahxVarD = bahy.D();
        bacm bacmVar = (bacm) bahxVarD;
        bacmVar.d = uriE;
        bahxVarD.n(elhaVar);
        bacmVar.c = le.c(amsvVar.b());
        Uri uriC = amsvVar.c();
        if (uriC == null || cqmu.b(uriC)) {
            uriC = null;
        }
        bacmVar.e = uriC;
        if (amsvVar instanceof amsy) {
            amsy amsyVar = (amsy) amsvVar;
            bahxVarD.g(amsyVar.h().toMillis());
            bacmVar.l = amsyVar.g();
            return bahxVarD;
        }
        if (!(amsvVar instanceof amwm)) {
            if (!(amsvVar instanceof amvp)) {
                ((eksl) b.i()).t("Cannot create message part for: %s", amsvVar);
                return bahxVarD;
            }
            amvp amvpVar = (amvp) amsvVar;
            bacmVar.j = amvpVar.g();
            bahxVarD.o(amvpVar.a());
            bahxVarD.h(amvpVar.a());
            return bahxVarD;
        }
        amwm amwmVar = (amwm) amsvVar;
        bahxVarD.p(amwmVar.f().getWidth());
        bahxVarD.i(amwmVar.f().getHeight());
        if (amwmVar instanceof amvy) {
            amvy amvyVar = (amvy) amwmVar;
            bahxVarD.j(amvyVar.a());
            bahxVarD.k(!amvyVar.m());
            bahxVarD.m(amvyVar.n());
            Optional optionalK = amvyVar.k();
            final fdap fdapVar = new fdap() { // from class: amwn
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    Long l = (Long) obj;
                    int i = amwp.a;
                    l.getClass();
                    bahxVarD.g(l.longValue());
                    return fctx.a;
                }
            };
            optionalK.ifPresent(new Consumer() { // from class: amwo
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    int i = amwp.a;
                    fdapVar.invoke(obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            if (crtr.e()) {
                if (amvyVar.h() == null) {
                    bacmVar.o = bvdq.DEFAULT_NO_VERDICT;
                    return bahxVarD;
                }
                amvx amvxVarH = amvyVar.h();
                amvxVarH.getClass();
                if (((Boolean) ((cczi) crtr.V.get()).e()).booleanValue()) {
                    int iOrdinal = amvxVarH.ordinal();
                    if (iOrdinal == 0) {
                        bvdqVar = bvdq.NEGATIVE_VERDICT_DISPLAY_IMAGE;
                    } else if (iOrdinal == 1) {
                        bvdqVar = bvdq.DEFAULT_NO_VERDICT;
                    } else if (iOrdinal == 2) {
                        bvdqVar = bvdq.POSITIVE_VERDICT_DISPLAY_IMAGE;
                    } else if (iOrdinal == 3) {
                        bvdqVar = bvdq.POSITIVE_VERDICT_HIDE_IMAGE;
                    } else if (iOrdinal == 4) {
                        bvdqVar = bvdq.POSITIVE_VERDICT_REQUIRE_SPEEDBUMP;
                    } else {
                        if (iOrdinal != 5) {
                            throw new fctg();
                        }
                        bvdqVar = bvdq.PENDING_VERDICT;
                    }
                } else {
                    int iOrdinal2 = amvxVarH.ordinal();
                    if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                        bvdqVar = bvdq.DEFAULT_NO_VERDICT;
                    } else if (iOrdinal2 == 2) {
                        bvdqVar = bvdq.POSITIVE_VERDICT_DISPLAY_IMAGE;
                    } else if (iOrdinal2 == 3) {
                        bvdqVar = bvdq.POSITIVE_VERDICT_HIDE_IMAGE;
                    } else if (iOrdinal2 == 4) {
                        bvdqVar = bvdq.POSITIVE_VERDICT_REQUIRE_SPEEDBUMP;
                    } else {
                        if (iOrdinal2 != 5) {
                            throw new fctg();
                        }
                        bvdqVar = bvdq.PENDING_VERDICT;
                    }
                }
                bacmVar.o = bvdqVar;
                return bahxVarD;
            }
        } else {
            if (amwmVar instanceof amwa) {
                amwa amwaVar = (amwa) amwmVar;
                LocationInformation locationInformation = new LocationInformation();
                locationInformation.d = amwaVar.a();
                locationInformation.c = amwaVar.h();
                bacmVar.h = locationInformation;
                bacmVar.b = amwaVar.m();
                return bahxVarD;
            }
            if (amwmVar instanceof amwb) {
                amwb amwbVar = (amwb) amwmVar;
                bacmVar.f = amwbVar.g();
                bacmVar.g = amwbVar.a();
            }
        }
        return bahxVarD;
    }

    @Override // defpackage.amwq
    public final MessagePartCoreData a(amsv amsvVar, elha elhaVar) {
        amsvVar.getClass();
        elhaVar.getClass();
        return this.c.c(c(amsvVar, elhaVar).q());
    }

    @Override // defpackage.amwq
    public final MessagePartCoreData b(amsv amsvVar, elha elhaVar, athh athhVar) {
        amsvVar.getClass();
        elhaVar.getClass();
        bahx bahxVarC = c(amsvVar, elhaVar);
        ((bacm) bahxVarC).n = athhVar;
        return this.c.c(bahxVarC.q());
    }
}

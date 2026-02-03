package defpackage;

import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwey {
    public final fcsu a;
    public final fcsu b;
    public final arnz c;
    private final fcsu d;
    private final asrf e;
    private final aqve f;

    public bwey(fcsu fcsuVar, asrf asrfVar, fcsu fcsuVar2, aqve aqveVar, fcsu fcsuVar3, arnz arnzVar) {
        this.d = fcsuVar;
        this.e = asrfVar;
        this.a = fcsuVar2;
        this.f = aqveVar;
        this.b = fcsuVar3;
        this.c = arnzVar;
    }

    final void a(elxz elxzVar, int i) {
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_E2EE_IDENTITY_VERIFICATION_EVENT;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        elxx elxxVar = (elxx) elya.a.createBuilder();
        elxxVar.copyOnWrite();
        elya elyaVar = (elya) elxxVar.instance;
        elyaVar.d = elxzVar.i;
        elyaVar.b |= 2;
        elxxVar.copyOnWrite();
        elya elyaVar2 = (elya) elxxVar.instance;
        elyaVar2.b |= 4;
        elyaVar2.e = i;
        elya elyaVar3 = (elya) elxxVar.build();
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        elyaVar3.getClass();
        ellhVar2.aV = elyaVar3;
        ellhVar2.e |= VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS;
        if (this.c.a()) {
            ((cbqh) this.b.b()).a(emxt.BUGLE_E2EE_IDENTITY_VERIFICATION_EVENT, ellgVar);
        } else {
            ((aill) this.a.b()).j(ellgVar);
        }
    }

    final void b(elyd elydVar, int i, String str) {
        elyb elybVar = (elyb) elyg.a.createBuilder();
        elybVar.copyOnWrite();
        elyg elygVar = (elyg) elybVar.instance;
        elygVar.c = elydVar.m;
        elygVar.b |= 1;
        elybVar.copyOnWrite();
        elyg elygVar2 = (elyg) elybVar.instance;
        elygVar2.b |= 4;
        elygVar2.g = i;
        if (str != null) {
            elybVar.copyOnWrite();
            elyg elygVar3 = (elyg) elybVar.instance;
            elygVar3.b |= 8;
            elygVar3.h = str;
        }
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_E2EE_LOOKUP_REGISTERED;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        elyg elygVar4 = (elyg) elybVar.build();
        elygVar4.getClass();
        ellhVar2.T = elygVar4;
        ellhVar2.c |= 1048576;
        if (this.c.a()) {
            ((cbqh) this.b.b()).a(emxt.BUGLE_E2EE_LOOKUP_REGISTERED, ellgVar);
        } else {
            ((aill) this.a.b()).j(ellgVar);
        }
    }

    public final void c(basd basdVar, int i) {
        if (this.c.a()) {
            ((cbqh) this.b.b()).c(basdVar, basd.a, 4, 24, i);
        } else {
            f(basdVar, basd.a, 4, 24, i);
        }
    }

    public final void d(basd basdVar, basd basdVar2, int i) {
        if (this.c.a()) {
            ((cbqh) this.b.b()).c(basdVar, basdVar2, 4, 24, i);
        } else {
            f(basdVar, basdVar2, 4, 24, i);
        }
    }

    final void e(basd basdVar, int i) {
        if (this.c.a()) {
            ((cbqh) this.b.b()).c(basdVar, basd.a, 4, 26, i);
        } else {
            f(basdVar, basd.a, 4, 26, i);
        }
    }

    @Deprecated
    public final void f(basd basdVar, basd basdVar2, int i, int i2, int i3) {
        elvt elvtVar = (elvt) elvv.a.createBuilder();
        fcsu fcsuVar = this.d;
        int iD = ((ajhd) fcsuVar.b()).d();
        elvtVar.copyOnWrite();
        elvv elvvVar = (elvv) elvtVar.instance;
        elvvVar.b |= 1;
        elvvVar.c = iD;
        elvv elvvVar2 = (elvv) elvtVar.build();
        final elof elofVar = (elof) elpg.b.createBuilder();
        enyw enywVarA = this.e.a();
        elofVar.copyOnWrite();
        elpg elpgVar = (elpg) elofVar.instance;
        elpgVar.Y = enywVarA.h;
        elpgVar.d |= 2097152;
        elofVar.copyOnWrite();
        elpg elpgVar2 = (elpg) elofVar.instance;
        elpgVar2.h = i - 1;
        elpgVar2.c |= 1;
        elofVar.copyOnWrite();
        elpg elpgVar3 = (elpg) elofVar.instance;
        elpgVar3.i = i2 - 1;
        elpgVar3.c |= 2;
        elofVar.copyOnWrite();
        elpg elpgVar4 = (elpg) elofVar.instance;
        elvvVar2.getClass();
        elpgVar4.y = elvvVar2;
        elpgVar4.c |= 4194304;
        elvg elvgVar = cqbe.a;
        elofVar.copyOnWrite();
        elpg elpgVar5 = (elpg) elofVar.instance;
        elpgVar5.L = elvgVar.x;
        elpgVar5.d |= 512;
        if (!((eoth) ((aquz) this.f).a.b()).a("bugle.skip_pcscf_in_etouffee_log")) {
            String strJ = ((ajhd) fcsuVar.b()).j(Optional.empty());
            elofVar.copyOnWrite();
            elpg elpgVar6 = (elpg) elofVar.instance;
            strJ.getClass();
            elpgVar6.d |= 1;
            elpgVar6.J = strJ;
        }
        if (i3 != 1) {
            elofVar.copyOnWrite();
            elpg elpgVar7 = (elpg) elofVar.instance;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            elpgVar7.af = i4;
            elpgVar7.d |= 536870912;
        }
        basdVar.g(new Consumer() { // from class: bwew
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                String strF = ((basd) obj).f();
                elof elofVar2 = elofVar;
                elofVar2.copyOnWrite();
                elpg elpgVar8 = (elpg) elofVar2.instance;
                evsy evsyVar = elpg.a;
                elpgVar8.c |= Integer.MIN_VALUE;
                elpgVar8.H = strF;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        basdVar2.g(new Consumer() { // from class: bwex
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                String strF = ((basd) obj).f();
                elof elofVar2 = elofVar;
                elofVar2.copyOnWrite();
                elpg elpgVar8 = (elpg) elofVar2.instance;
                evsy evsyVar = elpg.a;
                elpgVar8.d |= 32768;
                elpgVar8.R = strF;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_MESSAGE;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        elpg elpgVar8 = (elpg) elofVar.build();
        elpgVar8.getClass();
        ellhVar2.l = elpgVar8;
        ellhVar2.b |= 4;
        ((aill) this.a.b()).j(ellgVar);
    }

    public final void g(ConversationIdType conversationIdType, basd basdVar) {
        ennl ennlVar = (ennl) ennn.a.createBuilder();
        String string = conversationIdType.toString();
        ennlVar.copyOnWrite();
        ennn ennnVar = (ennn) ennlVar.instance;
        string.getClass();
        ennnVar.b |= 1;
        ennnVar.c = string;
        ennlVar.copyOnWrite();
        ennn ennnVar2 = (ennn) ennlVar.instance;
        ennnVar2.e = 1;
        ennnVar2.b |= 4;
        String str = basdVar.b;
        if (str != null) {
            ennlVar.copyOnWrite();
            ennn ennnVar3 = (ennn) ennlVar.instance;
            ennnVar3.b |= 2;
            ennnVar3.d = str;
        }
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.CONVERSATION_E2EE_STATUS_UPDATE;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ennn ennnVar4 = (ennn) ennlVar.build();
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        ennnVar4.getClass();
        ellhVar2.bp = ennnVar4;
        ellhVar2.f |= 536870912;
        if (this.c.a()) {
            ((cbqh) this.b.b()).a(emxt.CONVERSATION_E2EE_STATUS_UPDATE, ellgVar);
        } else {
            ((aill) this.a.b()).j(ellgVar);
        }
    }
}

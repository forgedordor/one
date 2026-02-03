package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class umz implements uel {
    private static final eksp a = eksp.c("BugleReactions");

    @Override // defpackage.uel
    public final ekgb a(baea baeaVar) {
        Object unfVar;
        cklv cklvVar = baeaVar.r;
        if (cklvVar == null) {
            int i = ekgb.d;
            return ekoe.a;
        }
        int i2 = ekgb.d;
        ekfw ekfwVar = new ekfw();
        for (ckme ckmeVar : cklvVar.b) {
            ejwl.a(ckmeVar.d.size() > 0);
            ckmb ckmbVar = ckmeVar.c;
            if (ckmbVar == null) {
                ckmbVar = ckmb.a;
            }
            ckml ckmlVarB = ckml.b(ckmbVar.e);
            if (ckmlVarB == null) {
                ckmlVarB = ckml.UNRECOGNIZED;
            }
            if (ckmlVarB == ckml.CUSTOM) {
                ckmb ckmbVar2 = ckmeVar.c;
                if (ckmbVar2 == null) {
                    ckmbVar2 = ckmb.a;
                }
                ckmb ckmbVar3 = (ckmb) ckmg.m.get(ckmbVar2.d);
                if (ckmbVar3 != null) {
                    unfVar = new umy(ckmbVar3, ckmeVar.d.size());
                } else {
                    ckmb ckmbVar4 = ckmeVar.c;
                    if (ckmbVar4 == null) {
                        ckmbVar4 = ckmb.a;
                    }
                    unfVar = new unf(ckmbVar4, ckmeVar.d.size());
                }
                ekfwVar.h(unfVar);
            } else {
                ckmb ckmbVar5 = ckmeVar.c;
                ckml ckmlVarB2 = ckml.b((ckmbVar5 == null ? ckmb.a : ckmbVar5).e);
                if (ckmlVarB2 == null) {
                    ckmlVarB2 = ckml.UNRECOGNIZED;
                }
                if (ckmlVarB2 == ckml.REACTION_TYPE_UNSPECIFIED) {
                    ((eksl) a.a(Level.SEVERE).h("com/google/android/apps/messaging/conversation/reactions/ui/badges/ReactionBadgeDataConverter", "convert", 50, "ReactionBadgeDataConverter.java")).q("Ignoring the reaction of unspecified type.");
                } else {
                    ckml ckmlVarB3 = ckml.b((ckmbVar5 == null ? ckmb.a : ckmbVar5).e);
                    if (ckmlVarB3 == null) {
                        ckmlVarB3 = ckml.UNRECOGNIZED;
                    }
                    if (ckmlVarB3 == ckml.EMOTIFY) {
                        ((eksl) a.a(Level.INFO).h("com/google/android/apps/messaging/conversation/reactions/ui/badges/ReactionBadgeDataConverter", "convert", 52, "ReactionBadgeDataConverter.java")).q("Ignoring the Emotify reaction for conv1.");
                    } else {
                        if (ckmbVar5 == null) {
                            ckmbVar5 = ckmb.a;
                        }
                        ekfwVar.h(new umy(ckmbVar5, ckmeVar.d.size()));
                    }
                }
            }
        }
        return ekfwVar.g();
    }
}

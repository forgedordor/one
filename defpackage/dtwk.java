package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtwk {
    public static boolean a(dtma dtmaVar, dtma dtmaVar2) {
        return b(dtmaVar, dtmaVar2, new ejwm() { // from class: dtwa
            @Override // defpackage.ejwm
            public final boolean a(Object obj) {
                return (((dtma) obj).b & 2) != 0;
            }
        }, new ejvr() { // from class: dtwb
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((dtma) obj).d;
            }
        }) && b(dtmaVar, dtmaVar2, new ejwm() { // from class: dtwc
            @Override // defpackage.ejwm
            public final boolean a(Object obj) {
                return (((dtma) obj).b & 1) != 0;
            }
        }, new ejvr() { // from class: dtwd
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((dtma) obj).c;
            }
        }) && b(dtmaVar, dtmaVar2, new ejwm() { // from class: dtwe
            @Override // defpackage.ejwm
            public final boolean a(Object obj) {
                return (((dtma) obj).b & 4) != 0;
            }
        }, new ejvr() { // from class: dtwf
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((dtma) obj).e;
            }
        }) && b(dtmaVar, dtmaVar2, new ejwm() { // from class: dtwg
            @Override // defpackage.ejwm
            public final boolean a(Object obj) {
                return (((dtma) obj).b & 8) != 0;
            }
        }, new ejvr() { // from class: dtwh
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Integer.valueOf(((dtma) obj).f);
            }
        }) && b(dtmaVar, dtmaVar2, new ejwm() { // from class: dtwi
            @Override // defpackage.ejwm
            public final boolean a(Object obj) {
                return (((dtma) obj).b & 16) != 0;
            }
        }, new ejvr() { // from class: dtwj
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                dtlz dtlzVarB = dtlz.b(((dtma) obj).g);
                return dtlzVarB == null ? dtlz.UNSPECIFIED : dtlzVarB;
            }
        }) && dtmaVar.h.size() == dtmaVar2.h.size();
    }

    private static boolean b(dtma dtmaVar, dtma dtmaVar2, ejwm ejwmVar, ejvr ejvrVar) {
        return !ejwmVar.a(dtmaVar) ? !ejwmVar.a(dtmaVar2) : ejvrVar.apply(dtmaVar).equals(ejvrVar.apply(dtmaVar2));
    }
}

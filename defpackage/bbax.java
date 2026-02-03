package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbax {
    private final fcsu a;
    private final fcsu b;

    public bbax(fcsu fcsuVar, fcsu fcsuVar2) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
    }

    public static ParticipantColor a(ParticipantsTable.BindData bindData) {
        return new ParticipantColor(bindData.m(), bindData.k(), bindData.n());
    }

    public static void d(brvp brvpVar, ParticipantColor participantColor) {
        ParticipantColor participantColor2 = new ParticipantColor(brvpVar.t, brvpVar.s, brvpVar.u);
        if (participantColor2.f(participantColor)) {
            participantColor2.d(participantColor);
            brvpVar.i(participantColor2.a);
            brvpVar.h(participantColor2.b);
            brvpVar.s(participantColor2.c);
        }
    }

    public final void b(brvp brvpVar) {
        if (brvpVar.I == -1 || cqjb.e().contains(Long.valueOf(brvpVar.I))) {
            brvpVar.l(-2L);
            brvpVar.D(null);
            brvpVar.k(null);
            brvpVar.W(0);
            brvpVar.p(-1L);
            if (brvpVar.Q != chpq.PROFILE_PEOPLE_SHARING_SOURCE) {
                brvpVar.N(null);
                brvpVar.K(chpq.PROFILE_UNSPECIFIED_SOURCE);
            }
            brvpVar.u(null);
            brvpVar.t(null);
            brvpVar.G(chpq.PROFILE_UNSPECIFIED_SOURCE);
        } else {
            brvpVar.l(-2L);
        }
        c(brvpVar);
    }

    public final void c(brvp brvpVar) {
        cqaz.l(brvpVar);
        if (a(brvpVar.a()).a == 2) {
            brvpVar.a();
            return;
        }
        d(brvpVar, new ParticipantColor(0, ((crlw) this.a.b()).f(cpbs.a(brvpVar.f)), 0));
        brvpVar.a();
    }
}

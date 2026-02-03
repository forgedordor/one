package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.recipient.DefaultRecipient;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anvu {
    public final ParticipantsTable.BindData a;
    public final bncf b;
    public final ProfilesTable.BindData c;
    private final fcsu d;
    private final fcsu e;

    public anvu(fcsu fcsuVar, fcsu fcsuVar2, ParticipantsTable.BindData bindData, bncf bncfVar, ProfilesTable.BindData bindData2) {
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.a = bindData;
        this.b = bncfVar;
        this.c = bindData2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.net.Uri a(com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient r2, defpackage.cpbl r3) {
        /*
            r1 = this;
            r3.getClass()
            cpbl r0 = defpackage.cpbl.b
            if (r3 != r0) goto L2f
            chpq r3 = r2.p()
            chpq r0 = defpackage.chpq.PROFILE_CONTACT_SOURCE
            if (r3 == r0) goto L13
            chpq r0 = defpackage.chpq.PROFILE_UNSPECIFIED_SOURCE
            if (r3 != r0) goto L24
        L13:
            bncf r3 = r1.b
            if (r3 == 0) goto L1c
            android.net.Uri r0 = r3.k()
            goto L1d
        L1c:
            r0 = 0
        L1d:
            if (r0 == 0) goto L24
            android.net.Uri r3 = r3.k()
            goto L2a
        L24:
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r3 = r1.a
            android.net.Uri r3 = r3.x()
        L2a:
            android.net.Uri r2 = r1.c(r2, r3)
            return r2
        L2f:
            fcsu r2 = r1.e
            java.lang.Object r2 = r2.b()
            axjf r2 = (defpackage.axjf) r2
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r3 = r1.a
            android.net.Uri r2 = r2.a(r3)
            r2.getClass()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anvu.a(com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient, cpbl):android.net.Uri");
    }

    public final chpq b() {
        chpq chpqVarG = this.a.G();
        chpqVarG.getClass();
        return chpqVarG;
    }

    public final Uri c(Recipient recipient, Uri uri) {
        cpbn cpbnVar = (cpbn) this.d.b();
        String strW = recipient.w();
        ParticipantColor participantColorJ = recipient.J();
        boolean zD = recipient.D();
        boolean z = false;
        if (recipient.H() != null && recipient.H().b()) {
            z = true;
        }
        Uri uriG = cpbnVar.g(uri, strW, ((DefaultRecipient) recipient).c, participantColorJ, zD, z, recipient.z());
        uriG.getClass();
        return uriG;
    }
}

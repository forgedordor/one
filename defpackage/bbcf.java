package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbcf implements ccyz {
    private final fcsu a;

    public bbcf(fcsu fcsuVar) {
        this.a = fcsuVar;
    }

    public static boolean c(String str) {
        return TextUtils.isEmpty(str) || str.trim().length() == 0;
    }

    public static void d(String str, int i) {
        if (c(str)) {
            throw new IllegalArgumentException(a.n(str, i != 1 ? i != 2 ? "DISPLAY" : "NORMALIZED" : "SEND", "Participant's ", " destination is not valid: "));
        }
    }

    @Override // defpackage.ccyz
    public final void a() {
        fcsu fcsuVar = ((axjq) this.a.b()).b;
        final boolean zA = axjs.a();
        ((dqsn) fcsuVar.b()).d("ParticipantsColumnSetter#updatePhenotypeColumn", new Runnable() { // from class: axji
            @Override // java.lang.Runnable
            public final void run() {
                boolean z = zA;
                if (z) {
                    axjq.c();
                }
                bsbs bsbsVarF = ParticipantsTable.f();
                bsbsVarF.ap("updatePhenotypeColumn");
                bsbsVarF.x(z);
                bsbsVarF.b().e();
            }
        });
    }

    @Override // defpackage.ccyz
    public final boolean gd() {
        return true;
    }
}

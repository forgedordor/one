package defpackage;

import com.google.android.apps.messaging.backup.BugleBackupAgent;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class szs implements crnx {
    final /* synthetic */ Charset a;
    final /* synthetic */ ekgi b;
    final /* synthetic */ BugleBackupAgent c;

    public szs(BugleBackupAgent bugleBackupAgent, Charset charset, ekgi ekgiVar) {
        this.a = charset;
        this.b = ekgiVar;
        this.c = bugleBackupAgent;
    }

    @Override // defpackage.crnx
    public final boolean a(int i) {
        BugleBackupAgent bugleBackupAgent = this.c;
        String strW = bugleBackupAgent.b.h(i).w();
        if (strW == null) {
            bugleBackupAgent.i.l("SIM ICCID for active subscription ID %d is null. Skipping.", Integer.valueOf(i));
            return true;
        }
        int i2 = elcz.a;
        String string = elcx.a.c(strW, this.a).toString();
        ahzu ahzuVar = bugleBackupAgent.i;
        Integer numValueOf = Integer.valueOf(i);
        String strB = cqcv.b(string);
        ekrd ekrdVar = (ekrd) ahzuVar.a.e();
        String str = ahzuVar.c;
        ekrz ekrzVar = eksq.a;
        ekrdVar.X(ekrzVar, str);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/restore/logging/DoubleLogger", "atFine", 122, "DoubleLogger.kt")).I("SIM ICCID for active subscription ID %d is \"%s\" (SHA-256: %s).", numValueOf, strW, strB);
        if (ahzuVar.e) {
            eksl ekslVar = (eksl) ahzuVar.b.e();
            ekslVar.X(ekrzVar, ahzuVar.d);
            ekslVar.I("SIM ICCID for active subscription ID %d is \"%s\" (SHA-256: %s).", numValueOf, strW, strB);
        }
        this.b.i(bugleBackupAgent.j.a(i).a(), "bugleuniqsub_".concat(string));
        return true;
    }
}

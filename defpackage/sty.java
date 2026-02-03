package defpackage;

import com.android.vcard.VCardConfig;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sty {
    private final fcsu a;

    public sty(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.a = fcsuVar;
    }

    public static final int b(Duration duration) {
        int seconds = (int) duration.getSeconds();
        return seconds - (seconds % 5);
    }

    public static final int c(int i) {
        if (i != 1) {
            return i != 2 ? 1 : 3;
        }
        return 2;
    }

    public static final int d(int i) {
        int i2 = i - 2;
        if (i2 != 1) {
            return i2 != 2 ? 1 : 3;
        }
        return 2;
    }

    public final void a(eocx eocxVar) {
        aill aillVar = (aill) this.a.b();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.VMT_SESSION_EVENT;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        ellhVar2.bm = eocxVar;
        ellhVar2.f |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
        aillVar.o(ellgVar);
    }
}

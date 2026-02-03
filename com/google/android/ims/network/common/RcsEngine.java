package com.google.android.ims.network.common;

import android.os.IBinder;
import com.google.android.ims.rcs.engine.IRcsEngineTemporaryController;
import defpackage.dezc;
import defpackage.dfno;
import defpackage.dfvy;
import defpackage.dfyl;
import defpackage.dfyr;
import defpackage.dfys;
import defpackage.dgtu;
import defpackage.dhek;
import defpackage.dhki;
import java.io.PrintWriter;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface RcsEngine extends IRcsEngineTemporaryController, IBinder, dgtu, dfyl, dfyr, dezc, dfno, dhek, dfvy {
    public static final int[] DEFAULT_NETWORK_REGISTRATION_ORDER = {17, 1, 0};

    void dumpState(PrintWriter printWriter);

    dfys getImsModule();

    dhki getSipConnectionType();

    void init();

    void onReconfigurationRequested();

    void onSimLoaded(boolean z);

    void onSimRemoved();

    void shutdown();
}

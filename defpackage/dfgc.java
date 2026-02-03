package defpackage;

import android.content.Context;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import com.google.android.ims.rcsservice.filetransfer.FileTransferInfo;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfgc {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;

    public dfgc(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.d = fcsuVar4;
        this.e = fcsuVar5;
        this.f = fcsuVar6;
    }

    public final dfgb a(long j, String str, String str2, FileTransferInfo fileTransferInfo, InstantMessageConfiguration instantMessageConfiguration, dfif dfifVar, boolean z, deyb deybVar, dfgu dfguVar, String str3) {
        Context context = (Context) this.a.b();
        dfdv dfdvVar = (dfdv) this.b.b();
        dgfu dgfuVar = (dgfu) this.c.b();
        str.getClass();
        str2.getClass();
        fileTransferInfo.getClass();
        instantMessageConfiguration.getClass();
        dfifVar.getClass();
        return new dfgb(context, dfdvVar, dgfuVar, this.f, j, str, str2, fileTransferInfo, instantMessageConfiguration, dfifVar, z, deybVar, dfguVar, str3);
    }
}

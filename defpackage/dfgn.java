package defpackage;

import android.telephony.TelephonyManager;
import com.google.android.ims.filetransfer.http.runnable.GbaBootstrapAuthenticationException;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Base64;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfgn extends TelephonyManager.BootstrapAuthenticationCallback {
    final /* synthetic */ SettableFuture a;
    final /* synthetic */ dfgq b;

    public dfgn(dfgq dfgqVar, SettableFuture settableFuture) {
        this.a = settableFuture;
        this.b = dfgqVar;
    }

    public final void onAuthenticationFailure(int i) {
        ewgq ewgqVar = (ewgq) ewgv.a.createBuilder();
        ewgqVar.copyOnWrite();
        ewgv ewgvVar = (ewgv) ewgqVar.instance;
        ewgvVar.c = 1;
        ewgvVar.b |= 1;
        ewgqVar.copyOnWrite();
        ewgv ewgvVar2 = (ewgv) ewgqVar.instance;
        ewgvVar2.d = 3;
        ewgvVar2.b |= 2;
        int iA = ewgt.a(i);
        if (iA == 0) {
            iA = 1;
        }
        dfgq dfgqVar = this.b;
        ewgqVar.copyOnWrite();
        ewgv ewgvVar3 = (ewgv) ewgqVar.instance;
        ewgvVar3.e = iA - 1;
        ewgvVar3.b |= 4;
        dfgqVar.a.a(4, (ewgv) ewgqVar.build());
        dhja.g("[SR] GBA authentication FAILURE: %d.", Integer.valueOf(i));
        this.a.setException(new GbaBootstrapAuthenticationException(i));
    }

    public final void onKeysAvailable(byte[] bArr, String str) {
        ewgq ewgqVar = (ewgq) ewgv.a.createBuilder();
        ewgqVar.copyOnWrite();
        ewgv ewgvVar = (ewgv) ewgqVar.instance;
        ewgvVar.c = 1;
        ewgvVar.b |= 1;
        ewgqVar.copyOnWrite();
        ewgv ewgvVar2 = (ewgv) ewgqVar.instance;
        ewgvVar2.d = 1;
        ewgvVar2.b |= 2;
        this.b.a.a(3, (ewgv) ewgqVar.build());
        dhja.k("[SR] GBA authentication SUCCESS: obtained gbaKey and btId.", new Object[0]);
        int i = dfgo.a;
        this.a.set(new dffg(new dffh(str), Base64.getEncoder().encodeToString(bArr)));
    }
}

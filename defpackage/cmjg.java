package defpackage;

import android.content.Intent;
import com.google.android.apps.messaging.shared.simstatetracker.AsyncTelephonySimStateReceiver;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmjg extends fcyz implements fdat {
    int a;
    final /* synthetic */ AsyncTelephonySimStateReceiver b;
    final /* synthetic */ Intent c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmjg(AsyncTelephonySimStateReceiver asyncTelephonySimStateReceiver, Intent intent, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = asyncTelephonySimStateReceiver;
        this.c = intent;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmjg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0171  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmjg.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cmjg(this.b, this.c, fcxyVar);
    }
}

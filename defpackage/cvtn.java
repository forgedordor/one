package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.messaging.shared.datamodel.data.PendingAttachmentData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvtn implements lhx {
    final /* synthetic */ cvmf a;

    public cvtn(cvmf cvmfVar) {
        this.a = cvmfVar;
    }

    @Override // defpackage.lhx
    public final boolean a(lia liaVar, int i, Bundle bundle) {
        String str;
        cvmf cvmfVar = this.a;
        cvmj cvmjVar = cvmfVar.a;
        babw babwVar = cvmfVar.b;
        View view = cvmfVar.c;
        String[] strArr = cvlj.sA;
        int length = strArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= 4) {
                str = null;
                break;
            }
            str = strArr[i2];
            if (liaVar.a().hasMimeType(str)) {
                break;
            }
            i2++;
        }
        if (str == null) {
            return false;
        }
        if ((i & 1) != 0) {
            try {
                liaVar.c();
            } catch (Exception e) {
                cvmj.a.o("requestPermission failed", e);
                return false;
            }
        }
        PendingAttachmentData pendingAttachmentDataA = ((baii) cvmjVar.Q.b()).a(str, liaVar.b(), aiuw.a(cvmjVar.k) == 3 ? elha.GBOARD_EMOJI : elha.UNKNOWN_IME);
        pendingAttachmentDataA.h = czeq.a(pendingAttachmentDataA);
        aipw aipwVar = (aipw) cvmjVar.L.b();
        emop emopVar = pendingAttachmentDataA.h;
        babw babwVar2 = cvmjVar.x;
        aipwVar.b(emopVar, ((bagr) babwVar2.a()).k());
        bagr bagrVar = (bagr) babwVar2.a();
        if (bagrVar.v(pendingAttachmentDataA, babwVar.b())) {
            bagrVar.q();
        }
        bagrVar.r(1);
        view.requestFocus();
        return true;
    }
}

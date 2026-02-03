package defpackage;

import android.net.Uri;
import android.provider.CallLog;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csxz extends fcyz implements fdat {
    int a;
    final /* synthetic */ csya b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csxz(csya csyaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = csyaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csxz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                csya csyaVar = this.b;
                egqi egqiVar = csyaVar.b;
                Uri uri = CallLog.Calls.CONTENT_URI;
                uri.getClass();
                fdpl fdplVarD = egqiVar.d(uri);
                csxy csxyVar = new csxy(csyaVar);
                this.a = 1;
                if (fdplVarD.a(csxyVar, this) == fcylVar) {
                    return fcylVar;
                }
            }
        } catch (SecurityException e) {
            ekrw ekrwVarJ = csya.a.j();
            ekrwVarJ.X(eksq.a, "Bugle");
            ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/video/MissedVideoCallObserver$register$1", "invokeSuspend", 78, "MissedVideoCallObserver.kt")).t("MissedVideoCallObserver failed, likely due to lack of READ_CALL_LOG permission: %s", e.getMessage());
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new csxz(this.b, fcxyVar);
    }
}

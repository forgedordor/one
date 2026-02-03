package defpackage;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.spatula.settings.SpatulaAvailability;
import com.google.android.gms.spatula.settings.internal.ISpatulaAvailabilityCallbacks;
import com.google.android.gms.spatula.settings.internal.ISpatulaSettingsService;
import defpackage.dcjb;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csml extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ csmm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csml(csmm csmmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = csmmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csml) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [fcyl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        ?? r0;
        ?? r02 = fcyl.a;
        boolean z = true;
        try {
            if (this.b != 0) {
                r0 = this.a;
                try {
                    fctl.b(obj);
                    r0 = r0;
                } catch (Exception e) {
                    e = e;
                    ekrw ekrwVarH = csmm.a.h();
                    ekrwVarH.X(eksq.a, "BugleSpam");
                    ((ekrd) ((ekrd) ekrwVarH).g(e).h("com/google/android/apps/messaging/shared/util/spam/spatula/SpatulaSettingsProxyImpl$isAvailable$2", "invokeSuspend", 124, "SpatulaSettingsProxyImpl.kt")).q("fail to get Spatula availability.");
                    fczl.a(r0, null);
                    return false;
                }
            } else {
                fctl.b(obj);
                csmm csmmVar = this.c;
                if (!eicg.b(u())) {
                    throw new IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
                }
                eieu eieuVarH = eiiy.h("SpatulaSettingsProxyImpl.isAvailable");
                try {
                    Object obj2 = csmmVar.b;
                    ((eksl) deee.a.h()).q("GetSpatulaAvailability");
                    dciz dcizVar = new dciz();
                    dcizVar.b = new Feature[]{deeg.a};
                    final deec deecVar = (deec) obj2;
                    dcizVar.a = new dcir() { // from class: deeb
                        @Override // defpackage.dcir
                        public final void a(Object obj3, Object obj4) {
                            deef deefVar = (deef) obj3;
                            final deec deecVar2 = deecVar;
                            final defr defrVar = (defr) obj4;
                            ISpatulaAvailabilityCallbacks.Stub stub = new ISpatulaAvailabilityCallbacks.Stub() { // from class: com.google.android.gms.spatula.settings.internal.InternalSpatulaSettingsClient$createSpatulaAvailabilityCallback$1
                                @Override // com.google.android.gms.spatula.settings.internal.ISpatulaAvailabilityCallbacks
                                public void onGetSpatulaAvailability(Status status, SpatulaAvailability spatulaAvailability) {
                                    if (spatulaAvailability != null) {
                                        dcjb.b(status, spatulaAvailability, defrVar);
                                        return;
                                    }
                                    SpatulaAvailability spatulaAvailability2 = new SpatulaAvailability();
                                    spatulaAvailability2.a = 0;
                                    dcjb.b(status, spatulaAvailability2, defrVar);
                                }
                            };
                            ISpatulaSettingsService iSpatulaSettingsService = (ISpatulaSettingsService) deefVar.w();
                            Context context = deefVar.c;
                            iSpatulaSettingsService.getSpatulaAvailability(stub, ddlh.a());
                        }
                    };
                    dcizVar.c = 34503;
                    defn defnVarJ = ((dcfm) obj2).j(dcizVar.a());
                    this.a = eieuVarH;
                    this.b = 1;
                    obj = febo.a(defnVarJ, this);
                    if (obj == r02) {
                        return r02;
                    }
                    r0 = eieuVarH;
                } catch (Exception e2) {
                    e = e2;
                    r0 = eieuVarH;
                    ekrw ekrwVarH2 = csmm.a.h();
                    ekrwVarH2.X(eksq.a, "BugleSpam");
                    ((ekrd) ((ekrd) ekrwVarH2).g(e).h("com/google/android/apps/messaging/shared/util/spam/spatula/SpatulaSettingsProxyImpl$isAvailable$2", "invokeSuspend", 124, "SpatulaSettingsProxyImpl.kt")).q("fail to get Spatula availability.");
                    fczl.a(r0, null);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    r02 = eieuVarH;
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        fczl.a(r02, th);
                        throw th2;
                    }
                }
            }
            if (((SpatulaAvailability) obj).a != 1) {
                z = false;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            fczl.a(r0, null);
            return boolValueOf;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new csml(this.c, fcxyVar);
    }
}

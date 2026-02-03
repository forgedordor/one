package defpackage;

import android.net.Uri;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wha extends fcyz implements fdat {
    int a;
    final /* synthetic */ vvp b;
    final /* synthetic */ whe c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wha(fcxy fcxyVar, vvp vvpVar, whe wheVar) {
        super(2, fcxyVar);
        this.b = vvpVar;
        this.c = wheVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wha) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [fcyl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        Object obj3;
        ?? r0 = fcyl.a;
        int i = this.a;
        boolean zBooleanValue = true;
        try {
            if (i == 0) {
                fctl.b(obj);
                Object objH = eiiy.h("AttachmentSecurityFilter#isAllowed");
                try {
                    vvp vvpVar = this.b;
                    if (vvpVar instanceof vvn) {
                        whe wheVar = this.c;
                        dltn dltnVar = ((vvn) vvpVar).b;
                        this.d = objH;
                        this.a = 1;
                        Object objA = wheVar.a(dltnVar, this);
                        if (objA != r0) {
                            obj3 = objH;
                            obj = objA;
                            zBooleanValue = ((Boolean) obj).booleanValue();
                            r0 = obj3;
                        }
                    } else if (vvpVar instanceof vvo) {
                        whe wheVar2 = this.c;
                        Uri uri = ((vvo) vvpVar).c;
                        this.d = objH;
                        this.a = 2;
                        Object objB = wheVar2.b(uri, this);
                        if (objB != r0) {
                            obj2 = objH;
                            obj = objB;
                            zBooleanValue = ((Boolean) obj).booleanValue();
                            r0 = obj2;
                        }
                    } else {
                        if (!(vvpVar instanceof vvm)) {
                            throw new fctg();
                        }
                        ekrw ekrwVarF = whe.a.f();
                        ekrwVarF.X(eksq.a, "BugleComposeRow2");
                        ((ekrd) ekrwVarF.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/AttachmentSecurityFilter$isAllowed$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 84, "AttachmentSecurityFilter.kt")).t("AttachmentSecurityFilter did not inspect URI for remote attachment %s", vvpVar);
                        r0 = objH;
                    }
                    return r0;
                } catch (Throwable th) {
                    r0 = objH;
                    th = th;
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        fczl.a(r0, th);
                        throw th2;
                    }
                }
            }
            if (i != 1) {
                Object obj4 = (Closeable) this.d;
                fctl.b(obj);
                obj2 = obj4;
                zBooleanValue = ((Boolean) obj).booleanValue();
                r0 = obj2;
            } else {
                Object obj5 = (Closeable) this.d;
                fctl.b(obj);
                obj3 = obj5;
                zBooleanValue = ((Boolean) obj).booleanValue();
                r0 = obj3;
            }
            Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
            fczl.a(r0, null);
            return boolValueOf;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        wha whaVar = new wha(fcxyVar, this.b, this.c);
        whaVar.d = obj;
        return whaVar;
    }
}

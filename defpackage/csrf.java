package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csrf extends fcyz implements fdat {
    int a;
    final /* synthetic */ csrl b;
    final /* synthetic */ String c;
    final /* synthetic */ Map d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csrf(fcxy fcxyVar, csrl csrlVar, String str, Map map) {
        super(2, fcxyVar);
        this.b = csrlVar;
        this.c = str;
        this.d = map;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csrf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
                return obj;
            }
            fctl.b(obj);
            ListenableFuture listenableFutureA = kol.a(new csrh(this.b, this.c, this.d));
            this.a = 1;
            Object objC = fdxs.c(listenableFutureA, this);
            return objC == fcylVar ? fcylVar : objC;
        } catch (Throwable th) {
            ekrw ekrwVarI = csrl.a.i();
            ekrwVarI.X(eksq.a, "BugleSpam");
            ((ekrd) ((ekrd) ekrwVarI).g(th).h("com/google/android/apps/messaging/shared/util/spam/tachyon/TachyonSpamGrpcProxyImpl$getDroidGuardResultsHelper$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 104, "TachyonSpamGrpcProxyImpl.kt")).q("TachyonSpamGrpcProxyImpl#getDroidGuardResults: Failed to get DroidGuard results. If you're seeing this in a test, please include `shadows = ShadowDroidGuardClient.class` in your test-class configuration, or include a module which provides a TachyonSpamGrpcProxyFake, rather than this impl. Failing to do either will cause flakes because TestingTaskBarrier does not know how to await for CallbackToFutureAdapter. https://groups.google.com/a/google.com/g/tiktok-users/c/HYrD36zsxt4/m/NbCeXn__AwAJ");
            return null;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        csrf csrfVar = new csrf(fcxyVar, this.b, this.c, this.d);
        csrfVar.e = obj;
        return csrfVar;
    }
}

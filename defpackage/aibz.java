package defpackage;

import j$.time.Duration;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aibz extends fcyz implements fdat {
    int a;
    final /* synthetic */ aice b;
    final /* synthetic */ dbxr c;
    final /* synthetic */ fbog d;
    final /* synthetic */ fcsf e;
    final /* synthetic */ Duration f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aibz(aice aiceVar, dbxr dbxrVar, fbog fbogVar, fcsf fcsfVar, Duration duration, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aiceVar;
        this.c = dbxrVar;
        this.d = fbogVar;
        this.e = fcsfVar;
        this.f = duration;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aibz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            aice aiceVar = this.b;
            dbxr dbxrVar = this.c;
            fbog fbogVar = this.d;
            fcsf fcsfVar = this.e;
            Duration duration = this.f;
            ayrq ayrqVar = ayrq.a;
            aiby aibyVar = new aiby(aiceVar, dbxrVar, fbogVar, fcsfVar, duration, null);
            this.a = 1;
            obj = ayrqVar.a("CustomD2DTargetServiceImpl#restoreCustomD2DItem", aibyVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        long j = ((fdhi) obj).c;
        ekrw ekrwVarH = aice.a.h();
        ekrwVarH.X(eksq.a, "BugleD2d");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.V(10, TimeUnit.SECONDS);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/restore/service/CustomD2DTargetServiceImpl$restoreCustomD2DItem$1", "invokeSuspend", 247, "CustomD2DTargetServiceImpl.kt")).s("CustomD2DTargetServiceImpl#restoreCustomD2DItem time: [%s]ms", fdhi.g(j));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aibz(this.b, this.c, this.d, this.e, this.f, fcxyVar);
    }
}

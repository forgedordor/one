package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csbd extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ fdci c;
    final /* synthetic */ csbe d;
    final /* synthetic */ Map e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csbd(fdci fdciVar, csbe csbeVar, Map map, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = fdciVar;
        this.d = csbeVar;
        this.e = map;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csbd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            obj2 = this.a;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            fdci fdciVar = this.c;
            cezj cezjVarA = cezm.a.a(this.d.b);
            Map map = this.e;
            this.a = fdciVar;
            this.b = 1;
            Object objA = cezjVarA.a(map, this);
            if (objA == fcylVar) {
                return fcylVar;
            }
            obj2 = fdciVar;
            obj = objA;
        }
        ((fdci) obj2).a = obj;
        ekrw ekrwVarH = csbe.a.h();
        ekrwVarH.X(eksq.a, "BugleSpam");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/util/spam/automationdetection/DroidguardAutomationDetectorImpl$getDroidguardBlob$2$1", "invokeSuspend", 91, "DroidguardAutomationDetectorImpl.kt")).q("Automation Detection: Droidguard blob obtained");
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new csbd(this.c, this.d, this.e, fcxyVar);
    }
}

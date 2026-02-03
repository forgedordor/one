package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tal extends fcyz implements fdat {
    int a;
    final /* synthetic */ tbe b;
    final /* synthetic */ dbwo c;
    final /* synthetic */ fbog d;
    final /* synthetic */ fcsf e;
    final /* synthetic */ Duration f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tal(tbe tbeVar, dbwo dbwoVar, fbog fbogVar, fcsf fcsfVar, Duration duration, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = tbeVar;
        this.c = dbwoVar;
        this.d = fbogVar;
        this.e = fcsfVar;
        this.f = duration;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tal) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            tbe tbeVar = this.b;
            dbwo dbwoVar = this.c;
            fbog fbogVar = this.d;
            fcsf fcsfVar = this.e;
            Duration duration = this.f;
            ayrq ayrqVar = ayrq.a;
            tak takVar = new tak(tbeVar, dbwoVar, fbogVar, fcsfVar, duration, null);
            this.a = 1;
            obj = ayrqVar.a("CustomD2DSourceServiceImpl#getCustomD2DItem", takVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        long j = ((fdhi) obj).c;
        ekrw ekrwVarH = tbe.a.h();
        ekrwVarH.X(eksq.a, "BugleD2d");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/backup/CustomD2DSourceServiceImpl$getCustomD2DItem$1", "invokeSuspend", 531, "CustomD2DSourceServiceImpl.kt")).s("CustomD2DSourceServiceImpl#getCustomD2DItem time: [%s]ms", fdhi.g(j));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new tal(this.b, this.c, this.d, this.e, this.f, fcxyVar);
    }
}

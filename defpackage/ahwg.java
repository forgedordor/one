package defpackage;

import j$.time.Duration;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahwg extends fcyz implements fdat {
    final /* synthetic */ ahwi a;
    final /* synthetic */ enzp b;
    final /* synthetic */ UUID c;
    final /* synthetic */ Duration d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;
    final /* synthetic */ int g;
    final /* synthetic */ int h;
    final /* synthetic */ aiba i;
    final /* synthetic */ enzh j;
    final /* synthetic */ ahwj k;
    final /* synthetic */ Long l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahwg(ahwi ahwiVar, enzp enzpVar, UUID uuid, Duration duration, int i, int i2, int i3, int i4, aiba aibaVar, enzh enzhVar, ahwj ahwjVar, Long l, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ahwiVar;
        this.b = enzpVar;
        this.c = uuid;
        this.d = duration;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = aibaVar;
        this.j = enzhVar;
        this.k = ahwjVar;
        this.l = l;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahwg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        try {
            ahwo ahwoVar = (ahwo) this.a.b.b();
            enzp enzpVar = this.b;
            UUID uuid = this.c;
            Duration duration = this.d;
            int i = this.e;
            int i2 = this.f;
            int i3 = this.g;
            int i4 = this.h;
            aiba aibaVar = this.i;
            auvw.k(ahwoVar.b, null, null, new ahwl(ahwoVar, enzpVar, uuid, duration, i, i2, i3, i4, this.j, this.k, this.l, aibaVar, null), 3);
        } catch (Exception e) {
            ekrw ekrwVarJ = ahwi.a.j();
            ekrwVarJ.X(eksq.a, "BugleRestore");
            ((ekrd) ((ekrd) ekrwVarJ).g(e).h("com/google/android/apps/messaging/restore/analytics/BasicRestoreWorkflowStepsEventLoggers$logCompleteEvent$1", "invokeSuspend", 125, "BasicRestoreWorkflowStepsEventLoggers.kt")).t("Failed to log complete event for: %s", this.b);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ahwg(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, fcxyVar);
    }
}

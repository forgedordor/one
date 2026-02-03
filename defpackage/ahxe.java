package defpackage;

import j$.time.Duration;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahxe extends fcyz implements fdat {
    int a;
    final /* synthetic */ ahxy b;
    final /* synthetic */ UUID c;
    final /* synthetic */ fdcg d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahxe(fcxy fcxyVar, ahxy ahxyVar, UUID uuid, fdcg fdcgVar) {
        super(2, fcxyVar);
        this.b = ahxyVar;
        this.c = uuid;
        this.d = fdcgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahxe) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object objA;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            objA = obj;
        } else {
            ahxy ahxyVar = this.b;
            UUID uuid = this.c;
            fdcg fdcgVar = this.d;
            ayrq ayrqVar = ayrq.a;
            ahxd ahxdVar = new ahxd(ahxyVar, uuid, fdcgVar, null);
            this.a = 1;
            objA = ayrqVar.a("BasicRestoreWorkflowSteps#doAttachmentRestoreInternal", ahxdVar, this);
            if (objA == fcylVar) {
                return fcylVar;
            }
        }
        long j = ((fdhi) objA).c;
        ahwi ahwiVar = (ahwi) this.b.i.b();
        UUID uuid2 = this.c;
        fdcg fdcgVar2 = this.d;
        enzp enzpVar = enzp.DO_ATTACHMENTS_RESTORE;
        int i2 = fdcgVar2.a;
        Duration durationOfSeconds = Duration.ofSeconds(fdhi.h(j), fdhi.d(j));
        durationOfSeconds.getClass();
        ahwi.a(ahwiVar, enzpVar, uuid2, 0, i2, 0, 0, null, durationOfSeconds, null, null, null, 1908);
        return objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ahxe ahxeVar = new ahxe(fcxyVar, this.b, this.c, this.d);
        ahxeVar.e = obj;
        return ahxeVar;
    }
}

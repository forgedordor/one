package defpackage;

import android.net.Uri;
import j$.time.Instant;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnwf extends fcyz implements fdat {
    int a;
    final /* synthetic */ cnwh b;
    final /* synthetic */ Uri c;
    final /* synthetic */ Instant d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnwf(cnwh cnwhVar, Uri uri, Instant instant, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cnwhVar;
        this.c = uri;
        this.d = instant;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnwf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object objA;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cnwh cnwhVar = this.b;
            Uri uri = this.c;
            Instant instant = this.d;
            this.a = 1;
            List listA = cnwhVar.A();
            if (listA.isEmpty()) {
                cnyu cnyuVar = (cnyu) cnyz.a.createBuilder();
                cnyuVar.getClass();
                UUID uuidRandomUUID = UUID.randomUUID();
                uuidRandomUUID.getClass();
                cnzi.g(cobs.a(uuidRandomUUID), cnyuVar);
                cnys cnysVar = (cnys) cnyt.a.createBuilder();
                cnysVar.getClass();
                String string = uri.toString();
                string.getClass();
                cnysVar.copyOnWrite();
                ((cnyt) cnysVar.instance).c = string;
                evvp evvpVarB = evxd.b(instant);
                cnysVar.copyOnWrite();
                cnyt cnytVar = (cnyt) cnysVar.instance;
                cnytVar.d = evvpVarB;
                cnytVar.b |= 1;
                cnzh.c(evxd.b(instant), cnysVar);
                cnzh.d(evxd.b(instant), cnysVar);
                cnzi.f(cnzh.a(cnysVar), cnyuVar);
                objA = ((cnyi) cnwhVar.c.b()).a(cnzi.c(cnyuVar), enqq.SPOT_SYNC, this);
                if (objA != fcylVar) {
                    objA = fctx.a;
                }
            } else {
                objA = cnwhVar.y(listA, enqq.SPOT_SYNC, false, this);
                if (objA != fcylVar) {
                    objA = fctx.a;
                }
            }
            if (objA == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cnwf(this.b, this.c, this.d, fcxyVar);
    }
}

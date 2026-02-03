package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.NoSuchElementException;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbkc extends fcyz implements fdat {
    int a;
    final /* synthetic */ UUID b;
    final /* synthetic */ cbkq c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbkc(fcxy fcxyVar, UUID uuid, cbkq cbkqVar) {
        super(2, fcxyVar);
        this.b = uuid;
        this.c = cbkqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbkc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        UUID uuid;
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                uuid = (UUID) this.d;
                fctl.b(obj);
            } else {
                fctl.b(obj);
                UUID uuid2 = this.b;
                ListenableFuture listenableFutureD = this.c.f.d(uuid2);
                this.d = uuid2;
                this.a = 1;
                Object objC = fdxs.c(listenableFutureD, this);
                if (objC == fcylVar) {
                    return fcylVar;
                }
                uuid = uuid2;
                obj = objC;
            }
            return new fcti(uuid, obj);
        } catch (NoSuchElementException unused) {
            return new fcti(this.b, null);
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbkc cbkcVar = new cbkc(fcxyVar, this.b, this.c);
        cbkcVar.d = obj;
        return cbkcVar;
    }
}

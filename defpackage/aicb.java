package defpackage;

import android.os.ParcelFileDescriptor;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aicb extends fcyz implements fdat {
    int a;
    final /* synthetic */ aice b;
    final /* synthetic */ ParcelFileDescriptor c;
    final /* synthetic */ dbwf d;
    final /* synthetic */ evqs e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aicb(fcxy fcxyVar, aice aiceVar, ParcelFileDescriptor parcelFileDescriptor, dbwf dbwfVar, evqs evqsVar) {
        super(2, fcxyVar);
        this.b = aiceVar;
        this.c = parcelFileDescriptor;
        this.d = dbwfVar;
        this.e = evqsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aicb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        aice aiceVar = this.b;
        ParcelFileDescriptor parcelFileDescriptor = this.c;
        parcelFileDescriptor.getClass();
        dbwf dbwfVar = this.d;
        UUID uuidC = cobs.c(this.e);
        this.a = 1;
        Object objG = aiceVar.g(parcelFileDescriptor, dbwfVar, uuidC, this);
        return objG == fcylVar ? fcylVar : objG;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        aicb aicbVar = new aicb(fcxyVar, this.b, this.c, this.d, this.e);
        aicbVar.f = obj;
        return aicbVar;
    }
}

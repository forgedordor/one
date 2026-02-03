package defpackage;

import android.os.ParcelFileDescriptor;
import com.android.vcard.VCardConfig;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tau extends fcyz implements fdat {
    final /* synthetic */ tbe a;
    final /* synthetic */ UUID b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tau(fcxy fcxyVar, tbe tbeVar, UUID uuid) {
        super(2, fcxyVar);
        this.a = tbeVar;
        this.b = uuid;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tau) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        szd szdVar = this.a.e;
        File fileA = szdVar.a.a(this.b);
        if (fileA == null) {
            throw new tby("Unable to open the backup database file");
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(fileA, VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
            try {
                long statSize = parcelFileDescriptorOpen.getStatSize();
                fczl.a(parcelFileDescriptorOpen, null);
                return new Long(statSize);
            } finally {
            }
        } catch (FileNotFoundException e) {
            szdVar.b.n(e, "Unable to get size of backup database");
            throw new tby("Unable to open the backup database file", e);
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        tau tauVar = new tau(fcxyVar, this.a, this.b);
        tauVar.c = obj;
        return tauVar;
    }
}

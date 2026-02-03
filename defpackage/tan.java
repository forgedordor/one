package defpackage;

import android.os.ParcelFileDescriptor;
import com.android.vcard.VCardConfig;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tan extends fcyz implements fdat {
    final /* synthetic */ fdce a;
    final /* synthetic */ tbe b;
    final /* synthetic */ evqs c;
    final /* synthetic */ fbog d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tan(fcxy fcxyVar, fdce fdceVar, tbe tbeVar, evqs evqsVar, fbog fbogVar) {
        super(2, fcxyVar);
        this.a = fdceVar;
        this.b = tbeVar;
        this.c = evqsVar;
        this.d = fbogVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tan) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        boolean z;
        szd szdVar;
        File fileA;
        fctl.b(obj);
        try {
            szdVar = this.b.e;
            fileA = szdVar.a.a(cobs.c(this.c));
        } catch (tby e) {
            this.b.l.n(e, "Failed to back up item");
            z = false;
        }
        if (fileA == null) {
            szdVar.b.k("Backup database copy file is null");
            throw new tby("Backup database copy file is null");
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(fileA, VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
            parcelFileDescriptorOpen.getClass();
            esum esumVar = dbwd.a;
            esumVar.getClass();
            esun.b(esumVar, parcelFileDescriptorOpen, this.d);
            z = true;
            this.a.a = z;
            return fctx.a;
        } catch (FileNotFoundException e2) {
            szdVar.b.n(e2, "File not found when opening file descriptor for backup database");
            throw new tby("File not found when opening file descriptor for backup database", e2);
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        tan tanVar = new tan(fcxyVar, this.a, this.b, this.c, this.d);
        tanVar.e = obj;
        return tanVar;
    }
}

package defpackage;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tao extends fcyz implements fdat {
    final /* synthetic */ fdce a;
    final /* synthetic */ tbe b;
    final /* synthetic */ szf c;
    final /* synthetic */ fbog d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tao(fcxy fcxyVar, fdce fdceVar, tbe tbeVar, szf szfVar, fbog fbogVar) {
        super(2, fcxyVar);
        this.a = fdceVar;
        this.b = tbeVar;
        this.c = szfVar;
        this.d = fbogVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tao) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        boolean z;
        szd szdVar;
        String strValueOf;
        PartsTable.BindData bindDataA;
        fctl.b(obj);
        try {
            szdVar = this.b.e;
            strValueOf = String.valueOf(this.c.a);
            bindDataA = PartsTable.a(strValueOf);
        } catch (tby e) {
            ekrw ekrwVarJ = tbe.a.j();
            ekrwVarJ.X(eksq.a, "BugleD2d");
            ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarJ).g(e);
            ekrdVar.Z(eksk.FULL);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/backup/CustomD2DSourceServiceImpl$getCustomD2DItemInternal$$inlined$withLegacyPropagatingContext$3", "invokeSuspend", 610, "CustomD2DSourceServiceImpl.kt")).q("Failed to back up item");
            z = false;
        }
        if (bindDataA == null) {
            ahzu ahzuVar = szdVar.b;
            ekrz ekrzVar = cqnc.v;
            ekrzVar.getClass();
            ahzuVar.q(ekrzVar, strValueOf, "Unable to find part id for backup attachment");
            throw new tby("Unable to find part id for backup attachment");
        }
        Uri uriT = bindDataA.t();
        if (uriT == null) {
            ahzu ahzuVar2 = szdVar.b;
            ekrz ekrzVar2 = cqnc.v;
            ekrzVar2.getClass();
            ahzuVar2.q(ekrzVar2, strValueOf, "Uri is null for backup attachment");
            throw new tby("Uri is null for backup attachment");
        }
        ParcelFileDescriptor parcelFileDescriptorA = szdVar.a(uriT, strValueOf, szdVar.b(uriT));
        esum esumVar = dbwd.a;
        esumVar.getClass();
        esun.b(esumVar, parcelFileDescriptorA, this.d);
        z = true;
        this.a.a = z;
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        tao taoVar = new tao(fcxyVar, this.a, this.b, this.c, this.d);
        taoVar.e = obj;
        return taoVar;
    }
}

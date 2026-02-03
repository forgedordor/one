package defpackage;

import android.database.DatabaseUtils;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class taw extends fcyz implements fdat {
    final /* synthetic */ tbe a;
    final /* synthetic */ long b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public taw(fcxy fcxyVar, tbe tbeVar, long j) {
        super(2, fcxyVar);
        this.a = tbeVar;
        this.b = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((taw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Uri uriT;
        fctl.b(obj);
        tbe tbeVar = this.a;
        int iLongValue = (int) ((Number) tbeVar.d.b()).longValue();
        final long j = this.b;
        szd szdVar = tbeVar.e;
        if (j < 0 || iLongValue < 0) {
            return fcvo.a;
        }
        bsje bsjeVarC = PartsTable.c();
        bsjeVarC.A("gatherAttachments");
        bsjeVarC.h(new Function() { // from class: szb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                bsjl bsjlVar = (bsjl) obj2;
                bsjlVar.getClass();
                bsjlVar.x();
                bsjlVar.ap(new dqpm("parts.uri", 4, ekjz.g(Arrays.asList(Uri.parse("")), new ejvr() { // from class: dqyn
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj3) {
                        if (obj3 == null) {
                            return null;
                        }
                        return obj3 instanceof Enum ? Integer.toString(((Enum) obj3).ordinal()) : DatabaseUtils.sqlEscapeString(obj3.toString());
                    }
                }), false));
                bsjlVar.ap(new dqty("parts._id", 8, Long.valueOf(j)));
                return bsjlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsjeVarC.d(new bsjb(PartsTable.d.a, false));
        bsjeVarC.y(iLongValue);
        ekgb ekgbVarZ = bsjeVarC.b().z();
        ekgbVarZ.getClass();
        ArrayList arrayList = new ArrayList();
        ekqh it = ekgbVarZ.iterator();
        it.getClass();
        while (it.hasNext()) {
            PartsTable.BindData bindData = (PartsTable.BindData) it.next();
            try {
                bindData.getClass();
                uriT = bindData.t();
            } catch (tby e) {
                ahzu ahzuVar = szdVar.b;
                ekrz ekrzVar = cqnc.v;
                ekrzVar.getClass();
                String strK = bindData.K();
                ekrz ekrzVar2 = cqnc.ab;
                ekrzVar2.getClass();
                ahzuVar.p(e, ekrzVar, strK, ekrzVar2, bindData.t(), "Unable to get metadata for attachment, skipping attachment for back up");
            }
            if (uriT == null) {
                ahzu ahzuVar2 = szdVar.b;
                ekrz ekrzVar3 = cqnc.v;
                ekrzVar3.getClass();
                ahzuVar2.q(ekrzVar3, bindData.K(), "Could not get file size, Uri is null");
                throw new tby("Could not get file size, Uri is null");
            }
            String strK2 = bindData.K();
            strK2.getClass();
            ParcelFileDescriptor parcelFileDescriptorA = szdVar.a(uriT, strK2, szdVar.b(uriT));
            try {
                if (parcelFileDescriptorA.getStatSize() == 0) {
                    ahzu ahzuVar3 = szdVar.b;
                    ekrz ekrzVar4 = cqnc.v;
                    ekrzVar4.getClass();
                    ekrz ekrzVar5 = cqnc.ab;
                    ekrzVar5.getClass();
                    ahzuVar3.r(ekrzVar4, strK2, ekrzVar5, uriT, "Could not get file size, file is empty");
                    throw new tby("Could not get file size, file is empty");
                }
                long statSize = parcelFileDescriptorA.getStatSize();
                fczl.a(parcelFileDescriptorA, null);
                szdVar.b.f("Read file size [%d] bytes from uri [%s]", Long.valueOf(statSize), uriT);
                String strK3 = bindData.K();
                strK3.getClass();
                long j2 = Long.parseLong(strK3);
                MessageIdType messageIdTypeV = bindData.v();
                messageIdTypeV.getClass();
                arrayList.add(new szf(j2, messageIdTypeV, statSize, bindData.I()));
            } finally {
            }
        }
        return arrayList;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        taw tawVar = new taw(fcxyVar, this.a, this.b);
        tawVar.c = obj;
        return tawVar;
    }
}

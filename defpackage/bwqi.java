package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwqi extends fcyz implements fdat {
    final /* synthetic */ bwqm a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwqi(fcxy fcxyVar, bwqm bwqmVar) {
        super(2, fcxyVar);
        this.a = bwqmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bwqi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        bwqm bwqmVar = this.a;
        bakt baktVar = (bakt) bwqmVar.b.b();
        bwvf bwvfVar = bwqmVar.g;
        List<ParticipantsTable.BindData> listK = baktVar.K(barn.b(bwvfVar.c == 2 ? (String) bwvfVar.d : ""));
        listK.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(listK, 10));
        for (ParticipantsTable.BindData bindData : listK) {
            bindData.getClass();
            int i = bbbd.a;
            String strT = null;
            if (!bbbe.c(bindData) && bindData.T() != null) {
                strT = bindData.T();
            }
            if (strT == null) {
                throw new IllegalStateException("Unable to create ChatEndpoint");
            }
            aubq aubqVarA = ((asqx) bwqmVar.d.b()).a(strT, false);
            aubqVarA.getClass();
            arrayList.add(aubqVarA);
        }
        return arrayList;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bwqi bwqiVar = new bwqi(fcxyVar, this.a);
        bwqiVar.b = obj;
        return bwqiVar;
    }
}

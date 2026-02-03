package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amjh implements ancm {
    private final amjl a;

    public amjh(amjl amjlVar) {
        amjlVar.getClass();
        this.a = amjlVar;
    }

    @Override // defpackage.ancm
    public final bsje b(bsje bsjeVar) {
        String[] strArr = VmtTable.a;
        bsjeVar.H(dqts.i(new bvcy(VmtTable.a).b(), VmtTable.c.a, PartsTable.d.a).g());
        return bsjeVar;
    }

    @Override // defpackage.ancm
    public final boolean c() {
        return true;
    }

    @Override // defpackage.ancm
    public final void d(anck anckVar, MessagesTable.BindData bindData, andw andwVar, ekgp ekgpVar, ajts ajtsVar, anbi anbiVar) {
        bindData.getClass();
        andwVar.getClass();
        ekgpVar.getClass();
        ajtsVar.getClass();
        String[] strArr = VmtTable.a;
        VmtTable.BindData[] bindDataArr = (VmtTable.BindData[]) bindData.aH("vmt", new VmtTable.BindData[0]);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator itA = fdbd.a(bindDataArr);
        while (itA.hasNext()) {
            VmtTable.BindData bindData2 = (VmtTable.BindData) itA.next();
            String strN = bindData2.n();
            String strO = bindData2.o();
            aonp aonpVarK = bindData2.k();
            int i = 1;
            if (aonpVarK != null) {
                switch (aonpVarK.ordinal()) {
                    case 1:
                        i = 2;
                        break;
                    case 2:
                        i = 3;
                        break;
                    case 3:
                        i = 4;
                        break;
                    case 4:
                        i = 5;
                        break;
                    case 5:
                        i = 6;
                        break;
                    case 6:
                        i = 7;
                        break;
                }
            }
            String strM = bindData2.m();
            linkedHashMap.put(strN, new amji(strO, i, strM != null ? Locale.forLanguageTag(strM) : null));
        }
        ((anaq) anckVar).f = ekfv.e(linkedHashMap);
    }

    @Override // defpackage.ancm
    public final anbf e() {
        return this.a;
    }

    @Override // defpackage.ancm
    public final brdr a(brdr brdrVar) {
        return brdrVar;
    }
}

package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.startchat.chip.ChipData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctsb extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ctsy c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctsb(fcxy fcxyVar, ctsy ctsyVar) {
        super(3, fcxyVar);
        this.c = ctsyVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ctsb ctsbVar = new ctsb((fcxy) obj3, this.c);
        ctsbVar.d = (fdpm) obj;
        ctsbVar.b = (Object[]) obj2;
        return ctsbVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object[] objArr;
        boolean z;
        dkrk dkrkVar;
        fcti fctiVar;
        ardj ardjVar;
        dkrk dkrkVar2;
        boolean z2;
        String string;
        ctsw ctswVar;
        ctsx ctsxVar;
        dkpf dkpfVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r2 = this.d;
            Object[] objArr2 = (Object[]) this.b;
            Object obj2 = objArr2[1];
            obj2.getClass();
            String str = (String) obj2;
            Object obj3 = objArr2[4];
            obj3.getClass();
            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
            ctrn ctrnVar = (ctrn) objArr2[5];
            Object obj4 = objArr2[6];
            obj4.getClass();
            boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
            cudx cudxVar = (cudx) objArr2[7];
            Uri uri = (Uri) objArr2[8];
            ctsy ctsyVar = this.c;
            ardj ardjVar2 = ctsyVar.r;
            if (!ardjVar2.a() || cudxVar == null) {
                objArr = objArr2;
                z = zBooleanValue2;
                dkrkVar = null;
                fctiVar = new fcti(null, new Integer(0));
            } else {
                if (uri != null) {
                    fctiVar = new fcti(new dkpf(uri, true, null, 0, null, 28), 0);
                    objArr = objArr2;
                    z = zBooleanValue2;
                } else {
                    if (!ctsyVar.d.b) {
                        List list = cudxVar.a;
                        if (!list.isEmpty()) {
                            uds udsVar = (uds) ctsyVar.m.b();
                            List listAm = fcva.am(list, 4);
                            ArrayList arrayList = new ArrayList(fcva.p(listAm, 10));
                            Iterator it = listAm.iterator();
                            while (it.hasNext()) {
                                ChipData chipData = (ChipData) it.next();
                                Object[] objArr3 = objArr2;
                                Iterator it2 = it;
                                arrayList.add(((cpbn) udsVar.c.b()).e(chipData.d, chipData.c == null ? null : chipData.b, chipData.a, null));
                                objArr2 = objArr3;
                                it = it2;
                                zBooleanValue2 = zBooleanValue2;
                            }
                            objArr = objArr2;
                            z = zBooleanValue2;
                            List listAo = fcva.ao(arrayList);
                            if (listAo.isEmpty()) {
                                dkpfVar = null;
                            } else {
                                Uri uriP = cpbr.p(udsVar.a, listAo);
                                uriP.getClass();
                                dkpfVar = new dkpf(uriP, null, null, 1, null, 22);
                            }
                            fctiVar = new fcti(dkpfVar, Integer.valueOf(fddu.f(list.size() - 4, 0)));
                        }
                    }
                    objArr = objArr2;
                    z = zBooleanValue2;
                    dkrkVar = null;
                    fctiVar = new fcti(null, 0);
                }
                dkrkVar = null;
            }
            dkpi dkpiVar = (dkpi) fctiVar.a;
            int iIntValue = ((Number) fctiVar.b).intValue();
            Context context = ctsyVar.c;
            ctro ctroVar = ctsyVar.d;
            boolean z3 = ctroVar.b;
            String string2 = context.getString(z3 ? R.string.edit_group_info_title : z ? R.string.create_group_info_with_icon_title : R.string.create_group_info_title);
            string2.getClass();
            boolean z4 = false;
            dkrj dkrjVar = (dkrj) objArr[0];
            if (dkpiVar != null) {
                ardjVar = ardjVar2;
                dkrkVar2 = new dkrk(dkpiVar, null, 0, 2, 0.0f, null, 54);
            } else {
                ardjVar = ardjVar2;
                dkrkVar2 = dkrkVar;
            }
            String string3 = context.getString(z3 ? R.string.group_name_text_field_title : R.string.group_name_text_field_title_with_optional);
            string3.getClass();
            asgz asgzVar = ctsyVar.p;
            if (!asgzVar.a() || z3) {
                z2 = z3;
                string = ctroVar.a;
            } else {
                z2 = z3;
                string = context.getString(R.string.group_name_text_field_title_with_optional);
                string.getClass();
            }
            String str2 = string;
            String string4 = context.getString(z2 ? R.string.group_rename_mirror_extended_fab_text : R.string.group_name_mirror_extended_fab_text);
            string4.getClass();
            if (!zBooleanValue && (!z2 || (!fdbq.f(ctroVar.a, str) && str.length() != 0 && ctrnVar == null))) {
                z4 = true;
            }
            Object obj5 = objArr[2];
            obj5.getClass();
            String str3 = (String) obj5;
            Object obj6 = objArr[3];
            obj6.getClass();
            boolean zBooleanValue3 = ((Boolean) obj6).booleanValue();
            boolean z5 = z2;
            boolean zE = ctsyVar.e();
            ctsv ctsvVar = new ctsv(ctsyVar);
            fdae ctruVar = z5 ? new ctru(ctsyVar) : ((ctjm) ctsyVar.k.b()).a(ctsyVar);
            ctsw ctswVar2 = new ctsw(ctsyVar);
            if (z) {
                ctswVar = ctswVar2;
                ctsxVar = new ctsx(ctsyVar);
            } else {
                ctswVar = ctswVar2;
                ctsxVar = null;
            }
            ctte ctteVar = new ctte(string2, dkrjVar, dkrkVar2, iIntValue, ctrnVar, string3, str, str2, string4, z4, str3, zBooleanValue3, zE, zBooleanValue, ctsvVar, ctruVar, ctswVar, ctsxVar, new cttd(asgzVar.a(), ardjVar.a()));
            this.a = 1;
            if (r2.fO(ctteVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}

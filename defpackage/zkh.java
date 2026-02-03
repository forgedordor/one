package defpackage;

import android.content.res.Resources;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zkh implements fdae {
    final /* synthetic */ auyl[] a;
    final /* synthetic */ ajlt b;
    final /* synthetic */ dkgv c;
    final /* synthetic */ zkl d;
    final /* synthetic */ zjx e;
    final /* synthetic */ boolean f;

    public zkh(auyl[] auylVarArr, ajlt ajltVar, dkgv dkgvVar, zkl zklVar, zjx zjxVar, boolean z) {
        this.a = auylVarArr;
        this.b = ajltVar;
        this.c = dkgvVar;
        this.d = zklVar;
        this.e = zjxVar;
        this.f = z;
    }

    @Override // defpackage.fdae
    public final zjs invoke() throws Resources.NotFoundException {
        Iterator it;
        dirx dirxVarA;
        auyl[] auylVarArr = this.a;
        int length = auylVarArr.length;
        ArrayList arrayList = new ArrayList(length);
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            auyl auylVar = auylVarArr[i2];
            arrayList.add(auylVar != null ? auylVar.b() : null);
        }
        dkgq[] dkgqVarArr = (dkgq[]) arrayList.toArray(new dkgq[0]);
        ajlt ajltVar = this.b;
        MessageId messageIdB = ajltVar.b();
        List listK = fcur.K(dkgqVarArr);
        ArrayList arrayList2 = new ArrayList(fcva.p(listK, 10));
        Iterator it2 = listK.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            int i3 = i + 1;
            if (i < 0) {
                fcva.m();
            }
            dkgq dkgqVar = (dkgq) next;
            String strA = messageIdB.a();
            strA.getClass();
            dkgv dkgvVar = this.c;
            zkl zklVar = this.d;
            zjx zjxVar = this.e;
            List list = listK;
            dkkh dkkhVarA = zjy.a(zjxVar.a, i, listK.size());
            if (i == list.size() - 1) {
                it = it2;
                dirxVarA = yql.a(zklVar.c, ajltVar, null, null, 30);
            } else {
                it = it2;
                dirxVarA = null;
            }
            arrayList2.add(new yki(new dkkr(strA, fcva.b(ajltVar.w() ? djrr.cj : djrr.ck), new dkkp(zklVar.e.a(), zklVar.f.a(), zklVar.g.a(), 3), new dkgu(dkgvVar, dkkhVarA, dirxVarA, 1913), 29360124), dkgqVar, ajltVar, this.f, zjxVar.f));
            i = i3;
            listK = list;
            it2 = it;
        }
        return new zjs(arrayList2, messageIdB, ykm.a(ajltVar));
    }
}

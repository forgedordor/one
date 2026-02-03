package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zkj extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ auyl[] c;
    final /* synthetic */ ajlt d;
    final /* synthetic */ dkgv e;
    final /* synthetic */ zkl f;
    final /* synthetic */ zjx g;
    final /* synthetic */ boolean h;
    private /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zkj(fcxy fcxyVar, auyl[] auylVarArr, ajlt ajltVar, dkgv dkgvVar, zkl zklVar, zjx zjxVar, boolean z) {
        super(3, fcxyVar);
        this.c = auylVarArr;
        this.d = ajltVar;
        this.e = dkgvVar;
        this.f = zklVar;
        this.g = zjxVar;
        this.h = z;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        zkj zkjVar = new zkj((fcxy) obj3, this.c, this.d, this.e, this.f, this.g, this.h);
        zkjVar.i = (fdpm) obj;
        zkjVar.b = (Object[]) obj2;
        return zkjVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        int i;
        dirx dirxVarA;
        Object obj2;
        fcyl fcylVar = fcyl.a;
        int i2 = this.a;
        fctl.b(obj);
        if (i2 == 0) {
            ?? r2 = this.i;
            Object obj3 = this.b;
            auyl[] auylVarArr = this.c;
            ArrayList arrayList = new ArrayList(auylVarArr.length);
            int i3 = 0;
            int i4 = 0;
            for (auyl auylVar : auylVarArr) {
                if (auylVar != null) {
                    obj2 = ((Object[]) obj3)[i4];
                    i4++;
                } else {
                    obj2 = null;
                }
                arrayList.add(obj2);
            }
            dkgq[] dkgqVarArr = (dkgq[]) arrayList.toArray(new dkgq[0]);
            ajlt ajltVar = this.d;
            MessageId messageIdB = ajltVar.b();
            List listK = fcur.K(dkgqVarArr);
            ArrayList arrayList2 = new ArrayList(fcva.p(listK, 10));
            Iterator it = listK.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                int i5 = i3 + 1;
                if (i3 < 0) {
                    fcva.m();
                }
                dkgq dkgqVar = (dkgq) next;
                String strA = messageIdB.a();
                strA.getClass();
                dkgv dkgvVar = this.e;
                zkl zklVar = this.f;
                zjx zjxVar = this.g;
                List list = listK;
                Iterator it2 = it;
                dkkh dkkhVarA = zjy.a(zjxVar.a, i3, list.size());
                if (i3 == list.size() - 1) {
                    i = i5;
                    dirxVarA = yql.a(zklVar.c, ajltVar, null, null, 30);
                } else {
                    i = i5;
                    dirxVarA = null;
                }
                arrayList2.add(new yki(new dkkr(strA, fcva.b(ajltVar.w() ? djrr.cj : djrr.ck), new dkkp(zklVar.e.a(), zklVar.f.a(), zklVar.g.a(), 3), new dkgu(dkgvVar, dkkhVarA, dirxVarA, 1913), 29360124), dkgqVar, ajltVar, this.h, zjxVar.f));
                listK = list;
                it = it2;
                i3 = i;
            }
            zjs zjsVar = new zjs(arrayList2, messageIdB, ykm.a(ajltVar));
            this.a = 1;
            if (r2.fO(zjsVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}

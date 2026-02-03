package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zka extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ fdci c;
    final /* synthetic */ ajlt d;
    final /* synthetic */ dkgv e;
    final /* synthetic */ zkl f;
    final /* synthetic */ zjx g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zka(fcxy fcxyVar, fdci fdciVar, ajlt ajltVar, dkgv dkgvVar, zkl zklVar, zjx zjxVar) {
        super(3, fcxyVar);
        this.c = fdciVar;
        this.d = ajltVar;
        this.e = dkgvVar;
        this.f = zklVar;
        this.g = zjxVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        zka zkaVar = new zka((fcxy) obj3, this.c, this.d, this.e, this.f, this.g);
        zkaVar.h = (fdpm) obj;
        zkaVar.b = obj2;
        return zkaVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fdpl auxqVar;
        boolean z;
        dirx dirxVarA;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r2 = this.h;
            boolean zBooleanValue = ((Boolean) this.b).booleanValue();
            Object[] objArr = (Object[]) this.c.a;
            auyl[] auylVarArr = (auyl[]) Arrays.copyOf(objArr, objArr.length);
            int length = auylVarArr.length;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    auxqVar = new auxq(new zkh(auylVarArr, this.d, this.e, this.f, this.g, zBooleanValue));
                    break;
                }
                auyl auylVar = auylVarArr[i3];
                if (auylVar == null || (auylVar instanceof auxq)) {
                    i3++;
                } else {
                    auyl[] auylVarArr2 = (auyl[]) fcur.K(auylVarArr).toArray(new auyl[0]);
                    fdpl[] fdplVarArr = (fdpl[]) Arrays.copyOf(auylVarArr2, auylVarArr2.length);
                    ajlt ajltVar = this.d;
                    dkgv dkgvVar = this.e;
                    zkl zklVar = this.f;
                    zjx zjxVar = this.g;
                    zkk zkkVar = new zkk(fdplVarArr, auylVarArr, ajltVar, dkgvVar, zklVar, zjxVar, zBooleanValue);
                    dkgv dkgvVar2 = dkgvVar;
                    boolean z2 = zBooleanValue;
                    int length2 = auylVarArr.length;
                    ArrayList arrayList = new ArrayList(length2);
                    for (int i4 = 0; i4 < length2; i4++) {
                        auyl auylVar2 = auylVarArr[i4];
                        arrayList.add(auylVar2 != null ? auylVar2.b() : null);
                    }
                    dkgq[] dkgqVarArr = (dkgq[]) arrayList.toArray(new dkgq[0]);
                    MessageId messageIdB = ajltVar.b();
                    List listK = fcur.K(dkgqVarArr);
                    ArrayList arrayList2 = new ArrayList(fcva.p(listK, 10));
                    for (Object obj2 : listK) {
                        int i5 = i2 + 1;
                        if (i2 < 0) {
                            fcva.m();
                        }
                        dkgq dkgqVar = (dkgq) obj2;
                        List list = listK;
                        String strA = messageIdB.a();
                        strA.getClass();
                        MessageId messageId = messageIdB;
                        dkkh dkkhVarA = zjy.a(zjxVar.a, i2, list.size());
                        if (i2 == list.size() - 1) {
                            z = z2;
                            dirxVarA = yql.a(zklVar.c, ajltVar, null, null, 30);
                        } else {
                            z = z2;
                            dirxVarA = null;
                        }
                        dkgu dkguVar = new dkgu(dkgvVar2, dkkhVarA, dirxVarA, 1913);
                        ArrayList arrayList3 = arrayList2;
                        boolean z3 = z;
                        arrayList3.add(new yki(new dkkr(strA, fcva.b(ajltVar.w() ? djrr.cj : djrr.ck), new dkkp(zklVar.e.a(), zklVar.f.a(), zklVar.g.a(), 3), dkguVar, 29360124), dkgqVar, ajltVar, z3, zjxVar.f));
                        messageIdB = messageId;
                        listK = list;
                        arrayList2 = arrayList3;
                        i2 = i5;
                        dkgvVar2 = dkgvVar2;
                        z2 = z3;
                    }
                    auxqVar = auyp.b(zkkVar, new zjs(arrayList2, messageIdB, ykm.a(ajltVar)));
                }
            }
            this.a = 1;
            if (fdpy.c(r2, auxqVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}

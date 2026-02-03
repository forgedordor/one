package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctni extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ctnn c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctni(fcxy fcxyVar, ctnn ctnnVar) {
        super(3, fcxyVar);
        this.c = ctnnVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ctni ctniVar = new ctni((fcxy) obj3, this.c);
        ctniVar.d = (fdpm) obj;
        ctniVar.b = (Object[]) obj2;
        return ctniVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r15v2, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r15 = this.d;
            Object[] objArr = (Object[]) this.b;
            Object obj2 = objArr[0];
            obj2.getClass();
            ekgb<ajov> ekgbVarG = (ekgb) obj2;
            Object obj3 = objArr[1];
            obj3.getClass();
            int size = 2;
            Object obj4 = objArr[2];
            obj4.getClass();
            ctot ctotVar = (ctot) obj4;
            ctoe ctoeVar = (ctoe) objArr[3];
            Object obj5 = objArr[4];
            obj5.getClass();
            List list = (List) obj5;
            Object obj6 = objArr[5];
            obj6.getClass();
            ctqg ctqgVar = (ctqg) objArr[6];
            boolean zIsEmpty = ((ctrh) obj3).a.b.isEmpty();
            boolean z = ((cudx) obj6).d == cueh.a && ctqgVar == null;
            boolean z2 = ctotVar.a;
            boolean zIsEmpty2 = list.isEmpty();
            ekfw ekfwVar = new ekfw();
            ekfwVar.h(new ajov("", 0, 1));
            if (z) {
                ekfwVar.h(new ajov("", 1, 1));
            } else {
                size = 1;
            }
            if (z2) {
                ekfwVar.h(new ajov("", size, 1));
                size++;
            }
            if (!zIsEmpty) {
                ekfwVar.h(new ajov("★", size, 1));
                size++;
            }
            if (!zIsEmpty2) {
                ekfwVar.h(new ajov("", size, list.size()));
                size += list.size();
            }
            if (ctoeVar != null) {
                ekfwVar.h(new ajov("", size, 1));
            }
            ekgb ekgbVarG2 = ekfwVar.g();
            ekgbVarG2.getClass();
            if (!ekgbVarG2.isEmpty()) {
                int i2 = ((ekoe) ekgbVarG2).c;
                ekfw ekfwVar2 = new ekfw();
                ekfwVar2.j(ekgbVarG2);
                for (ajov ajovVar : ekgbVarG) {
                    ekfwVar2.h(new ajov(ajovVar.a, ajovVar.b + i2, ajovVar.c));
                }
                ekgbVarG = ekfwVar2.g();
                ekgbVarG.getClass();
            }
            ctno ctnoVar = new ctno(ekgbVarG);
            this.a = 1;
            if (r15.fO(ctnoVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}

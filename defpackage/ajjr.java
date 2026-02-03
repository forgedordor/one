package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ajjr extends fcyz implements fdat {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    Object f;
    int g;
    final /* synthetic */ ajjs h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajjr(ajjs ajjsVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.h = ajjsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajjr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        ajjs ajjsVar;
        Object emlnVar;
        emkj emkjVar;
        emkj emkjVar2;
        Object obj2;
        Object obj3;
        Object obj4;
        emkj emkjVar3;
        emln emlnVar2;
        emkj emkjVar4;
        fcyl fcylVar = fcyl.a;
        int i = this.g;
        if (i == 0) {
            fctl.b(obj);
            ajjsVar = this.h;
            elud eludVar = (elud) eluz.a.createBuilder();
            eludVar.getClass();
            emkj emkjVar5 = new emkj(eludVar);
            elzt elztVar = (elzt) elzv.a.createBuilder();
            elztVar.getClass();
            emlnVar = new emln(elztVar);
            eiju eijuVarA = ((cdku) ajjsVar.a.b()).a();
            this.a = ajjsVar;
            this.b = emkjVar5;
            this.c = emlnVar;
            this.d = emlnVar;
            this.e = emkjVar5;
            this.f = emlnVar;
            this.g = 1;
            obj = fdxs.c(eijuVarA, this);
            if (obj != fcylVar) {
                emkjVar = emkjVar5;
                emkjVar2 = emkjVar;
                obj2 = emlnVar;
                obj3 = obj2;
            }
            return fcylVar;
        }
        if (i != 1) {
            obj4 = this.d;
            emkjVar3 = (emkj) this.c;
            emln emlnVar3 = (emln) this.b;
            emkjVar4 = (emkj) this.a;
            fctl.b(obj);
            emlnVar2 = emlnVar3;
            obj.getClass();
            long jLongValue = ((Number) obj).longValue();
            elzt elztVar2 = ((emln) obj4).a;
            elztVar2.copyOnWrite();
            elzv elzvVar = (elzv) elztVar2.instance;
            elzv elzvVar2 = elzv.a;
            elzvVar.b |= 2;
            elzvVar.d = jLongValue;
            evsn evsnVarBuild = emlnVar2.a.build();
            evsnVarBuild.getClass();
            elud eludVar2 = emkjVar3.a;
            eludVar2.copyOnWrite();
            eluz eluzVar = (eluz) eludVar2.instance;
            eluz eluzVar2 = eluz.a;
            eluzVar.am = (elzv) evsnVarBuild;
            eluzVar.d |= 8;
            evsn evsnVarBuild2 = emkjVar4.a.build();
            evsnVarBuild2.getClass();
            return ((eluz) evsnVarBuild2).toBuilder();
        }
        obj2 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        obj3 = (emln) this.c;
        emkjVar2 = (emkj) this.b;
        ajjsVar = (ajjs) this.a;
        fctl.b(obj);
        emkjVar = obj5;
        emlnVar = obj6;
        int i2 = true != ((Boolean) obj).booleanValue() ? 2 : 3;
        elzt elztVar3 = ((emln) obj2).a;
        elztVar3.copyOnWrite();
        elzv elzvVar3 = (elzv) elztVar3.instance;
        elzv elzvVar4 = elzv.a;
        elzvVar3.c = i2 - 1;
        elzvVar3.b |= 1;
        eiju eijuVarB = ((cdku) ajjsVar.a.b()).b();
        this.a = emkjVar2;
        this.b = obj3;
        this.c = emkjVar;
        this.d = emlnVar;
        this.e = null;
        this.f = null;
        this.g = 2;
        obj = fdxs.c(eijuVarB, this);
        if (obj != fcylVar) {
            obj4 = emlnVar;
            emkjVar3 = emkjVar;
            emlnVar2 = obj3;
            emkjVar4 = emkjVar2;
            obj.getClass();
            long jLongValue2 = ((Number) obj).longValue();
            elzt elztVar22 = ((emln) obj4).a;
            elztVar22.copyOnWrite();
            elzv elzvVar5 = (elzv) elztVar22.instance;
            elzv elzvVar22 = elzv.a;
            elzvVar5.b |= 2;
            elzvVar5.d = jLongValue2;
            evsn evsnVarBuild3 = emlnVar2.a.build();
            evsnVarBuild3.getClass();
            elud eludVar22 = emkjVar3.a;
            eludVar22.copyOnWrite();
            eluz eluzVar3 = (eluz) eludVar22.instance;
            eluz eluzVar22 = eluz.a;
            eluzVar3.am = (elzv) evsnVarBuild3;
            eluzVar3.d |= 8;
            evsn evsnVarBuild22 = emkjVar4.a.build();
            evsnVarBuild22.getClass();
            return ((eluz) evsnVarBuild22).toBuilder();
        }
        return fcylVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ajjr(this.h, fcxyVar);
    }
}

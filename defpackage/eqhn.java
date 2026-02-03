package defpackage;

import j$.time.Instant;
import j$.util.DesugarCollections;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eqhn extends fcyz implements fdap {
    int a;
    final /* synthetic */ eqhr b;
    final /* synthetic */ String c;
    final /* synthetic */ eqeq d;
    final /* synthetic */ eqdb e;
    final /* synthetic */ eqgs f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqhn(eqhr eqhrVar, String str, eqeq eqeqVar, eqdb eqdbVar, eqgs eqgsVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = eqhrVar;
        this.c = str;
        this.d = eqeqVar;
        this.e = eqdbVar;
        this.f = eqgsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        ezjh ezjhVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            if (i == 1) {
            }
            Instant instantB = eonw.b(((ezjn) obj).c);
            instantB.getClass();
            return new eqfx(instantB);
        }
        eqhr eqhrVar = this.b;
        String str = this.c;
        eqeq eqeqVar = this.d;
        this.a = 1;
        obj = eqhrVar.l(str, eqeqVar.g, this);
        if (obj == fcylVar) {
            return fcylVar;
        }
        eqhr eqhrVar2 = this.b;
        eqdb eqdbVar = this.e;
        eqeq eqeqVar2 = this.d;
        ezpp ezppVar = (ezpp) obj;
        ezjk ezjkVar = (ezjk) ezjl.a.createBuilder();
        ezjkVar.getClass();
        ezjkVar.copyOnWrite();
        ezjl ezjlVar = (ezjl) ezjkVar.instance;
        ezjlVar.c = eqeqVar2.c;
        ezjlVar.b |= 1;
        ezppVar.getClass();
        ezjkVar.copyOnWrite();
        ezjl ezjlVar2 = (ezjl) ezjkVar.instance;
        ezjlVar2.f = ezppVar;
        ezjlVar2.b |= 4;
        ezjg ezjgVar = (ezjg) ezjj.a.createBuilder();
        ezjgVar.getClass();
        ezjgVar.copyOnWrite();
        ((ezjj) ezjgVar.instance).c = eqeqVar2.a;
        ezjgVar.copyOnWrite();
        ezjj ezjjVar = (ezjj) ezjgVar.instance;
        ezjjVar.g = eqeqVar2.b;
        ezjjVar.b |= 1;
        ezji ezjiVar = ezji.TACHYGRAM_MESSAGE;
        ezjiVar.getClass();
        ezjgVar.copyOnWrite();
        ((ezjj) ezjgVar.instance).d = ezjiVar.a();
        ezud ezudVar = (ezud) ezui.a.createBuilder();
        ezudVar.getClass();
        DesugarCollections.unmodifiableList(((ezui) ezudVar.instance).b).getClass();
        ezug ezugVar = (ezug) ezuh.a.createBuilder();
        ezugVar.getClass();
        String string = eqdbVar.a().toString();
        ezugVar.copyOnWrite();
        ((ezuh) ezugVar.instance).b = string;
        evqs evqsVarB = eqdbVar.b();
        ezugVar.copyOnWrite();
        ((ezuh) ezugVar.instance).c = evqsVarB;
        evsn evsnVarBuild = ezugVar.build();
        evsnVarBuild.getClass();
        ezuh ezuhVar = (ezuh) evsnVarBuild;
        ezudVar.copyOnWrite();
        ezui ezuiVar = (ezui) ezudVar.instance;
        evtg evtgVar = ezuiVar.b;
        if (!evtgVar.c()) {
            ezuiVar.b = evsn.mutableCopy(evtgVar);
        }
        ezuiVar.b.add(ezuhVar);
        DesugarCollections.unmodifiableList(((ezui) ezudVar.instance).c).getClass();
        ekgb ekgbVar = eqeqVar2.e;
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVar, 10));
        ekqh it = ekgbVar.iterator();
        while (it.hasNext()) {
            eqem eqemVar = (eqem) it.next();
            eqemVar.getClass();
            ezue ezueVar = (ezue) ezuf.a.createBuilder();
            ezueVar.getClass();
            ezueVar.copyOnWrite();
            ((ezuf) ezueVar.instance).b = eqemVar.a;
            ezueVar.copyOnWrite();
            ((ezuf) ezueVar.instance).c = eqemVar.b;
            ezueVar.copyOnWrite();
            ((ezuf) ezueVar.instance).d = eqemVar.c;
            evsn evsnVarBuild2 = ezueVar.build();
            evsnVarBuild2.getClass();
            arrayList.add((ezuf) evsnVarBuild2);
        }
        ezudVar.copyOnWrite();
        ezui ezuiVar2 = (ezui) ezudVar.instance;
        evtg evtgVar2 = ezuiVar2.c;
        if (!evtgVar2.c()) {
            ezuiVar2.c = evsn.mutableCopy(evtgVar2);
        }
        evpz.addAll(arrayList, ezuiVar2.c);
        evsn evsnVarBuild3 = ezudVar.build();
        evsnVarBuild3.getClass();
        evqs byteString = ((ezui) evsnVarBuild3).toByteString();
        ezjgVar.copyOnWrite();
        ((ezjj) ezjgVar.instance).e = byteString;
        eqep eqepVar = eqeqVar2.d;
        int iOrdinal = eqepVar.ordinal();
        int i2 = 3;
        if (iOrdinal == 1) {
            ezjhVar = ezjh.USER;
        } else if (iOrdinal == 2) {
            ezjhVar = ezjh.NOTIFY;
        } else {
            if (iOrdinal != 3) {
                throw new IllegalArgumentException("unknown enum value: ".concat(eqepVar.toString()));
            }
            ezjhVar = ezjh.EPHEMERAL;
        }
        ezjhVar.getClass();
        ezjgVar.copyOnWrite();
        ((ezjj) ezjgVar.instance).k = ezjhVar.a();
        ezjw ezjwVar = (ezjw) ezjx.a.createBuilder();
        ezjwVar.getClass();
        int i3 = eqeqVar2.h - 1;
        if (i3 == 0) {
            i2 = 2;
        } else if (i3 != 1) {
            i2 = 4;
        }
        ezjwVar.copyOnWrite();
        ((ezjx) ezjwVar.instance).b = i2 - 2;
        evsn evsnVarBuild4 = ezjwVar.build();
        evsnVarBuild4.getClass();
        ezjgVar.copyOnWrite();
        ezjj ezjjVar2 = (ezjj) ezjgVar.instance;
        ezjjVar2.l = (ezjx) evsnVarBuild4;
        ezjjVar2.b |= 8;
        ezol ezolVar = eqeqVar2.f;
        if (ezolVar != null) {
            ezjgVar.copyOnWrite();
            ezjj ezjjVar3 = (ezjj) ezjgVar.instance;
            ezjjVar3.j = ezolVar;
            ezjjVar3.b |= 4;
        }
        evsn evsnVarBuild5 = ezjgVar.build();
        evsnVarBuild5.getClass();
        ezjkVar.copyOnWrite();
        ezjl ezjlVar3 = (ezjl) ezjkVar.instance;
        ezjlVar3.e = (ezjj) evsnVarBuild5;
        ezjlVar3.b |= 2;
        evsn evsnVarBuild6 = ezjkVar.build();
        evsnVarBuild6.getClass();
        eqhrVar2.a.a(eqgs.d(this.f, 10));
        eqfy eqfyVar = eqhrVar2.c;
        this.a = 2;
        obj = eqfyVar.a.b().f((ezjl) evsnVarBuild6, new fbrg(), this);
        if (obj == fcylVar) {
            return fcylVar;
        }
        Instant instantB2 = eonw.b(((ezjn) obj).c);
        instantB2.getClass();
        return new eqfx(instantB2);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new eqhn(this.b, this.c, this.d, this.e, this.f, (fcxy) obj).b(fctx.a);
    }
}

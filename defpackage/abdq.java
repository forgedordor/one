package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abdq implements abdl {
    private static final cqce e = cqce.g("DittoClearcutLogger", "SatelliteClearcutLogger");
    public final fcsu a;
    public final Object b = new Object();
    public final AtomicBoolean c = new AtomicBoolean(true);
    public String d = "";
    private final fcsu f;
    private final eosc g;
    private final bvir h;
    private final Optional i;
    private final eosc j;

    public abdq(bvir bvirVar, Optional optional, fcsu fcsuVar, fcsu fcsuVar2, eosc eoscVar, eosc eoscVar2) {
        this.a = fcsuVar;
        this.f = fcsuVar2;
        this.g = eoscVar;
        this.h = bvirVar;
        this.i = optional;
        this.j = eoscVar2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ewyz p(int r5) {
        /*
            ewzc r0 = defpackage.ewzc.a
            evsf r0 = r0.createBuilder()
            ewyz r0 = (defpackage.ewyz) r0
            r0.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r1 = r0.instance
            ewzc r1 = (defpackage.ewzc) r1
            int r5 = defpackage.ewzb.a(r5)
            r1.e = r5
            r0.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r5 = r0.instance
            ewzc r5 = (defpackage.ewzc) r5
            r1 = 9
            int r1 = defpackage.ewza.a(r1)
            r5.g = r1
            cczi r5 = defpackage.abmt.a
            java.lang.Object r5 = r5.e()
            java.lang.String r5 = (java.lang.String) r5
            int r1 = r5.hashCode()
            r2 = 1
            r3 = 3
            r4 = 2
            switch(r1) {
                case -1897523141: goto L55;
                case -318354310: goto L4b;
                case 3449687: goto L41;
                case 1439571273: goto L37;
                default: goto L36;
            }
        L36:
            goto L5f
        L37:
            java.lang.String r1 = "autopush"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L5f
            r5 = r3
            goto L60
        L41:
            java.lang.String r1 = "prod"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L5f
            r5 = 0
            goto L60
        L4b:
            java.lang.String r1 = "preprod"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L5f
            r5 = r2
            goto L60
        L55:
            java.lang.String r1 = "staging"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L5f
            r5 = r4
            goto L60
        L5f:
            r5 = -1
        L60:
            if (r5 == 0) goto L6f
            if (r5 == r2) goto L6e
            if (r5 == r4) goto L6c
            if (r5 == r3) goto L6a
            r3 = r4
            goto L6f
        L6a:
            r3 = 6
            goto L6f
        L6c:
            r3 = 5
            goto L6f
        L6e:
            r3 = 4
        L6f:
            r0.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r5 = r0.instance
            ewzc r5 = (defpackage.ewzc) r5
            int r3 = r3 + (-2)
            r5.f = r3
            int r5 = defpackage.abmt.f()
            r0.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r1 = r0.instance
            ewzc r1 = (defpackage.ewzc) r1
            r1.h = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abdq.p(int):ewyz");
    }

    private final eiju q() {
        if (this.i.isPresent() && this.c.get()) {
            return ((abfv) this.i.get()).f().h(new ejvr() { // from class: abdo
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    abdq abdqVar = this.a;
                    String str = (String) obj;
                    abdqVar.c.set(false);
                    synchronized (abdqVar.b) {
                        abdqVar.d = str;
                        if (abdqVar.d.equals("empty_source_id")) {
                            return "";
                        }
                        return abdqVar.d;
                    }
                }
            }, this.g);
        }
        synchronized (this.b) {
            if (this.d.equals("empty_source_id")) {
                return eijx.e("");
            }
            return eijx.e(this.d);
        }
    }

    private final void r(final String str, final int i, final int i2, final int i3) {
        eiju eijuVarQ = q();
        ejvr ejvrVar = new ejvr() { // from class: abdn
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                int i4;
                int i5 = i - 1;
                String str2 = (String) obj;
                ewyz ewyzVarP = abdq.p(2);
                switch (i5) {
                    case 6:
                        i4 = 8;
                        break;
                    case 7:
                        i4 = 9;
                        break;
                    case 8:
                        i4 = 10;
                        break;
                    case 9:
                        i4 = 11;
                        break;
                    case 10:
                        i4 = 12;
                        break;
                    case 11:
                        i4 = 13;
                        break;
                    default:
                        i4 = 14;
                        break;
                }
                String str3 = str;
                ewyp ewypVar = (ewyp) ewys.a.createBuilder();
                ewypVar.copyOnWrite();
                ((ewys) ewypVar.instance).c = 1;
                ewypVar.copyOnWrite();
                ((ewys) ewypVar.instance).d = ewyq.a(i4);
                if (!TextUtils.isEmpty(str3)) {
                    ewypVar.copyOnWrite();
                    ((ewys) ewypVar.instance).h = str3;
                }
                if (!TextUtils.isEmpty(str2)) {
                    ewypVar.copyOnWrite();
                    ewys ewysVar = (ewys) ewypVar.instance;
                    str2.getClass();
                    ewysVar.f = str2;
                }
                int i6 = i2;
                if (i6 != -1) {
                    ewypVar.copyOnWrite();
                    ((ewys) ewypVar.instance).j = i6;
                }
                int i7 = i3;
                if (i7 != -1) {
                    ewypVar.copyOnWrite();
                    ((ewys) ewypVar.instance).k = i7;
                }
                abdq abdqVar = this.a;
                ewyzVarP.copyOnWrite();
                ewzc ewzcVar = (ewzc) ewyzVarP.instance;
                ewys ewysVar2 = (ewys) ewypVar.build();
                ewzc ewzcVar2 = ewzc.a;
                ewysVar2.getClass();
                ewzcVar.d = ewysVar2;
                ewzcVar.c = 3;
                abdqVar.o(ewyzVarP, bvir.b(str2));
                return true;
            }
        };
        eosc eoscVar = this.g;
        eijuVarQ.h(ejvrVar, eoscVar).k(auvh.b(), eoscVar);
    }

    @Override // defpackage.abdl
    public final void a(String str) {
        r(str, 10, -1, -1);
    }

    @Override // defpackage.abdl
    public final void b(String str, int i, int i2) {
        r(str, 7, i, i2);
    }

    @Override // defpackage.abdl
    public final void c(String str) {
        r(str, 13, -1, -1);
    }

    @Override // defpackage.abdl
    public final void d(String str, int i) {
        n(str, 4, i, exmt.OK, 2);
    }

    @Override // defpackage.abdl
    public final void e(String str, int i, exmt exmtVar) {
        n(str, 9, i, exmtVar, 2);
    }

    @Override // defpackage.abdl
    public final void f(String str, int i) {
        n(str, 7, i, exmt.OK, 2);
    }

    @Override // defpackage.abdl
    public final void g(String str, int i) {
        n(str, 3, i, exmt.OK, 2);
    }

    @Override // defpackage.abdl
    public final void h(String str, int i, exmt exmtVar) {
        n(str, 5, i, exmtVar, 2);
    }

    @Override // defpackage.abdl
    public final void i(String str, int i, exmt exmtVar) {
        n(str, 8, i, exmtVar, 2);
    }

    @Override // defpackage.abdl
    public final void j(String str, int i) {
        n(str, 6, i, exmt.OK, 2);
    }

    @Override // defpackage.abdl
    public final void k(String str) {
        r(str, 11, -1, -1);
    }

    @Override // defpackage.abdl
    public final void l(String str) {
        r(str, 12, -1, -1);
    }

    @Override // defpackage.abdl
    public final void m() {
        this.c.set(true);
    }

    @Override // defpackage.abdl
    public final void n(final String str, final int i, final int i2, final exmt exmtVar, final int i3) {
        if (!this.h.a()) {
            e.p("Clearcut loggings are disabled.");
            return;
        }
        eiju eijuVarQ = q();
        ejvr ejvrVar = new ejvr() { // from class: abdm
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                String str2 = (String) obj;
                ewyz ewyzVarP = abdq.p(11);
                ewzr ewzrVar = (ewzr) ewzs.a.createBuilder();
                ewzrVar.copyOnWrite();
                ((ewzs) ewzrVar.instance).d = i - 2;
                ewzrVar.copyOnWrite();
                ((ewzs) ewzrVar.instance).f = exmtVar.a();
                ewzrVar.copyOnWrite();
                ((ewzs) ewzrVar.instance).g = i3 - 2;
                abdq abdqVar = this.a;
                boolean zE = ((crnp) abdqVar.a.b()).e();
                ewzrVar.copyOnWrite();
                ((ewzs) ewzrVar.instance).h = zE;
                String str3 = str;
                if (!TextUtils.isEmpty(str3)) {
                    ewzrVar.copyOnWrite();
                    ewzs ewzsVar = (ewzs) ewzrVar.instance;
                    str3.getClass();
                    ewzsVar.b = str3;
                }
                if (!TextUtils.isEmpty(str2)) {
                    ewzrVar.copyOnWrite();
                    ewzs ewzsVar2 = (ewzs) ewzrVar.instance;
                    str2.getClass();
                    ewzsVar2.c = str2;
                }
                int i4 = i2;
                ewzrVar.copyOnWrite();
                ((ewzs) ewzrVar.instance).e = i4;
                ewyzVarP.copyOnWrite();
                ewzc ewzcVar = (ewzc) ewyzVarP.instance;
                ewzs ewzsVar3 = (ewzs) ewzrVar.build();
                ewzc ewzcVar2 = ewzc.a;
                ewzsVar3.getClass();
                ewzcVar.d = ewzsVar3;
                ewzcVar.c = 13;
                abdqVar.o(ewyzVarP, bvir.b(str2));
                return true;
            }
        };
        eosc eoscVar = this.g;
        eijuVarQ.h(ejvrVar, eoscVar).k(auvh.b(), eoscVar);
    }

    final void o(ewyz ewyzVar, int i) {
        ewzp ewzpVar = (ewzp) ewzq.a.createBuilder();
        ewzpVar.copyOnWrite();
        ewzq ewzqVar = (ewzq) ewzpVar.instance;
        ewzc ewzcVar = (ewzc) ewyzVar.build();
        ewzcVar.getClass();
        ewzqVar.c = ewzcVar;
        ewzqVar.b |= 1;
        final ewzq ewzqVar2 = (ewzq) ewzpVar.build();
        final dbyl dbylVarC = this.h.c(i);
        if (dbylVarC == null) {
            return;
        }
        auvh.h(((aisn) this.f.b()).a().h(new ejvr() { // from class: abdp
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return null;
                }
                dbyk dbykVarJ = dbylVarC.j(ewzqVar2);
                dbykVarJ.j(-1);
                dbykVarJ.c();
                return null;
            }
        }, this.j));
    }
}

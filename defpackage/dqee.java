package defpackage;

import android.net.Uri;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqee {
    public static final ekrg a = ekrg.c("com/google/android/libraries/compose/voice/recorder/VoiceRecordingManager");
    public static final dqcb b = dqcb.a;
    public final dqdh c;
    public final eony d;
    public final dqdk e;
    public final dpzv f;
    public final dnhq g;
    public final dqbu h;
    public final dnhr i;
    public final feav j;
    public Instant k;
    public fdlr l;
    public final fduf m;
    public final fdvc n;
    public final fduj o;
    private final fdjx p;
    private final fdjx q;
    private final fcyh r;

    public dqee(dqdh dqdhVar, fdjx fdjxVar, fdjx fdjxVar2, fcyh fcyhVar, eony eonyVar, dqdk dqdkVar, dpzv dpzvVar, dnhq dnhqVar, dqbu dqbuVar, Optional optional) {
        fdjxVar.getClass();
        fdjxVar2.getClass();
        fcyhVar.getClass();
        eonyVar.getClass();
        dqdkVar.getClass();
        dpzvVar.getClass();
        dnhqVar.getClass();
        this.c = dqdhVar;
        this.p = fdjxVar;
        this.q = fdjxVar2;
        this.r = fcyhVar;
        this.d = eonyVar;
        this.e = dqdkVar;
        this.f = dpzvVar;
        this.g = dnhqVar;
        this.h = dqbuVar;
        this.i = (dnhr) fdct.b(optional);
        this.j = new feaz();
        dqdm dqdmVar = dqdm.a;
        fduf fdufVarA = fdvf.a(dqdmVar);
        this.m = fdufVarA;
        this.n = fdtg.b(new fdua(fdufVarA, dpzvVar.d, new dqdz(null)), fdjxVar2, fdur.a, dqdmVar);
        this.o = dqdhVar.a.a;
    }

    private final Object m(fdap fdapVar, fcxy fcxyVar) {
        return fdin.a(this.r, new dqed(this, fdapVar, null), fcxyVar);
    }

    public final dojp a(Uri uri) {
        String string = uri.toString();
        string.getClass();
        Instant instantA = this.d.a();
        instantA.getClass();
        dqcb dqcbVar = b;
        Duration durationB = b();
        dqbv dqbvVar = (dqbv) dqbw.a.createBuilder();
        dqbvVar.getClass();
        List list = this.c.a.b;
        dqdk dqdkVar = this.e;
        dqcf dqcfVarA = null;
        if (!dqdkVar.d || list.isEmpty()) {
            list = null;
        }
        if (list != null) {
            ArrayList arrayList = new ArrayList(fcva.p(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((dqcd) it.next()).a));
            }
            dqce dqceVar = (dqce) dqcf.a.createBuilder();
            dqceVar.getClass();
            DesugarCollections.unmodifiableList(((dqcf) dqceVar.instance).b).getClass();
            dqcg.b(arrayList, dqceVar);
            dqcfVarA = dqcg.a(dqceVar);
        }
        if (dqcfVarA != null) {
            dqbx.b(dqcfVarA, dqbvVar);
        }
        return new dojp(((xks) dqdkVar.b).b, string, null, null, 0L, instantA, dqcbVar, durationB, dqbx.a(dqbvVar), 12);
    }

    public final Duration b() {
        Instant instant = this.k;
        instant.getClass();
        Duration durationBetween = Duration.between(instant, this.d.a());
        durationBetween.getClass();
        return durationBetween;
    }

    public final Object c(dqbw dqbwVar, fcxy fcxyVar) {
        Object objM = m(new dqdq(this, dqbwVar, null), fcxyVar);
        return objM == fcyl.a ? objM : fctx.a;
    }

    public final Object d(fcxy fcxyVar) {
        Object objM = m(new dqdr(this, null), fcxyVar);
        return objM == fcyl.a ? objM : fctx.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.Exception r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.dqdt
            if (r0 == 0) goto L13
            r0 = r9
            dqdt r0 = (defpackage.dqdt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dqdt r0 = new dqdt
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r9)
            goto L60
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            defpackage.fctl.b(r9)
            ekrg r9 = defpackage.dqee.a
            ekrw r9 = r9.j()
            ekrd r9 = (defpackage.ekrd) r9
            ekrw r9 = r9.g(r8)
            r2 = 249(0xf9, float:3.49E-43)
            java.lang.String r4 = "VoiceRecordingManager.kt"
            java.lang.String r5 = "com/google/android/libraries/compose/voice/recorder/VoiceRecordingManager"
            java.lang.String r6 = "handleError"
            ekrw r9 = r9.h(r5, r6, r2, r4)
            ekrd r9 = (defpackage.ekrd) r9
            java.lang.String r2 = "Error occurred during recording."
            r9.q(r2)
            dqdk r9 = r7.e
            dqdj r9 = r9.c
            r9.e(r8)
            r0.c = r3
            java.lang.Object r9 = r7.h(r3, r0)
            if (r9 == r1) goto L79
        L60:
            android.net.Uri r9 = (android.net.Uri) r9
            if (r9 == 0) goto L70
            fdjx r8 = r7.p
            dqdu r0 = new dqdu
            r1 = 0
            r0.<init>(r7, r9, r1)
            r9 = 3
            defpackage.fdil.d(r8, r1, r1, r0, r9)
        L70:
            r8 = 2132082983(0x7f150127, float:1.9806095E38)
            r7.k(r8)
            fctx r8 = defpackage.fctx.a
            return r8
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqee.e(java.lang.Exception, fcxy):java.lang.Object");
    }

    public final Object f(fcxy fcxyVar) {
        return m(new dqdy(this, null), fcxyVar);
    }

    public final Object g(fcxy fcxyVar) {
        Object objM = m(new dqea(this, null), fcxyVar);
        return objM == fcyl.a ? objM : fctx.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(boolean r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.dqeb
            if (r0 == 0) goto L13
            r0 = r7
            dqeb r0 = (defpackage.dqeb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dqeb r0 = new dqeb
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L45
            if (r2 == r3) goto L41
            r6 = 2
            if (r2 != r6) goto L39
            defpackage.fctl.b(r7)
            fdjx r6 = r5.p
            dqec r7 = new dqec
            r7.<init>(r5, r4)
            r0 = 3
            fdlr r6 = defpackage.fdil.d(r6, r4, r4, r7, r0)
            r5.l = r6
            return r4
        L39:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L41:
            defpackage.fctl.b(r7)
            goto L75
        L45:
            defpackage.fctl.b(r7)
            dpzv r7 = r5.f
            r7.c()
            dqdk r7 = r5.e
            dqdj r7 = r7.c
            if (r6 == 0) goto L5b
            j$.time.Duration r6 = r5.b()
            r7.d(r6)
            goto L62
        L5b:
            j$.time.Duration r6 = r5.b()
            r7.f(r6)
        L62:
            dqdh r6 = r5.c
            boolean r7 = r6.f()
            if (r3 == r7) goto L6b
            r6 = r4
        L6b:
            if (r6 == 0) goto L79
            r0.c = r3
            java.lang.Object r7 = r6.d(r0)
            if (r7 == r1) goto L78
        L75:
            android.net.Uri r7 = (android.net.Uri) r7
            return r7
        L78:
            return r1
        L79:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqee.h(boolean, fcxy):java.lang.Object");
    }

    public final void i(Uri uri) {
        fdil.d(this.p, null, null, new dqds(this, uri, null), 3);
    }

    public final void j() {
        this.f.c();
        this.k = null;
        this.m.f(dqdm.a);
    }

    public final void k(int i) {
        this.f.c();
        this.m.f(new dqdl(i));
    }
}

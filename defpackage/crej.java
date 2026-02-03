package defpackage;

import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crej {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionTypesFlags");
    private final fcsu b;
    private final Map c;
    private final fctc d;

    public crej(fcsu fcsuVar, fcsu fcsuVar2, Map map) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.b = fcsuVar;
        this.c = map;
        this.d = fctd.a(new fdae() { // from class: creg
            @Override // defpackage.fdae
            public final Object invoke() {
                String str = (String) crbf.m.e();
                str.getClass();
                Set setM = crej.m(str);
                String str2 = (String) crbf.n.e();
                str2.getClass();
                return new creh(setM, crej.m(str2));
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Set m(java.lang.String r9) {
        /*
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.List r9 = defpackage.cssr.c(r9)
            java.util.Iterator r9 = r9.iterator()
        Ld:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto Lc4
            java.lang.Object r1 = r9.next()
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            int r2 = r1.length()
            if (r2 <= 0) goto Ld
            r2 = 58
            ejxk r2 = defpackage.ejxk.b(r2)     // Catch: java.lang.IllegalArgumentException -> L9b
            java.util.List r2 = r2.i(r1)     // Catch: java.lang.IllegalArgumentException -> L9b
            r3 = 0
            java.lang.Object r4 = r2.get(r3)     // Catch: java.lang.IllegalArgumentException -> L9b
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.IllegalArgumentException -> L9b
            int r5 = r2.size()     // Catch: java.lang.IllegalArgumentException -> L9b
            r6 = 1
            if (r5 <= r6) goto L83
            java.lang.Object r2 = r2.get(r6)     // Catch: java.lang.IllegalArgumentException -> L9b
            r2.getClass()     // Catch: java.lang.IllegalArgumentException -> L9b
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.IllegalArgumentException -> L9b
            int r5 = r2.hashCode()     // Catch: java.lang.IllegalArgumentException -> L9b
            r7 = 2044801(0x1f3381, float:2.865377E-39)
            r8 = 2
            if (r5 == r7) goto L6b
            r7 = 433141802(0x19d1382a, float:2.1632778E-23)
            if (r5 == r7) goto L62
            r3 = 2013139542(0x77fe1256, float:1.03063695E34)
            if (r5 == r3) goto L58
            goto L75
        L58:
            java.lang.String r3 = "DEVICE"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L75
            r3 = r8
            goto L76
        L62:
            java.lang.String r5 = "UNKNOWN"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L75
            goto L76
        L6b:
            java.lang.String r3 = "BOTH"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L75
            r3 = r6
            goto L76
        L75:
            r3 = -1
        L76:
            if (r3 == 0) goto L83
            if (r3 == r6) goto L83
            if (r3 != r8) goto L7d
            goto L83
        L7d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L9b
            r2.<init>()     // Catch: java.lang.IllegalArgumentException -> L9b
            throw r2     // Catch: java.lang.IllegalArgumentException -> L9b
        L83:
            r4.getClass()     // Catch: java.lang.IllegalArgumentException -> L9b
            ezan r2 = defpackage.ezan.c(r4)     // Catch: java.lang.IllegalArgumentException -> L9b
            ezan r3 = defpackage.ezan.UNKNOWN_SUGGESTION_TYPE     // Catch: java.lang.IllegalArgumentException -> L9b
            if (r2 == r3) goto L93
            r0.add(r2)     // Catch: java.lang.IllegalArgumentException -> L9b
            goto Ld
        L93:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L9b
            java.lang.String r3 = "Unknown Suggestion Type found"
            r2.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L9b
            throw r2     // Catch: java.lang.IllegalArgumentException -> L9b
        L9b:
            r2 = move-exception
            ekrg r3 = defpackage.crej.a
            ekrw r3 = r3.i()
            ekrz r4 = defpackage.eksq.a
            java.lang.String r5 = "Bugle"
            r3.X(r4, r5)
            ekrd r3 = (defpackage.ekrd) r3
            ekrw r2 = r3.g(r2)
            r3 = 182(0xb6, float:2.55E-43)
            java.lang.String r4 = "SmartSuggestionTypesFlags.kt"
            java.lang.String r5 = "com/google/android/apps/messaging/shared/util/p2p/common/SmartSuggestionTypesFlags"
            java.lang.String r6 = "parseSuggestionTypes"
            ekrw r2 = r2.h(r5, r6, r3, r4)
            ekrd r2 = (defpackage.ekrd) r2
            java.lang.String r3 = "SmartSuggestionConfigUtils: Unknown suggestion type %s"
            r2.t(r3, r1)
            goto Ld
        Lc4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crej.m(java.lang.String):java.util.Set");
    }

    public final creh a() {
        return (creh) this.d.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0086 -> B:24:0x008c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r9, defpackage.emig r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.crei
            if (r0 == 0) goto L13
            r0 = r11
            crei r0 = (defpackage.crei) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            crei r0 = new crei
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            ezan r9 = r0.g
            java.lang.Object r10 = r0.a
            css r2 = r0.h
            emig r4 = r0.f
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r5 = r0.e
            defpackage.fctl.b(r11)
            goto L8c
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            defpackage.fctl.b(r11)
            css r11 = new css
            java.util.Set r2 = r8.c(r10)
            r11.<init>(r2)
            java.util.Map r2 = r8.c
            ekgp r2 = (defpackage.ekgp) r2
            ekhx r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
            r7 = r11
            r11 = r10
            r10 = r2
            r2 = r7
        L55:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L9b
            java.lang.Object r4 = r10.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            ezan r5 = (defpackage.ezan) r5
            java.lang.Object r4 = r4.getValue()
            creo r4 = (defpackage.creo) r4
            emig r6 = defpackage.emig.REPLY
            if (r11 != r6) goto L73
            r6 = r3
            goto L74
        L73:
            r6 = 0
        L74:
            r0.e = r9
            r0.f = r11
            r0.h = r2
            r0.a = r10
            r0.g = r5
            r0.d = r3
            java.lang.Object r4 = r4.a(r9, r6, r0)
            if (r4 == r1) goto L9a
            r7 = r5
            r5 = r9
            r9 = r7
            r7 = r4
            r4 = r11
            r11 = r7
        L8c:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L97
            r2.remove(r9)
        L97:
            r11 = r4
            r9 = r5
            goto L55
        L9a:
            return r1
        L9b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crej.b(com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType, emig, fcxy):java.lang.Object");
    }

    public final Set c(emig emigVar) {
        emigVar.getClass();
        Set set = emigVar == emig.REPLY ? a().a : a().b;
        return (!((Boolean) ((cczi) crbf.bE.get()).e()).booleanValue() || ((crqx) this.b.b()).m()) ? set : fcva.at(set, bbfa.a);
    }

    public final boolean d() {
        return l(ezan.CALENDAR);
    }

    public final boolean e() {
        return l(ezan.DUO_CALL);
    }

    public final boolean f() {
        return ((crqx) this.b.b()).o() && l(ezan.EMOTION);
    }

    public final boolean g() {
        return l(ezan.GIF);
    }

    public final boolean h() {
        return l(ezan.LOCATION);
    }

    public final boolean i() {
        return l(ezan.RECENT_IMAGE);
    }

    public final boolean j() {
        return l(ezan.RECORD_VOICE_MESSAGE);
    }

    public final boolean k() {
        return l(ezan.STARRING);
    }

    public final boolean l(ezan ezanVar) {
        return a().a.contains(ezanVar) || a().b.contains(ezanVar);
    }
}

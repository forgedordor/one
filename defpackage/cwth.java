package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import j$.time.DateTimeException;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwth implements cmyf {
    public static final cczi a = cdag.f(cdag.b, "p2p_share_recent_image_suggestion_expiration_age_millis", TimeUnit.MINUTES.toMillis(2));
    private final fcsu b;
    private final eygg c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final crma g;
    private final cogw h;
    private final fcsu i;
    private final cqce j;

    public cwth(@apnu fcsu fcsuVar, eygg eyggVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, crma crmaVar, cogw cogwVar, fcsu fcsuVar5) {
        fcsuVar.getClass();
        eyggVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        crmaVar.getClass();
        cogwVar.getClass();
        fcsuVar5.getClass();
        this.b = fcsuVar;
        this.c = eyggVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.f = fcsuVar4;
        this.g = crmaVar;
        this.h = cogwVar;
        this.i = fcsuVar5;
        this.j = cqce.g("Bugle", "SmartSuggestionRule");
    }

    private final boolean g() {
        return ((crlk) this.f.b()).d();
    }

    private final boolean h(SmartSuggestionItemSuggestionData smartSuggestionItemSuggestionData) {
        ezgi ezgiVar = smartSuggestionItemSuggestionData.c;
        if (ezgiVar.c == 19) {
            ezbn ezbnVar = (ezbn) ezgiVar.d;
            ezbnVar.getClass();
            ezpz ezpzVar = ezbnVar.d;
            if (ezpzVar == null) {
                ezpzVar = ezpz.a;
            }
            eyaz eyazVar = ezpzVar.c;
            if (eyazVar == null) {
                eyazVar = eyaz.a;
            }
            eyazVar.getClass();
            ezpz ezpzVar2 = ezbnVar.d;
            if (ezpzVar2 == null) {
                ezpzVar2 = ezpz.a;
            }
            eybm eybmVar = ezpzVar2.d;
            if (eybmVar == null) {
                eybmVar = eybm.a;
            }
            eybmVar.getClass();
            try {
                LocalDateTime localDateTimeOf = LocalDateTime.of(eyazVar.b, eyazVar.c + 1, eyazVar.d, eybmVar.b, eybmVar.c);
                if (((Boolean) ((cczi) cwtn.a.get()).e()).booleanValue() || ((Boolean) ((cczi) crbf.bE.get()).e()).booleanValue()) {
                    return true;
                }
                return localDateTimeOf.isAfter(this.h.f().atZone(ZoneId.systemDefault()).toLocalDateTime());
            } catch (DateTimeException unused) {
            }
        }
        return false;
    }

    @Override // defpackage.cmyf
    public final boolean a(SuggestionData suggestionData) {
        suggestionData.getClass();
        return suggestionData instanceof SmartSuggestionData;
    }

    @Override // defpackage.cmyf
    public final Object b(SuggestionData suggestionData, cmxw cmxwVar, int i, fcxy fcxyVar) {
        if (suggestionData instanceof SmartSuggestionItemSuggestionData) {
            return f((SmartSuggestionItemSuggestionData) suggestionData, cmxwVar, i, fcxyVar);
        }
        this.j.n("Non smart suggestion passed to SmartSuggestionRule");
        throw new IllegalStateException("Non smart suggestion passed to SmartSuggestionRule");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.cmxw r6, com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.cwtd
            if (r0 == 0) goto L13
            r0 = r8
            cwtd r0 = (defpackage.cwtd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cwtd r0 = new cwtd
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData r7 = r0.d
            defpackage.fctl.b(r8)
            goto L50
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.fctl.b(r8)
            fcsu r8 = r5.i
            java.lang.Object r8 = r8.b()
            ascw r8 = (defpackage.ascw) r8
            boolean r8 = r8.a()
            if (r8 == 0) goto L5a
            r8 = r7
            com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData r8 = (com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData) r8
            r0.d = r8
            r0.c = r3
            java.lang.Object r8 = r6.b(r0)
            if (r8 == r1) goto L59
        L50:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r6 = r8.booleanValue()
            if (r6 == 0) goto L8d
            goto L5a
        L59:
            return r1
        L5a:
            eygg r6 = r5.c
            java.lang.Object r6 = r6.b()
            crqx r6 = (defpackage.crqx) r6
            boolean r6 = r6.o()
            if (r6 == 0) goto L8d
            fcsu r6 = r5.e
            java.lang.Object r6 = r6.b()
            crej r6 = (defpackage.crej) r6
            boolean r6 = r6.f()
            if (r6 == 0) goto L8d
            java.lang.String r6 = r7.o()
            fcsu r8 = r5.d
            java.lang.Object r8 = r8.b()
            crgr r8 = (defpackage.crgr) r8
            java.lang.String r7 = r7.u()
            etyp r6 = r8.a(r6, r7)
            if (r6 == 0) goto L8d
            goto L8e
        L8d:
            r3 = r4
        L8e:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwth.c(cmxw, com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.cmxw r8, com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwth.d(cmxw, com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.cmxw r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.cwtg
            if (r0 == 0) goto L13
            r0 = r7
            cwtg r0 = (defpackage.cwtg) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cwtg r0 = new cwtg
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.a
            defpackage.fctl.b(r7)
            goto L45
        L38:
            defpackage.fctl.b(r7)
            r0.a = r6
            r0.d = r4
            java.lang.Object r7 = r6.d(r0)
            if (r7 == r1) goto L7a
        L45:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r2 = 0
            if (r7 == 0) goto L53
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            return r6
        L53:
            fcsu r7 = r5.e
            java.lang.Object r7 = r7.b()
            crej r7 = (defpackage.crej) r7
            boolean r7 = r7.e()
            if (r7 != 0) goto L6d
            cqce r6 = r5.j
            java.lang.String r7 = "Duo suggestions not enabled"
            r6.q(r7)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            return r6
        L6d:
            r7 = 0
            r0.a = r7
            r0.d = r3
            java.lang.Object r6 = r6.h(r0)
            if (r6 != r1) goto L79
            goto L7a
        L79:
            return r6
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwth.e(cmxw, fcxy):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x013d, code lost:
    
        if (r13 != r1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ae, code lost:
    
        if (r12 < r9.h.f().toEpochMilli()) goto L92;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02ef A[PHI: r6
      0x02ef: PHI (r6v3 boolean) = 
      (r6v0 boolean)
      (r6v4 boolean)
      (r6v5 boolean)
      (r6v6 boolean)
      (r6v9 boolean)
      (r6v10 boolean)
      (r6v11 boolean)
      (r6v0 boolean)
      (r6v0 boolean)
      (r6v0 boolean)
      (r6v0 boolean)
      (r6v12 boolean)
      (r6v13 boolean)
     binds: [B:95:0x01c5, B:142:0x02ee, B:141:0x02e9, B:140:0x02dc, B:130:0x0298, B:128:0x0284, B:125:0x0268, B:123:0x0264, B:116:0x0246, B:107:0x0220, B:102:0x0204, B:98:0x01d8, B:97:0x01ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData r10, defpackage.cmxw r11, int r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwth.f(com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData, cmxw, int, fcxy):java.lang.Object");
    }
}
